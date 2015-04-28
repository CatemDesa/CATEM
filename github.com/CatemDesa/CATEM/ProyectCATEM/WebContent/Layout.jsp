<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=divice-width, initial-scale=1.0">

<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
<script src="http://code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

<link href="css/menu.css" rel="stylesheet">

<link href="<s:url value="/css/estilo.css"/>" rel="stylesheet"
	type="text/css" />

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body style="text-align: center;">

	<table style="width: 100%; height: 100%;">
		<tr>
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr>
			<td style="width: 20% ;height: 100%; position:absolute;">
				<br /> <tiles:insertAttribute name="menu" />
			</td>
			<td style="width: 80%; height: 100%; position:inherit;">				
				
				<table style="width: 100%; height: 100%;">
					<tr style="height: 90%; position:inherit;">
						<td><br /> <tiles:insertAttribute name="body" /> <br /></td>
					</tr>
					<tr>
						<td style="height: 10%; position:inherit;">
							<hr /> <tiles:insertAttribute name="footer" /> <br />
						</td>						
					</tr>
				</table>
			</td>
		</tr>
	</table>

</body>
</html>