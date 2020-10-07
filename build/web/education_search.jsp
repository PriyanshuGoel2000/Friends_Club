<%-- 
    Document   : education_search
    Created on : Jul 7, 2020, 7:57:32 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page  import="java.sql.*"%>
<html>

<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<title>New Page 3</title>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<title>New Page 3</title>
</head>

<body>
<%@include  file="welcome.jsp"%>
<form method="POST" action="search_cat.jsp">
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </p>
  <div align="center">
    <center>
    <table border="1" width="592">
      <tr>
        <td width="84">Education</td>
        <td width="78">Name</td>
        <td width="98">E mail Id</td>
        <td width="92">Country</td>
        <td width="92">Address</td>
        <td width="98">Phone No</td>
        <td width="102">Image</td>
      </tr><tr>
   <% 
   String txt=(String)session.getAttribute("new");
    String na=null;
    String add=null;
    String id=null;
    String ph=null;
    String con1=null;
   String img=null;
           /* String hob1=null;
    String edu=null;
    String game=null;*/
   try
        {
        Connection conn;
          ResultSet rs;
          Statement st;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          st=conn.createStatement();
          //out.println("HJHJ");
         
          
             
          rs=st.executeQuery("select * from user_reg1 where education='"+txt+"'  ");
         while (rs.next())
         {
              na=rs.getString("fullname");
              id=rs.getString("email");
              add=rs.getString("address");
             ph=rs.getString("phone");
              con1=rs.getString("country"); 
               img=rs.getString("photo"); 
               %>
              <td><%=txt%></td>
              <td><%=na%></td>
              <td><%=id%></td>
              <td><%=con1%></td>
              <td><%=add%></td>
              <td><%=ph%></td>
              <td><img src="<%=img%>"></td></tr>
               
         <% }
   }
   catch(Exception e)
   {
   }%>
      
    </table>
    </center>
  </div>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;</p>
  <p>&nbsp;
  </p>
</form>

</body>

</html>
