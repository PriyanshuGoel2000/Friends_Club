package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jChatBox.Util.*;
import jChatBox.Chat.*;
import jChatBox.Chat.Filter.*;
import java.util.*;

public final class open_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String jspDisplay = SystemProcessor.execute(request,session,application);
	if (jspDisplay != null)
	{
		response.sendRedirect(jspDisplay);
	}
	else
	{
		ChatroomManager = jChatBox.Chat.ChatroomManager.getInstance();
	}

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<LINK REL=STYLESHEET TYPE=\"text/css\" HREF=\"styles/admin.css\">\r\n");
      out.write("<script language=\"JavaScript\"><!--\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("\tif (document.chatroom.name.value.length != 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.chatroom.subject.value.length != 0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.chatroom.todo.value = \"openchatroom\";\r\n");
      out.write("                        document.chatroom.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"You have to fill in SUBJECT parameter !\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"You have to fill in NAME parameter !\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function cancel()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.href=\"menu.jsp\";\r\n");
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
      out.write("//--></script>\r\n");
      out.write("<title>jChatBox Manager</title>\r\n");
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
      out.write("<form method=\"post\" action=\"menu.jsp\" name=\"chatroom\">\r\n");
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
      out.write("                  <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                    <select name=\"chatrooms\" onChange=\"manage(this.options[selectedIndex].value);\">\r\n");
      out.write("                      <option selected>Select a chatroom</option>\r\n");
      out.write("                      ");

                      	if (ChatroomManager != null)
                      	{
                      		Vector chatrooms = ChatroomManager.getChatrooms();
                      		Chatroom chatroom = null;
                      		for (int i=0;i<chatrooms.size();i++)
                      		{
                      			chatroom = (Chatroom) chatrooms.elementAt(i);
                      			out.print("<option value=\""+chatroom.getParams().getID()+"\">"+chatroom.getParams().getName()+"</option>");
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
      out.write("            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\" color=\"#FF0000\"><b>Open\r\n");
      out.write("              a chatroom</b></font></td>\r\n");
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
      out.write("                                <div align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\"><b><font color=\"#0000FF\">\r\n");
      out.write("                                  <font face=\"Arial, Helvetica, sans-serif\">-\r\n");
      out.write("                                  Setup parameters to open a chatroom -</font></font></b></font><br>\r\n");
      out.write("                                  <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\" color=\"#FF0000\"><b><font size=\"-2\">\r\n");
      out.write("                                  ");

                                	if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMNAMEMISSING)) out.print("Chatroom's name missing !");
                                  	else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMSUBJECTMISSING)) out.print("Chatroom's subject missing !");
                                  
      out.write("\r\n");
      out.write("                                  </font></b></font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\"><b>\r\n");
      out.write("                                  </b></font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><br>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  </b></font>\r\n");
      out.write("                                  <table width=\"65%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                    <tr bgcolor=\"#EEEEEE\">\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\">Basic\r\n");
      out.write("                                        parameters :</font></b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;</font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Name\r\n");
      out.write("                                        : ");
 if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMNAMEMISSING)) out.print("<font color=#ff0000>*</font>"); 
      out.write("</font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"text\" name=\"name\" size=\"16\" class=\"SystemBox\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Subject\r\n");
      out.write("                                        : ");
 if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMSUBJECTMISSING)) out.print("<font color=#ff0000>*</font>"); 
      out.write("</font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"text\" name=\"subject\" size=\"16\" class=\"SystemBox\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Max.\r\n");
      out.write("                                        users : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"maxusers\" class=\"SystemBox\">\r\n");
      out.write("                                          <option value=\"5\">5</option>\r\n");
      out.write("                                          <option value=\"10\">10</option>\r\n");
      out.write("                                          <option value=\"15\">15</option>\r\n");
      out.write("                                          <option value=\"20\" selected>20</option>\r\n");
      out.write("                                          <option value=\"25\">25</option>\r\n");
      out.write("                                          <option value=\"30\">30</option>\r\n");
      out.write("                                          <option value=\"35\">35</option>\r\n");
      out.write("                                          <option value=\"40\">40</option>\r\n");
      out.write("                                          <option value=\"45\">45</option>\r\n");
      out.write("                                          <option value=\"50\">50</option>\r\n");
      out.write("                                          <option value=\"55\">55</option>\r\n");
      out.write("                                          <option value=\"60\">60</option>\r\n");
      out.write("                                          <option value=\"65\">65</option>\r\n");
      out.write("                                          <option value=\"70\">70</option>\r\n");
      out.write("                                          <option value=\"75\">75</option>\r\n");
      out.write("                                          <option value=\"80\">80</option>\r\n");
      out.write("                                          <option value=\"85\">85</option>\r\n");
      out.write("                                          <option value=\"90\">90</option>\r\n");
      out.write("                                          <option value=\"95\">95</option>\r\n");
      out.write("                                          <option value=\"100\">100</option>\r\n");
      out.write("                                          <option value=\"150\">150</option>\r\n");
      out.write("                                          <option value=\"200\">200</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Display\r\n");
      out.write("                                        mode : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"mode\" class=\"SystemBox\">\r\n");
      out.write("                                          <option value=\"framed\">Framed (JSP)</option>\r\n");
      out.write("                                          <option value=\"bufferedframed\" selected>Buffered-Framed\r\n");
      out.write("                                          (JSP)</option>\r\n");
      out.write("                                          <option value=\"applet\">Applet</option>\r\n");
      out.write("                                          <option value=\"flash\">Flash</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <hr noshade width=\"65%\" size=\"1\">\r\n");
      out.write("                                  <table width=\"65%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                    <tr bgcolor=\"#EEEEEE\">\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\">Advanced\r\n");
      out.write("                                        parameters :</font></b></font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">&nbsp;</font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">History\r\n");
      out.write("                                        : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"history\" class=\"SystemBox\">\r\n");
      out.write("                                          <option value=\"20\">20</option>\r\n");
      out.write("                                          <option value=\"25\">25</option>\r\n");
      out.write("                                          <option value=\"30\">30</option>\r\n");
      out.write("                                          <option value=\"35\" selected>35</option>\r\n");
      out.write("                                          <option value=\"40\">40</option>\r\n");
      out.write("                                          <option value=\"45\">45</option>\r\n");
      out.write("                                          <option value=\"50\">50</option>\r\n");
      out.write("                                          <option value=\"55\">55</option>\r\n");
      out.write("                                          <option value=\"60\">60</option>\r\n");
      out.write("                                          <option value=\"70\">70</option>\r\n");
      out.write("                                          <option value=\"80\">80</option>\r\n");
      out.write("                                          <option value=\"90\">90</option>\r\n");
      out.write("                                          <option value=\"100\">100</option>\r\n");
      out.write("                                          <option value=\"120\">120</option>\r\n");
      out.write("                                          <option value=\"150\">150</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Refresh\r\n");
      out.write("                                        limit : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"refreshlimit\" class=\"SystemBox\">\r\n");
      out.write("                                          <option value=\"3\">3 seconds</option>\r\n");
      out.write("                                          <option value=\"5\">5 seconds</option>\r\n");
      out.write("                                          <option value=\"8\">8 seconds</option>\r\n");
      out.write("                                          <option value=\"10\">10 seconds</option>\r\n");
      out.write("                                          <option value=\"12\" selected>12 seconds</option>\r\n");
      out.write("                                          <option value=\"15\">15 seconds</option>\r\n");
      out.write("                                          <option value=\"18\">18 seconds</option>\r\n");
      out.write("                                          <option value=\"20\">20 seconds</option>\r\n");
      out.write("                                          <option value=\"25\">25 seconds</option>\r\n");
      out.write("                                          <option value=\"30\">30 seconds</option>\r\n");
      out.write("                                          <option value=\"40\">40 seconds</option>\r\n");
      out.write("                                          <option value=\"50\">50 seconds</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Refresh\r\n");
      out.write("                                        model : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"refreshmodel\" class=\"SystemBox\">\r\n");
      out.write("                                          <option value=\"1\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Time-Constant</font></option>\r\n");
      out.write("                                          <option value=\"2\" selected><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Action-Tracker</font></option>\r\n");
      out.write("                                          <option value=\"3\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Room-Load</font></option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Private\r\n");
      out.write("                                        messages : </font></td>\r\n");
      out.write("                                      <td>\r\n");
      out.write("                                        <table width=\"60%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"radio\" name=\"private\" value=\"yes\" checked>\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Yes</font></td>\r\n");
      out.write("                                            <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"radio\" name=\"private\" value=\"no\">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">No</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Language\r\n");
      out.write("                                        : </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"language\" class=\"SystemBox\">\r\n");
      out.write("                                          ");

                                           Hashtable languages = XMLConfig.LANGUAGES;
                                           String defaultStr = XMLConfig.DEFAULTLANGUAGE;
                                           String defaultLanguage = "";
                                           if (languages != null)
                                           {
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
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Filters\r\n");
      out.write("                                        : </font></td>\r\n");
      out.write("                                      <td>\r\n");
      out.write("                                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                          ");

                                            Vector vFiltersList = XMLConfig.FILTERS;
                                            jChatBox.Chat.Filter.Filter aFilter = null;
                                            String Check = " checked";
                                            for (int f=0;f<vFiltersList.size();f++)
                                            {
                                            aFilter = (jChatBox.Chat.Filter.Filter) vFiltersList.elementAt(f);
                                            
      out.write("\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td width=\"15%\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"checkbox\" name=\"");
      out.print( aFilter.getID() );
      out.write("\" value=\"ok\"");
      out.print( Check );
      out.write(">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td width=\"85%\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( aFilter.getName() );
      out.write("</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                            }
                                         
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    ");
 if (XMLConfig.LISTENERS.size() > 0) { 
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td valign=\"top\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Listeners\r\n");
      out.write("                                        : </font></td>\r\n");
      out.write("                                      <td>\r\n");
      out.write("                                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                          ");

                                            Vector vListenersList = XMLConfig.LISTENERS;
                                            jChatBox.Chat.Event.ChatroomListener aListener = null;
                                            Check = " checked";
                                            for (int f=0;f<vListenersList.size();f++)
                                            {
                                            aListener = (jChatBox.Chat.Event.ChatroomListener) vListenersList.elementAt(f);
                                            
      out.write("\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                            <td width=\"15%\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                              <input type=\"checkbox\" name=\"");
      out.print( aListener.getID() );
      out.write("\" value=\"ok\"");
      out.print( Check );
      out.write(">\r\n");
      out.write("                                              </font></td>\r\n");
      out.write("                                            <td width=\"85%\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">");
      out.print( aListener.getName() );
      out.write("</font></td>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                          ");

                                            }
                                         
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                      </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <hr noshade width=\"65%\" size=\"1\">\r\n");
      out.write("                                  <table border=\"0\" cellspacing=\"1\" cellpadding=\"1\" width=\"65%\">\r\n");
      out.write("                                    <tr bgcolor=\"#EEEEEE\">\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"><b><font size=\"-2\" color=\"#000099\">Moderators\r\n");
      out.write("                                        :</font></b></font></td>\r\n");
      out.write("                                      <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-2\">Multiple\r\n");
      out.write("                                        moderator selection is allowed.</font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"left\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <select name=\"moderatorlist\" size=\"3\" multiple class=\"SystemBox\">\r\n");
      out.write("                                          ");
 if ( (XMLConfig.MODERATORS != null) && (!XMLConfig.MODERATORS.isEmpty()) )
													  {
                                                        
      out.write("\r\n");
      out.write("                                          <option value=\"\">- Select moderator(s) -</option>\r\n");
      out.write("                                          ");

														ChatroomUser cUser = (ChatroomUser) session.getValue(XMLConfig.USERSESSIONID);
														String preselection = null;
														if ((cUser != null) && (cUser.getType()==User.MODERATOR)) preselection = cUser.getName();
														Enumeration e = XMLConfig.MODERATORS.keys();
														while (e.hasMoreElements())
														{
															String name = (String) e.nextElement();
															if ((preselection != null) && (preselection.equals(name)))
															{
															
      out.write("<option selected value=\"");
      out.print( name );
      out.write('"');
      out.write('>');
      out.print( name );
      out.write("</option>");

															}
															else
															{
															
      out.write("<option value=\"");
      out.print( name );
      out.write('"');
      out.write('>');
      out.print( name );
      out.write("</option>");

															}
														}
													  }
													  else
													  {
                                                        
      out.write("\r\n");
      out.write("                                          <option value=\"\">- No moderator available -</option>\r\n");
      out.write("                                          ");

													  }
													
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                  </font>\r\n");
      out.write("                                  <table border=\"0\" cellspacing=\"2\" cellpadding=\"1\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"button\" name=\"Button\" value=\"Open\" onClick=\"validate()\" class=\"SystemButton\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                      <td><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                        <input type=\"button\" name=\"Cancel\" value=\"Cancel\" onClick=\"cancel()\" class=\"SystemButton\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"todo\" value=\"openchatroom\">\r\n");
      out.write("                                        </font></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </table>\r\n");
      out.write("                                  <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                  &nbsp;</font></div>\r\n");
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
