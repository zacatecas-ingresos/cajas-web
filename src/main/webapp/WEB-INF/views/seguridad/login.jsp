<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Log in</title>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">

<!-- jQuery -->
<script
	src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

<!-- jQuery UI -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

<!-- jQuery Form -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" /></script>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<!-- Bootstrap WYSIHTML5 -->
<script
	src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

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
<script
	src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>

<!-- FiscoFlex -->
<link
	href="${pageContext.request.contextPath}/resources/fiscoflex/css/fiscoflex.css"
	rel="stylesheet" />

<!-- Sweetalert -->
<link
	href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js">
	
</script>

<!-- FormValidation -->
<link
	href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>


</head>
<body class="hold-transition login-page">

	<!-- Login -->
	<div class="login-box">
		<div class="login-box-body">

			<form class="form-signin" method="post" id="login"
				action="loginServlet">

				<div class="form-group has-feedback">
					<input id="nombreUsuario" name="nombreUsuario" class="form-control"
						placeholder="Usuario" /> <span
						class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" id="password" name="password"
						class="form-control" placeholder="Password" /> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<button type="submit" onclick="login()"
							class="btn btn-primary btn-block btn-flat">Iniciar
							Sesión</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- Fin Login -->


	<script>
		function login() {
			nombreUsuario = document.getElementsByName('nombreUsuario')[0].value;
			password = document.getElementsByName('password')[0].value;
			var credenciales = {
				nombreUsuario : nombreUsuario,
				password : password
			};

			var loginWerbServlet = "/loginServlet";
			jQuery.ajax({
				type : 'POST',
				url : loginWerbServlet,
				data : credenciales
			});
		}
	</script>

</body>
</html>