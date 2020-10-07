<%-- 
    Document   : login_warning
    Created on : Jul 8, 2020, 3:00:53 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<title>Only registered user's can use this service</title>
</head>

<body>
<%@include  file="header_before.jsp"%>
<form method="POST" action="select.jsp">
  
  <div align="center">
    <center>
    <table border="1" cellpadding="2" cellspacing="5" width="51%" background="pictures/img1.jpg" bordercolor="#0080FF">
      <tr>
        <td width="100%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="Home.jsp">
          <img border="0" src="pictures/home3.gif" width="88" height="27">
          </a>
          <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <b>Only registered user's can use this service!!!!</b></p>
          <p>&nbsp;<b> If you are not registered please sign-up to use
          our services.<a href="Registration.jsp">Sign Up</a></b></p>
          <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>
          If you are already a
          registered user please login</b></p>
          <div align="center">
            <table border="0" cellpadding="2" cellspacing="5" width="74%">
              <tr>
                <td width="100%">User ID<b>&nbsp;</b>&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="user" size="16">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <p>Password&nbsp;&nbsp; <input type="password" name="T1" size="16"></p>
                  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <input type="submit" value="LOGIN" name="B1" style="background-color: #6699FF; color: #FFFFFF; border-style: ridge; padding-top: 1; padding-bottom: 1">
                </td>
              </tr>
            </table>
          </div>
        </td>
      </tr>
    </table>
    </center>
  </div>
  <pre>
  
  
  </pre>
</form>
<br/><br/><br/>
<%@include  file="footer.jsp"%>
</body>

</html>
