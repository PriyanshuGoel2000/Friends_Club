<%-- 
    Document   : select
    Created on : Jul 7, 2020, 8:07:47 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
    <head><title>JSP Page</title></head>
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
          rs=st.executeQuery("select * from login where username='"+na+"' and password='"+pa+"' ");
          //out.println("sdfhhj");
          //st.executeUpdate("insert into login values ('"+na+"','"+pa+"')");
        
          
          while(rs.next())
          {
              na1=rs.getString("username");
                  pw=rs.getString("password");
              //out.println("HJ");
                  out.println(na1);
              out.println(pw);
           }
          if((na.equals(na1))&&(pa.equals(pw)))
          {
                 session.setAttribute("usid",na);%>
             <jsp:forward page="welcome.jsp"/>
          <%}
          else
          {%>
              <jsp:forward page="login failed.jsp"/>
         <% }
      }
      catch(Exception e)
      {
            e.printStackTrace();
      }
        %>
       

        <%-- <jsp:useBean id="beanInstanceName" scope="session" class="beanPackage.BeanClassName" /> --%>
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>

