<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Alta Vehiculo</title>
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
						<%@ include file="/WEB-INF/jspf/logout.jspf"%>
					</ul>
				</div>
			</nav>
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<%@ include file="/WEB-INF/jspf/menu.jspf"%>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Verificación Adeudos
				</h1>
			</section>

			<!-- Main content Verificacion adeudo -->
			<section class="content">
				<div class="row">
					<!-- Main row -->
					<div class="col-md-12" id="div2">

						<div class="box box-primary">

							<div class="box-body">

								<form id="form-vehiculos">
								
										<div class="col-md-12 well">									
							
										<fieldset>
											<legend style="text-align: center;">Información Verificacion</legend>
											<div id="contenido" class="form-group"></div>
										</fieldset>
										<br>									
									</div>

									<div class="col-md-12">									
										<br>
										<fieldset>
											<legend>Periodos de Adeudo</legend>
											<div id="comprobantes" class="form-group"></div>
										</fieldset>
										<br>									
									</div>

								</form>

							</div>
							<div class="box-footer">
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
				</div>
			</section>
			<!-- Fin contenido Verificacion adeudo -->
		</div>

		<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 2.3.0
			</div>
			<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
			</strong> Todos los derechos reservados.
		</footer>
	</div>
	<!-- ./wrapper -->
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

						//Obtiene todos los usuarios registrados
						var url = window.location.search.substring(1);
						var fragmento = url.split("=");
						var idVerificacion = fragmento[1];

						var urlBusqueda = "${pageContext.request.contextPath}/cajas/vehicular/verificacion/obtenerVerificacioPorID/"
								+ "?id=" + idVerificacion;

						$
								.ajax({
									type : "GET",
									dataType : 'json',
									url : urlBusqueda,
									success : function(data) {
										$('#contenido').html("");
										$
												.each(
														data,
														function(key, val) {
															var ejercicio = $('<div class="col-md-2"><label><strong>EJERCICIO: </strong>'
																	+ val.ejercicio
																	+ '</label></div>');
															ejercicio
																	.appendTo('#contenido');
															var fecha = $('<div class="col-md-4"><label><strong>FECHA CAPTURA: </strong>'
																	+ val.fechaVerificacion
																	+ '</label></div>');
															fecha
																	.appendTo('#contenido');
															var vin = $('<div class="col-md-4"><label><strong>VIN: </strong>'
																	+ val.vinVehiculo
																	+ '</label></div>');
															vin
																	.appendTo('#contenido');
															var noSeguimiento = $('<div class="col-md-2"><label><strong>No Seguimiento: </strong>'
																	+ val.noSeguimientoVerificion
																	+ '</label></div>');
															noSeguimiento
																	.appendTo('#contenido');
														});
									},
									error : function(jqXHR, textStatus,
											errorThrown) {
										console.log(textStatus + " "
												+ errorThrown);
									}
								});

						combos();

						//Cancelar y dirige a la vista principal de los vehiculos registrados
						$('#cancel-btn')
								.click(
										function() {
											var urlBack = "${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp";
											window.location = urlBack;
										});

						//Registra un vehiculo
						$('#save-btn').click(function() {
							/*
											var anio = new Date().toISOString()
													.slice(0, 4);

											//Validaciones
											var formValidation = $(
													'#form-adeudo').data(
													'formValidation');

											formValidation.validate();


											if (formValidation.isValid()) {

												var datos = {};

												var formData = JSON
														.stringify(datos);

												console.log(formData);

												var urlPost = "${pageContext.request.contextPath}/cajas/vehicular/verificacion";
												var admin = "${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp";

												$
														.ajax({
															type : 'POST',
															url : urlPost,
															data : formData,
															dataType : "json",
															contentType : 'application/json',
															success : function(
																	data,
																	textStatus,
																	jQxhr) {
																swal(
																		{
																			text : "Verificación Vehicular registrada correctamente",
																			title : "No Seguimiento: "
																					+ data.valor,
																			type : "success",
																			closeOnCancel : false
																		},
																		function() {
																			window.location = admin;
																		});
															}
														});
											}*/

						});

						//Validaciones
						$('#form-adeudo').formValidation({
							framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
							icon : {//Feedback Icons
								valid : 'glyphicon glyphicon-ok',
								invalid : 'glyphicon glyphicon-remove',
								validating : 'glyphicon glyphicon-refresh'
							},
							//live: 'enabled',
							//Lista de campos a validar y las reglas que aplican para cada uno de ellos
							fields : {

							}
						});

						//Errores
						$
								.ajaxSetup({
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

	function combos() {
		var d = new Date();
		var year = d.getFullYear();

		var anio0VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio0VerificacionAdeudo" type="checkbox" value="'+year+'">'
				+ year + '</label></div>');
		anio0VerificacionAdeudo.appendTo('#comprobantes');
		var anio1VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio1VerificacionAdeudo" type="checkbox" value="'
				+ (year - 1) + '">' + (year - 1) + '</label></div>');
		anio1VerificacionAdeudo.appendTo('#comprobantes');
		var anio2VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio2VerificacionAdeudo" type="checkbox" value="'
				+ (year - 2) + '">' + (year - 2) + '</label></div>');
		anio2VerificacionAdeudo.appendTo('#comprobantes');
		var anio3VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio3VerificacionAdeudo" type="checkbox" value="'
				+ (year - 3) + '">' + (year - 3) + '</label></div>');
		anio3VerificacionAdeudo.appendTo('#comprobantes');
		var anio4VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio4VerificacionAdeudo" type="checkbox" value="'
				+ (year - 4) + '">' + (year - 4) + '</label></div>');
		anio4VerificacionAdeudo.appendTo('#comprobantes');
		var anio5VerificacionAdeudo = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio5VerificacionAdeudo" type="checkbox" value="'
				+ (year - 5) + '">' + (year - 5) + '</label></div>');
		anio5VerificacionAdeudo.appendTo('#comprobantes');
	};

	$(function() {
		$("#criterioMarca")
				.autocomplete(
						{
							source : function(request, response) {
								var criterio = $('#criterioMarca').val();
								var urlGet = "${pageContext.request.contextPath}/cajas/catalogos/marcavehiculo/buscarPorCriterio/"
										+ "?criterio=" + criterio;
								$.ajax({
									type : "GET",
									dataType : 'json',
									url : urlGet,
									data : {
										term : request.term
									},
									success : function(data) {
										//console.log("data:: " + data);
										response($.map(data, function(item) {
											return {
												id : item.idMarcaVehiculo,
												label : item.nombre,
												value : item.nombre
											};
										}));
									},
									error : function(jqXHR, textStatus,
											errorThrown) {
										console.log(textStatus + " "
												+ errorThrown);
									}
								});
							},
							minLength : 2,
							select : function(event, ui) {
								$("#idMarcaVehiculo").val(ui.item.id);

							}
						});
	});
</script>
</html>