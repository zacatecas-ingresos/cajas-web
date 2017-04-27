<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
					<span style="color: #798c9c"> </span>Asignar Obligacion
				</h1>
			</section>

			<!-- Main content Usuarios Registrados -->
			<section class="content">
				<div class="row"> 					
					<div class="col-md-12">
						<div class="box box-primary" id="busqueda">							
							<div class="box-header">
								<h3 class="box-title">Datos Generales</h3>
							</div>
							<div class="box-body">
									<div class="row">
										<div class="col-md-2">
											<div class="form-group">
												<label for="selectCriterio">Tipo Búsqueda:</label> 
											</div>
										</div>
										<div class="col-md-4">
											<select
												class="form-control" id="selectCriterio">
												<option value="" selected="selected">Seleccione una opción</option>
												</select>	
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<input type="text" class="form-control" id="inputCriterio"
												placeholder="Ingrese criterio busqueda">
											</div>
										</div>
										<div class="col-md-2">
											<button type="button"
											class="btn btn-sm btn-success glyphicon glyphicon-search"
											id="btnBuscar">
											</button>
										</div>
									</div>
								<br /> <br />
							</div>
							
							<div class="box-footer"  id="resultadoBusqueda" >
								<div class="col-md-12">
									<table id="tablaContribuyente"
										class="tablaUsuarios table table-bordered table-hover">
											<thead>
											<tr class="bg-primary">
											<th>RFC</th>
											<th>NOMBRE O RAZÓN SOCIAL</th>
											<th>DIRECCIÓN FISCAL</th>
											<th>FECHA INICIO</th>
											<th>ESTATUS</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>								
								<br /> <br />
								<button type="button" class="btn btn-primary glyphicon glyphicon-eye-open" id="seleccionarContribuyente"> &nbsp; Ver </button>
							</div>
						</div>
					</div>
				</div>	
				
				<div class="row">
					<div class="col-md-12">
						<div class="box box-success" id="panelContribuyente" >						
							<div class="box-header">
								<h3 class="box-title">Datos del Contribuyente</h3>
							</div>
							<div class="box-body">

								<div class="col-md-12">
									
									<form class="form-horizontal" id="formContribuyente" >

										<div class="form-group">
											<label for="inputNombre" class="col-sm-2 control-label">Nombre:</label> 
											 <div class="col-sm-10">
												<input type="text"
												class="form-control" id="inputNombre"
												placeholder="Nombre contribuyente" >
											 </div>
										</div>
										<div class="form-group">
											<label for="inputRfc" class="col-sm-2 control-label">&nbsp;&nbsp;&nbsp;RFC:</label> 
											<div class="col-sm-10">
												<input
												type="email" class="form-control" id="inputRfc"
												placeholder="Ingrese criterio busqueda" >
											</div>
										</div>
										<div class="form-group">
											<label for="inputDomicilio" class="col-sm-2 control-label" >Docimilio:</label> 
											<div class="col-sm-10">
												<input
												type="text" class="form-control" id="inputDomicilio"
												placeholder="Nombre contribuyente" >
											</div>
										</div>
									</form>
								</div>
							<br /> <br />
				<div class="row">
					<div class="col-md-12">
						<div class="box box-info" id="panelAsignar">
							<div class="box-header">
								<h3 class="box-title">Asignar Obligacion</h3>
							</div>
							<div class="box-body">
									<div class="col-md-4">						
											<div class="form-group">
											<label for="selectObligacion">Obligación:</label>
											<div class="selectContainer">
												<select class="form-control " id="selectObligacion"
													name="selectObligacion">
													<option value="">Seleccione una obligación</option>
												</select>
											</div>
										</div>
										 <div class="box-footer clearfix">
                                <button id="cancel-btn" type="button"
                                    class="btn btn-default btn-lg pull-left">
                                    <i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
                                    Cancelar
                                </button>
                                <button type="button" id="save-btn"
                                    class="btn btn-success btn-lg pull-right">
                                    <i class="fa fa-credit-card"></i> Agregar
                                </button>
                            </div>											
						</div>
					</div>
				</div>

			</section>
			<!-- Fin contenido Registrar Usuario -->
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
<script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

<!-- jQuery UI -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

<!-- jQuery Form -->
<script
	src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" ></script>

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
<script src="${pageContext.request.contextPath}/resources/bootstrap-select/js/bootstrap-select.min.js"></script>

<!-- Fin scripts -->


<script>
	$(document).ready(function() {		
		var resultados = [];
		var rfcContribuyente;			
		var data = [{rfc:'EITS830726F83', nombre:'GRUPO X', domicilio:'FINANZAS NO.88.', fechaInicio:new Date(), activo:true,
								sucursales:[{numero:41, calle:'AV. X', numInt:888, numExt:888, colonia:'X', municipio:'ZACATECAS', empleados:3, declara:true}]}];
	

		$('#panelContribuyente').hide();
		$('#panelAsignar').hide();	
	//	$('#agregar-btn').hide();
							
		obtenerCriterioBusqueda();	
		obtenerObligacion();

		
		//Busca un contribuyente
		$('#btnBuscar').click(function() {
								
				//Validaciones
				if($('#selectCriterio').val().length < 1){
					swal(
							{
							  	title : "Debe seleccionar el tipo de busuqeda a realizar.",
							 	type : "error",
								closeOnCancel : false
							}
						);
					
					$('#selectCriterio').css("border-color", "#ff0000");				
					return;		
				}else{
						$('#selectCriterio').css("border-color", "#d2d6de");
					}
					
				if($('#inputCriterio').val().length < 1){
					swal(
							{
							  	title : "Debe Ingresar criterio de busqueda.",
							 	type : "error",
								closeOnCancel : false
							}
						);
					$('#inputCriterio').css("border-color", "#ff0000");
					return;		
				}else{
						$('#inputCriterio').css("border-color", "#d2d6de");
					}

				$('#panelContribuyente').hide();
				$('#panelAsignar').hide();
										
				$('tbody').find('td').remove();
				for (var i = 0; i < data.length; i++) {
					tr = $('<tr/>');
					$(tr).append("<td class="+"rfc" +" >" + data[i].rfc + "</td>");
					$(tr).append("<td class="+"nombre" +" >" + data[i].nombre + "</td>");
					$(tr).append("<td class="+"domicilio" +" >" + data[i].domicilio + "</td>");
					$(tr).append("<td class="+"fechaInicio" +" >" + parseDate(data[i].fechaInicio) + "</td>");
					$(tr).append("<td class="+"activo" +" >" + "<img src="+estatusUsuario(data[i].activo)+" style="+"width:30px; height:auto;" + "></img></td>");
					$('#tablaContribuyente > tbody').append(tr);
				}								
						
				$('#resultadoBusqueda').show();	

			});
			

			$('#seleccionarContribuyente').click(function(){
				if(rfcContribuyente == null){
					swal(
							{
								title : "No ha seleccionado a un contribuyente.",
								type : "error",
								closeOnCancel : false
							}
						);
				}else{
									
						$.grep(data, function(value, index) {
							if(rfcContribuyente==value.rfc){
								$('#inputNombre').val(value.nombre);
								$('#inputRfc').val(value.rfc);
								$('#inputDomicilio').val(value.domicilio);
											
								//$('tbody').find('td').remove();
								for (var i = 0; i < value.sucursales.length; i++) {
									tr = $('<tr/>');
									$(tr).append("<td class="+"No" +" >" + value.sucursales[i].numero + "</td>");
									$(tr).append("<td class="+"calle" +" >" + value.sucursales[i].calle + "</td>");
									$(tr).append("<td class="+"numInt" +" >" + value.sucursales[i].numInt + "</td>");
									$(tr).append("<td class="+"numExt" +" >" + value.sucursales[i].numExt + "</td>");
									$(tr).append("<td class="+"colonia" +" >" + value.sucursales[i].colonia + "</td>");
									$(tr).append("<td class="+"municipio" +" >" + value.sucursales[i].municipio + "</td>");
									$(tr).append("<td class="+"empleados" +" >" + value.sucursales[i].empleados + "</td>");
									//$(tr).append("<td class="+"declara" +" >"+"<input type="+"checkbox"+"checked="+sucursales[i].declara+">"+ "</td>");
									$('#tablaSucursales > tbody').append(tr);
								}
											
							}
										
						});
									
									
					$('#panelContribuyente').show();
					$('#panelAsignar').show();	
					$('#resultadoBusqueda').hide();
				

			}
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
			

		function estatusUsuario(estatus){
			var urlEstatus;
			if(estatus == 1){
				urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/active.png";
			}else if(estatus == 0){
				urlEstatus = "${pageContext.request.contextPath}/resources/admin-lte/img/inactive.png";
			}
			return urlEstatus;
		}	


		//Mantiene seleccionada una fila cambiando de color	
		$('tbody').on("click", "tr", function(event) {
		   	$(this).addClass('bg-info').siblings().removeClass('bg-info');
		});
			
		//cambiar puntero
		$('tbody').hover(function() {
			 $(this).css('cursor','pointer');
		});
			
		$('tbody').on("click", "td", function() {
			rfcContribuyente = $(this).closest('tr').find('.rfc').text();
		});
								
		
		function obtenerCriterioBusqueda() {
			var criterios = [ {id : 1, criterio : 'Nombre'}, {id : 2, criterio : 'Razon Social'}, 
				{id : 3,criterio : 'RFC'}];
			$.grep(criterios, function(value, index) {
				$('#selectCriterio').append(
						'<option value="'+value.id+'">' + value.criterio
								+ '</option>');
			});
		}								
		
				
		function obtenerObligacion() {
			var obligaciones = [{id:3, obligacion:'Nomina'}, {id:4, obligacion:'Hospedaje'}];
			$.grep(obligaciones, function(value, index) {
				$('#selectObligacion').append('<option value="'+value.id+'">' + value.obligacion
				+ '</option>');
			});
		}	

			

		//Errores
	    $.ajaxSetup({
	        error: function (x, status, error) {
	            if (x.status == 400) {
	            	var result = x.responseJSON;
	            	console.log(result.code);
	            	console.log(result.message);
	            	swal({
						title:"Error " + result.code, 
						text:result.message, 
						type:"error",
						closeOnCancel: false
					});	            		               
	            } else if(x.status == 500) {
	            	swal({
						title:"Error 500", 
						text:"Disculpe las molestias no podemos procesar su solicitud.", 
						type:"error",
						closeOnCancel: false
					});
	            }
	        }
	    });

	});
	</script>

</html>