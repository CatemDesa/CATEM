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
														<s:label key="nombre"></s:label>
														<s:textfield name="nombre" key="nombre" theme="simple" />
														<s:fielderror fieldName="nombre"></s:fielderror>
													</p>
													<p>
														<s:label key="apellido"></s:label>
														<s:textfield name="apellido" key="apellido" />
														<s:fielderror fieldName="apellido"></s:fielderror>
													</p>
													<p>
														<s:label key="nacionalidad"></s:label>
														<s:textfield name="nacionalidad" key="nacionalidad" />
														<s:fielderror fieldName="nacionalidad"></s:fielderror>
													</p>
												</td>

												<td>
													<fieldset style="white-space: nowrap;">
														<s:label key="tipoSocio"></s:label>
														<br />														
														<s:radio name="idTipoSocio" list="tiposSocio" listKey="idTipoSocio" listValue="descripcion" value="1"/>
													</fieldset>
												</td>
												<td><s:fielderror fieldName="idTipoSocio"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="DNI"></s:label>
														<s:textfield name="dni" key="DNI" />
													</p>
												</td>
												<td><s:fielderror fieldName="dni"></s:fielderror></td>
												<td>
													<p>
														<s:label key="fechaNac"></s:label>
														<sj:datepicker  name="fechaNacimiento" label="fechaNac"
															displayFormat="dd-MM-yy" />
													</p>
												</td>
												<td><s:fielderror fieldName="fechaNacimiento"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="estadoCivil"></s:label>
														<s:select list="estados" key="idEstadoCivil" name="idEstadoCivil"
															listKey="idEstadoCivil" listValue="descripcion"
															headerKey="-1" headerValue="Seleccionar..."></s:select>
													</p>
												</td>
												<td><s:fielderror fieldName="idEstadoCivil"></s:fielderror></td>

												<td>
													<p>
														<s:label key="ocupacion"></s:label>
														<s:textfield name="ocupacion" key="ocupacion" />
													</p>
												</td>
												<td><s:fielderror fieldName="ocupacion"></s:fielderror></td>
											</tr>
											<tr>
												<td>
													<p>
														<s:label key="celular"></s:label>
														<s:textfield name="cel" key="cel" />
													</p>
												</td>
												<td><s:fielderror fieldName="cel"></s:fielderror></td>
												<td>
													<p>
														<s:label key="email"></s:label>
														<s:textfield name="email" key="email" />
													</p>
												</td>
												<td><s:fielderror fieldName="email"></s:fielderror></td>
											</tr>
										</table>

										<s:submit value="Enviar" />
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