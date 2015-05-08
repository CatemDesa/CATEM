<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>



<div class="box">
	<h2>
		<a href="#" id="toggle-forms" style="cursor: pointer;">Alta</a>
	</h2>

	<div style="margin: 0px; position: static; overflow: hidden;">
		<div class="block" id="forms" style="margin: 0px">
			<fieldset>
				<legend>Alta de Socio</legend>

				<div
					style="margin: 0px; position: static; overflow: hidden; height: 100%;">
					<div id="grid" style="margin: 0px;">

						<s:form action="confimAltaSocio" theme="simple">
							<div class="grid_8" style="width: 95%;">
								<div class="box">
									<table style="witdh: 100%;">
										<tr>
											<td colspan="4">
												<p>
													<s:label>Nombre: </s:label>
													<s:textfield name="socio.nombre" label="Nombre" />
												</p>
												<p>
													<s:label>Apellido: </s:label>
													<s:textfield name="socio.apellido" label="Apellido" />
												</p>
												<p>
													<s:label>Nacionalidad: </s:label>
													<s:textfield name="socio.nacionalidad"
														label="Nacionalidad" />
												</p>
											</td>

											<td>
												<fieldset style="white-space:nowrap;">
													<legend>Tipo de Socio</legend>														
														<s:iterator value="tiposSocio"> 
														  <s:radio theme="simple" name="tipoSocioSelected" list="#{idTipoSocio:descripcion}" /><br>
														</s:iterator> 
												</fieldset>
											</td>
										</tr>
										<tr>
											<td colspan="2">
												<p>
													<s:label>DNI: </s:label>
													<s:textfield name="socio.dni" label="DNI" />
												</p>
											</td>
											<td colspan="2">
												<p>
													<s:label>Fecha de Nacimiento: </s:label>
													<s:textfield name="socio.fechaNacimiento"
														label="Fecha de Nacimiento"/>
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="2">
												<p>
													<s:label>Estado Civil: </s:label>
													<s:select list="estados" name="estadoCivilSelected" listKey="idEstadoCivil" listValue="descripcion" headerKey="-1" headerValue="Seleccionar..." ></s:select>
												</p>
											</td>

											<td colspan="2">
												<p>
													<s:label>Ocupación: </s:label>
													<s:textfield name="socio.ocupacion" label="Ocupación" />
												</p>
											</td>
										</tr>
										<tr>
											<td colspan="2">
												<p>
													<s:label>Celular: </s:label>
													<s:textfield name="socio.cel" label="Celular" />
												</p>
											</td>
											<td colspan="2">
												<p>
													<s:label>Mail: </s:label>
													<s:textfield name="socio.email" label="mail" />
												</p>
											</td>
										</tr>
									</table>

									<input type="submit" value="Aceptar" /> 
									<input type="reset"
										value="Cancelar" />

								</div>
							</div>
						</s:form>

					</div>
				</div>

			</fieldset>
		</div>
	</div>
</div>

