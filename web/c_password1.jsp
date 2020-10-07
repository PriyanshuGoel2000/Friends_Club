<%-- 
    Document   : c_password1
    Created on : Jul 22, 2020, 5:40:43 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>changing it</title>
    </head>
    <body>
           <%
      try
      {
          String naw=request.getParameter("Np");
          String nak=null;
          nak=request.getParameter("user");
          Connection con;
          Statement st;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          st=con.createStatement();
          //out.println("HJHJ");
          st.executeUpdate("update login set password='"+naw+"' where username='"+nak+"'");
           %>
           <jsp:forward page="c_success.jsp"/>
     <% }
      catch(Exception e)
      {
            e.printStackTrace();
      }
        %>
    </body>
</html>
