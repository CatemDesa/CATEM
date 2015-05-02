<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>


	
		<div class="box">
			<h2>
				<a href="#" id="toggle-forms" style="cursor: pointer;">Alta</a>
			</h2>
			
				<div style="margin:0px; position:static; overflow:hidden;">
				<div class="block" id="forms" style="margin:0px">
					<fieldset>
					<s:fielderror/>
						<legend>Alta de Socio</legend>
						<s:form action="SocioAction">
							<div class="grid_8">
								<div class="box">
								<s:textfield key="nombre" label="Nombre" />
								</div>
							</div>
							<div class="grid_8">
								<div class="box">
									<p><s:textfield key="apellido" label="Apellido" /></p>
								</div>
							</div>
						</s:form>
						</fieldset>	
				</div>
				</div>
			</div>
		
	