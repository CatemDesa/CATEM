<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CATEM - Ingresar</title>
	<link rel="stylesheet" href="css/login.css">
</head>
<body>
<div class="box">
<h2><a href="#" id="toggle-login-forms" style="cursor:pointer;" class="visible">Formulario de Login</a></h2>
<div style="margin:0p; position:static; overflow:hidden; height:340px;">
<div class="block" id="login-form" style="margin:0px;">

<fieldset class="login">
<legend>Ingreso</legend>
<s:form action="loginAction">    
	
	 <p class="notice">Introduzca sus datos
		<s:textfield key="nombreUsuario" label="Nombre de Usuario" />
	    <s:password key="password" label="Contraseña" />
 		<s:submit value="Enviar" />       
		</s:form>
	</fieldset>
	<fieldset>
	<legend>Recuperar</legend>
	<s:form action="recuperarUsuario">
	<p>Si ha olvidado su contraseña o usuario presione en recuperar
	<s:submit value="Recuperar"/>	
	</s:form>	
	</fieldset>
	</div>
	</div>
	</div>
</body>
</html>