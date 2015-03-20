<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Home</title>
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
	body {
		background-image: url('http://crunchify.com/bg.png');
	}
	hr{
		border: 3px solid rgba(240, 239, 103, 0.82);
	}
</style>
</head>
<body>
<div class="container">
	<div class="navbar navbar-fixed-center">
    	<div class="navbar-inner">
	       	<center>
           		<form method="post" action="addUsuario.html" commandName="Administrador">
              		<h1>Login de Usuario</h1>
                		<table>
                  			<tr>
                    			<td>Usuario</td>
                  				<td><input type="text" name="txtUsuario" path="usuario" /></td>
                        	</tr>
                        	<tr>
                   				<td>Password</td>
           						<td><input type="text" name="txtPassword" path="contrasena"/></td>
           					</tr>
                        	<tr>
 								<td><button class="btn btn-large btn-primary" type="submit" value= "Login"    name="Login">Login</button></td>

                        	</tr>
                    	</table>
            	</form>
        	</center>
    	</div>
 	</div>
 	<hr>
 	
 	<form:form action="loginpublico.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.volver"/>"/>
 		</td>
 		</tr>
	</form:form>
	 <form:form action="reporte.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.generar_reporte"/>"/>
 		</td>
 		</tr>
	</form:form>
</div>
</body>
</html>