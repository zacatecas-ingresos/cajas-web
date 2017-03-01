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
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
	rel="stylesheet" />

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<!-- FiscoFlex -->
<link
	href="${pageContext.request.contextPath}/resources/fiscoflex/css/fiscoflex.css"
	rel="stylesheet" />


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

	<!-- jQuery 2.1.4 -->
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
	<script
		src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>


	<script>
		function login() {
			$.post('/loginServlet', {
				param : $('#nombreUsuario').val(),
				param : $('#password').val()
			});
		}
	</script>

</body>
</html>