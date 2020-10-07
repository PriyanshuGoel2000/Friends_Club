<%-- 
    Document   : c_password
    Created on : Jul 22, 2020, 5:04:22 PM
    Author     : Vinamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Your Password</title>
        <style type="text/css">
            input{
	border: 1px solid #b3b3b3;
}
input:focus{
	background-color: #e6e6e6;
}
fieldset{
	margin-bottom: 4%;
        width:75%;
}
        </style>
        <script type="text/javascript">
            function validateForm(){
                var x=document.forms["form2"]["Np"].value;
                var y=document.forms["form2"]["rtp"].value;
                if(x!==y){
                    alert("Cannot Validate Password retype again");
                    return false;
                }
            }
            </script>
    </head>
   <body bgcolor="#A8CAF0">
        <%@include file="header_before.jsp"%>
        <hr/>
        <h2>Advisory: Be Smart While Changing your password, don't be dumb... :)</h2><hr/>
         <form name =form2 method="POST" action="c_password1.jsp" onsubmit="return validateForm()">
	<fieldset>
		<legend>
			Change Password
		</legend>
                <label for="User Name">User Name:</label>
		<input type="text" name="user" placeholder="your username" id="User Name" required><br/>
		<label for="New Password">New Password:</label>
		<input type="password" name="Np" placeholder="your password" id="New Password" required><br/>
                <label for="Re Password"> Retype New Password:</label>
                <input type="password" name="rtp" placeholder="your password" id="Re Password" required><br/>
                <br/><br/>
                <input type="submit" value="Change Password" style="background-color: #000080; color: #FFFFFF; font-weight: bold"/>
	</fieldset>
</form>
        <br/><br/><br/><br/><br/><br/>
        <%@include file="footer.jsp"%>
    </body>
</html>
