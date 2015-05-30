<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CATEM - Ingresar</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body style="margin: 0px 25% 0px 25%;">

	<div class="box">
		<h2>
			<a href="#" id="toggle-login-forms" style="cursor: pointer;"
				class="visible">Formulario de Login</a>
		</h2>


		<div style="margin: 0px; position: static; overflow: hidden;">
			<div class="block" id="login-form" style="margin: 0px;">
				<s:form action="login" validate="true" method="post" theme="simple">

					<fieldset class="login">
						<legend>Ingreso</legend>

						<p class="notice">Introduzca sus datos</p>
						<br />
						<table style="width: 60%;">
							<tr>
								<td><s:label key="username"></s:label></td>
								<td><s:textfield key="username" name="username" size="15" /></td>
								<td><s:fielderror fieldName="username"></s:fielderror></td>
							</tr>
							<tr>
								<td><s:label key="password"></s:label></td>
								<td><s:password key="password" name="password" size="15" /></td>
								<td><s:fielderror fieldName="password"></s:fielderror></td>
							</tr>
						</table>
						<br />
						<div style="aling:rigth">
						<s:submit value="Enviar" />
						</div>
					</fieldset>
				</s:form>
				<fieldset>
					<legend>Recuperar</legend>
					<s:form action="recuperarUsuario">
						<p>
							Si ha olvidado su contraseña o usuario presione en recuperar
							<s:submit value="Recuperar" />
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