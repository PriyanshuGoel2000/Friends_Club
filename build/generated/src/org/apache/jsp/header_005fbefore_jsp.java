package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_005fbefore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML>\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\"><LINK \n");
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
      out.write("<STYLE type=text/css>\n");
      out.write("    .style1 {\n");
      out.write("\tFONT-WEIGHT: bold; FONT-SIZE: 14px; COLOR: #ff6600;\n");
      out.write("}\n");
      out.write("</STYLE>\n");
      out.write("\n");
      out.write("<META content=\"Microsoft FrontPage 4.0\" name=GENERATOR></HEAD>\n");
      out.write("<BODY bgColor=#c0dffd>\n");
      out.write("<TABLE cellSpacing=1% cellPadding=1% border=0>\n");
      out.write("  <TBODY>\n");
      out.write("  <TR bgColor=#3366cc>\n");
      out.write("    <TD noWrap bgColor=#2d6ac7 colSpan=2 rowSpan=2 width=\"271\"><IMG \n");
      out.write("      alt=\"Header image\" src=\"pictures/mm_travel_photo.jpg\"></TD>\n");
      out.write("    <TD id=logo vAlign=bottom noWrap align=middle width=700 bgColor=#2d6ac7 \n");
      out.write("    height=63>\n");
      out.write("      <DIV align=left>\n");
      out.write("        <marquee behavior=\"alternate\" width=\"409\" height=\"19\" direction=\"right\">Friend's Club</marquee>\n");
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
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"login1.jsp\">\n");
      out.write("      HOME</a>&nbsp; &nbsp;&nbsp;<a href=\"invite.jsp\">INVITE&nbsp;</a>&nbsp;&nbsp;\n");
      out.write("      <a href=\"compose.jsp\">MAIL&nbsp;</a>&nbsp;&nbsp;&nbsp; <a href=\"chat.jsp\">CHAT</a>&nbsp;&nbsp;\n");
      out.write("      <a href=\"groups.jsp\">GROUP</a> \n");
      out.write("      &nbsp; \n");
      out.write(" <td width=\"8\" bgcolor=\"#99CC66\">&nbsp; \n");
      out.write("     <TD id=dateformat bgColor=#99cc66 colSpan=2 height=25 width=\"700\">&nbsp;<a href=\"search.jsp\">SEARCH</a>&nbsp;\n");
      out.write("      <a href=\"about.jsp\">ABOUT</a>&nbsp; <a href=\"contact.jsp\">CONTACT</a>&nbsp;\n");
      out.write("      <b><span style=\"text-transform: uppercase\"><a href=\"http://\">Entertainment</a></span>&nbsp;\n");
      out.write("      TODAY ::\n");
      out.write("      <SCRIPT language=javascript>\n");
      out.write("      document.write(TODAY);  </SCRIPT>\n");
      out.write("      &nbsp;</b>\t\n");
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
      out.write("</table>\n");
      out.write("         \n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
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
