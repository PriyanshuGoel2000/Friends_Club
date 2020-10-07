package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header_before.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n");
      out.write("<meta name=\"GENERATOR\" content=\"Microsoft FrontPage 4.0\">\n");
      out.write("<meta name=\"ProgId\" content=\"FrontPage.Editor.Document\">\n");
      out.write("<title>HOME</title>\n");
      out.write("<meta name=\"Microsoft Theme\" content=\"none\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#A8CAF0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=UTF-8\"><LINK \n");
      out.write("href=\"pictures/mm_travel2.css\" type=text/css rel=stylesheet>\n");
      out.write("<SCRIPT language=javascript>\n");
      out.write("//--------------- LOCALIZEABLE GLOBALS ---------------\n");
      out.write("var d=new Date();\n");
      out.write("var monthname=new Array(\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\");\n");
      out.write("//Ensure correct for language. English is \"January 1, 2004\"\n");
      out.write("var TODAY = monthname[d.getMonth()] + \" \" + d.getDate() + \", \" + d.getFullYear();\n");
      out.write("//---------------   END LOCALIZEABLE   ---------------\n");
      out.write("</SCRIPT>\n");
      out.write("\n");
      out.write("<STYLE type=text/css>.style1 {\n");
      out.write("  FONT-WEIGHT: bold; FONT-SIZE: 14px; COLOR: #ff6600\n");
      out.write("}\n");
      out.write("</STYLE>\n");
      out.write("\n");
      out.write("<META content=\"Microsoft FrontPage 4.0\" name=GENERATOR></HEAD>\n");
      out.write("<BODY bgColor=#c0dffd>\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"1052\" border=0>\n");
      out.write("  <TBODY>\n");
      out.write("  <TR bgColor=#3366cc>\n");
      out.write("    <TD noWrap bgColor=#2d6ac7 colSpan=2 rowSpan=2 width=\"271\"><IMG height=109 \n");
      out.write("      alt=\"Header image\" src=\"pictures/mm_travel_photo.jpg\" width=334 \n");
      out.write("      border=0></TD>\n");
      out.write("    <TD id=logo vAlign=bottom noWrap align=middle width=700 bgColor=#2d6ac7 \n");
      out.write("    height=63>\n");
      out.write("      <DIV align=left>\n");
      out.write("          <h1> FRIEND'S CLUB</h1>\n");
      out.write("      </DIV></TD></TR>\n");
      out.write("  <TR bgColor=#3366cc>\n");
      out.write("    <TD id=tagline vAlign=top align=middle bgColor=#2d6ac7 height=28 width=\"700\">\n");
      out.write("      <DIV class=style1 align=left>&nbsp; </DIV></TD></TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD bgColor=#003366 colSpan=3 width=\"973\"><IMG height=1 alt=\"\" \n");
      out.write("      src=\"pictures/mm_spacer.gif\" width=1 border=0></TD></TR>\n");
      out.write("  <tr>\n");
      out.write("    <TD bgColor=#003366 colSpan=3 width=\"973\"><IMG height=1 alt=\"\" \n");
      out.write("      src=\"pictures/mm_spacer.gif\" width=1 border=0></TD>\n");
      out.write("  </tr>\n");
      out.write("  <TR bgColor=#ccff99>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       \n");
      out.write("       <TD bgColor=#99cc66 width=\"338\">\n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"Home.jsp\">\n");
      out.write("      Log-in</a>&nbsp; &nbsp;&nbsp;<a href=\"invite.jsp\">INVITE&nbsp;</a>&nbsp;&nbsp;\n");
      out.write("      <a href=\"compose.jsp\">MAIL&nbsp;</a>&nbsp;&nbsp;&nbsp; <a href=\"chat.jsp\">CHAT</a>&nbsp;&nbsp;\n");
      out.write("      <a href=\"groups.jsp\">GROUP</a> \n");
      out.write("      &nbsp; \n");
      out.write(" <td width=\"8\" bgcolor=\"#99CC66\">&nbsp; \n");
      out.write("     <TD id=dateformat bgColor=#99cc66 colSpan=2 height=25 width=\"700\">&nbsp;<a href=\"search.jsp\">SEARCH</a>&nbsp;\n");
      out.write("      <a href=\"about.jsp\">ABOUT</a>&nbsp; <a href=\"contact.jsp\">CONTACT</a>&nbsp;\n");
      out.write("      <b><span style=\"text-transform: uppercase\"><a href=\"Entertainment.jsp\">Entertainment</a></span>&nbsp;\n");
      out.write("      TODAY ::\n");
      out.write("      <SCRIPT language=javascript>\n");
      out.write("      document.write(TODAY);  </SCRIPT>\n");
      out.write("      &nbsp;</b>  \n");
      out.write("       </TD>\n");
      out.write(" \n");
      out.write("  </TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD width=338>&nbsp;</TD>\n");
      out.write("    <TD vAlign=top colSpan=2 width=\"633\">&nbsp;<BR>&nbsp;<BR>\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=2 width=635 border=0>\n");
      out.write("        <TBODY>\n");
      out.write("         \n");
      out.write("  </table>\n");
      out.write("         \n");
      out.write("</table>     \n");
      out.write("</BODY>\n");
      out.write("</html>\n");
      out.write('\n');

    String nnn=(String)session.getAttribute("usid");  
    if(nnn!=null)
    {
    response.sendRedirect("Home_redirect.jsp");
    }
    else
    {
     
      out.write("\n");
      out.write("<form name =form1 method=\"POST\" action=\"select.jsp\">\n");
      out.write("  <!--webbot bot=\"SaveResults\"\n");
      out.write("  U-File=\"D:\\online support\\sreesha\\web\\_private\\form_results.txt\"\n");
      out.write("  S-Format=\"TEXT/CSV\" S-Label-Fields=\"TRUE\" -->\n");
      out.write("  <p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\n");
      out.write("  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"475\" height=\"148\" bgcolor=\"#A8CAF0\">\n");
      out.write("    <caption>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </caption>\n");
      out.write("    <tr background=\"#CODFFD\">\n");
      out.write("    \n");
      out.write("      <td width=\"18\" height=\"1\"></td>\n");
      out.write("      <td width=\"17\" height=\"1\"></td>\n");
      out.write("      <td width=\"344\" height=\"1\" bgcolor=\"#A8CAF0\">&nbsp;<img border=\"0\" src=\"image/login-header.gif\" width=\"306\" height=\"41\"></td>\n");
      out.write("      <td width=\"3000\" height=\"1\" bgcolor=\"#A8CAF\" colspan=\"2\"><b>&nbsp;<font color=\"#FFFFFF\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></b></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr background=\"#C0DFFD\">\n");
      out.write("      <td width=\"18\" height=\"50\"></td>\n");
      out.write("      <td width=\"17\" height=\"154\" rowspan=\"4\"><img border=\"0\" src=\"talk1.jpg\" width=\"250\" height=\"159\">&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("      <td width=\"192\" height=\"50\" bgcolor=\"#A8CAF0\">&nbsp;User ID <input type=\"text\" name=\"user\" size=\"22\"></td>\n");
      out.write("      <td width=\"6\" height=\"154\" bgcolor=\"#A8CAF0\" rowspan=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("      <td width=\"300\" height=\"154\" bgcolor=\"#FFFFFF\" rowspan=\"4\"><img border=\"0\" src=\"talk2.jpg\" width=\"430\" height=\"167\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"18\" height=\"36\"></td>\n");
      out.write("      <td width=\"192\" height=\"36\" bgcolor=\"#A8CAF0\">&nbsp;Password&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"password\" name=\"T1\" size=\"22\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"18\" height=\"28\"></td>\n");
      out.write("      <td width=\"217\" height=\"28\" bgcolor=\"#A8CAF0\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"http//:select.jsp\">\n");
      out.write("        <input type=\"submit\" value=\"LOGIN\" name=\"B1\" style=\"background-color: #000080; color: #FFFFFF; font-weight: bold\"></a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"18\" height=\"40\"></td>\n");
      out.write("      <td width=\"267\" height=\"40\" bgcolor=\"#A8CAF0\"><a href=\"forgot_password.jsp\">Forgot\n");
      out.write("        Password?&nbsp;</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"Registration.jsp\">\n");
      out.write("        Sign Up</a></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"7\" width=\"887\">\n");
      out.write("   <tr background=\"#CODFFD\">\n");
      out.write("      <td width=\"883\" colspan=\"2\" height=\"5\" bordercolor=\"#A8CAF0\" bgcolor=\"#A8CAF0\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"1049\" height=\"1\" bgcolor=\"#A8CAF0\">&nbsp;</td>\n");
      out.write("      <td width=\"111\" height=\"1\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"883\" colspan=\"2\" height=\"6\" bgcolor=\"#A8CAF0\"></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <LINK \n");
      out.write("href=\"pictures/mm_travel2.css\" type=text/css rel=stylesheet>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            footer{\n");
      out.write("          background: #003366;\n");
      out.write("          width: 1052px;\n");
      out.write("          margin =0%;\n");
      out.write("          padding =0%;\n");
      out.write("          float:left;\n");
      out.write("           overflow:auto;}\n");
      out.write("           #ima{\n");
      out.write("\twidth: 75px;\n");
      out.write("           }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              <footer class=\"footer\">\n");
      out.write("          <img id=\"ima\" src=\"namaste.jpg\" align=\"left\" alt=\"Creaters\"/>\n");
      out.write("<p>©This Project is Co-created by Sankalp Trivedi & Priyanshu Goel.All Rights Reserved.2020</p>\n");
      out.write("</footer>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
}
      out.write("\n");
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
