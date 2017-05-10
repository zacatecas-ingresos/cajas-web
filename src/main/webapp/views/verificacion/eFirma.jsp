<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>e.Firma</title>
<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- AdminLTE -->
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
	rel="stylesheet" />

<!-- Sweetalert -->
<link
	href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"
	rel="stylesheet" type="text/css">

<!-- FormValidation -->
<link
	href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css"
	rel="stylesheet" type="text/css">

<!-- jquery-ui.css -->
<link
	href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
<form enctype="multipart/form-data">
	<div
		class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
		<br />
		<div class="panel panel-default">
			<div class="panel-heading">
				<div style="text-align: center;">
					<h1>Bienvenido</h1>
					<h2>Acceso con e.firma</h2>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="form-group">
					<div class="input-group">
						<label for="inputCertificado">Ingresa Certificado (.cer):</label>
						 <input id="inputCertificado" type="file"
							class="form-control" name="inputCertificado" accept=".cer"
							required />
					</div>
				</div>	
				<div class="form-group">
					<div class="input-group">
						<label for="inputCertificado">Clave privada (.key):</label>
						 <input id="inputKey" type="file"
							class="form-control" name="inputKey" accept=".key"
							required />
					</div>
				</div>				
				<div class="form-group">
					<div class="input-group">
						<span class="input-group-addon"> <i
							class="fa fa-lock" style="width: auto"></i>
						</span> <input id="inputPassword" type="input"
							class="form-control" name="inputPassword" placeholder="Contraseña"
							required autofocus />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<span class="input-group-addon"> <i
							class="fa fa-user" style="width: auto"></i>
						</span> <input id="txtSenha" type="input"
							class="form-control" name="inputRFC" placeholder="RFC"
							required disabled />
					</div>
				</div>
				<button id="btnLogin" class="btn btn-default" style="width: 100%">
					Enviar &nbsp;&nbsp; <i class="glyphicon glyphicon-log-in"></i>
				</button>
			</div>
		</div>
	</div>

	</form>
</body>

<!-- Scripts -->

<!-- jQuery -->
<script
	src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

<!-- jQuery UI -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

<!-- jQuery Form -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" /></script>

<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<!-- Bootstrap WYSIHTML5 -->
<script
	src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

<script
	src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>

<script
	src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>

<script
	src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script>

<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>

<!-- Fin scripts -->


<script>
$(document)
.ready(
		function() {
		
		});

</script>

</html>