<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Modificar Localidad</title>

        <!-- Bootstrap -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- Font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- AdminLTE -->
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css"
              rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
              rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
              rel="stylesheet" type="text/css" />
    
        <!-- Sweetalert -->
        	<link
		href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"
		rel="stylesheet" type="text/css">
    
        <!-- FormValidation -->
        <link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css"
              rel="stylesheet" type="text/css">

        <!-- SIT -->
        <link href="${pageContext.request.contextPath}/resources/sit/css/sit.css"
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
                    <h1>Direcciones</h1>
                </section>

                <!-- Main content Localidades -->
                <section class="content">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h1>Modificar Direccion</h1>
                        </div>
                        <div class="box-body">
									
								<form id="frm-domicilio">
									<div class="col-md-12">
										<fieldset>
											<legend>Direccion</legend>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputCalle" class="control-label">Calle
															</label> <input id="inputCalle" name="inputCalle" type="text"
															class="form-control" maxlength="25"
															placeholder="Calle" required>
													</div>
												</div>
												<div class="col-md-2">
													<div class="form-group">
														<label for="inputNum" class="control-label">Numero Ext.
															</label> <input id="inputNum"
															name="inputNum" type="text" class="form-control"
															maxlength="8" placeholder="Num " required>
													</div>
												</div>
													<div class="col-md-2">
													<div class="form-group">
														<label for="inputNumInt" class="control-label">Numero Int.
															</label> <input id="inputNumInt"
															name="inputNumInt" type="text" class="form-control"
															maxlength="8" placeholder="Num " >
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputColonia" class="control-label">Colonia</label>
														<input id="inputColonia" class="form-control"  placeholder="Colonia" required> 
														
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="inputEntreCalle1" class="control-label">Entre Calles</label>
														<input id="inputEntreCalle1" name="inputEntreCalle1" type="text"
															class="form-control" maxlength="25" placeholder="Calle"
															name="inputEntreCalles1" >
													</div>
												</div>
													<div class="col-md-4">
													<div class="form-group">
														<label for="inputEntreCalle2" class="control-label">        </label>
														<input id="inputEntreCalle2" name="inputEntreCalle2" type="text"
															class="form-control" maxlength="25" placeholder="Calle"
															name="inputEntreCalles2" >
													</div>
												</div>
												<div class="col-md-2">
													<div class="form-group">
														<label for="inputCP" class="control-label">Codigo Postal</label>
														<input id="inputCP" name="inputCP" type="text"
															class="form-control" maxlength="5" placeholder="Codigo Postal"
															name="inputCP" required>
													</div>
												</div>
												</div> 
											<div class="row">
												<div class="col-md-3">
													<div class="form-group">
														<label for="selectEdo" class="control-label">Estado</label>
														<select class="form-control" id="selectEdo"
															name="selectEdo" required>
															
														</select>
													</div>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label for="selectMunicipio" class="control-label">Municipio</label>
														<select class="form-control" id="selectMunicipio"
															name="selectMunicipio" required>
															
														</select>
													</div>
												</div>
												 <div class="col-md-4">
													<div class="form-group">
														<label for="selectLocalidad" class="control-label">Localidad</label>
														<select class="form-control" id="selectLocalidad"
															name="selectLocalidad"  required>
															
														</select>
													</div>
												</div> 
											</div>
											</div>
									</div>
                        <div class="box-footer clearfix">
                            <button id="btn-cancel" type="button"
                                    class="btn btn-default btn-lg pull-left">
                                <i class="fa fa-arrow-circle-left" aria-hidden="true"></i>
                                Cancelar
                            </button>
                            <button type="button" id="btn-edit"
                                    class="btn btn-success btn-lg pull-right">
                                <i class="fa fa-save"></i> Guardar
                            </button>
                        </div>
                    </div>
                </section>
                <!-- Fin contenido Localidades -->
            </div>

            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 2.3.0
                </div>
                <strong>Derechos de autor &copy; 2016 <a href="http://www.finanzas.gob.mx">Secretaría de finanzas de Zacatecas</a>.</strong> Todos los derechos reservados.
            </footer>
        </div>
        <!-- ./wrapper -->

        <!-- Bibliotecas JavaScript -->
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

        <script>
        $(document).ready(function() {

        	
       
        	var url = window.location.search.substring(1);
			var fragmento = url.split("=");
			var id = fragmento[1];
			
			
			
			$('#agregar').click(function() {
				  addEstado();
				  
				 });
				 
				 var urlGetEstado = "${pageContext.request.contextPath}/cajas/estados";
				 $.ajax({
				  type : "GET",
				  dataType : 'json',
				  url : urlGetEstado,
				  success : function(data) {
				         $.each(data, function(key, item) {
				             $('#selectEdo').append($('<option>').text(item.estado).attr('value', item.idEstado));
				         });
				  },
				  error : function(jqXHR, textStatus, errorThrown) {
				   console.log(textStatus + " " + errorThrown);
				  }
				 });	
					
				 
				 
				 $('#add').click(function() {
					  addMunicipio();
					  
					 });
					 
					 var urlGetMunicipio = "${pageContext.request.contextPath}/cajas/municipios";
					 $.ajax({
					  type : "GET",
					  dataType : 'json',
					  url : urlGetMunicipio,
					  success : function(data) {
					         $.each(data, function(key, item) {
					             $('#selectMunicipio').append($('<option>').text(item.municipio).attr('value', item.idMunicipio));
					         });
					  },
					  error : function(jqXHR, textStatus, errorThrown) {
					   console.log(textStatus + " " + errorThrown);
					  }
					 });
					 
					 
					 
					 $('#agregar').click(function() {
						  addLocalidad();
						  
						 });
						 
						 var urlGetLocalidad = "${pageContext.request.contextPath}/cajas/localidades";
						 $.ajax({
						  type : "GET",
						  dataType : 'json',
						  url : urlGetLocalidad,
						  success : function(data) {
						         $.each(data, function(key, item) {
						             $('#selectLocalidad').append($('<option>').text(item.localidad).attr('value', item.idLocalidad));
						         });
						  },
						  error : function(jqXHR, textStatus, errorThrown) {
						   console.log(textStatus + " " + errorThrown);
						  }
						 });
			
			
			
			
			
			
			 $.ajax({
					type: "GET",
					url: "${pageContext.request.contextPath}/cajas/direcciones/idDireccion/?idDireccion="+id,
					dataType: "json",
					success : function(data) {
						
						$('#inputCalle').val(data['calle']);
						$('#inputNum').val(data['numeroExterior']);		
						$('#inputNumInt').val(data['numeroInterior']);
						$('#inputColonia').val(data['colonia']);			
						$('#inputEntreCalle1').val(data['cruzamiento1']);
						$('#inputEntreCalle2').val(data['cruzamiento2']);			
						$('#inputCP').val(data['codigoPostal']);
						$('#selectEdo').val(data['idEstado']);			
						$('#selectMunicipio').val(data['IdMunicipio']);
						$('#selectLocalidad').val(data['idLocalidad']);	
							
					},
								
			});


        	//Cancelar y dirige a la vista principal 
        	$('#btn-cancel').click(function() {
        		var urlDireccion = "${pageContext.request.contextPath}/views/catalogos/direcciones/direccion.jsp";
        		window.location = urlDireccion;
        	});

        	//Edita 
        	$('#btn-edit').click(function() {

        		//Validaciones
        		var formValidation = $('#frm-domicilio').data('formValidation');
        			formValidation.validate();
        		
        			if (formValidation.isValid()) {

        				  var datos = {};
				            var calle = $('#inputCalle');
				            var numExt = $('#inputNum');
				            var numInt = $('#inputNumInt');
				            var colonia = $('#inputColonia');
				            var entreCalle1 = $('#inputEntreCalle1');
				            var entreCalle2 = $('#inputEntreCalle2');
				            var cp = $('#inputCP');
				            var idEstado = $('#selectEdo');
				            var idMunicipio = $('#selectMunicipio');
				            var idLocalidad = $('#selectLocalidad');
				            

				            datos.calle = calle.val();
							datos.numExt = numExt.val();
							datos.numInt = numInt.val();
							datos.colonia = colonia.val();
							datos.entreCalle1 = entreCalle1.val();
				            datos.entreCalle2 = entreCalle2.val();
				            datos.cp = cp.val();
				            datos.idEstado = idEstado.val();
				            datos.idMunicipio = idMunicipio.val();
				            datos.idLocalidad = idLocalidad.val();
        				

        				var formData = JSON.stringify(datos);
        			
        				console.log(formData);
        			
        				var urlPut = "${pageContext.request.contextPath}/cajas/direcciones";
        				var urlDireccion= "${pageContext.request.contextPath}/views/catalogos/direcciones/direccion.jsp";

        				$.ajax({
        					type : 'PUT',
        					url : urlPut,
        					data : formData,
        					dataType : "json",
        					contentType : 'application/json',
        					success : function(data,textStatus,jQxhr) {
        					swal(
        						{
        							title : "Direccion Actualizada.",
        							type : "success",
        							closeOnCancel : false
        						},
        							function() {
        							window.location = urlDireccion;
        							});
        					}
        				});
        			}

        	});
        	

        	//Validaciones
        	$('#frm-domicilio').formValidation(
        		{
        			framework : 'bootstrap', 
        			icon : {//Feedback Icons
        			valid : 'glyphicon glyphicon-ok',
        			invalid : 'glyphicon glyphicon-remove',
        			validating : 'glyphicon glyphicon-refresh'
        			},

        	
        			fields : {
        				'inputCalle' : { //validación del campo
        								trigger : 'blur', 
        								validators : { 
        						notEmpty : {
        									message : 'Ingrese una calle.'
        								},
        						
        							}
        						},
        				'inputNum' : {
        							trigger : 'blur',
        							validators : {
        						notEmpty : {
        							message : 'Ingrese numero de el domicilio.'
        						  },
        						

        						}
        					}
        						'inputColonia' : {
        							trigger : 'blur',
        							validators : {
        						notEmpty : {
        							message : 'Ingrese una colonia.'
        						  },
        						

        						}
        					}
        					
        				}
        	});

        	
        	$('#crear').click(function() {
        		var urlCrearDireccion = "${pageContext.request.contextPath}/views/catalogos/direcciones/crearDireccion.jsp";
        		window.location = urlCrearDireccion;
        	});
        	//Editar Localidad
        	$('#home').click(function(){
        			var urlEditarDireccion = "${pageContext.request.contextPath}/views/catalogos/direcciones/direccion.jsp";
        			window.location=urlEditarDireccion;
        		
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
    </body>
</html>