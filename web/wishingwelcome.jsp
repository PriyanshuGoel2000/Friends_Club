<%-- 
    Document   : wishingwelcome
    Created on : Jul 8, 2020, 2:32:53 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page language="java" contentType="text/html" %>
<html>
    <head><title>Welcome Script</title></head>
    <body bgcolor="white">
    <% java.util.Date now=new java.util.Date();%>
    
 <span style="font:bold 24pt blue">             
 <% if(now.getHours()<12) { %> <font color="blue" >Good Morning!</font>
 <% } else if(now.getHours()<17) { %> <b><font color="blue">Good Afternoon!</font></b>
 <%} else { %> <font color="blue">Good Evening!</font> <% } %>
 </span>
 

        <%-- <jsp:useBean id="beanInstanceName" scope="session" class="beanPackage.BeanClassName" /> --%>
        <%-- <jsp:getProperty name="beanInstanceName"  property="propertyName" /> --%>

    </body>
</html>