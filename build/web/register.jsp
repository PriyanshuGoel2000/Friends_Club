<%-- 
    Document   : register
    Created on : Jul 7, 2020, 8:10:41 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
    
    <%
        String una=request.getParameter("uname");
        String fn=request.getParameter("fname");
         String pw=request.getParameter("pword");
       
          String mid=request.getParameter("ename");
       // out.println(una);
            String image=request.getParameter("image");
          // out.println(image);
           String ph=request.getParameter("phone");
          String ad=request.getParameter("add");
          String con=request.getParameter("country");
          // out.println(ph);
         String sex=request.getParameter("gender");
         String hobb=request.getParameter("hobby");
         String game=request.getParameter("game");
         String edu=request.getParameter("edu");
        
        try
        {
         // out.println("JHJ");
          Connection con1;
          //ResultSet rs;
          Statement st,st1;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          //out.println("JHJ");
          con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          //out.println("JHJ");
          st=con1.createStatement();
          //out.println("123");
           //String s="insert into user_reg values('"+una+"','"+fn+"','"+pw+"','"+mid+"','"+ph+"','"+ad+"','"+con+"','"+sex+"','"+hobb+"','"+game+"','"+edu+"','"+image+"')";
            String s="insert into user_reg1 values('"+una+"','"+fn+"','"+mid+"','"+ph+"','"+ad+"','"+con+"','"+sex+"','"+hobb+"','"+game+"','"+edu+"','"+image+"')";
        // st.executeUpdate("insert into user_reg values('ggf','fgdf','tgf','ty','etre','df','aa','retr','dass','hgjh','trtre','boy2.jpg')");
            st.executeUpdate(s);
           st1=con1.createStatement();
           st1.executeUpdate("insert into login values('"+una+"','"+pw+"')");
           %>
          <jsp:forward page="success.jsp"/>
          <% 
          out.println("error");
        }
        catch(Exception e)
        {
            
        }
    
         %>

        <%-- <jsp:useBean id="beanInstanceName" scope="session" class="beanPackage.BeanClassName" /> --%>
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>

