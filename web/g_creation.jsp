<%-- 
    Document   : g_creation
    Created on : Jul 8, 2020, 2:49:27 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page  import="java.sql.*"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
    <%@include  file="welcome.jsp"%>
    <%
 String gname=request.getParameter("T1");
    int i=0;
    try
        {
          //out.println("JHJ");
          Connection con1;
        ResultSet rs;
          Statement st=null;
          String gid=null;
          Class.forName("oracle.jdbc.driver.OracleDriver");
         
          con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          
          st=con1.createStatement();
         
          rs=st.executeQuery("select count(*) from group_create  ");
          while(rs.next())
          {
              i=rs.getInt(1);
              out.println(i);
              
          }
          i=i+10;
           out.println(i);
            gid=Integer.toString(i);
            gid="G"+gid;
            out.println(gid);
            out.println(gname);
            out.println(name1);
st.executeUpdate("insert into group_create values('"+gid+"','"+gname+"','"+name1+"')");
           %>
        
          <% 
          out.println("ok");
        }
        catch(Exception e)
        {
            
        }
    
         %>
       

        <%-- <jsp:useBean id="beanInstanceName" scope="session" class="beanPackage.BeanClassName" /> --%>
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>