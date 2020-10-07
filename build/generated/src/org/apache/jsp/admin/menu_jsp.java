package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jChatBox.Util.*;
import jChatBox.Chat.*;
import java.util.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String jspDisplay = SystemProcessor.execute(request, session, application);
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
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
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
      out.write("//-->\r\n");
      out.write("</script>\r\n");
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
      out.write("<form method=\"post\" action=\"menu.jsp\" name=\"chat\">\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"25%\">\r\n");
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
      out.write("                                <div align=\"center\"><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">Welcome\r\n");
      out.write("                                  to jChatBox administration panel !<br>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  </font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\" color=\"#FF0000\"><b>\r\n");
      out.write("                                  ");

          							if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMOPENED)) out.print("Chatroom has been opened successfully.");
          							else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMCLEARED)) out.print("Chatroom content has been cleared successfully.");
          							else if ((SystemProcessor.getSysMessage(session)).equals(Conf.CHATROOMCLOSED)) out.print("Chatroom has been closed/removed successfully.");
          							else if ((SystemProcessor.getSysMessage(session)).equals(Conf.SYSTEMERROR)) out.print("Cannot execute : System error.");
          							else if ((SystemProcessor.getSysMessage(session)).equals(Conf.BACKUPDONE)) out.print("Chatrooms backup done successfully.");
          							else if ((SystemProcessor.getSysMessage(session)).equals(Conf.COMMANDNOTALLOWED)) out.print(Conf.COMMANDNOTALLOWED);
          						  
      out.write("\r\n");
      out.write("                                  </b></font><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\">\r\n");
      out.write("                                  </font></div>\r\n");
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
      out.write("        <div align=\"center\"><br>\r\n");
      out.write("          <font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\" color=\"#FF0000\"><b>\r\n");
      out.write("          </b></font> </div>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <p><font face=\"Verdana, Arial, Helvetica, sans-serif\" size=\"-1\"> </font></p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
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
