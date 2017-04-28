<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<title>Cajas</title>

		<!-- Bootstrap -->
		<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<!-- Font Awesome -->
		<link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" />

		<!-- AdminLTE -->
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css" rel="stylesheet" />

		<!-- Sweetalert -->
		<link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css" rel="stylesheet" type="text/css">

		<!-- FormValidation -->
		<link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
		
		<link href="${pageContext.request.contextPath}/resources/sit/css/sit.css" rel="stylesheet" type="text/css">
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
					<h1><span style="color: #798c9c"> </span>Contribuyentes</h1>
				</section>
			
				<!-- Main content Usuarios Registrados -->
				<section class="content">			
					<div id="panelBusqueda" class="box box-primary">
						<div class="box-header">
							<h3 class="box-title">Datos Generales</h3>
						</div>
						<div class="box-body">
							<div class="row">
								<div class="col-md-4 col-md-offset-4">
		                            <div class="has-feedback">
		                                <input id="busqueda" name="busqueda" type="text"
		                                       class="form-control input-sm" 
		                                       placeholder="Buscar..." data-toggle="tooltip" 
		                                       data-placement="top" title="Buscar por nombre, razón social o RFC">
		                                <span class="glyphicon glyphicon-search form-control-feedback"></span>
		                            </div>
								</div>
							</div>
							
							<table id="tblContribuyente" class="table table-hover voffset4" >
								<tbody>
									<tr class="bg-primary">
										<th><abbr title="Registro federal de contribuyentes">RFC</abbr></th>
										<th>Nombre o Razón social</th>
										<th>Dirección fiscal</th>
										<th>Fecha de nacimiento</th>
										<th>Estado</th>
									</tr>
								</tbody>
							</table>

							<div class="row">
								<div class="col-md-4">
									<button id="seleccionarContribuyente" type="button" class="btn btn-primary"><i class="glyphicon glyphicon-eye-open"></i>&nbsp;&nbsp;Ver contribuyente</button>
								</div>
							</div>
						</div>
					</div>

					<div id="panelContribuyente" class="box box-success hidden">
						<div class="box-header">
							<h3 class="box-title">Contribuyentes</h3>
						</div>
						<div class="box-body">
							<form id="formContribuyente" class="form-horizontal">
								<div class="form-group">
									<label for="inputNombre" class="col-sm-2 control-label">Nombre</label> 
		 							<div class="col-sm-10">
										<input disabled="true" type="text" class="form-control" id="inputNombre" placeholder="Nombre del contribuyente" />
		 							</div>
								</div>

								<div class="form-group">
									<label for="inputRfc" class="col-sm-2 control-label">RFC</label> 
									<div class="col-sm-10">
										<input disabled="true" type="rfc" class="form-control" id="inputRfc" placeholder="RFC del contriobuyente" >
									</div>
								</div>

								<div class="form-group">
									<label for="inputDomicilio" class="col-sm-2 control-label">Docimilio</label> 
									<div class="col-sm-10">
										<input disabled="true" type="text" class="form-control" id="inputDomicilio" placeholder="Nombre contribuyente" >
									</div>
								</div>
							</form>
						</div>
					</div>

					<div id="panelObligacion" class="box box-primary hidden">
						<div class="box-header">
							<h3 class="box-title">Obligación</h3>
						</div>
						<div class="box-body">
							<div class="col-md-4">
								<div class="form-group">
									<label for="selectObligacion">Tipo de obligación</label>
									<div class="selectContainer">
										
												<input type="checkbox" id="c1" name="cc" />
											    <label for="c1"><span></span>Nomina</label>
											    <p>
											    <input type="checkbox" id="c2" name="cc" />
											    <label for="c2"><span></span>Hospedaje</label>
											    <p><br/>
											    								
									
									</div>
								</div>
							</div>
						</div>
						<div class="box-footer">
							<button id="cancelar-btn" type="button" class="btn btn-danger btn-lg">
								<i class="fa fa-close"></i> Cancelar
							</button>
							<button id="agregar-btn" type="button" class="btn btn-primary btn-lg pull-right">
								<i class="fa fa-plus"></i> Agregar
							</button>
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
	
		<!-- Scripts -->
		<!-- jQuery -->
		<script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
	
		<!-- jQuery UI -->
		<script src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

		<!-- jQuery Form -->
		<script src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js" ></script>

		<!-- Bootstrap -->
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

		<!-- Bootstrap WYSIHTML5 -->
		<script src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

		<script src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>

		<script src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script>

		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>

		<!-- Include Bootstrap-select CSS, JS -->
		<script src="${pageContext.request.contextPath}/resources/bootstrap-select/js/bootstrap-select.min.js"></script>
		<!-- Fin scripts -->

		<script>
$(document).ready(function() {
	var rfcContribuyente;
	
	$('#busqueda').keyup(function() {
			buscar();		
		}
	);

	// Cambiar puntero
    $('#tblContribuyente > tbody').hover(function() {
        $(this).css('cursor', 'pointer');
    });
	
	// Mantiene seleccionada una fila cambiando de color	
	$('#tblContribuyente > tbody').on("click", "tr", function(event) {
	   		$(this).addClass('bg-info').siblings().removeClass('bg-info');
		}
	);
	
    //Obtiene el ID de la fila seleccionada
    $('#tblContribuyente > tbody').on("click", "td", function() {
    	rfcContribuyente = {
    		nombre : $(this).closest('tr').find('.nombre').text(),
			rfc : $(this).closest('tr').find('.rfc').text(),
			domicilio : ''
    	} 
        
    });
	
	$('#seleccionarContribuyente').click(function() {
		
			mostrarContribuyente(rfcContribuyente);	
			
		}
	);
});



function buscar() {
	var criterio = $('#busqueda').val();
	
	if(criterio.length > 3) {
		//console.log("Iniciando busqueda");

    	var urlGet = '${pageContext.request.contextPath}/cajas/contribuyentes/consulta?porCriterio=' + criterio;
	    $.ajax({
	        type: 'GET',
	        dataType : 'json',
	        url: urlGet,
	        success: function(data) {
	            console.log(data);
	        	llenarTablaContribuyentes(data);
	        },
	        error : function(jqXHR, textStatus, errorThrown) {
	            console.log(textStatus + " " + errorThrown);
	        }
	    });
	} else {
		$('#panelContribuyente').addClass('hidden');
	}
}

function llenarTablaContribuyentes(data) {
   // console.log("Iniciando llenar tabla");

	var tableBody = $('#tblContribuyente > tbody');

	for (var i = 0; i < data.length; i++) {
	    var row = '<tr>'
			+ '<td class=\"rfc\" >' + data[i].rfc + '</td>'
			+ '<td class=\"nombre\">' + data[i].nombreCompuesto + '</td>'
			+ '<td >-</td>'
			+ '<td >' + data[i].fechaNacimiento + '</td>'
	        + '<td >-</td>'
			+ '</tr>';
	   tableBody.append(row);
	}
}

function mostrarContribuyente(contribuyente) {
	//console.log("Iniciando mostrar contribuyente");
	
	$('#inputNombre').val(contribuyente.nombre);
	$('#inputRfc').val(contribuyente.rfc);
	$('#inputDomicilio').val(contribuyente.domicilio);
	
	$('#panelContribuyente').removeClass('hidden');
	$('#panelObligacion').removeClass('hidden');
	
} 
function seleccionarObligaciones(obligaciones){
	
}
		</script>
	</body>
</html>