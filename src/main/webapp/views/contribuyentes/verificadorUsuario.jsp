<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<title>Usuarios</title>

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
		href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
	
</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<header class="main-header">
			<!-- Logo -->
			<a href="index2.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Cajas</b></span>
			</a>
			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<%@ include file="/WEB-INF/jspf/logout.jspf" %>
					</ul>
				</div>
			</nav>
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<%@ include file="/WEB-INF/jspf/menu.jspf" %>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Verificador
				</h1>
			</section>

			<!-- Main content Verificadores -->
			<section class="content">
				<!-- Main row -->				
				<div class="col-md-12" id="div2">
					
					<div class="box box-primary">
					
						<div class="box-body">
						
							<form id="form-usuarios">
								
								<div class="col-md-12">
									
									<div class="form-group">
										
										<label for="inputUser" class="control-label">Usuario:</label>
										<input type="text" class="form-control" id="inputUser"
												name="inputUser" data-toggle="tooltip"
												data-placement="top" title="Ingrese su nombre de Verificador"
												placeholder="verificador">
									</div>	
									
									<div class="form-group">
										<label for="inputappaterno" class="control-label">Apellido Paterno:</label>
										<input type="text" class="form-control" id="inputapmaterno"
												name="inputappaterno" data-toggle="tooltip"
												data-placement="top" title="Ingrese su Apellido Paterno"
												placeholder="ApPaterno" required="required">
										</div>

									<div class="form-group">
											<label for="inputapmaterno" class="control-label">Apellido Materno:</label>
											<input type="text" class="form-control"
												data-toggle="tooltip" data-placement="top"
												title="ingres su Apellido Materno" id="inputapmaterno"
												name="inputapmaterno" placeholder="Apellido Materno">
									</div>
									
								</div>							
							
							</form>
							
						</div>
						<div class="box-footer clearfix">
								<button id="cancel-btn" type="button"
									class="btn btn-default btn-lg pull-left">
									<i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
									Cancelar
								</button>
								<button type="button" id="save-btn"
										class="btn btn-success btn-lg pull-right">
									<i class="fa fa-credit-card"></i> Guardar
								</button>
						</div>
					
					</div>

				</div>
			</section>
					</div>
	</div>
	<!-- ./wrapper -->
	

		<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 2.3.0
			</div>
			<strong>Derechos de autor &copy; 2016 <a
				href="------">--------------</a>.
			</strong> Todos los derechos reservados.
		</footer>
		
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
$(document).ready(function() {


	//Cancelar y dirige a la vista principal de los usuarios registrados
	$('#cancel-btn').click(function() {
		var urlUsuario = "${pageContext.request.contextPath}/views/contribuyentes/	verificadorUsuario.jsp";
		window.location = urlUsuario;
	});

	//Registra un usuario
	$('#save-btn').click(function() {

		//Validaciones
		var formValidation = $('#form-usuarios').data('formValidation');
		
			formValidation.validate();

			console.log(formValidation.isValid());
			
			if (formValidation.isValid()) {

				var datos = {};
				var nombre = $('#inputUser');
				var appaterno = $('#inputapmaterno');
				var apmaterno = $('#inputapmaterno');

				datos.nombre = nombre.val();
				datos.appmaterno = apmaterno.val();
				datos.appaterno = apmaterno.val();
				datos.activo = 1;

				var formData = JSON.stringify(datos);
			
				console.log(formData);
			
				var urlPost = "${pageContext.request.contextPath}/cajas/verificador";
				var urlUsuario = "${pageContext.request.contextPath}/views/contribuyente/verificadorUsuario.jsp";

				$.ajax({
					type : 'POST',
					url : urlPost,
					data : formData,
					dataType : "json",
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
					swal(
						{
							title : "Verificador registrado correctamente.",
							type : "success",
							closeOnCancel : false
						},
							function() {
							window.location = urlUsuario;
							});
				},
					error : function(jqXHR,textStatus,errorThrown) {
						console.log(textStatus+ " "+ errorThrown);
						}
					});
			}
	});



	//Errores
	$.ajaxSetup({
			error : function(x, status, error) {
				if (x.status == 400) {
					var result = x.responseJSON;
						swal({
							title : "Error " + result.code,
							text : result.message,
							type : "error",
							closeOnCancel : false
						});
				} else if (x.status == 500) {
						swal({
						title : "Error 500",
						text : "Disculpe las molestias no podemos procesar su solicitud.",
						type : "error",
						closeOnCancel : false
					});
				}
		}
	});

	});
</script>
</html>