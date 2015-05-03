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
								<div class="grid_8" style="width:95%;">
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
												</fieldset>	
											</td>								
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>DNI: </s:label>
											<s:textfield key="dni" label="DNI" />
											</p>
										</td>
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>Fecha de Nacimiento: </s:label>
											<s:textfield key="fechaNacimiento" label="Fecha de Nacimiento" />
											</p>
										</td>
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>Estado Civil: </s:label>
											<s:textfield key="estadoCivil" label="Estado Civil" />
											</p>
										</td>
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>Ocupación: </s:label>
											<s:textfield key="ocupacion" label="Ocupación" />
											</p>
										</td>
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>Celular: </s:label>
											<s:textfield key="celular" label="Celular" />
											</p>
										</td>
										</tr>
										<tr>
										<td colspan="2">
											<p>
											<s:label>Mail: </s:label>
											<s:textfield key="mail" label="mail" />
											</p>
										</td>
										</tr>
										</table>
									
									</div>
								</div>
							</s:form>
							
						</div>
					</div>
						
						</fieldset>	
				</div>
				</div>
			</div>
		
	