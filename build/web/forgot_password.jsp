<%-- 
    Document   : forgot_password
    Created on : Jul 19, 2020, 5:52:20 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>    
    </head>
    <body bgcolor="#A8CAF0">
        <%@include file="header_before.jsp"%>
        <form name =form1 method="POST" action="verify.jsp">
  <p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
  <table border="0" cellpadding="0" cellspacing="0" width="475" height="148" bgcolor="#A8CAF0">
    <caption>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </caption>
    <tr background="#CODFFD">
    
      <td width="18" height="1"></td>
      <td width="17" height="1"></td>
      <td width="344" height="1" bgcolor="#A8CAF0">&nbsp;<img border="0" src="image/login-header.gif" width="306" height="41"></td>
      <td width="3000" height="1" bgcolor="#A8CAF" colspan="2"><b>&nbsp;<font color="#FFFFFF">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></b></td>
    </tr>
    <tr background="#C0DFFD">
      <td width="18" height="50"></td>
      <td width="17" height="154" rowspan="4"><img border="0" src="talk1.jpg" width="250" height="159">&nbsp;&nbsp;&nbsp;</td>
      <td width="192" height="50" bgcolor="#A8CAF0">&nbsp;User ID <input type="text" name="user" size="22" required></td>
      <td width="6" height="154" bgcolor="#A8CAF0" rowspan="4">&nbsp;&nbsp;&nbsp;&nbsp;</td>
      <td width="300" height="154" bgcolor="#FFFFFF" rowspan="4"><img border="0" src="talk2.jpg" width="430" height="167"></td>
    </tr>
    <tr>
      <td width="18" height="36"></td>
      <td width="192" height="36" bgcolor="#A8CAF0">&nbsp;Email&nbsp;&nbsp;&nbsp;
          <input type="email" name="T1" size="30" required></td>
    </tr>
    <tr>
      <td width="18" height="28"></td>
      <td width="217" height="28" bgcolor="#A8CAF0">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="http//:verify.jsp">
            <input type="submit" value="Next" name="check" style="background-color: #000080; color: #FFFFFF; font-weight: bold"></a></td>
    </tr>
  </table>
  <table border="0" cellpadding="0" cellspacing="0" height="7" width="887">
   <tr background="#CODFFD">
      <td width="883" colspan="2" height="5" bordercolor="#A8CAF0" bgcolor="#A8CAF0">&nbsp;</td>
    </tr>
    <tr>
      <td width="1049" height="1" bgcolor="#A8CAF0">&nbsp;</td>
      <td width="111" height="1"></td>
    </tr>
    <tr>
      <td width="883" colspan="2" height="6" bgcolor="#A8CAF0"></td>
    </tr>
  </table>
  <p>&nbsp;</p>
</form>
<%@include file="footer.jsp"%>
    </body>
</html>
