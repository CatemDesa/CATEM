<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CATEM - Alta Socio</title>
<link rel="stylesheet" href="css/style.css">
<s:head />
<sj:head jqueryui="true"/>

<style>
    .vertical input { display: block; }
</style>

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
									<s:form action="confimAltaSocio" theme="simple" validate="true"
										method="post">
										<table style="witdh: 100%;">
											<tr>
												<td colspan="3">
													<p>
														<s:label key="label.nombre"></s:label>
														<s:textfield name="nombre" key="label.nombre" theme="simple" />
														<s:fielderror fieldName="nombre"></s:fielderror>
													</p>
													<p>
														<s:label key="label.apellido"></s:label>
														<s:textfield name="apellido" key="label.apellido" />
														<s:fielderror fieldName="apellido"></s:fielderror>
													</p>
													<p>
														<s:label key="label.nacionalidad"></s:label>
														<s:textfield name="nacionalidad" key="label.nacionalidad" />
														<s:fielderror fieldName="nacionalidad"></s:fielderror>
													</p>
												</td>

												<td>
													<fieldset style="white-space: nowrap;">
														<s:label key="label.tipoSocio"></s:label>
														<br />														
														<s:radio name="idTipoSocio" list="tiposSocio" listKey="idTipoSocio" listValue="descripcion"/>
													</fieldset>
												</td>
												<td><s:fielderror fieldName="idTipoSocio"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="label.tipodni"></s:label>
														<s:textfield name="dni" key="label.tipodni" />
													</p>
												</td>
												<td><s:fielderror fieldName="dni"></s:fielderror></td>
												<td>
													<p>
														<s:label key="label.fechaNac"></s:label>
														<sj:datepicker  name="fechaNacimiento" label="label.fechaNac"
															displayFormat="dd/mm/yy" />
													</p>
												</td>
												<td><s:fielderror fieldName="fechaNacimiento"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="label.estadoCivil"></s:label>
														<s:select list="estados" key="idEstadoCivil" name="idEstadoCivil"
															listKey="idEstadoCivil" listValue="descripcion"
															headerKey="" headerValue="Seleccionar..."></s:select>
													</p>
												</td>
												<td><s:fielderror fieldName="idEstadoCivil"></s:fielderror></td>

												<td>
													<p>
														<s:label key="label.ocupacion"></s:label>
														<s:textfield name="ocupacion" key="label.ocupacion" />
													</p>
												</td>
												<td><s:fielderror fieldName="ocupacion"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="label.celular"></s:label>
														<s:textfield name="cel" key="label.celular" maxlength="11"/>
													</p>
												</td>
												<td><s:fielderror fieldName="cel"></s:fielderror></td>
												<td>
													<p>
														<s:label key="label.email"></s:label>
														<s:textfield name="email" key="label.email" />
													</p>
												</td>
												<td><s:fielderror fieldName="email"></s:fielderror></td>
											</tr>
										</table>

										<s:submit value="Enviar" />
										<input type="reset" value="Cancelar" />
									</s:form>

								</div>
<<<<<<< HEAD
							
	
						</div>
					</div>
					<fieldset>
						<legend>Domicilio Particular</legend>
						<div
						style="margin: 0px; position: static; overflow: hidden; height: 100%;">
						<div id="grid" style="margin: 0px;">
								<div class="grid_8" style="width: 95%;">
									<div class="box">
										<table style="witdh: 100%">
										
											<tr>
												<td colspan="4" style="width:100%;">
														<s:label>Calle: </s:label>
														<s:textfield name="domicilio.calle" label="Calle"/>
												</td>
												<td>
													<s:label>Numero: </s:label>
													<s:textfield name="domicilio.numero" label="Numero" />
												</td>
												<td>
													<s:label>Piso: </s:label>
													<s:textfield name="domicilio.piso" label="Piso" />
												</td>
												<td>
													<s:label>Departamento: </s:label>
													<s:textfield name="domicilio.departamento" label="Departamento" />
												</td>
											</tr>
											<tr>
												<td colspan="4">
												
													<s:label>Localidad:</s:label>
													<s:textfield name="domicilio.localidad" label="Localidad"></s:textfield>
												</td>
												<td>
													<s:label>Teléfono:</s:label>
													<s:textfield name="domicilio.telefono" label="Teléfono"></s:textfield>
												</td>

											</tr>
											<tr>
												<td></td>

											</tr>
										</table>
									</div>
								</div>
							
	
						</div>
					</div>
						
					</fieldset>
					<fieldset>
						<legend>Domicilio Profesional</legend>
						<div class="toggler atStart"
						style="margin: 0px; position: static; overflow: hidden; height: 100%;">
						<div id="grid" style="margin: 0px;">
								<div class="grid_8" style="width: 95%;">
									<div class="box">
										<table style="witdh: 100%">
										
											<tr>
												<td colspan="4" style="width:100%;">
														<s:label>Calle: </s:label>
														<s:textfield name="domicilio.calle" label="Calle"/>
												</td>
												<td>
													<s:label>Numero: </s:label>
													<s:textfield name="domicilio.numero" label="Numero" />
												</td>
												<td>
													<s:label>Piso: </s:label>
													<s:textfield name="domicilio.piso" label="Piso" />
												</td>
												<td>
													<s:label>Departamento: </s:label>
													<s:textfield name="domicilio.departamento" label="Departamento" />
												</td>
											</tr>
											<tr>
												<td colspan="4">
												
													<s:label>Localidad:</s:label>
													<s:textfield name="domicilio.localidad" label="Localidad"></s:textfield>
												</td>
												<td>
													<s:label>Teléfono:</s:label>
													<s:textfield name="domicilio.telefono" label="Teléfono"></s:textfield>
												</td>

											</tr>
											<tr>
												<td></td>

											</tr>
										</table>
									</div>
								</div>
							
	
						</div>
					</div>
						
					</fieldset>
				</fieldset>
=======
							</div>

						</div>
					</div>
>>>>>>> origin/master

				</fieldset>
			</div>
		</div>
	</div>

</body>
</html>
