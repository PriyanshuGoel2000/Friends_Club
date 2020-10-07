package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jChatBox.Util.*;
import jChatBox.Chat.*;
import jChatBox.Chat.Filter.*;
import java.util.*;

public final class chatroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("\r\n");
      jChatBox.Service.ModeratorProcessor SystemProcessor = null;
      synchronized (application) {
        SystemProcessor = (jChatBox.Service.ModeratorProcessor) _jspx_page_context.getAttribute("SystemProcessor", PageContext.APPLICATION_SCOPE);
        if (SystemProcessor == null){
          SystemProcessor = new jChatBox.Service.ModeratorProcessor();
          _jspx_page_context.setAttribute("SystemProcessor", SystemProcessor, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	jChatBox.Chat.ChatroomManager ChatroomManager = null;
	XMLPropertyResourceBundle defaultBundle = (XMLPropertyResourceBundle) XMLConfig.RESOURCES.get(XMLConfig.DEFAULTLANGUAGE);
	response.setContentType("text/html; charset="+defaultBundle.getString("global.encoding"));
	/* I18N support since Servlets 2.3. */
	//try
	//{
	//  request.setCharacterEncoding(defaultBundle.getString("global.encoding"));
	//} catch (Exception e) {}
	jChatBox.Chat.Monitor Monitor = null;
	String ID = "";
	Chatroom aChatroom = null;
	int id = -1;
	String jspDisplay = SystemProcessor.execute(request,session, application);
	if (jspDisplay != null)
	{
		response.sendRedirect(jspDisplay);
	}
	else
	{
		ChatroomManager = jChatBox.Chat.ChatroomManager.getInstance();
		Monitor = jChatBox.Chat.Monitor.getInstance();
		ID = request.getParameter("id");
		if ( (ID != null) && (!ID.equals("")) )
		{
			id = Integer.parseInt(ID);
			aChatroom = ChatroomManager.getChatroom(id);

			/** Manager Users and Blacklist "windows" */
			String sub = request.getParameter("sub");
			if ( (sub != null) && (!sub.equals("")) )
			{
				if (sub.equals("viewusers")) session.putValue("winusers","open");
				else if (sub.equals("closeusers")) session.putValue("winusers","close");
				else if (sub.equals("viewblacklist")) session.putValue("winblacklist","open");
				else if (sub.equals("closeblacklist")) session.putValue("winblacklist","close");
			}
		}
		else
		{
			ID = (String) session.getValue("ID");
			if (ID == null) ID="";
		}
	}

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<LINK REL=STYLESHEET TYPE=\"text/css\" HREF=\"styles/admin.css\">\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("function viewusers()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"chatroom.jsp?todo=manage&rand=");
      out.print( System.currentTimeMillis() );
      out.write("&id=");
      out.print( ID );
      out.write("&sub=viewusers\";\r\n");
      out.write("}\r\n");
      out.write("function closeusers()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"chatroom.jsp?todo=manage&rand=");
      out.print( System.currentTimeMillis() );
      out.write("&id=");
      out.print( ID );
      out.write("&sub=closeusers\";\r\n");
      out.write("}\r\n");
      out.write("function viewblacklist()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"chatroom.jsp?todo=manage&rand=");
      out.print( System.currentTimeMillis() );
      out.write("&id=");
      out.print( ID );
      out.write("&sub=viewblacklist\";\r\n");
      out.write("}\r\n");
      out.write("function closeblacklist()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"chatroom.jsp?todo=manage&rand=");
      out.print( System.currentTimeMillis() );
      out.write("&id=");
      out.print( ID );
      out.write("&sub=closeblacklist\";\r\n");
      out.write("}\r\n");
      out.write("function update()\r\n");
      out.write("{\r\n");
      out.write("\tif (document.chatroom.subject.value.length > 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.chatroom.todo.value=\"updatechatroom\";\r\n");
      out.write("\t\tdocument.chatroom.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"You have to fill in SUBJECT field !\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function close()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"menu.jsp?todo=closechatroom&id=");
      out.print( ID );
      out.write("&rand=");
      out.print( System.currentTimeMillis() );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("function clear()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"menu.jsp?todo=clearchatroom&id=");
      out.print( ID );
      out.write("&rand=");
      out.print( System.currentTimeMillis() );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("function generate()\r\n");
      out.write("{\r\n");
      out.write("\tif (document.chatroom.filename.value.length > 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.chatroom.todo.value=\"generatetranscript\";\r\n");
      out.write("\t\tdocument.chatroom.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"You have to fill in FILENAME field !\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function backup()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"menu.jsp?todo=backup&rand=");
      out.print( System.currentTimeMillis() );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("function logout()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"index.jsp?todo=logout&rand=");
      out.print( System.currentTimeMillis() );
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("function manage(opt)\r\n");
      out.write("{\r\n");
      out.write("\tif (opt != \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tlocation.href=\"chatroom.jsp?todo=manage&rand=");
      out.print( System.currentTimeMillis() );
      out.write("&id=\"+opt;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function ban(name)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.chatroom.username.value=name;\r\n");
      out.write("\tdocument.chatroom.todo.value=\"ban\";\r\n");
      out.write("\tdocument.chatroom.submit();\r\n");
      out.write("}\r\n");
      out.write("function banip()\r\n");
      out.write("{\r\n");
      out.write("\tvar ipaddress = document.chatroom.userip.value;\r\n");
      out.write("\tif (ipaddress.length > 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t    document.chatroom.todo.value=\"banip\";\r\n");
      out.write("\t    document.chatroom.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("            alert(\"You have to fill in IP address to ban\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function kickoff(name)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.chatroom.username.value=name;\r\n");
      out.write("\tdocument.chatroom.todo.value=\"kickoff\";\r\n");
      out.write("\tdocument.chatroom.submit();\r\n");
      out.write("}\r\n");
      out.write("function remove(ip)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.chatroom.ip.value=ip;\r\n");
      out.write("\tdocument.chatroom.todo.value=\"remove\";\r\n");
      out.write("\tdocument.chatroom.submit();\r\n");
      out.write("}\r\n");
      out.write("function clearblacklist()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.chatroom.todo.value=\"clear\";\r\n");
      out.write("\tdocument.chatroom.submit();\r\n");
      out.write("}\r\n");
      out.write("function join()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.chatroom.todo.value=\"join\";\r\n");
      out.write("\tdocument.chatroom.submit();\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<title>Chatroom Manager</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" link=\"#9999CC\" alink=\"#9999CC\" vlink=\"#9999CC\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"68\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#2D1E86\" height=\"65\" width=\"33%\" align=\"left\" valign=\"top\"><font color=\"#FFFFFF\" face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\"><b><font color=\"#FFFF66\">&nbsp;v");
      out.print( jChatBox.Util.Conf.VERSION );
      out.write("</font></b></font></td>\r\n");
      out.write("    <td bgcolor=\"#2D1E86\" align=\"center\" height=\"65\" width=\"34%\"><a href=\"http://www.javazoom.net/jzservlets/jchatbox/jchatbox.html\" target=\"_blank\"><img src=\"images/jchatboxt.gif\" width=\"214\" height=\"65\" alt=\"jChatBox\" border=\"0\"></a></td>\r\n");
      out.write("    <td bgcolor=\"#2D1E86\" height=\"65\" align=\"right\" valign=\"top\" width=\"33%\"><font color=\"#FFFFFF\" face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\"><b><font color=\"#0099CC\">&copy;&nbsp;JavaZOOM 1999-2004</font>&nbsp;<br></b><a class=\"homelink\" href=\"http://www.javazoom.net\" target=\"_blank\">http://www.javazoom.net</a>&nbsp;</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"33%\" height=\"3\" background=\"images/jchatboxb.gif\"><img src=\"images/single.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("    <td width=\"34%\" align=\"center\" background=\"images/jchatboxb.gif\" height=\"3\"><img src=\"images/single.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("    <td width=\"33%\" height=\"3\" background=\"images/jchatboxb.gif\"><img src=\"images/single.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"chatroom.jsp\" name=\"chatroom\">\r\n");
      out.write("  <p align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><br>\r\n");
      out.write("    </font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\" color=\"#FF0000\"><b>\r\n");
      out.write("    ");

 		if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMUPDATED)) out.print("Chatroom has been updated successfully.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMTRANSCRIPTED)) out.print("Chatroom has been transcripted successfully.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMSUBJECTMISSING)) out.print("Chatroom's subject missing.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMIDMISSING)) out.print("System error : Chatroom's id missing.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMNOTFOUND)) out.print("System error : Chatroom not found.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.SYSTEMERROR)) out.print("Cannot execute : System error.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.USERNAMEMISSING)) out.print("Username missing.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.NAMENOTFOUND)) out.print("Username not found.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.KICKEDOFF)) out.print("User has been kicked off this chatroom.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.BANNED)) out.print("User has been banned of this chatroom.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMBLACKLISTCLEARED)) out.print("Blacklist cleared.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.IPREMOVED)) out.print("IP removed from blacklist.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CANNOTKICKOFFORBAN)) out.print("Cannot kick off or ban SYSTEM user.");
 		else if ((SystemProcessor.getSysMessage(session)).equals(Conf.NAMENOTAVAILABLE)) out.print("Name already in use for this charoom.");
 		else if ( ((SystemProcessor.getSysMessage(session)).equals(Conf.SYSTEMUSERJOINED)) || ((SystemProcessor.getSysMessage(session)).equals(Conf.MODERATORUSERJOINED)))
 		{
 			if ((SystemProcessor.getSysMessage(session)).equals(Conf.SYSTEMUSERJOINED)) out.print("SYSTEM user has joined this chatroom.");
			else out.print("MODERATOR user has joined this chatroom.");
 			out.print(" Try <a href=\"../skin_multilanguage/room.jsp\" target=\"_blank\" class=\"bluelink\">this URL</a> to enter this chatroom.<br>");
 		}
 		else out.print(SystemProcessor.getSysMessage(session));
    
      out.write("\r\n");
      out.write("    </b></font></p>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"25%\" valign=\"top\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"><br>\r\n");
      out.write("              <br>\r\n");
      out.write("              </font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font color=\"#990000\">Manage\r\n");
      out.write("              chatroom<br>\r\n");
      out.write("              </font></b></font>\r\n");
      out.write("              <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td> <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                    <select name=\"chatrooms\" onChange=\"manage(this.options[selectedIndex].value);\">\r\n");
      out.write("                      <option>Select a chatroom</option>\r\n");
      out.write("                      ");

                      	if (ChatroomManager != null)
                      	{
                      		Vector chatrooms = ChatroomManager.getChatrooms();
                      		Chatroom chatroom = null;
                      		String Selection = "";
                      		for (int i=0;i<chatrooms.size();i++)
                      		{
                      			chatroom = (Chatroom) chatrooms.elementAt(i);
                      			if (chatroom.getParams().getID() == id) Selection=" selected";
                      			else Selection = "";
                      			out.print("<option value=\""+chatroom.getParams().getID()+"\""+Selection+">"+chatroom.getParams().getName()+"</option>");
                      		}
                      	}
                      
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    </font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"></font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a class=\"menulink\" href=\"open.jsp\"><b>Open\r\n");
      out.write("              a chatroom</b></a></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"></font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a class=\"menulink\" href=\"moderators.jsp\"><b>Moderators</b></a></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"></font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a class=\"menulink\" href=\"javascript:backup()\"><b>Backup\r\n");
      out.write("              chatrooms </b></a></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"></font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a class=\"menulink\" href=\"xmlconfig.jsp\"><b>Manage\r\n");
      out.write("              jChatBox</b></a></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><img src=\"images/reddot.gif\" width=\"12\" height=\"12\"></font></td>\r\n");
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a class=\"menulink\" href=\"javascript:logout()\"><b>Logout</b></a></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"75%\" valign=\"top\">\r\n");
      out.write("        <table width=\"98%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("              <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr bgcolor=\"#999999\">\r\n");
      out.write("                  <td bgcolor=\"#003399\">\r\n");
      out.write("                    <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"2\">\r\n");
      out.write("                      <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                        <td nowrap>\r\n");
      out.write("                          <table width=\"100%\" border=\"0\" cellspacing=\"5\" cellpadding=\"5\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td>\r\n");
      out.write("                                <div align=\"center\">\r\n");
      out.write("                                  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"1\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td bgcolor=\"#FFFFCC\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font color=\"#000099\"><a href=\"javascript:clear()\" class=\"tablink\">Clear</a>&nbsp;</font>|<font color=\"#000099\">&nbsp;</font></b></font><a href=\"javascript:close()\" class=\"tablink\">Close</a><font color=\"#000099\">&nbsp;</font>|<font color=\"#000099\">&nbsp;</font><a href=\"javascript:join()\" class=\"tablink\">Join</a><font color=\"#000099\">&nbsp;</font></b></font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td>\r\n");
      out.write("                                        <hr size=\"1\" width=\"100%\">\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\"><b><font color=\"#000099\" size=\"-1\">&nbsp;Info</font></b></font></td>\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;</font></td>\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;</font></td>\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;</font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Name\r\n");
      out.write("                                        : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        ");
 if (aChatroom != null) out.print(aChatroom.getParams().getName()); 
      out.write("\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>History\r\n");
      out.write("                                        : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"history\" class=\"SystemBox\">\r\n");
      out.write("                                          ");

                                          	if (aChatroom != null)
                                          	{
                                          		int[] historyList = {20,25,30,35,40,45,50,55,60,70,80,90,100,120,150};
                                          		int history = aChatroom.getParams().getHistory();
                                          		String hStr = null;
                                          		String Selected = null;
                                          		for (int h=0;h<historyList.length;h++)
                                          		{
                                          		   hStr = ""+historyList[h];
                                          		   if (historyList[h]==history) Selected = " selected";
                                          		   else Selected = "";
                                          		   
      out.write("\r\n");
      out.write("                                          <option value=\"");
      out.print( hStr );
      out.write('"');
      out.print( Selected );
      out.write("><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( hStr );
      out.write("</font></option>\r\n");
      out.write("                                          ");
}
                                          	}
                                          
      out.write("\r\n");
      out.write("                                        </select></font>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Subject\r\n");
      out.write("                                        :</b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"text\" name=\"subject\" size=\"16\" class=\"SystemBox\" value=\"");
 if (aChatroom != null) out.print(aChatroom.getParams().getSubject()); 
      out.write("\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Refresh\r\n");
      out.write("                                        limit : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"refreshlimit\" class=\"SystemBox\">\r\n");
      out.write("                                          ");

										  if (aChatroom != null)
										  {
                                          	int[] refreshList = {3,5,8,10,12,15,18,20,25,30,40,50};
                                          	int refresh = aChatroom.getParams().getRefreshLimit();
                                          	String rStr = null;
                                          	String Select = null;
                                          	for (int r=0;r<refreshList.length;r++)
                                          	{
                                          	   rStr = ""+refreshList[r];
                                          	   if (refreshList[r]==refresh) Select = " selected";
                                          	   else Select = "";
                                          	   
      out.write("\r\n");
      out.write("                                          <option value=\"");
      out.print( rStr );
      out.write('"');
      out.print( Select );
      out.write("><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( rStr );
      out.write("\r\n");
      out.write("                                          seconds</font></option>\r\n");
      out.write("                                          ");
}
                                          }
                                         
      out.write("\r\n");
      out.write("                                        </select></font>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Max.\r\n");
      out.write("                                        users :</b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        ");
 if (aChatroom != null) out.print(aChatroom.getParams().getMaxUsers()); 
      out.write("\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Refresh\r\n");
      out.write("                                        model : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"refreshmodel\" class=\"SystemBox\">\r\n");
      out.write("                                          ");

										  if (aChatroom != null)
										  {
                                          	int[] refreshModel = {1,2,3};
                                          	String[] refreshModelList = {"Time-Constant","Action-Tracker","Room-Load"};
                                          	int refresh = aChatroom.getParams().getRefreshModel();
                                          	String rStr = null;
                                          	String Select = null;
                                          	for (int r=0;r<refreshModel.length;r++)
                                          	{
                                          	   rStr = refreshModelList[r];
                                          	   if (refreshModel[r]==refresh) Select = " selected";
                                          	   else Select = "";
                                          	   
      out.write("\r\n");
      out.write("                                          <option value=\"");
      out.print( refreshModel[r] );
      out.write('"');
      out.print( Select );
      out.write("><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( rStr );
      out.write("</font></option>\r\n");
      out.write("                                          ");
}
                                          }
                                         
      out.write("\r\n");
      out.write("                                        </select></font>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Display\r\n");
      out.write("                                        mode : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        ");

                                         	if (aChatroom != null)
                                         	{
                                         		if (aChatroom.getParams().getDisplayMode() == Conf.NONFRAMED) out.print("Non Framed (JSP)");
                                         		else if (aChatroom.getParams().getDisplayMode() == Conf.FRAMED) out.print("Framed (JSP)");
                                         		else if (aChatroom.getParams().getDisplayMode() == Conf.BUFFEREDFRAMED) out.print("Buffered-Framed (JSP)");
                                         		else if (aChatroom.getParams().getDisplayMode() == Conf.APPLET) out.print("Applet");
                                         		else if (aChatroom.getParams().getDisplayMode() == Conf.FLASH) out.print("Flash");
                                         	}
                                         
      out.write(" </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Private\r\n");
      out.write("                                        messages : </b></font></td>\r\n");
      out.write("                                      <td>\r\n");
      out.write("                                        <table width=\"80%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"radio\" name=\"private\" value=\"yes\" ");
 if ( (aChatroom != null) && (aChatroom.getParams().getPrivateStatus() == true) ) out.print("checked"); 
      out.write(">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Yes</font></td>\r\n");
      out.write("                                            <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"radio\" name=\"private\" value=\"no\" ");
 if ( (aChatroom != null) && (aChatroom.getParams().getPrivateStatus() == false) ) out.print("checked"); 
      out.write(">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">No</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\">&nbsp;</td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Moderators\r\n");
      out.write("                                        : </b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Language\r\n");
      out.write("                                        :</b></font></td>\r\n");
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"language\" class=\"SystemBox\">\r\n");
      out.write("                                          ");

                                           Hashtable languages = XMLConfig.LANGUAGES;
                                           String defaultLanguage = "";
                                           if ((languages != null) && (aChatroom != null))
                                           {
                                              String defaultStr = aChatroom.getParams().getLanguage();
                                              Enumeration e = languages.keys();
                                              while (e.hasMoreElements())
                                              {
                                              	String language = (String) e.nextElement();
                                              	if (language.equals(defaultStr)) defaultLanguage = " selected";
                                              	else defaultLanguage = "";
                                              	
      out.write("\r\n");
      out.write("                                          <option value=\"");
      out.print( language );
      out.write('"');
      out.print( defaultLanguage );
      out.write('>');
      out.print( language );
      out.write("</option>\r\n");
      out.write("                                          ");

                                              }
                                           }
                                        
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"button\" name=\"Update\" value=\"Update\" class=\"SystemButton\" onClick=\"update()\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td valign=\"top\">\r\n");
      out.write("                                        <table border=\"0\" cellspacing=\"0\" cellpadding=\"1\">\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td align=\"left\"> <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <select name=\"moderatorlist\" size=\"3\" multiple class=\"SystemBox\">\r\n");
      out.write("                                                ");
 if ( (XMLConfig.MODERATORS != null) && (!XMLConfig.MODERATORS.isEmpty()) )
													  {
                                                        
      out.write("\r\n");
      out.write("                                                <option value=\"\">- Select moderator(s)\r\n");
      out.write("                                                -</option>\r\n");
      out.write("                                                ");

														Enumeration e = XMLConfig.MODERATORS.keys();
														Vector mods = aChatroom.getParams().getModerators();
														String allowedmod = null;
														while (e.hasMoreElements())
														{
															String name = (String) e.nextElement();
															String sel = "";
															for (int ms=0;ms<mods.size();ms++)
															{
																allowedmod = (String) mods.elementAt(ms);
																if (name.equals(allowedmod))
																{
																	sel = "selected";
																	break;
																}
															}
															
      out.write("\r\n");
      out.write("                                                <option ");
      out.print( sel );
      out.write(" value=\"");
      out.print( name );
      out.write('"');
      out.write('>');
      out.print( name );
      out.write("</option>\r\n");
      out.write("                                                ");

														}
													  }
													  else
													  {
                                                        
      out.write("\r\n");
      out.write("                                                <option value=\"\">- No moderator\r\n");
      out.write("                                                available -</option>\r\n");
      out.write("                                                ");

													  }
													
      out.write("\r\n");
      out.write("                                              </select>\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                        <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"></font></td>\r\n");
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Filters\r\n");
      out.write("                                        : </b></font></td>\r\n");
      out.write("                                      <td valign=\"top\">\r\n");
      out.write("                                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                          ");

                                          if (aChatroom != null)
                                          {
                                          	Vector vFilters = aChatroom.getParams().getFilters();
                                          	Vector vFiltersList = XMLConfig.FILTERS;
                                          	jChatBox.Chat.Filter.Filter myFilter = null, aFilter = null;
                                          	String Check = "";
                                          	for (int f=0;f<vFiltersList.size();f++)
                                          	{
                                          		aFilter = (jChatBox.Chat.Filter.Filter) vFiltersList.elementAt(f);
                                          		for (int m=0;m<vFilters.size();m++)
                                          		{
                                          			myFilter = (jChatBox.Chat.Filter.Filter) vFilters.elementAt(m);
                                          			if ((myFilter.getID()).equals(aFilter.getID()))
                                          			{
                                          				Check=" checked";
                                          				break;
                                          			}
                                          			else Check="";
                                                        }
                                            
      out.write("\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"checkbox\" name=\"");
      out.print( aFilter.getID() );
      out.write("\" value=\"ok\"");
      out.print( Check );
      out.write(">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( aFilter.getName() );
      out.write("</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                                }
                                            }
                                          
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    ");
 if (XMLConfig.LISTENERS.size()>0) { 
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\">&nbsp;</td>\r\n");
      out.write("                                      <td valign=\"top\">&nbsp;</td>\r\n");
      out.write("                                      ");
 if ((aChatroom != null) && (aChatroom.getListeners().size()>0)) {
      out.write("\r\n");
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Listeners : </b></font></td>\r\n");
      out.write("                                       ");
} else { 
      out.write("\r\n");
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>No Listeners.</b></font></td>\r\n");
      out.write("                                       ");
} 
      out.write("\r\n");
      out.write("                                      <td valign=\"top\">\r\n");
      out.write("                                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                          ");

 					  if (aChatroom != null) {
                                          Vector vListeners = aChatroom.getListeners();
                                          jChatBox.Chat.Event.ChatroomListener aListener = null;
                                          for (int f=0;f<vListeners.size();f++)
                                          {
                                             aListener = (jChatBox.Chat.Event.ChatroomListener) vListeners.elementAt(f);
                                          
      out.write("\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">&#149; </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( aListener.getName() );
      out.write("</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                           }
 					  }
                                          
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    ");
} 
      out.write("\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font color=\"#000099\">&nbsp;Transcript\r\n");
      out.write("                                        </font></b><font color=\"#333333\"> <font size=\"-2\">\r\n");
      out.write("                                        (This text file will be saved in your\r\n");
      out.write("                                        logs folder)</font></font><b><font color=\"#000099\">\r\n");
      out.write("                                        </font></b></font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>&nbsp;Filename\r\n");
      out.write("                                        : </b>\r\n");
      out.write("                                        <input type=\"text\" name=\"filename\" value=\"chatroomtranscript.txt\" size=\"30\" class=\"SystemBox\">\r\n");
      out.write("                                        <input type=\"button\" name=\"Generate\" value=\"Generate\" class=\"SystemButton\" onClick=\"generate()\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"todo\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( ID );
      out.write("\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"username\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"ip\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"rand\" value=\"");
      out.print( System.currentTimeMillis() );
      out.write("\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                      ");

                                      	if ( (session.getValue("winusers") != null) && ((session.getValue("winusers")).equals("open")) )
                                      	{
      out.write("\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font size=\"-1\">&nbsp;</font></font></b></font><font size=\"-1\"><a href=\"javascript:closeusers()\"><img src=\"images/x.gif\" border=\"0\" alt=\"Manage users\" align=\"absmiddle\"></a>&nbsp;<a href=\"javascript:closeusers()\" class=\"bluelink\">Users</a>&nbsp;(");
 if (aChatroom != null) out.print(aChatroom.getTotalUsers()); 
      out.write('/');
 if (aChatroom != null) out.print(aChatroom.getParams().getMaxUsers()); 
      out.write(")\r\n");
      out.write("                                        - </font></font></b><font size=\"-2\" color=\"#000099\"><font size=\"-1\"><a href=\"javascript:viewusers()\" class=\"bluelink\">refresh</a></font></font></font></td>\r\n");
      out.write("                                    \t\t</tr>\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\">\r\n");
      out.write("                                        <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                          <tr bgcolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>&nbsp;Name&nbsp;</b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>IP</b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>User\r\n");
      out.write("                                              Agent</b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Action</b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><font size=\"-2\" color=\"#666666\">last\r\n");
      out.write("                                              access</font></font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                          	Hashtable table = new Hashtable();
                                          	if (Monitor != null) table = Monitor.getTable();
      										Enumeration e = table.keys();
      										ChatroomUser cUser = null;
      										HttpSession cSession = null;
      										int cID = -1;
							       			Vector filters = aChatroom.getParams().getFilters();
							       			jChatBox.Chat.Filter.Filter filter = null;
							       			String username = null;
      										while (e.hasMoreElements())
      										{
												cUser = (ChatroomUser) e.nextElement();
												cSession = (HttpSession) table.get(cUser);
												if (cUser.getParams().getChatroom() == 	id)
												{
													username = cUser.getName();
									       			/** Filter username for non-SYSTEM users */
													if (cUser.getType() != User.SYSTEM)
													{
														for (int f=0;f<filters.size();f++)
														{
															filter = (jChatBox.Chat.Filter.Filter) filters.elementAt(f);
									               			username = filter.process(username);
									               		}
									                }
													
      out.write("\r\n");
      out.write("                                          <tr align=\"center\">\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\" nowrap><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;");
      out.print( username );
      out.write("&nbsp;</font></td>\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;");
      out.print( cUser.getIP() );
      out.write("&nbsp;</font></td>\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;");
      out.print( cUser.getParams().getAgent() );
      out.write("&nbsp;</font></td>\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;<a href=\"javascript:kickoff('");
      out.print( cUser.getName() );
      out.write("')\" class=\"menulink\">kickoff</a>&nbsp;&nbsp;<a href=\"javascript:ban('");
      out.print( cUser.getName() );
      out.write("')\" class=\"menulink\">ban</a>&nbsp;</font></td>\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\" color=\"#666666\">(");
      out.print( (System.currentTimeMillis()-cSession.getLastAccessedTime())/1000 );
      out.write('/');
      out.print( cSession.getMaxInactiveInterval() );
      out.write(")</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                          		}
                                          	}
                                          
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                      \t\t</tr>\r\n");
      out.write("                                      ");
}
                                      	else
                                      	{
      out.write("\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font size=\"-1\">&nbsp;</font></font></b></font><font size=\"-2\" color=\"#000099\"><font size=\"-1\"><a href=\"javascript:viewusers()\"><img src=\"images/arrowdown.gif\" border=\"0\" alt=\"Manage users\" align=\"absmiddle\"></a>&nbsp;<a href=\"javascript:viewusers()\" class=\"bluelink\">Users</a></font></font></b></font></td>\r\n");
      out.write("                                    \t\t</tr>\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("                                      \t\t  <td>&nbsp;\r\n");
      out.write("\r\n");
      out.write("                                      \t\t  </td>\r\n");
      out.write("                                      \t\t</tr>\r\n");
      out.write("                                      \t");
}
                                      
      out.write("\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                      ");

                                      	if ( (session.getValue("winblacklist") != null) && ((session.getValue("winblacklist")).equals("open")) )
                                      	{
      out.write("\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font size=\"-1\">&nbsp;</font></font></b></font><font size=\"-1\"><a href=\"javascript:closeblacklist()\"><img src=\"images/x.gif\" border=\"0\" alt=\"Manage blacklist\" align=\"absmiddle\"></a>&nbsp;<a href=\"javascript:closeblacklist()\" class=\"bluelink\">Blacklist</a>&nbsp;(");
 if (aChatroom != null) out.print(aChatroom.getBlacklist().getSize()); 
      out.write(")\r\n");
      out.write("                                        - </font></font></b><font size=\"-2\" color=\"#000099\"><font size=\"-1\"><a href=\"javascript:clearblacklist()\" class=\"bluelink\">clear</a></font></font></font></td>\r\n");
      out.write("                                    \t\t</tr>\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("                                      \t\t  <td>\r\n");
      out.write("                                        <table width=\"100%%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                          <tr bgcolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>IP</b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>Action</b></font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                          	if (aChatroom != null)
                                          	{
                                          		Vector vList = aChatroom.getBlacklist().getList();
      											for (int l=0;l<vList.size();l++)
      											{
													
      out.write("\r\n");
      out.write("                                          <tr align=\"center\">\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;");
      out.print( (String) vList.elementAt(l) );
      out.write("&nbsp;</font></td>\r\n");
      out.write("                                            <td bgcolor=\"#FFFFFF\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\"><a href=\"javascript:remove('");
      out.print( (String) vList.elementAt(l) );
      out.write("')\" class=\"menulink\">remove</a></font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                          		}
                                          	}
                                          
      out.write("\r\n");
      out.write("                                          <tr bgcolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b>\r\n");
      out.write("                                              <input type=\"text\" name=\"userip\" size=\"16\" class=\"SystemBox\">\r\n");
      out.write("                                              </b></font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><a href=\"javascript:banip()\" class=\"menulink\"><font size=\"-2\">add\r\n");
      out.write("                                              to blacklist (ban)</font></a></font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                      \t\t</tr>\r\n");
      out.write("                                      ");
}
                                      	else
                                      	{
      out.write("\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("\r\n");
      out.write("                                      <td bgcolor=\"#EEEEEE\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\"><font size=\"-1\">&nbsp;</font></font></b></font><font size=\"-2\" color=\"#000099\"><font size=\"-1\"><a href=\"javascript:viewblacklist()\"><img src=\"images/arrowdown.gif\" border=\"0\" alt=\"Manage blacklist\" align=\"absmiddle\"></a>&nbsp;<a href=\"javascript:viewblacklist()\" class=\"bluelink\">Blacklist</a></font></font></b></font></td>\r\n");
      out.write("                                    \t\t</tr>\r\n");
      out.write("                                    \t\t<tr>\r\n");
      out.write("                                      \t\t  <td>&nbsp;\r\n");
      out.write("                                      \t\t  </td>\r\n");
      out.write("                                      \t\t</tr>\r\n");
      out.write("                                      \t");
}
                                      
      out.write("\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"><font color=\"#888888\" face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">.jChatBox is free for non-commercial sites.</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
