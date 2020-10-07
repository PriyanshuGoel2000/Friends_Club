<%-- 
    Document   : welcome
    Created on : Jul 8, 2020, 3:05:08 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>welcome</title></head>
    <body>
<%@include  file="header.jsp"%>


<form method="POST" action="--WEBBOT-SELF--">
  <!--webbot bot="SaveResults" U-File="fpweb:///_private/form_results.txt"
  S-Format="TEXT/CSV" S-Label-Fields="TRUE" -->
  <div align="left">
    <table border="0" width="32%">
      <tr>
        <td width="100%">&nbsp;&nbsp; <img border="0" src="welcome.jpeg" width="200" height="50">
<b>
<%
      String name1=(String)session.getAttribute("usid"); 
      out.println(name1);
    %></b></td>
      </tr>
    </table>
  </div>
</form>
    </body>
</html>
