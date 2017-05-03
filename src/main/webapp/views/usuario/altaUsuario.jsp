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
					<span style="color: #798c9c"> </span>Administrar Usuarios
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
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
												data-placement="top" title="Ingrese su nombre de usuario"
												placeholder="Usuario">
									</div>	
									
									<div class="form-group">
										<label for="inputEmail" class="control-label">Email:</label>
										<input type="email" class="form-control" id="inputEmail"
												name="inputEmail" data-toggle="tooltip"
												data-placement="top" title="Ingrese su email"
												placeholder="Email" required="required">
										</div>

									<div class="form-group">
											<label for="inputPassword" class="control-label">Contraseña:</label>
											<input type="password" class="form-control"
												data-toggle="tooltip" data-placement="top"
												title="Ingrese su contraseña" id="inputPassword"
												name="inputPassword" placeholder="Password">
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
			<!-- Fin contenido Registrar Usuario -->
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
		var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
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
				var email = $('#inputEmail');
				var password = $('#inputPassword');

				datos.nombre = nombre.val();
				datos.email = email.val();
				datos.password = password.val();
				datos.activo = 1;

				var formData = JSON.stringify(datos);
			
				console.log(formData);
			
				var urlPost = "${pageContext.request.contextPath}/cajas/usuario";
				var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";

				$.ajax({
					type : 'POST',
					url : urlPost,
					data : formData,
					dataType : "json",
					contentType : 'application/json',
					success : function(data,textStatus,jQxhr) {
					swal(
						{
							title : "Usuario registrado correctamente.",
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

	//Validaciones
	$('#form-usuarios').formValidation(
		{
			framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
			icon : {//Feedback Icons
			valid : 'glyphicon glyphicon-ok',
			invalid : 'glyphicon glyphicon-remove',
			validating : 'glyphicon glyphicon-refresh'
			},

			//Lista de campos a validar y las reglas que aplican para cada uno de ellos
			fields : {
				'inputUser' : { //validación del campo
								trigger : 'blur', //Se especifica cuando se acciona la validación del campo
								validators : { //validaciones

							notEmpty : {
									message : 'El nombre de usuario es requerido.'
								},
							stringLength : {
									min : 8,
									max: 100,
									message : 'El nombre de usuario requiere por lo menos ocho caracteres.'
									},
							remote : {
									url : '${pageContext.request.contextPath}/cajas/usuario/existeNombreUsuario?'+ $('#inputUser').val(),
									message : "El usuario ya existe",
									data : function(validator,$field,value){
										return{
											inputUser:validator.getFieldElements('inputUser').val()
										};
									}
								}
							}
						},
				'inputEmail' : {
							trigger : 'blur',
							validators : {
						notEmpty : {
							message : 'El email es requerido.'
						  },
						regexp : {
							regexp : /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/,
							message : 'La estructura del email es incorrecta.'
							},
						remote : {
								url: '${pageContext.request.contextPath}/cajas/usuario/existeEmail?'+ $('#inputEmail').val(),
								message : "Ya existe un usuario registrado con este email.",
								data : function(validator,$field,value){
									return{
										inputEmail:validator.getFieldElements('inputEmail').val()
									};
								}
							}

						}
					},
				'inputPassword' : {
							trigger : 'blur',
							validators : {
								notEmpty : {
									message : 'La conraseña es requerida.'
								},
								stringLength : {
									min : 8,
									max: 100,
									message : 'Su contraseña requiere por lo menos ocho caracteres.'
								}

							}
						}
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