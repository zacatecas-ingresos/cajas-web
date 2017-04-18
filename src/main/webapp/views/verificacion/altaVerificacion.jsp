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
						<jsp:include page="/views/menu/logout.jsp"></jsp:include>
					</ul>
				</div>
			</nav>
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<jsp:include page="/views/menu/menu.jsp"></jsp:include>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					<span style="color: #798c9c"> </span>Alta Vehiculo
				</h1>
			</section>

			<!-- Main content Alta Vehiculo -->
			<section class="content">
				<!-- Main row -->
				<div class="col-md-12" id="div2">

					<div class="box box-primary">

						<div class="box-body">

							<form id="form-vehiculos">

								<div class="col-md-12">

									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<label for="selectOficina" class="control-label">Oficina
													Verificacion</label> <select class="form-control"
													id="selectOficina" name="selectOficina" disabled required>
													<option value="1" selected>ZACATECAS</option>
												</select>
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label for="inputEjercicio" class="control-label">Ejercicio</label>
												<input id="inputEjercicio" name="inputEjercicio" type="text"
													class="form-control" maxlength="4" placeholder="Ejercicio"
													value="2017" name="inputEjercicio" disabled required>
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label for="selectTipoVerificacion" class="control-label">Tipo
													Verificación</label> <select class="form-control"
													id="selectTipoVerificacion" name="selectTipoVerificacion"
													disabled required>
													<option value="0" selected>MEXICANOS</option>
													<option value="1">EXTRANJEROS</option>
												</select>
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<label for="selectEstatusVerificacion" class="control-label">Estatus
													Verificacion</label> <select class="form-control"
													id="selectEstatusVerificacion"
													name="selectEstatusVerificacion" disabled required>
													<option value="1" selected>CAPTURADA</option>
													<option value="2">AUTORIZADA</option>
													<option value="3">TERMINADA</option>
													<option value="4">RECHAZADA MINISTERIO</option>
													<option value="5">RECHAZADA VERIFICACIO</option>
													<option value="6">PAGADO</option>
													<option value="7">PAGA DESPUES</option>
													<option value="8">CONDONADO</option>
													<option value="9">CANCELADO</option>
												</select>
											</div>
										</div>
									</div>
									<fieldset >
										<legend>Vehiculo</legend>
										<div class="row">
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputVin" class="control-label">Serie
														(VIN)</label> <input id="inputVin" name="inputVin" type="text"
														class="form-control" maxlength="17"
														placeholder="Serie (VIN)" required>
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputNumeroMotor" class="control-label">Numero
														Motor</label> <input id="inputNumeroMotor" name="inputNumeroMotor"
														type="text" class="form-control" maxlength="17"
														placeholder="Numero Motor" required>
												</div>
											</div>

											<div class="col-md-4">
												<div class="form-group">
													<label for="selectMarca" class="control-label">Marca</label>
													<select class="form-control" id="selectMarca"
														name="selectMarca" required>
														<option value="1">TOYOTA</option>
													</select>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2">
												<div class="form-group">
													<label for="inputModelo" class="control-label">Modelo</label>
													<input id="inputModelo" name="inputModelo" type="text"
														class="form-control" maxlength="4" placeholder="Modelo"
														name="inputModelo" required>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="selectClase" class="control-label">Clase</label>
													<select class="form-control" id="selectClase"
														name="selectClase" required>
														<option value="1">AUTOMOVIL</option>
													</select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="selectTipo" class="control-label">Tipo</label>
													<select class="form-control" id="selectTipo"
														name="selectTipo" required>
														<option value="1">VAGONETA</option>
													</select>
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputLinea" class="control-label">Linea</label>
													<input class="form-control" id="inputLinea"
														name="inputLinea" required>
												</div>
											</div>
										</div>
									</fieldset>
									<fieldset>
										<legend>Documentación Recibida</legend>


										<div class="row">
											<div class="col-md-4">
												<label class="checkbox-inline"><input
													id="facturaVehiculoDocumentacionInput" type="checkbox"
													value="1">Factura (Titulo y Pedimiento)</label>
											</div>
											<div class="col-md-4">
												<label class="checkbox-inline"><input
													id="identificacionOficialDocumentacion" type="checkbox"
													value="1">Identificacion Oficial</label>
											</div>
											<div class="col-md-4">
												<label class="checkbox-inline"><input
													id="comprobanteDomicilioDocumentacionInput" type="checkbox"
													value="1">Comprobante de Domicilio</label>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4">
												<label class="checkbox-inline"><input
													id="rfcPersonaMoralDocumentacionInput" type="checkbox"
													value="1">RFC (Persona Moral)</label>
											</div>
											<div class="col-md-4">
												<label class="checkbox-inline"><input
													id="identificacionRepresentanteLegalDocumentacionInput"
													type="checkbox" value="1">Identificacion Oficial
													Rep. Legal</label>
											</div>
										</div>
									</fieldset>
									<br>
									<fieldset>
										<legend>Comprobantes de Pago</legend>
										<div id="comprobantes" class="form-group"></div>
									</fieldset>
									<br>
									<fieldset>
										<legend>Persona Tramite</legend>
										<div class="row">
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputNombrePersona" class="control-label">Persona</label>
													<input class="form-control" id="inputNombrePersona"
														name="inputNombrePersona" placeholder="Nombre">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputApellidoPaterno" class="control-label">Apellido
														Paterno</label> <input class="form-control"
														id="inputApellidoPaterno" name="inputApellidoPaterno"
														placeholder="Apellido Paterno">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<label for="inputApellidoMaterno" class="control-label">Apellido
														Materno</label> <input class="form-control"
														id="inputApellidoMaterno" name="inputApellidoMaterno"
														placeholder="Apellido Materno">
												</div>
											</div>
										</div>

									</fieldset>

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
			<!-- Fin contenido Alta Vehiculo -->
		</div>
	</div>
	<!-- ./wrapper -->


	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 2.3.0
		</div>
		<strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
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
	$(document)
			.ready(
					function() {

						//Genera los checkbox de años
						combos();

						//Cancelar y dirige a la vista principal de los vehiculos registrados
						$('#cancel-btn')
								.click(
										function() {
											var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
											window.location = urlUsuario;
										});

						//Registra un vehiculo
						$('#save-btn')
								.click(
										function() {

											var fechaHoy = new Date()
													.toISOString().slice(0, 10);
											var anio = new Date().toISOString()
													.slice(0, 4);

											//Validaciones
											var formValidation = $(
													'#form-vehiculos').data(
													'formValidation');

											formValidation.validate();

											console.log(formValidation
													.isValid());

											if (formValidation.isValid()) {

												var datos = {};
												var idOficinaVerificacion = $('#selectOficina');
												var ejercicio = $('#inputEjercicio');
												var tipoVerificacion = $('#selectTipoVerificacion');
												var estatusVerificacion = $('#selectEstatusVerificacion');
												var vinVehiculo = $('#inputVin');
												var numeroMotorVehiculo = $('#inputNumeroMotor');
												var idMarcaVehiculo = $('#selectMarca');
												var modeloVehiculo = $('#inputModelo');
												var idClaseVehiculo = $('#selectClase');
												var idTipoVehiculo = $('#selectTipo');
												var lineaVehiculo = $('#inputLinea');
												var nombrePersonaVerificacion = $('#inputNombrePersona');
												var apellidoPaternoPersonaVerificacion = $('#inputApellidoPaterno');
												var apellidoMaternoPersonaVerificacion = $('#inputApellidoMaterno');
												var email = $('#inputEmail');
												var facturaVehiculoDocumentacion = 0;
												var identificacionOficialDocumentacion = 0;
												var comprobanteDomicilioDocumentacion = 0;
												var rfcPersonaMoralDocumentacion = 0;
												var identificacionRepresentanteLegalDocumentacion = 0;
												var anioActualComprobantePago = 0;
												var anio1ComprobantePago = 0;
												var anio2ComprobantePago = 0;
												var anio3ComprobantePago = 0;
												var anio4ComprobantePago = 0;
												var anio5ComprobantePago = 0;

												if ($(
														"#facturaVehiculoDocumentacionInput")
														.is(':checked')) {
													facturaVehiculoDocumentacion = 1
												}
												if ($(
														"#identificacionOficialDocumentacion")
														.is(':checked')) {
													identificacionOficialDocumentacion = 1
												}
												if ($(
														"#comprobanteDomicilioDocumentacionInput")
														.is(':checked')) {
													comprobanteDomicilioDocumentacion = 1
												}
												if ($(
														"#rfcPersonaMoralDocumentacionInput")
														.is(':checked')) {
													rfcPersonaMoralDocumentacion = 1
												}
												if ($(
														"#identificacionRepresentanteLegalDocumentacionInput")
														.is(':checked')) {
													identificacionRepresentanteLegalDocumentacion = 1
												}

												if ($(
														"#anioActualComprobantePago")
														.is(':checked')) {
													anioActualComprobantePago = $(
															"#anioActualComprobantePago")
															.val();
												}
												if ($("#anio1ComprobantePago")
														.is(':checked')) {
													anio1ComprobantePago = $(
															"#anio1ComprobantePago")
															.val();
												}
												if ($("#anio2ComprobantePago")
														.is(':checked')) {
													anio2ComprobantePago = $(
															"#anio2ComprobantePago")
															.val();
												}
												if ($("#anio3ComprobantePago")
														.is(':checked')) {
													anio3ComprobantePago = $(
															"#anio3ComprobantePago")
															.val();
												}
												if ($("#anio4ComprobantePago")
														.is(':checked')) {
													anio4ComprobantePago = $(
															"#anio4ComprobantePago")
															.val();
												}
												if ($("#anio5ComprobantePago")
														.is(':checked')) {
													anio5ComprobantePago = $(
															"#anio5ComprobantePago")
															.val();
												}

												datos.idOficinaVerificacion = idOficinaVerificacion
														.val();
												datos.ejercicio = ejercicio
														.val();
												datos.tipoVerificacion = tipoVerificacion
														.val();
												datos.estatusVerificacion = estatusVerificacion
														.val();
												datos.fechaVerificacion = fechaHoy;
												datos.vinVehiculo = vinVehiculo
														.val();
												datos.numeroMotorVehiculo = numeroMotorVehiculo
														.val();
												datos.idMarcaVehiculo = idMarcaVehiculo
														.val();
												datos.modeloVehiculo = modeloVehiculo
														.val();
												datos.idClaseVehiculo = idClaseVehiculo
														.val();
												datos.idTipoVehiculo = idTipoVehiculo
														.val();
												datos.lineaVehiculo = lineaVehiculo
														.val();
												datos.nombrePersonaVerificacion = nombrePersonaVerificacion
														.val();
												datos.apellidoPaternoPersonaVerificacion = apellidoPaternoPersonaVerificacion
														.val();
												datos.apellidoMaternoPersonaVerificacion = apellidoMaternoPersonaVerificacion
														.val();
												datos.email = email.val();
												datos.facturaVehiculoDocumentacion = facturaVehiculoDocumentacion;
												datos.identificacionOficialDocumentacion = identificacionOficialDocumentacion;
												datos.comprobanteDomicilioDocumentacion = comprobanteDomicilioDocumentacion;
												datos.rfcPersonaMoralDocumentacion = rfcPersonaMoralDocumentacion;
												datos.identificacionRepresentanteLegalDocumentacion = identificacionRepresentanteLegalDocumentacion;
												datos.anioActualComprobantePago = anioActualComprobantePago;
												datos.anio1ComprobantePago = anio1ComprobantePago;
												datos.anio2ComprobantePago = anio2ComprobantePago;
												datos.anio3ComprobantePago = anio3ComprobantePago;
												datos.anio4ComprobantePago = anio4ComprobantePago;
												datos.anio5ComprobantePago = anio5ComprobantePago;

												var formData = JSON
														.stringify(datos);

												console.log(formData);

												var urlPost = "${pageContext.request.contextPath}/cajas/vehicular/verificacion";
												var urlCrear = "${pageContext.request.contextPath}/views/verificacion/altaVerificacion.jsp";

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
																			title : "Verificación Vehicular registrada correctamente.",
																			type : "success",
																			closeOnCancel : false
																		},
																		function() {
																			window.location = urlCrear;
																		});
															},
															error : function(
																	jqXHR,
																	textStatus,
																	errorThrown) {
																console
																		.log(textStatus
																				+ " "
																				+ errorThrown);
															}
														});
											}

										});

						//Validaciones
						$('#form-vehiculos')
								.formValidation(
										{
											framework : 'bootstrap', //Indicamos el framework para validar, Bootstrap, Pure,Semantic,etc
											icon : {//Feedback Icons
												valid : 'glyphicon glyphicon-ok',
												invalid : 'glyphicon glyphicon-remove',
												validating : 'glyphicon glyphicon-refresh'
											},
											//live: 'enabled',
											//Lista de campos a validar y las reglas que aplican para cada uno de ellos
											fields : {
												'inputVin' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El VIN es requerido.'
														},
														stringLength : {
															min : 17,
															max : 17,
															message : 'El VIN por lo menos 17 caracteres.'
														},
														vin : {
															message : 'El VIN no esta formado correctamente.'
														},
														remote : {
															url : '${pageContext.request.contextPath}/cajas/vehicular/verificacion/existeVin?'
																	+ $(
																			'#inputVin')
																			.val(),
															message : "¡El VIN que ingreso ya existe!",
															data : function(
																	validator,
																	$field,
																	value) {
																return {
																	inputVin : validator
																			.getFieldElements(
																					'inputVin')
																			.val()
																};
															}
														}
													},
												},
												/*
												'inputNombrePersona' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Nombre es requerido.'
														},
													}
												},
												'inputApellidoPaterno' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Apellido Paterno es requerido.'
														},
													}
												},
												*/
												'inputNumeroMotor' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Numero de Motor es requerido.'
														},
														remote : {
															url : '${pageContext.request.contextPath}/cajas/vehicular/verificacion/existeNumeroMotor?'
																	+ $(
																			'#inputNumeroMotor')
																			.val(),
															message : "¡El Numero de Motor que ingreso ya existe!",
															data : function(
																	validator,
																	$field,
																	value) {
																return {
																	inputNumeroMotor : validator
																			.getFieldElements(
																					'inputNumeroMotor')
																			.val()
																};
															}
														}
													}
												},
												'selectMarca' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'La Marca es requerida.'
														},
													}
												},
												'inputModelo' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Modelo es requerido.'
														},
														numeric : {
															message : 'El Modelo debe ser numerico',
														}
													}
												},
												'selectOficina' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'La Oficina es requerida.'
														},
													}
												},
												'selectTipoVerificacion' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Tipo de Verificacion es requerido.'
														},
													}
												},
												'selectEstatusVerificacion' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Estatus de Verificacion es requerido.'
														},
													}
												},
												'inputEjercicio' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Ejercicio es requerido.'
														},
														numeric : {
															message : 'El Ejercicio debe ser numerico',
														}
													}
												},
												'selectClase' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'La Clase es requerida.'
														},
													}
												},
												'selectTipo' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'El Tipo es requerido.'
														},
													}
												},
												'selectLinea' : { //validación del campo
													trigger : 'blur', //Se especifica cuando se acciona la validación del campo
													validators : { //validaciones

														notEmpty : {
															message : 'La Linea es requerida.'
														},
													}
												},
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

		var anioActual = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anioActualComprobantePago" type="checkbox" value="'+year+'">'
				+ year + '</label></div>');
		anioActual.appendTo('#comprobantes');
		var anioActualMenosUno = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio1ComprobantePago" type="checkbox" value="'
				+ (year - 1) + '">' + (year - 1) + '</label></div>');
		anioActualMenosUno.appendTo('#comprobantes');
		var anioActualMenosDos = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio2ComprobantePago" type="checkbox" value="'
				+ (year - 2) + '">' + (year - 2) + '</label></div>');
		anioActualMenosDos.appendTo('#comprobantes');
		var anioActualMenosTres = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio3ComprobantePago" type="checkbox" value="'
				+ (year - 3) + '">' + (year - 3) + '</label></div>');
		anioActualMenosTres.appendTo('#comprobantes');
		var anioActualMenosCuatro = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio4ComprobantePago" type="checkbox" value="'
				+ (year - 4) + '">' + (year - 4) + '</label></div>');
		anioActualMenosCuatro.appendTo('#comprobantes');
		var anioActualMenosCinco = $('<div class="col-md-1"><label class="checkbox-inline"><input id="anio5ComprobantePago" type="checkbox" value="'
				+ (year - 5) + '">' + (year - 5) + '</label></div>');
		anioActualMenosCinco.appendTo('#comprobantes');
	};
</script>
</html>