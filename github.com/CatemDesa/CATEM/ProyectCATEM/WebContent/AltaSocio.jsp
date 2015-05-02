<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>


	
		<div class="box">
			<h2>
				<a href="#" id="toggle-forms" style="cursor: pointer;">Alta</a>
			</h2>
			<s:form action="SocioAction">
				<div style="margin:0px; position:static; overflow:hidden;">
					<fieldset>
						<legend>Alta de Socio</legend>
						<p>
							<s:textfield key="nombre" label="Nombre" />
						</p>
					</fieldset>		
				</div>
			</s:form>
		</div>
	