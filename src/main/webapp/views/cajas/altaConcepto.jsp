<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Cajas</title>

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
					<span style="color: #798c9c"> </span>Alta Concepto
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">

				<div class="row">

					<div class="col-md-12">
						<div id="panelAltaConcepto" class="box box-success">
							<div class="box-header">
								<div class="col-md-1">
									<button id="regresar" type="button" class="btn btn-default"
										data-dismiss="modal">Regresar</button>
								</div>
								<h3 class="box-title">ALTA CONCEPTO</h3>
							</div>
							<div class="box-body">
								<div class="col-md-1"></div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputComplementaria">Datos Generales</label>
									</div>
									<div class="form-group">
										<label for="inputClave">Clave:</label> <input
											class="form-control" id="inputClave"
											placeholder="Clave concepto" type="text">
									</div>

									<div class="form-group">
										<label for="selectAnyoFiscal">Año Fiscal:</label> <select
											class="form-control" id="selectAnyoFiscal">
											<option value="" selected="selected">Seleccione una
												opción</option>
										</select>
									</div>
									<div class="form-group">
										<label for="inputDescripcion">Descripcion:</label> <input
											class="form-control" id="inputDescripcion"
											placeholder="Descripcion" type="text">
									</div>
									<div class="form-group">
										<label for="inputCuota">Cuota:</label> <input
											class="form-control" id="inputCuota"
											placeholder="Descripcion" type="text">
									</div>
									<div class="form-group">
										<label for="inputFundamento">Fundamento Legal:</label> <input
											class="form-control" id="inputFundamento"
											placeholder="Descripcion" type="text">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label for="inputComplementaria">Niveles Contables</label>
									</div>
									<div class="col-md-3">
										<div class="form-group">
											<label for="inputN1">N1:</label> <input class="form-control"
												id="inputN1" placeholder="Nivel 1" type="text">
										</div>

										<div class="form-group">
											<label for="inputN2">N2:</label> <input class="form-control"
												id="inputN2" placeholder="Nivel 2" type="text">
										</div>

										<div class="form-group">
											<label for="inputN3">N3:</label> <input class="form-control"
												id="inputN3" placeholder="Nivel 3" type="text">
										</div>

										<div class="form-group">
											<label for="selectNivel">Nivel:</label> <select
												class="form-control" id="selectNivel">
												<option value="" selected="selected">Seleccione una
													opción</option>
											</select>
										</div>
									</div>
									<div class="col-md-3">
										<div class="form-group">
											<label for="inputN4">N4:</label> <input class="form-control"
												id="inputN4" placeholder="Nivel 4" type="text">
										</div>

										<div class="form-group">
											<label for="inputN5">N5:</label> <input class="form-control"
												id="inputN5" placeholder="Nivel 5" type="text">
										</div>

										<div class="form-group">
											<label for="inputN6">N6:</label> <input class="form-control"
												id="inputN6" placeholder="Nivel 6" type="text">
										</div>
									</div>
								</div>
								<div class="col-md-2"></div>
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

<!-- Include Bootstrap-select CSS, JS -->
<script
	src="${pageContext.request.contextPath}/resources/bootstrap-select/js/bootstrap-select.min.js"></script>

<!-- Fin scripts -->


<script>
	$(document).ready(function() {

		obtenerAnyo();
		obtenerNiveles();

		$('#cancel-btn')
		.click(
				function() {
					var urlUsuario = "${pageContext.request.contextPath}/views/cajas/administracionConceptos.jsp";
					window.location = urlUsuario;
				});

		$('#save-btn').click(function() {
			
			var datos = {};

			datos.descripcion = $('#inputDescripcion');
			datos.nivel1 = $('#inputN1');
			datos.nivel2 = $('#inputN2');
			datos.nivel3 = $('#inputN3');
			datos.nivel4 = $('#inputN4');
			datos.nivel5 = $('#inputN5');
			datos.nivel6 = $('#inputN6');
			datos.clave = $('#inputClave');
			datos.cobroDerecho = $('#inputCuota');
			datos.ejercicioFiscal = $('#selectAnyoFiscal');
			datos.tipoNivel = $('#selectNivel');

			var formData = JSON.stringify(datos);

			var urlPost = "${pageContext.request.contextPath}/cajas/concepto/nuevoConcepto";
			
			$.ajax({
				type : 'POST',
				url : urlPost,
				data : formData,
				dataType : "json",
				contentType : 'application/json',
				success : function(data,textStatus,jQxhr) {
				swal(
					{
						title : "Concepto registrado correctamente.",
						type : "success",
						closeOnCancel : false
					});
			},
				error : function(jqXHR,textStatus,errorThrown) {
					console.log(textStatus+ " "+ errorThrown);
					}
				});
		});

	});

	var obtenerAnyo = function() {
		var aFiscales = [{id : 2017, aFiscal : 2017}, 
			{id : 2016, aFiscal : 2016}];
		$.grep(aFiscales, function(value, index) {

			$('#selectAnyoFiscal').append(
					'<option value="'+value.id+'">' + value.aFiscal
							+ '</option>');
		});
	};

	var obtenerNiveles = function() {
		var niveles = [{id : 1, descripcion : 'Afectable'}, 
			{id : 2, descripcion : 'Concentradora'}];
		$.grep(niveles, function(value, index) {

			$('#selectNivel').append(
					'<option value="'+value.id+'">' + value.descripcion
							+ '</option>');
		});
	};
</script>

</html>