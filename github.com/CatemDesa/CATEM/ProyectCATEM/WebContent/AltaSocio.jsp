<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CATEM - Alta Socio</title>
<link rel="stylesheet" href="css/style.css">
<s:head/>
</head>
<body>
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

							<div class="grid_8" style="width: 95%;">
								<div class="box">
									<s:form action="confimAltaSocio" theme="simple" validate="true" method="post">
										<table style="witdh: 100%;">
											<tr>
												<td colspan="3">
													<p>
														<s:label key="nombre"></s:label>
														<s:textfield name="socio.nombre" key="nombre"
															theme="simple" />
														<s:fielderror fieldName="socio.nombre"></s:fielderror>
													</p>
													<p>
														<s:label key="apellido"></s:label>
														<s:textfield name="socio.apellido" key="apellido" />
														<s:fielderror fieldName="socio.apellido"></s:fielderror>
													</p>
													<p>
														<s:label key="nacionalidad"></s:label>
														<s:textfield name="socio.nacionalidad"
															key="nacionalidad" />
														<s:fielderror fieldName="socio.nacionalidad"></s:fielderror>
													</p>
												</td>

												<td>
													<fieldset style="white-space: nowrap;">
														<s:label key="tipoSocio"></s:label>
														<br />														
														<s:radio key="tipoSocio" name="socio.idTipoSocio" list="tiposSocio" listKey="idTipoSocio" listValue="descripcion" />
													</fieldset>
												</td>
												<td><s:fielderror fieldName="socio.idTipoSocio"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="dni"></s:label>
														<s:textfield name="socio.dni" key="DNI" />
													</p>
												</td>
												<td><s:fielderror fieldName="socio.dni"></s:fielderror></td>
												<td>
													<p>
														<s:label key="fechaNac"></s:label>
														<s:textfield name="socio.fechaNacimiento"
															key="fechaNacimiento" />
													</p>
												</td>
												<td><s:fielderror fieldName="socio.fechaNacimiento"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="estadoCivil"></s:label>
														<s:select list="estados" key="idEstadoCivil" name="socio.idEstadoCivil"
															listKey="idEstadoCivil" listValue="descripcion"
															headerKey="-1" headerValue="Seleccionar..."></s:select>
													</p>
												</td>
												<td><s:fielderror fieldName="socio.idEstadoCivil"></s:fielderror></td>

												<td>
													<p>
														<s:label key="ocupacion"></s:label>
														<s:textfield name="socio.ocupacion" key="ocupación" />
													</p>
												</td>
												<td><s:fielderror fieldName="socio.ocupacion"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="celular"></s:label>
														<s:textfield name="socio.cel" key="cel" />
													</p>
												</td>
												<td><s:fielderror fieldName="socio.cel"></s:fielderror></td>
												<td>
													<p>
														<s:label key="email"></s:label>
														<s:textfield name="socio.email" key="email" />
													</p>
												</td>
												<td><s:fielderror fieldName="socio.email"></s:fielderror></td>
											</tr>
										</table>

										<s:submit value="Enviar"/>
										<input type="reset" value="Cancelar" />
									</s:form>

								</div>
							</div>

						</div>
					</div>

				</fieldset>
			</div>
		</div>
	</div>

</body>
</html>