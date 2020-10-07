<%-- 
    Document   : chatroom
    Created on : Jul 8, 2020, 2:53:26 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ page import="jChatBox.Util.*,jChatBox.Chat.*,jChatBox.Chat.Filter.*,java.util.*,java.net.*" %>
<jsp:useBean id="SystemProcessor" class="jChatBox.Service.ModeratorProcessor" scope="application" />
<jsp:useBean id="UserProcessor" class="jChatBox.Service.UserProcessor" scope="application" />
<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>
<%
	jChatBox.Chat.ChatroomManager ChatroomManager = null;
	String chatroomName = "", buffering = null, todo = null;
	int chatroomMaxUsers = -1, chatroomTotalUsers = -1, refreshValue = 20, dMode = -1;
	Chatroom chatroom = null;
	ChatroomUser cUser = null;
	String jspDisplay = UserProcessor.execute(request,response,session,application);
	if (jspDisplay != null)
	{
		response.sendRedirect(response.encodeRedirectURL(jspDisplay));
	}
	else
	{
		ChatroomManager = jChatBox.Chat.ChatroomManager.getInstance();
        cUser = (ChatroomUser) session.getValue(XMLConfig.USERSESSIONID);
		if (cUser != null)
		{
			int cID = cUser.getParams().getChatroom();
			refreshValue = cUser.getParams().getRefresh();
			try
			{
				chatroom = ChatroomManager.getChatroom(cID);
				dMode = chatroom.getParams().getDisplayMode();
				chatroomName = chatroom.getParams().getName();
				chatroomMaxUsers = chatroom.getParams().getMaxUsers();
				chatroomTotalUsers = chatroom.getTotalUsers();
				buffering = request.getParameter("buffering");
				todo = request.getParameter("todo");
			} catch (ChatException ce)
			  {
			  	/** Chatroom not found */
				response.sendRedirect(response.encodeRedirectURL(Conf.JSPUSERLOGIN));
			  }
		}
	}
%>
<% if (dMode != Conf.BUFFEREDFRAMED) { %><meta http-equiv=Refresh content="<%= refreshValue %>;URL=<%= response.encodeURL("content.jsp?todo=refresh") %>"><%}%>
<head>
<title><%= chatroomName %></title>
<script language="JavaScript"><!--
function privatemsg(user)
{
 window.open('<%= response.encodeURL("privatetext.jsp?to=") %>'+escape(user)+'','PrivateMessage','resizable=yes,width=600,height=70');
}
//--></script>
</head>
<body  leftmargin="1" topmargin="1" marginwidth="1" marginheight="1">

<center>
<table width=99% border=0 cellspacing=1 cellpadding=0>
<tr>
<td align=center valign=top>
	<%
       /** Display chat content. Top - Bottom */
       StringBuffer sb = new StringBuffer();
	   if (chatroom != null)
	   {
         Vector v = chatroom.getChat(cUser.getName());
         Vector filters = chatroom.getParams().getFilters();
         jChatBox.Chat.Filter.Filter filter = null;
         if (v != null)
         {
            Msg message = null;
            String messageStr = null;
            String messageDate = null;
            String fromStr = null;
            int i = v.size() - 1;
            int lines = 0;
            sb.append("<table width=100% border=0 cellspacing=0 cellpadding=0>\n");
            while ( (i>=0) && (lines<chatroom.getParams().getHistory()) )
            {
               message = (Msg) v.elementAt(i);
               messageDate = (new SimpleDateFormat("HH:mm:ss")).format(message.getDate());
               messageStr = message.getMsg();
               fromStr = message.getFrom();
               /** Filter From and Msg fields for non-SYSTEM users */
               if (!(message.getFrom()).equals(XMLConfig.SYSTEMLOGIN))
               {
               		for (int f=0;f<filters.size();f++)
               		{
               			filter = (jChatBox.Chat.Filter.Filter) filters.elementAt(f);
               			fromStr = filter.eprocess(fromStr,message,cUser);
               			messageStr = filter.eprocess(messageStr,message,cUser);
               		}
               }
               i--;
               lines++;
			   sb.append("<tr>\n");
               // System Administrator message.
               if ( message.getType() == Msg.SYSTEM )
               {
				  sb.append("<td width=8% valign=top align=right nowrap><font face=Verdana size=-2 color=#FF0000><b>SYSTEM</b>:&nbsp;</font><br><font color=#999999 size=-2>"+messageDate+"&nbsp;</font></td>\n");
				  sb.append("<td width=90% valign=top><font face=Verdana size=-1 color=#FF0000>"+messageStr+"</font></td>\n");
			   }
               // Join message.
               if ( message.getType() == Msg.JOIN )
               {
				  sb.append("<td width=8% valign=top align=right nowrap><font face=Verdana size=-2><b>JOIN</b>:&nbsp;</font><br><font color=#999999 size=-2>"+messageDate+"&nbsp;</font></td>\n");
				  sb.append("<td width=90% valign=top><font face=Verdana size=-1>"+messageStr+" has joined chatroom.</font></td>\n");
               }
               // Quit message.
                else if ( message.getType() == Msg.LEFT )
               {
				  sb.append("<td width=8% valign=top align=right nowrap><font face=Verdana size=-2><b>QUIT</b>:&nbsp;</font><br><font color=#999999 size=-2>"+messageDate+"&nbsp;</font></td>\n");
				  sb.append("<td width=90% valign=top><font face=Verdana size=-1>"+messageStr+" has left chatroom.</font></td>\n");
               }
               // Private message.
               else if ( message.getType() == Msg.PRIVATE )
               {
				  sb.append("<td width=8% valign=top align=right nowrap><font face=Verdana size=-2 color=#990000><b>"+fromStr+"</b>:&nbsp;</font><br><font color=#999999 size=-2>"+messageDate+"&nbsp;</font></td>\n");
				  sb.append("<td width=90% valign=top><font face=Verdana size=-1 color=#990000>"+messageStr+"</font></td>\n");
               }
               // Message for all users in the chatroom.
               else
               {
				  sb.append("<td width=8% valign=top align=right nowrap><font face=Verdana size=-2><b>"+fromStr+"</b>:&nbsp;</font><br><font color=#999999 size=-2>"+messageDate+"&nbsp;</font></td>\n");
				  sb.append("<td width=90% valign=top><font face=Verdana size=-1>"+messageStr+"</font></td>\n");
               }
               sb.append("</tr>\n");
            }
      		sb.append("</table>\n");
         }
	 	 out.print(new String(sb));
	   }
	%>
  </td>
	<td valign=top align=right>
      <table border=0 cellspacing=0 cellpadding=0>
        <tr bgcolor=#000099>
            <td bgcolor="#999999">
              <table width=100% border=0 cellspacing=1 cellpadding=2>
              <tr bgcolor=#000077 align=center>
                  <td nowrap bgcolor="#777777"><font size=-2 face=Verdana color=#FFFFFF><b>Users
                    : <%= chatroomTotalUsers %>/<%= chatroomMaxUsers %></b></font></td>
              </tr>
              <tr bgcolor=#FFFFFF>
                <td nowrap><font size=-2 face=Verdana color=#000000>
				<%
				  /** Display users list. Links to privatemsg could be enabled. Head depends on user Type.*/
				  if (chatroom != null)
				  {
					String priv = null;
					sb = new StringBuffer();
				  	Hashtable table = chatroom.getUsers();
				    Enumeration e = table.keys();
			        String name = null;
			        String username = null;
      				ChatroomUser user = null;
         			Vector filters = chatroom.getParams().getFilters();
         			jChatBox.Chat.Filter.Filter filter = null;
      				while (e.hasMoreElements())
      				{
              			name = (String) e.nextElement();
              			user = (ChatroomUser) table.get(name);
              			username = user.getName();
              			/** Filter username for non-SYSTEM users */
						if (user.getType() != User.SYSTEM)
						{
							for (int f=0;f<filters.size();f++)
							{
								filter = (jChatBox.Chat.Filter.Filter) filters.elementAt(f);
		               			username = filter.eprocess(username,null,cUser);
		               		}
		                }
              			if (chatroom.getParams().getPrivateStatus()==true) priv = "<a href=\"javascript:privatemsg('"+user.getName()+"')\">"+username+"</a><br>";
						else priv = username+"<br>";
              			if (user.getType() == User.SYSTEM) priv="@"+priv;
              			else if (user.getType() == User.MODERATOR) priv="#"+priv;
              			sb.append(priv);
				  	}
      				sb.append("<br>&copy;&nbsp;<a href=\"http://www.javazoom.net\" target=\"_blank\">JavaZOOM</a><br>");
      				out.print(new String(sb));
      			  }
				%>
                </font></td>
              </tr>
            </table>
            </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</center>
</body>
</html>