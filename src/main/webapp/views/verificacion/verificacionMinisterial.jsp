<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta
    content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
    name="viewport">
<title>Verificación ministerial</title>

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

        <!-- Encabezado -->
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
        <!-- Fin del encabezado -->

        <!-- Menú lateral izquierdo -->
        <aside class="main-sidebar">
            <section class="sidebar">
                <%@ include file="/WEB-INF/jspf/menu.jspf" %><!-- Se llama al al archivo donde se encuentra el menú -->
            </section>
        </aside>
        <!-- Fin menú lateral izquierdo -->

        <!-- Contenido de la página -->
        <div class="content-wrapper">

            <!-- Encabezado del contenido de la página -->
            <section class="content-header">
                <h1>
                    <span style="color: #798c9c"> </span>Verificación ministerial
                </h1>
            </section>
            <!-- Fin del encabezado del contenido de la página -->



            <!-- Usuarios Registrados -->
            <section class="content">

                <div class="box box-primary">

                    <div class="box-body">

                        <div class="row">

                            <div class="col-md-12">



                                <!-- Contenido -->

                                <!-- Botón nuevo marcas 
                                <div class="col-xs-1 col-md-5"></div>
                                <div class="col-xs-1 col-md-5"></div>
                                <div class="col-xs-10 col-md-2">
                                    <div class="dropdown">
                                        <button class="btn btn-primary dropdown-toggle" type="button"
                                            data-toggle="dropdown">
                                            Opciones <span class="caret"></span>
                                        </button>
                                        <ul class="dropdown-menu">
                                            <li><a class="button" id="crear">Modificar Verificación</a></li>
                                        </ul>
                                    </div>
                                </div>
                                Fin botón nuevo marcas -->

                                <br /> <br />

                                <div class="row">
                                    <div class="col-xs-1" style="text-align: left;"></div>
                                    <div class="row">
									<div class="col-xs-3" style=" text-align: left;"></div>
									<div class="col-xs-6 well" style=" text-align: left; ;">
										<label for="search" class="control-label"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> BUSCAR</label>
										<input type="text" class="form-control" data-toggle="tooltip" data-placement="top" title="Ingrese numero de seguimiento" id="search"
														name="search" placeholder="N° de seguimiento...">
									</div>
									<div class="col-xs-3" style=" text-align: left;"></div>
									</div>	
                                    <div class="col-xs-1" style="text-align: left;"></div>
                                </div>
                                <br /> <br />

            <section class="content">
                <div class="row">
                    <!-- Main row -->
                    <div class="col-md-12" id="div2">
                        <div class="box box-primary">
                            <div class="box-body">
                                <form id="form-vehiculos" novalidate="novalidate" class="fv-form fv-form-bootstrap"><button type="submit" class="fv-hidden-submit" style="display: none; width: 0px; height: 0px;"></button>
                                    <div class="col-md-12">
                                     <legend>Datos del Vehiculo</legend>
                                        <div class="row">
                                         <div class="col-md-4">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputVin" 
                                                               class="control-label">
                                                               	Serie (VIN)
                                                        </label> 
                                                        <input id="inputVin" 
                                                        	   name="inputVin" 
                                                        	   type="text" 
                                                        	   class="form-control" 
                                                        	   maxlength="17" 
                                                        	   placeholder="Serie (VIN)" 
                                                        	   required 
                                                        	   data-fv-field="inputVin" />
                                                        <i class="form-control-feedback" data-fv-icon-for="inputVin" style="display: none;"></i>
	                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="inputVin" data-fv-result="NOT_VALIDATED" style="display: none;">El VIN es requerido.</small>
	                                                    <small class="help-block" data-fv-validator="stringLength" data-fv-for="inputVin" data-fv-result="NOT_VALIDATED" style="display: none;">El VIN por lo menos 17 caracteres.</small>
	                                                    <small class="help-block" data-fv-validator="vin" data-fv-for="inputVin" data-fv-result="NOT_VALIDATED" style="display: none;">El VIN no esta formado correctamente.</small>
	                                                    <small class="help-block" data-fv-validator="remote" data-fv-for="inputVin" data-fv-result="NOT_VALIDATED" style="display: none;">¡El VIN que ingreso ya existe!</small>
                                                    </div>
                                         </div>                                            
                                              <div class="col-md-4">
                                                    <div class="form-group">
                                                        <label for="criterioMarca" class="control-label">Marca</label>
                                                        <input id="criterioMarca" class="form-control ui-autocomplete-input" autocomplete="off"> 
                                                        <input id="idMarcaVehiculo" type="hidden">
                                                    </div>
                                              </div>                                    
                                        </div>
                                        <fieldset>
                                        <div class="row">                                               
                                                <div class="col-md-4">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputNumeroMotor" class="control-label">Numero
                                                            Motor</label> <input id="inputNumeroMotor" name="inputNumeroMotor" type="text" class="form-control" maxlength="17" placeholder="Numero Motor" required="" data-fv-field="inputNumeroMotor">
                                                            <i class="form-control-feedback" data-fv-icon-for="inputNumeroMotor" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="inputNumeroMotor" data-fv-result="NOT_VALIDATED" style="display: none;">El Numero de Motor es requerido.</small>
                                                    <small class="help-block" data-fv-validator="remote" data-fv-for="inputNumeroMotor" data-fv-result="NOT_VALIDATED" style="display: none;">¡El Numero de Motor que ingreso ya existe!</small>
                                                    <small class="help-block" data-fv-validator="stringLength" data-fv-for="inputNumeroMotor" data-fv-result="NOT_VALIDATED" style="display: none;">Please enter a value with valid length</small></div>
                                                </div>                                              
                                            </div>
                                            <div class="row">
                                                <div class="col-md-2">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputModelo" class="control-label">Modelo</label>
                                                        <input id="inputModelo" name="inputModelo" type="text" class="form-control" maxlength="4" placeholder="Modelo" required="" data-fv-field="inputModelo">
                                                        <i class="form-control-feedback" data-fv-icon-for="inputModelo" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="inputModelo" data-fv-result="NOT_VALIDATED" style="display: none;">El Modelo es requerido.</small>
                                                    <small class="help-block" data-fv-validator="numeric" data-fv-for="inputModelo" data-fv-result="NOT_VALIDATED" style="display: none;">El Modelo debe ser numerico</small>
                                                    <small class="help-block" data-fv-validator="stringLength" data-fv-for="inputModelo" data-fv-result="NOT_VALIDATED" style="display: none;">Please enter a value with valid length</small></div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group has-feedback">
                                                        <label for="selectClase" class="control-label">Clase</label>
                                                        <select class="form-control" id="selectClase" name="selectClase" required="" data-fv-field="selectClase">
                                                            <option value="1">AUTOMOVIL</option>
                                                        </select><i class="form-control-feedback" data-fv-icon-for="selectClase" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="selectClase" data-fv-result="NOT_VALIDATED" style="display: none;">La Clase es requerida.</small></div>
                                                </div>
                                                
                                                <div class="col-md-3">
                                                    <div class="form-group has-feedback">
                                                        <label for="selectTipo" class="control-label">Tipo</label>
                                                        <select class="form-control" id="selectTipo" name="selectTipo" required="" data-fv-field="selectTipo">
                                                            <option value="1">VAGONETA</option>
                                                        </select><i class="form-control-feedback" data-fv-icon-for="selectTipo" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="selectTipo" data-fv-result="NOT_VALIDATED" style="display: none;">El Tipo es requerido.</small></div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputLinea" class="control-label">Linea</label>
                                                        <input class="form-control" id="inputLinea" name="inputLinea" required="" data-fv-field="inputLinea"><i class="form-control-feedback" data-fv-icon-for="inputLinea" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="inputLinea" data-fv-result="NOT_VALIDATED" style="display: none;">Please enter a value</small></div>
                                                </div>
                                                <div class="col-md-4">
                                                <div class="form-group has-feedback">
                                                    <label for="selectStatus" class="control-label">STATUS</label> <select class="form-control" id="selectStatus" name="selectStatus" disabled="" required="" data-fv-field="selectStatus">
                                                        <option value="1">PAGADO</option>
                                                        <option value="2">SIN PAGO</option>
                                                        <option value="3">EN ESPERA</option>
                                                    </select><i class="form-control-feedback" data-fv-icon-for="selectOficina" style="display: none;"></i>
                                                <small class="help-block" data-fv-validator="notEmpty" data-fv-for="selectOficina" data-fv-result="NOT_VALIDATED" style="display: none;">La Oficina es requerida.</small></div>
                                               </div>
                                            </div>
                                        </fieldset>                                       
                                        <br>                                       
                                        <br>
                                        <fieldset>
                                            <legend>Validacion Ministerial</legend>
                                            <div class="row">
                                            <div class="col-md-6">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputModelo" class="control-label">Folio Ministerial</label>
                                                        <input id="infolioMinisterial" name="inputfolioMinisterial" type="text" class="form-control" maxlength="4" placeholder="folioMinisterial" required="" data-fv-field="inputfolioMinisterial">
                                                        <i class="form-control-feedback" data-fv-icon-for="inputfolioMinisterial" style="display: none;"></i>
                                                    <small class="help-block" data-fv-validator="notEmpty" data-fv-for="inputfolioMinisterial" data-fv-result="NOT_VALIDATED" style="display: none;">El folio es requerido.</small>
                                                    <small class="help-block" data-fv-validator="numeric" data-fv-for="inputModelo" data-fv-result="NOT_VALIDATED" style="display: none;">El folio debe ser numerico</small>
                                                    <small class="help-block" data-fv-validator="stringLength" data-fv-for="inputfolioMinisterial" data-fv-result="NOT_VALIDATED" style="display: none;">Please enter a value with valid length</small></div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group has-feedback">
                                                        <label for="inputobsMinisterial" class="control-label">Observaciones</label>
                                                        <input id="inputobsMinisterial" name="inputobsMinisterial" type="text" class="form-control" maxlength="144" placeholder="Observaciones" required="" data-fv-field="inputobsMinisterial">
                                                        <i class="form-control-feedback" data-fv-icon-for="inputobsMinisterial" style="display: none;"></i>
                                                </div>
                                                <div class="row">
                                                <div class="col-md-6">
                                                <div class="form-group has-feedback">
                                                    <label for="selectEstatusVerificacion" class="control-label">Estatus Verificacion</label>
                                                    <select class="form-control" 
                                                            id="selectEstatusVerificacion" 
                                                            name="selectEstatusVerificacion" 
                                                            disabled="" 
                                                            required="" 
                                                            data-fv-field="selectEstatusVerificacion">
                                                        <option value="1">CAPTURADA</option>
                                                        <option value="2">AUTORIZADA</option>
                                                        <option value="3">TERMINADA</option>
                                                        <option value="4">RECHAZADA MINISTERIO</option>
                                                        <option value="5">RECHAZADA VERIFICACIO</option>
                                                        <option value="6">PAGADO</option>
                                                        <option value="7">PAGA DESPUES</option>
                                                        <option value="8">CONDONADO</option>
                                                        <option value="9">CANCELADO</option>
                                                    </select><i class="form-control-feedback" data-fv-icon-for="selectEstatusVerificacion" style="display: none;"></i>
                                                <small class="help-block" data-fv-validator="notEmpty" data-fv-for="selectEstatusVerificacion" data-fv-result="NOT_VALIDATED" style="display: none;">El Estatus de Verificacion es requerido.</small></div>
                                                </div>
                                                </div>
                                            <!-- Date selector
                                            <div class="col-md-6">
                                                    <div class="form-group has-feedback">
                                                        <label for="selectClase" class="control-label">Fecha de validacion ministerial</label>
                                                      <input id="fechaverimin" type="date" name="bday">
                                                        </div>
                                             Fin de Date selector-->

                                            </div>
                                            </div>
                                        </fieldset>
                                    </div>
                                </form>
                            </div>
                            <div class="box-footer">
                                <button id="cancel-btn" type="button" class="btn btn-default btn-lg pull-left">
                                    <i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
                                    Cancelar
                                </button>
                                <button type="button" id="save-btn" class="btn btn-success btn-lg pull-right">
                                    <i class="fa fa-credit-card"></i> Guardar
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Fin contenido Alta Vehiculo -->
        </div> <!-- Fin contenido -->
                            </div>
                        </div>
                        <!-- DIV INFORMACION DE LA VERIFICACION SELECIONADA -->
                        <div id="divInfo" style="display: none" class="well">
                            <button id="botonGastos" type="button"
                                class="btn btn-warning btn-md">
                                <i class="fa fa-money" aria-hidden="true"></i> VALIDAR GASTOS
                            </button>
                            &nbsp;&nbsp;
                            <button id="botonOcultar" type="button"
                                class="btn btn-info btn-md pull-right">
                                <i class="fa fa-eye-slash" aria-hidden="true"></i> OCULTAR
                            </button>
                            <br>
                            <br>                            
                            <fieldset>
                            <legend>Mas InformaciÓn:</legend>
                            <div class="row" id="contenido"></div>
                            </fieldset>                            
                        </div>
            </section>
             <!--Fin contenido Registrar marca -->
        </div>
        <!-- Fin del contenido de la página -->

        <!-- Footer -->
        <div class="wrapper">
            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 2.3.0
                </div>
                <strong>Derechos de autor &copy; 2016 <a href="------">--------------</a>.
                </strong> Todos los derechos reservados.
            </footer>
        </div>
        <!-- Fin del footer -->

        <!-- Add the sidebar's background. This div must be placed
               immediately after the control sidebar -->
        <div class="control-sidebar-bg"></div>
    </div>
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
 <!--combo-date-->
 <script
    src="${pageContext.request.contextPath}/resources/bootstrap/js/js/moment.min.js"></script>
 <script
    src="${pageContext.request.contextPath}/resources/bootstrap/js/combodate.js"></script>
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

                     //Obtiene la información de la verficación
/*                      var url = window.location.search.substring(1);
                     var params = url.split("=");
                     var idVerificacion = params[1];
 */                     
                     $.ajax({
                            type: "GET",
                            url: "${pageContext.request.contextPath}/cajas/vehicular/verificacionMinisterial?idVerificacion="+31,
                            dataType: "json",
                            success : function(data) {
                                for(d in data){
                                    $('#inputVin').val(data['vinVehiculo']);
                                }               
                            },
                            error : function(jqXHR,textStatus,errorThrown) {
                                console.log(textStatus+ " "+ errorThrown);
                            }           
                    });


                        //Genera los checkbox de años
                        combos();

                        //Cancelar y dirige a la vista principal de los vehiculos registrados
                        $('#cancel-btn')
                                .click(
                                        function() {
                                            var urlBack = "${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp";
                                            window.location = urlBack;
                                        });

                        //Registra un vehiculo
                        $('#save-btn')
                                .click(
                                        function() {
                            
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
                                                var estatusVerificacion = $('#selectEstatusVerificacion');
                                                var vinVehiculo = $('#inputVin');
                                                var numeroMotorVehiculo = $('#inputNumeroMotor');
                                                var idMarcaVehiculo = $('#idMarcaVehiculo');
                                                var modeloVehiculo = $('#inputModelo');
                                                var idClaseVehiculo = $('#selectClase');
                                                var idTipoVehiculo = $('#selectTipo');
                                                var lineaVehiculo = $('#inputLinea');
                                                var nombrePersonaVerificacion = $('#inputNombrePersona');
                                                var apellidoPaternoPersonaVerificacion = $('#inputApellidoPaterno');
                                                var apellidoMaternoPersonaVerificacion = $('#inputApellidoMaterno');
                                                var email = $('#inputEmail');

                                                var facturaVehiculoDocumentacion = $(
                                                        "#facturaVehiculoDocumentacionInput")
                                                        .is(':checked');
                                                var identificacionOficialDocumentacion = $(
                                                        "#identificacionOficialDocumentacion")
                                                        .is(':checked');
                                                var comprobanteDomicilioDocumentacion = $(
                                                        "#comprobanteDomicilioDocumentacionInput")
                                                        .is(':checked');
                                                var rfcPersonaMoralDocumentacion = $(
                                                        "#rfcPersonaMoralDocumentacionInput")
                                                        .is(':checked');
                                                var identificacionRepresentanteLegalDocumentacion = $(
                                                        "#identificacionRepresentanteLegalDocumentacionInput")
                                                        .is(':checked');

                                                var anioActualComprobantePago = 0;
                                                var anio1ComprobantePago = 0;
                                                var anio2ComprobantePago = 0;
                                                var anio3ComprobantePago = 0;
                                                var anio4ComprobantePago = 0;
                                                var anio5ComprobantePago = 0;

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
                                                datos.estatusVerificacion = estatusVerificacion
                                                        .val();
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
                                /*console.log("Selected: " + ui.item.value + ", "
                                        + ui.item.label + ", " + ui.item.id);*/
                            }
                        });
    });
</script>
</html>