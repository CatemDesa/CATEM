<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CATEM - Ingresar</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="box">
<h2><a href="#" id="toggle-login-forms" style="cursor:pointer;" class="visible">Formulario de Login</a></h2>
<div style="margin:0px; position:static; overflow:hidden;">
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
	<script type="text/javascript" src="js/mootools-1.2.1-core.js"></script>
	<script type="text/javascript" src="js/mootools-1.2-more.js"></script>
	<script type="text/javascript" src="js/mootools-fluid16-autoselect.js"></script>
</body>
</html>