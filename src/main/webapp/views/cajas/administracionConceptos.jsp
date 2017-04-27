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
					<span style="color: #798c9c"> </span>Administración de conceptos
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">
				<!-- Main row -->

				<div class="col-md-12" id="div2">

					<div id="administradorConcepto" class="row">
						<!-- left column -->
						<div class="col-md-12">
							<!-- general form elements -->
							<div class="box box-primary">
								<div class="box-header">
									
								</div>

								<div class="box-body">
									<div class="col-md-6">
										<form class="form-inline">

											<div class="form-group">

												<label for="selectCriterio">Criterio Búsqueda:</label> <select
													class="form-control" id="selectCriterio">
													<option value="" selected="selected">Seleccione
														una opción</option>
												</select>

											</div>

											<div class="form-group">
												<input type="text" class="form-control" id="inputCriterio"
													placeholder="Ingrese criterio busqueda">
											</div>

											<button type="button"
												class="btn btn-sm btn-success glyphicon glyphicon-search"
												id="btnBuscar"></button>

										</form>
									</div>
									<br /> <br />
								</div>

								<div class="box-footer">

									<div class="col-md-12">
										<table id="tablaConceptos"
											class="tablaUsuarios table table-bordered table-hover">
											<thead>
												<tr class="bg-primary">
													<th></th>
													<th></th>
													<th>ID</th>
													<th>AÑO</th>
													<th>DESCRIPCION</th>
													<th>N1</th>
													<th>N2</th>
													<th>N3</th>
													<th>N4</th>
													<th>N5</th>
													<th>N6</th>
													<th>CLAVE</th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
									</div>

									<br /> <br />
									<button type="button"
										class="btn btn-info glyphicon glyphicon-plus"
										id="nuevoConcepto">&nbsp;Alta Concepto</button>
								</div>

							</div>
							
							
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header"></div>
										<div class="modal-body">

											<div class="box box-primary">
												<div class="box-header">
													<h3 class="box-title">Datos Generales</h3>
												</div>
												<div class="box-body">
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputAnyoConsulta">Año Fiscal:</label> <input
															class="form-control" id="inputAnyoConsulta"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputDescripcionConsulta">Descripcion:</label> <input
															class="form-control" id="inputDescripcionConsulta"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputCuotaConsulta">Cuota:</label> <input
															class="form-control" id="inputCuotaConsulta"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputFundamentoConsulta">Fundamento Legal:</label> <input
															class="form-control" id="inputFundamentoConsulta"
															placeholder="Descripcion" type="text">
														</div>
													</div>
												</div>
												<div class="box-footer">
													<div class="col-md-12">
														<div class="form-group">
															<label for="inputComplementaria">Niveles Contables</label>
														</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputN1Consulta">N1:</label> <input
															class="form-control" id="inputN1Consulta"
															placeholder="Nivel 1" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN2Consulta">N2:</label> <input
															class="form-control" id="inputN2Consulta"
															placeholder="Nivel 2" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN3Consulta">N3:</label> <input
															class="form-control" id="inputN3Consulta"
															placeholder="Nivel 3" type="text">
														</div>
									
														<div class="form-group">
															<label for="nivelConsulta">Nivel:</label><input
															class="form-control" id="nivelConsulta"
															placeholder="Nivel 3" type="text">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputN4Consulta">N4:</label> <input
															class="form-control" id="inputN4Consulta"
															placeholder="Nivel 4" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN5Consulta">N5:</label> <input
															class="form-control" id="inputN5Consulta"
															placeholder="Nivel 5" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN6Consulta">N6:</label> <input
															class="form-control" id="inputN6Consulta"
															placeholder="Nivel 6" type="text">
														</div>
													</div>
												</div>
												</div>
											</div>
								       </div>
								       <div class="modal-footer">
        									<button  id="closeDialog" type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      									</div>
								    </div>
								</div>
							</div>
							
							<!-- panel de  modificacion -->
							<div class="modal fade" id="myModalEditar" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header"></div>
										<div class="modal-body">

											<div class="box box-primary">
												<div class="box-header">
													<h3 class="box-title">Datos Generales</h3>
												</div>
												<div class="box-body">
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputAnyoEditar">Año Fiscal:</label> <input
															class="form-control" id="inputAnyoEditar"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputDescripcionEditar">Descripcion:</label> <input
															class="form-control" id="inputDescripcionEditar"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputCuotaEditar">Cuota:</label> <input
															class="form-control" id="inputCuotaEditar"
															placeholder="Descripcion" type="text">
														</div>
														<div class="form-group">
															<label for="inputFundamentoEditar">Fundamento Legal:</label> <input
															class="form-control" id="inputFundamentoEditar"
															placeholder="Descripcion" type="text">
														</div>
													</div>
												</div>
												<div class="box-footer">
													<div class="col-md-12">
														<div class="form-group">
															<label>Niveles Contables</label>
														</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputN1Editar">N1:</label> <input
															class="form-control" id="inputN1Editar"
															placeholder="Nivel 1" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN2Editar">N2:</label> <input
															class="form-control" id="inputN2Editar"
															placeholder="Nivel 2" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN3Editar">N3:</label> <input
															class="form-control" id="inputN3Editar"
															placeholder="Nivel 3" type="text">
														</div>
									
														<div class="form-group">
															<label for="nivelEditar">Nivel:</label><input
															class="form-control" id="nivelEditar"
															placeholder="Nivel 3" type="text">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="inputN4Editar">N4:</label> <input
															class="form-control" id="inputN4Editar"
															placeholder="Nivel 4" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN5Editar">N5:</label> <input
															class="form-control" id="inputN5Editar"
															placeholder="Nivel 5" type="text">
														</div>
									
														<div class="form-group">
															<label for="inputN6Editar">N6:</label> <input
															class="form-control" id="inputN6Editar"
															placeholder="Nivel 6" type="text">
														</div>
													</div>
												</div>
												</div>
											</div>
								       </div>
								       <div class="modal-footer">
        									<button  id="closeDialog2" type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
      									</div>
								    </div>
								</div>
							</div>
							<!-- Fin panel modificar -->
								
						</div>
					</div>
					
					<div id="panelAltaConcepto" class="box box-success">
						<div class="box-header">
						<div class="col-md-1"><button  id="regresar" type="button" class="btn btn-default" data-dismiss="modal">Regresar</button></div>
						<h3 class="box-title">ALTA CONCEPTO</h3></div>
						<div class="box-body">
							<div class="col-md-1"></div>
							<div class="col-md-4">
								<div class="form-group">
									<label for="inputComplementaria">Datos Generales</label>
								</div>
								<div class="form-group">
									<label for="selectAnyoFiscal">Año Fiscal:</label> <select
													class="form-control" id="selectAnyoFiscal">
													<option value="" selected="selected">Seleccione
														una opción</option>
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
										<label for="inputN1">N1:</label> <input
											class="form-control" id="inputN1"
											placeholder="Nivel 1" type="text">
									</div>
									
									<div class="form-group">
										<label for="inputN2">N2:</label> <input
											class="form-control" id="inputN2"
											placeholder="Nivel 2" type="text">
									</div>
									
									<div class="form-group">
										<label for="inputN3">N3:</label> <input
											class="form-control" id="inputN3"
											placeholder="Nivel 3" type="text">
									</div>
									
									<div class="form-group">
										<label for="selectNivel">Nivel:</label> <select
													class="form-control" id="selectNivel">
													<option value="" selected="selected">Seleccione
														una opción</option>
												</select>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-group">
										<label for="inputN4">N4:</label> <input
											class="form-control" id="inputN4"
											placeholder="Nivel 4" type="text">
									</div>
									
									<div class="form-group">
										<label for="inputN5">N5:</label> <input
											class="form-control" id="inputN5"
											placeholder="Nivel 5" type="text">
									</div>
									
									<div class="form-group">
										<label for="inputN6">N6:</label> <input
											class="form-control" id="inputN6"
											placeholder="Nivel 6" type="text">
									</div>
								</div>
							</div>
							<div class="col-md-2"></div>
						</div>
						<div class="box-footer clearfix"></div>
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
	$(document).ready(function() {

						$('#panelAltaConcepto').hide();
						$('#administradorConcepto').show();

						obtenerCriterioBusqueda();
						obtenerAnyo();
						obtenerNiveles();
						
						$('#cancel-btn')
								.click(
										function() {
											var urlUsuario = "${pageContext.request.contextPath}/views/usuario/usuario.jsp";
											window.location = urlUsuario;
										});

						//Registra un usuario
						$('#btnBuscar').click(function() {
							
											//Validaciones
											if ($('#selectCriterio').val().length < 1) {
												swal({
													title : "Debe seleccionar el tipo de busuqeda a realizar.",
													type : "error",
													closeOnCancel : false
												});
												$('#selectCriterio').css("border-color", "#ff0000");

												return;
											} else {
												$('#selectCriterio').css("border-color", "#d2d6de");
											}

											if ($('#inputCriterio').val().length < 1) {
												swal({
													title : "Debe Ingresar criterio de busqueda.",
													type : "error",
													closeOnCancel : false
												});
												$('#inputCriterio').css("border-color", "#ff0000");

												return;
											} else {
												$('#inputCriterio').css("border-color", "#d2d6de");
											}

											var estiloBotonVer="'btn-sm btn-success glyphicon glyphicon-eye-open btn-mover'";
											var estiloBotonEditar="'btn btn-sm btn-primary glyphicon glyphicon-pencil btn-mover'";

											$('tbody').find('td').remove();
											for (var i = 0; i < conceptos.length; i++) {
												tr = $('<tr/>');
												$(tr).append("<td class="+"visualizar"+">"+"<button id="+"btn"+conceptos[i].id+" onclick="+"consultarConcepto()"+" class="+estiloBotonVer+" style="+"text-align:center;" + ">"+"</button></td>");
												$(tr).append("<td class="+"editar"+">"+"<button id="+"btnEditar"+conceptos[i].id+" onclick="+"editarConcepto()"+" class="+estiloBotonEditar+" style="+"text-align:center;" + ">"+"</button></td>");
												$(tr).append("<td class="+"id" +" >"+ conceptos[i].id+ "</td>");
												$(tr).append("<td class="+"aFiscal" +" >"+ conceptos[i].aFiscal+ "</td>");
												$(tr).append("<td class="+"descripcion" +" >"+ conceptos[i].descripcion+ "</td>");
												$(tr).append("<td class="+"n1" +" >"+ conceptos[i].n1+ "</td>");
												$(tr).append("<td class="+"n2" +" >"+ conceptos[i].n2+ "</td>");
												$(tr).append("<td class="+"n3" +" >"+ conceptos[i].n3+ "</td>");
												$(tr).append("<td class="+"n4" +" >"+ conceptos[i].n4+ "</td>");
												$(tr).append("<td class="+"n5" +" >"+ conceptos[i].n5+ "</td>");
												$(tr).append("<td class="+"n6" +" >"+ conceptos[i].n6+ "</td>");
												$(tr).append("<td class="+"clave" +" >"+ conceptos[i].clave+ "</td>");
												$('#tablaConceptos > tbody')
														.append(tr);
											}

										});

						$('#nuevoConcepto')
								.click(function() {
									$('#panelAltaConcepto').show();
									$('#administradorConcepto').hide();
										});

						$('#panelAltaConcepto')
						.click(function() {
							$('#panelAltaConcepto').hide();
							$('#administradorConcepto').show();
								});

						$('#closeDialog').click(function() {
							$('#myModal').modal('hide');
						});

						$('#closeDialog2').click(function() {
							$('#myModalEditar').modal('hide');
						});

						function parseDate(jsonDate) {
							var dateObject = new Date(jsonDate);
							var day = dateObject.getDate();
							var month = dateObject.getMonth() + 1;
							var year = dateObject.getFullYear();
							day = day < 10 ? "0" + day : day;
							month = month < 10 ? "0" + month : month;
							var date = day + "/" + month + "/" + year;
							return date;
						}

						function estatusUsuario(estatus) {
							var urlEstatus;
							if (estatus == 1) {
								urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/active.png";
							} else if (estatus == 0) {
								urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/inactive.png";
							}
							return urlEstatus;
						}

						//Mantiene seleccionada una fila cambiando de color	
						$('tbody').on(
								"click",
								"tr",
								function(event) {
									$(this).addClass('bg-info').siblings()
											.removeClass('bg-info');
								});

						//cambiar puntero
						$('tbody').hover(function() {
							$(this).css('cursor', 'pointer');
						});

						$('tbody').on(
								"click",
								"td",
								function() {
									idConcepto = $(this).closest('tr')
											.find('.id').text();
								});

					});

	var idConcepto;

	var conceptos = [{id : 24534, aFiscal : 2015, descripcion : 'IMP S/NOMINA PAGO ESPONTÁNEO', n1 : 4115, n2 : 100, n3 : 100, n4 : 10, n5 : 0, n6 : 0, clave: 161},
		{id : 30949, aFiscal : 2016, descripcion : 'IMP S/NOMINA ACTO CONTROL DE OBLIGACIONES', n1 : 4191, n2 : 4115, n3 : 100, n4 : 100, n5 : 30, n6 : 0, clave: 161},
		{id : 31534, aFiscal : 2016, descripcion : 'IMP S/NOMINA PAGO ESPONTÁNEO', n1 : 4115, n2 : 100, n3 : 100, n4 : 10, n5 : 0, n6 : 0, clave: 161},
		{id : 32534, aFiscal : 2017, descripcion : 'IMP S/NOMINA PAGO ESPONTÁNEO', n1 : 4115, n2 : 100, n3 : 100, n4 : 10, n5 : 0, n6 : 0, clave: 161}];

	var obtenerCriterioBusqueda = function() {
		var criterios = [ {
			id : 1,
			criterio : 'Clave concepto'
		}, {
			id : 2,
			criterio : 'Obligacion'
		}];
		$.grep(criterios, function(value, index) {

			$('#selectCriterio').append(
					'<option value="'+value.id+'">' + value.criterio
							+ '</option>');
		});
	};
	
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

	
	var consultarConcepto = function() {
		if (idConcepto == null) {
			swal({
				title : "No ha seleccionado concepto.",
				type : "error",
				closeOnCancel : false
			});
			$('#myModal').modal('hide');
			
			return;
		}

		$('#myModal').modal('show');

		$.grep(conceptos, function(value, index) {
			if(idConcepto==value.id){
				console.log('obtener datos');
				$('#inputAnyoConsulta').val(value.aFiscal);
				$('#inputDescripcionConsulta').val(value.descripcion);
				$('#inputCuotaConsulta').val('0.00');
				$('#inputFundamentoConsulta').val('FUNDAMENTACION');
				$('#inputN1Consulta').val(value.n1);
				$('#inputN2Consulta').val(value.n2);
				$('#inputN3Consulta').val(value.n3);
				$('#inputN4Consulta').val(value.n4);
				$('#inputN5Consulta').val(value.n5);
				$('#inputN6Consulta').val(value.n6);
				$('#nivelConsulta').val('Afectable');
			}
		});
		
	};

	var editarConcepto = function() {
		if (idConcepto == null) {
			swal({
				title : "No ha seleccionado concepto.",
				type : "error",
				closeOnCancel : false
			});
			$('#myModalEditar').modal('hide');
			
			return;
		}

		$('#myModalEditar').modal('show');

		$.grep(conceptos, function(value, index) {
			if(idConcepto==value.id){
				console.log('obtener datos');
				$('#inputAnyoEditar').val(value.aFiscal);
				$('#inputDescripcionEditar').val(value.descripcion);
				$('#inputCuotaEditar').val('0.00');
				$('#inputFundamentoEditar').val('FUNDAMENTACION');
				$('#inputN1Editar').val(value.n1);
				$('#inputN2Editar').val(value.n2);
				$('#inputN3Editar').val(value.n3);
				$('#inputN4Editar').val(value.n4);
				$('#inputN5Editar').val(value.n5);
				$('#inputN6Editar').val(value.n6);
				$('#nivelEditar').val('Afectable');
			}
		});
		
	};
	
</script>
</html>