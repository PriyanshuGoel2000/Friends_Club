package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jChatBox.Util.*;
import jChatBox.Chat.*;
import jChatBox.Chat.Filter.*;
import java.util.*;
import java.net.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class chatroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      jChatBox.Service.ModeratorProcessor SystemProcessor = null;
      synchronized (application) {
        SystemProcessor = (jChatBox.Service.ModeratorProcessor) _jspx_page_context.getAttribute("SystemProcessor", PageContext.APPLICATION_SCOPE);
        if (SystemProcessor == null){
          SystemProcessor = new jChatBox.Service.ModeratorProcessor();
          _jspx_page_context.setAttribute("SystemProcessor", SystemProcessor, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      jChatBox.Service.UserProcessor UserProcessor = null;
      synchronized (application) {
        UserProcessor = (jChatBox.Service.UserProcessor) _jspx_page_context.getAttribute("UserProcessor", PageContext.APPLICATION_SCOPE);
        if (UserProcessor == null){
          UserProcessor = new jChatBox.Service.UserProcessor();
          _jspx_page_context.setAttribute("UserProcessor", UserProcessor, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

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

      out.write('\n');
 if (dMode != Conf.BUFFEREDFRAMED) { 
      out.write("<meta http-equiv=Refresh content=\"");
      out.print( refreshValue );
      out.write(";URL=");
      out.print( response.encodeURL("content.jsp?todo=refresh") );
      out.write('"');
      out.write('>');
}
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>");
      out.print( chatroomName );
      out.write("</title>\n");
      out.write("<script language=\"JavaScript\"><!--\n");
      out.write("function privatemsg(user)\n");
      out.write("{\n");
      out.write(" window.open('");
      out.print( response.encodeURL("privatetext.jsp?to=") );
      out.write("'+escape(user)+'','PrivateMessage','resizable=yes,width=600,height=70');\n");
      out.write("}\n");
      out.write("//--></script>\n");
      out.write("</head>\n");
      out.write("<body  leftmargin=\"1\" topmargin=\"1\" marginwidth=\"1\" marginheight=\"1\">\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<table width=99% border=0 cellspacing=1 cellpadding=0>\n");
      out.write("<tr>\n");
      out.write("<td align=center valign=top>\n");
      out.write("\t");

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
	
      out.write("\n");
      out.write("  </td>\n");
      out.write("\t<td valign=top align=right>\n");
      out.write("      <table border=0 cellspacing=0 cellpadding=0>\n");
      out.write("        <tr bgcolor=#000099>\n");
      out.write("            <td bgcolor=\"#999999\">\n");
      out.write("              <table width=100% border=0 cellspacing=1 cellpadding=2>\n");
      out.write("              <tr bgcolor=#000077 align=center>\n");
      out.write("                  <td nowrap bgcolor=\"#777777\"><font size=-2 face=Verdana color=#FFFFFF><b>Users\n");
      out.write("                    : ");
      out.print( chatroomTotalUsers );
      out.write('/');
      out.print( chatroomMaxUsers );
      out.write("</b></font></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr bgcolor=#FFFFFF>\n");
      out.write("                <td nowrap><font size=-2 face=Verdana color=#000000>\n");
      out.write("\t\t\t\t");

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
				
      out.write("\n");
      out.write("                </font></td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
