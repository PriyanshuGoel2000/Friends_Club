<%-- 
    Document   : verify
    Created on : Jul 22, 2020, 4:45:46 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verification</title>
    </head>
    <body>
        <%
      try
      {
          String na=request.getParameter("user");
          String pa=request.getParameter("T1");
         // session.setAttribute("usid",na);
          //out.println(na);
          //out.println(pa);
          String na1=null;
          String pw=null;
          
          Connection con;
          ResultSet rs;
          Statement st;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          st=con.createStatement();
          //out.println("HJHJ");
          rs=st.executeQuery("select * from user_reg1 where username='"+na+"' and email='"+pa+"' ");
          //out.println("sdfhhj");
          //st.executeUpdate("insert into login values ('"+na+"','"+pa+"')");
        
          
          while(rs.next())
          {
              na1=rs.getString("username");
                  pw=rs.getString("email");
              //out.println("HJ");
                  out.println(na1);
              out.println(pw);
           }
          if((na.equals(na1))&&(pa.equals(pw)))
          {%>
             <jsp:forward page="c_password.jsp"/>
          <%}
          else
          {%>
              <jsp:forward page="v_failed.jsp"/>
         <% }
      }
      catch(Exception e)
      {
            e.printStackTrace();
      }
        %>
    </body>
</html>
