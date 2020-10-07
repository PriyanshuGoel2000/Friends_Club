<%-- 
    Document   : g_create
    Created on : Jul 8, 2020, 2:42:39 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page  import="java.sql.*"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
    <jsp:useBean id="my" scope="session" class="friend.FriendClass" /> 
    
    <%@include  file="welcome.jsp"%>
     <%@include  file="group_head.jsp"%>
    <%@include  file="new_group.jsp"%>
   
    
    <%
  out.println(name1);
    String id=request.getParameter("G1");
    session.setAttribute("gid",id);
   out.println(id);
    ResultSet rs=null;
    Statement st;
    Connection con;
    String na=null;
  try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          st=con.createStatement();
          rs=st.executeQuery("select uname from user_reg1 where email='"+id+"' ");
          while(rs.next())
          {
              na=rs.getString(1);
          }
         out.println(na);
         session.setAttribute("member",na);
  }
  catch(Exception e)
  {
  }
   //  String mem=(String)session.getAttribute("member");
        // String gid=(String)session.getAttribute("gid");
        // out.println(mem);
        // out.println(gid);
        %>

     
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>