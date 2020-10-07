<%-- 
    Document   : Entertainment
    Created on : Jul 14, 2020, 6:23:41 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entertainment</title>
        <style type="text/css">
            .preview{
         display: inline-block;
	width: 20%;
	margin-left: 5%;
	border: 2px solid #000000;
           }
        </style>
    </head>
    <body bgcolor="#A8CAF0">
        <%
    String nnn=(String)session.getAttribute("usid");  
    if(nnn==null)
    {
    response.sendRedirect("login_warning.jsp");
    }
    else
    {
     %>
     <%@include  file="welcome.jsp"%>
        <h1>.....Welcome The Entertainment zone or we can say The Gaming zone....</h1>
        <p>Here You can have access to various games developed by our team through<br/>
            which you can enjoy your time in our virtual club.<br/>
            So do Try it,but network connection is required to play these games<br/>
            and we can only play them using desktop.....</p>
        <h3>Click On The Link To Access The games: <a href="https://priyanshugoel2000.github.io/Games.html">Let's Play.</a></h3>
        <h4>A Glance at some of the games:</h4>
        <figure> <figcaption>Box Shooter (Screenshot):</figcaption> <img  class="preview" alt="BoxShooter" src="game1.png""></figure>
        <figure> <figcaption>Roller Madness (Screenshot):</figcaption><img  class="preview" alt="RollerMadness" src="game2.png"></figure>
        <figure> <figcaption>Super Sparty (Screenshot):</figcaption><img  class="preview" alt="SuperSparty" src="game3.png"></figure>
<%}%>    
<%@include  file="footer.jsp"%>
    </body>
</html>
