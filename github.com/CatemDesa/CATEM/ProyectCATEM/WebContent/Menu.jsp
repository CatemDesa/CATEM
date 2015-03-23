<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Menú de Opciones</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="box menu">
		<h2>
		<a href="#" id="toggle-section-menu" style="cursor:pointer;" class="visible">Menú de opciones</a></h2>
		<div style="margin:0px;position:static; overflow:hidden;">
			<div class="block" id="section-menu" style="margin:0px;">
			<ul class="section menu">
				<li>
					<a class="menuitem current">Socios</a>
					<ul class="submenu current" >
						<li><a>Alta</a></li>
						<li><a>Baja</a></li>
						<li><a>Modificar</a></li>
					</ul>
				</li>
				<li>
					<a class="menuitem ">Pagos</a>
					<ul class="submenu ">
						<li><a>Ingresos Socios</a></li>
						<li><a>Ingresos Extraordinarios</a></li>
						<li><a>Pagos</a></li>
					</ul>
				</li>
				<li>
					<a class="menuitem ">Cardio</a>
					<ul class="submenu ">
					</ul>
				</li>
				<li>
					<a class="menuitem ">Reportes</a>
					<ul class="submenu ">
					</ul>
				</li>
			</ul>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/mootools-1.2.1-core.js"></script>
	<script type="text/javascript" src="js/mootools-1.2-more.js"></script>
	<script type="text/javascript" src="js/mootools-fluid16-autoselect.js"></script>
</body>
</html>