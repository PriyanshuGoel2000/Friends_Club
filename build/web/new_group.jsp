<%-- 
    Document   : new_group
    Created on : Jul 8, 2020, 2:45:34 PM
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
<title>New Page 1</title>
</head>
<%@page  import="java.sql.*"%>
<body>
<%@include  file="welcome.jsp"%>
<jsp:useBean id="group" class="friend.Groups"/>
<form method="POST" action="code_group.jsp">
  <!--webbot bot="SaveResults" U-File="fpweb:///_private/form_results.txt"
  S-Format="TEXT/CSV" S-Label-Fields="TRUE" -->
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </p>
  <div align="center">
    <center>
    <table border="0" width="53%">
      <tr>
        <td width="38%">Common Groups</td>
        <td width="62%">
        <select size="1" name="Group">
     <option value="" selected>--Select Group--</option>
        <%
       
        
         Connection conn;
          ResultSet rss=null;
          Statement stt=null;
          String gr=null;
          try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          stt=conn.createStatement();
          //String mygr="admin"
           rss=stt.executeQuery("select * from group_create where name='admin'");
           while(rss.next())
           {
               gr=rss.getString(2);
            %>
       <option value> <%=gr%></option><% } }
         catch(Exception e)
         {
             out.println("e");
         }%>
          </select></td>
      </tr>
      
      <tr>
        <td width="38%">Personal Groups</td>
        <td width="62%">
        <select size="1" name="Group1">
     <option value="" selected>--Select Group--</option>
        <%
       
        
         Connection conn1;
          ResultSet rss1=null;
          Statement stt1=null;
          String gr1=null;
          try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          stt1=conn1.createStatement();
          //String mygr="admin"
           rss1=stt1.executeQuery("select * from group_create where name='"+name1+"'");
           while(rss1.next())
           {
               gr1=rss1.getString(2);
            %>
       <option value> <%=gr1%></option><% } }
         catch(Exception e)
         {
             out.println("e");
         }%>
          </select></td>
      </tr>
    </table>
    
    </center>
  </div>
 
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="submit" value="Submit" name="B1"><input type="reset" value="Reset" name="B2"></p>
</form>

</body>

</html>

