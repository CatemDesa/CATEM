<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

	<div class="box menu">
		<h2>
		<a href="#" id="toggle-section-menu" style="cursor:pointer;" class="visible">Menú de opciones</a></h2>
		<div style="margin:0px;position:static; overflow:hidden;">
			<div class="block" id="section-menu" style="margin:0px;">
			<ul class="section menu">
				<li>
					<a class="menuitem current">Socios</a>
					<ul class="submenu current" >
						<li><s:a action="login">Alta</s:a></li>
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

