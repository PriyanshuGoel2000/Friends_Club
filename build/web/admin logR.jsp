<%-- 
    Document   : admin logR
    Created on : Jul 7, 2020, 6:43:39 PM
    Author     : Sankalp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  
      <%@page contentType="text/html"%>
<%@page import="java.sql.*"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
    <%
    
    try
    {
          String nm=request.getParameter("id");
          String pa=request.getParameter("pw");
          Connection conn;
          ResultSet rss;
          Statement stt;
          String na1=null;
          String pw=null;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          stt=conn.createStatement();
          rss=stt.executeQuery("select * from Admin log where adminid='"+nm+"' and password='"+pa+"' ");
          //out.println("sdfhhj");
          //st.executeUpdate("insert into login values ('"+na+"','"+pa+"')");
        
          
          while(rss.next())
          {
              na1=rss.getString("adminid");
                  pw=rss.getString("password");
              //out.println("HJ");
                  out.println(na1);
              out.println(pw);
           }
          if((nm.equals(na1))&&(pa.equals(pw)))
          {%>
             <jsp:forward page="login sucess.jsp"/>
          <%}
          else
          {%>
              <jsp:forward page="unsucess.jsp"/>
         <% }
      }
      catch(Exception e)
      {
      }
        %>
       
    
        <%-- <jsp:useBean id="beanInstanceName" scope="session" class="beanPackage.BeanClassName" /> --%>
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>