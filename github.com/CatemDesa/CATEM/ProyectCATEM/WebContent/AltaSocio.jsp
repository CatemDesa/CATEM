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
						<legend>Alta de Socio</legend>
						
					<div style="margin:0px; position:static; overflow:hidden; height:100%;">
						<div id="grid" style="margin:0px;">
							
							<s:form action="SocioAction" theme="simple">
								<div class="grid_8" style="witdh:95%;">
									<div class="box">
									<table style="witdh:100%;">
										<tr>
											<td>
												<p>
												<s:label>Nombre: </s:label> 
												<s:textfield key="nombre" label="Nombre" />
												</p>
												<p>
												<s:label>Apellido: </s:label>
												<s:textfield key="apellido" label="Apellido" />
												</p>
												<p>
												<s:label>Nacionalidad: </s:label>
												<s:textfield key="nacionalidad" label="Nacionalidad" />
												</p>
											</td>
											<td>
											<fieldset>
												<legend>Tipo de Socio</legend>
												<p>Particular</p>
												<p>Comercio</p>
												<p>Profecional</p>										
									</table>
											<p>
											<s:label>DNI: </s:label>
											<s:textfield key="dni" label="DNI" />
											</p>
											<p>
											<s:label>Fecha de Nacimiento: </s:label>
											<s:textfield key="fechaNacimiento" label="Fecha de Nacimiento" />
											</p>
											<p>
											<s:label>Estado Civil: </s:label>
											<s:textfield key="estadoCivil" label="Estado Civil" />
											</p>
											<p>
											<s:label>Ocupación: </s:label>
											<s:textfield key="ocupacion" label="Ocupación" />
											</p>
											<p>
											<s:label>Celular: </s:label>
											<s:textfield key="celular" label="Celular" />
											</p>
											<p>
											<s:label>Mail: </s:label>
											<s:textfield key="mail" label="mail" />
											</p>
									
									</div>
								</div>
							</s:form>
							
						</div>
					</div>
						
						</fieldset>	
				</div>
				</div>
			</div>
		
	