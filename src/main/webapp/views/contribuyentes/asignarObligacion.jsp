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

		<!-- jquery-ui.css -->
		<link href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.css" rel="stylesheet" type="text/css" />		

		<link href="${pageContext.request.contextPath}/resources/sit/css/sit.css" rel="stylesheet" type="text/css">
		<link href="path/to/multiselect.css" media="screen" rel="stylesheet" type="text/css">
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
										<th>Tipo de Persona</th>
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
									<label for="inputTipo" class="col-sm-2 control-label">Tipo Persona</label> 
									<div class="col-sm-10">
										<input disabled="true" type="text" class="form-control" id="inputTipo" placeholder="Tipo de contribuyente" >
									</div>
								</div>
							</form>
						</div>
					</div>

					<div id="panelObligacion" class="box box-primary hidden">
						<div class="box-header">
							<h3 class="box-title">Registrar Obligación al Contribuyente</h3>
						</div>
						<div class="box-body">
							<div class="col-md-4">
								<div class="form-group">
									<label for="selectObligacion">Seleccione la Obligación</label>
									<div class="selectContainer">
											<dl class="dropdown">   										
											 <SELECT id="selectObligacion">
											    <option value=" IESP"> IESP</option>
												<option value=" ISAN"> ISAN</option>
											    <option value="NOMINA">NOMINA</option>
											    <option value="HOSPEDAJE">HOSPEDAJE</option>											   												
												<option value="JUEGOS DE AZAR">JUEGOS DE AZAR</option>
												<option value="REGIMEN INTERMEDIO">REGIMEN INTERMEDIO</option>
												<option value="REMEDIACIÓN AMBIENTAL EN LA EXTRACCIÓN DE MATERIALES"> REMEDIACIÓN AMBIENTAL EN LA EXTRACCIÓN DE MATERIALES </option>
												<option value=" DE LA EMISIÓN DE GASES A LA ATMÓSFERA"> DE LA EMISIÓN DE GASES A LA ATMÓSFERA</option>
												<option value="DE LA EMISIÓN DE CONTAMINANTES AL SUELO, SUBSUELO Y AGUA">DE LA EMISIÓN DE CONTAMINANTES AL SUELO, SUBSUELO Y AGUA</option>
												<option value=" DEPÓSITO O ALMACENAMIENTO DE RESIDUOS"> DEPÓSITO O ALMACENAMIENTO DE RESIDUOS</option>
									  		  </SELECT>		
											  </dl>	 																	    										
									</div>
								</div>
							</div>
						</div>
						
					<div class="box-body">
						<form id="formContribuyente" class="form-horizontal">
								<div class="form-group">
                                <label for="fechaAlta" class="col-sm-2 control-label">Fecha de Alta</label>
                                <div class="col-sm-4">
                                    <input id="fechaAlta" name="fechaAlta" class="form-control" />
                                </div>
                            </div>
						
								<div class="form-group">
                                <label for="vencimiento" class="col-sm-2 control-label">Dias de Vencimiento</label>
                                <div class="col-sm-4">
                                    <input id="vencimiento" name="vencimiento" type="text" class="form-control" />
                                </div>
                           		 </div>
									<div class="form-group">
                                <label for="estatus" class="col-sm-2 control-label">Estatus</label>
                                <div class="col-sm-4">
                                    <input id="estatus" name="estatus" type="text" class="form-control" />
                                </div>
                           		 </div>						
						
								<div class="form-group">
                                <label for="TipoObliagcion" class="col-sm-2 control-label">Tipo de Obligacion</label>
	                                <div class="col-sm-4">
	                                    <input id="TipoObliagcion" name="TipoObliagcion" type="text" class="form-control" />
	                                </div>
                           		 </div>		
                          </div>						
						</div>	
					</FORM>
						<table id="tblObligaciones" class="table table-hover voffset4" >
								<tbody>
									<tr class="bg-primary">
										<th><abbr title="X">Obligacion</abbr></th>										
										<th>Dia de Vencimiento</th>
										<th>Fecha de Inicio</th>
										<th>Estatus</th>
										<th>Usuario de Alta</th>
										<th>Tipo de obligacion</th>
									</tr>
								</tbody>
							</table>
						<div class="box-footer">
							<button id="cancelar-btn" type="button" class="btn btn-danger btn-lg">
								<i class="fa fa-close"></i> Cancelar
							</button>
							<button id="agregar" type="button" class="btn btn-primary btn-lg pull-right">
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
	$(function() {
		$.datepicker.regional['es-MX'] = {
			"Name" : "es-MX",
			"closeText" : "Close",
			"prevText" : "Prev",
			"nextText" : "Next",
			"currentText" : "Today",
			"monthNames" : [ "enero", "febrero", "marzo",
					"abril", "mayo", "junio", "julio",
					"agosto", "septiembre", "octubre",
					"noviembre", "diciembre", "" ],
			"monthNamesShort" : [ "ene", "feb", "mar",
					"abr", "may", "jun", "jul", "ago",
					"sep", "oct", "nov", "dic", "" ],
			"dayNames" : [ "domingo", "lunes", "martes",
					"miércoles", "jueves", "viernes",
					"sábado" ],
			"dayNamesShort" : [ "dom", "lun", "mar", "mié",
					"jue", "vie", "sáb" ],
			"dayNamesMin" : [ "do", "lu", "ma", "mi", "ju",
					"vi", "sá" ],
			"dateFormat" : "dd/mm/yy",
			"firstDay" : 0,
			"isRTL" : false
		};
		$.datepicker
				.setDefaults($.datepicker.regional['es-MX']);
		
		$("#fechaAlta").datepicker();
		

	});
	
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
			rfc : $(this).closest('tr').find('.RFC').text(),
			TipoPersona :  $(this).closest('tr').find('.TipoPersona').text()
			
    	} 
    	
    	//alert(rfcContribuyente.nombre);
        
    });
	
	$('#seleccionarContribuyente').click(function() {
		
		
			mostrarContribuyente(rfcContribuyente);	
			
			
		}
	);
	
	$('#agregar').click(function() {
		addObligacion();
		
	});
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
			+ '<td class=\"RFC\" >' + data[i].rfc + '</td>'
			+ '<td class=\"nombre\">' + data[i].nombreCompuesto + '</td>'
			+ '<td >-</td>'
			+ '<td class=\"TipoPersona\">' + data[i].tipoPersona + '</td>'
			+ '<td >-</td>'
			+ '</tr>';
	   tableBody.append(row);
	}
}

function mostrarContribuyente(contribuyente) {
	//console.log("Iniciando mostrar contribuyente");
	
	
	$('#inputNombre').val(contribuyente.nombre);
	$('#inputRfc').val(contribuyente.rfc);
	$('#inputTipo').val(contribuyente.TipoPersona);
	
	$('#panelContribuyente').removeClass('hidden');
	$('#panelObligacion').removeClass('hidden');

	} 

	
function addObligacion(){ 
	
	   var Obligacion=$("#selectObligacion").val();
	   var Dias=$("#vencimiento").val();
	   var Fecha=$("#fechaAlta").val(); 
	   var Estatus=$("#estatus").val(); 
	   var Tipo=$("#TipoObliagcion").val(); 	

				if(!!Obligacion && !!Dias && !!Fecha && !!Estatus && !!Tipo){
			   	var tableDatos = $('#tblObligaciones > tbody');   		   
				  			   
				    var row = '<tr>'
						+ '<td class=\"Obligacion\" >' + Obligacion + '</td>'
						  + '<button class="btn removemebtn">Remove Row!!'
						+ '<td class=\"Dias\">' + Dias + '</td>'
						+ '<td class=\"Fecha Alta\">' + Fecha + '</td>'
						+ '<td class=\"Estatus\">' + Estatus + '</td>'
						+ '<td>-</td>'
						+ '<td class=\"Tipo de Obliagcion\">' + Tipo + '</td>'
						+ '</tr>';
						tableDatos.append(row);
						borrar();
						deleteRow();   	

}
		}
	   	
	function borrar(){
		$("#selectObligacion").val('');
		$("#vencimiento").val('');
		$("#fechaAlta").val('');
		$("#estatus").val('');
		$("#TipoObliagcion").val('');
	}
	function deleteRow(i){
	    document.getElementById('#tblObligaciones').deleteRow(i)
	}

	</script>
	</body>
</html>
