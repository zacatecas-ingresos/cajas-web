<%-- 
    Document   : crearContribuyente
    Created on : Apr 25, 2017, 6:59:43 AM
    Author     : Freddy Barrera (freddy.barrera.moo@gmail.com)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equi|v="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="Content-Language" content="es-MX" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
        <title>Contribuyentes</title>
        
        <!-- Bootstrap -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        
        <!-- Font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
        
        <!-- AdminLTE -->
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/Fonts.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css" rel="stylesheet" />
        
        <!-- jsTree -->
        <link href="${pageContext.request.contextPath}/resources/jstree/themes/default/style.css" rel="stylesheet" />
        
        <!-- Sweetalert -->
        <link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css" rel="stylesheet" type="text/css" >
        
        <!-- FormValidation -->
        <link href="${pageContext.request.contextPath}/resources/formvalidation/css/formValidation.min.css" rel="stylesheet" type="text/css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <header class="main-header">
                <!-- Logo -->
                <a href="${pageContext.request.contextPath}" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>S</b>it</span> <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Sistema Integral Tributario</b></span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
                       role="button"> <span class="sr-only">Botón de navegación</span>
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
                    <h1>Contribuyentes <small>Alta</small></h1>                    
                    <ol class="breadcrumb">
                        <li><a href="${pageContext.request.contextPath}"><i class="fa fa-home"></i> Inicio</a></li>
                        <li><a href="${pageContext.request.contextPath}/views/contribuyentes/contribuyente.jsp">Contribuyentes</a></li>
                        <li class="active">Alta de contribuyente</li>
                    </ol>
                </section>
                
                <!-- Main content -->
                <div class="content">
                    <form id="frmContribuyente" class="form-horizontal">
                        <fieldset>                            
                            <div class="form-group">
                                <label for="rfc" class="col-sm-2 control-label" ><abbr title="Registro Federal de Contribuyentes">RFC</abbr></label>
                                <div class="col-sm-4">
                                    <input id="rfc" name="rfc" type="text" class="form-control" />
                                </div>

                                <label for="rec" class="col-sm-2 control-label"><abbr title="Registro Estatal de Contribuyentes">REC</abbr></label>
                                <div class="col-sm-4">
                                    <input id="rec" name="rec" type="text" class="form-control" />
                                </div>
                            </div>
                        </fieldset>
                        <fieldset>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-4">
                                    <label for="personaFisica" class="radio-inline">
                                        <input id="personaFisica" name="tipoPersona" type="radio" value="FISICA" /> Persona física
                                    </label>
                                </div>
                                <div class="col-sm-4">
                                    <label for="personaMoral" class="radio-inline">
                                        <input id="personaMoral" name="tipoPersona" type="radio" value="MORAL" /> Persona moral
                                    </label>
                                </div>
                            </div>
                        </fieldset>

                        <%--
                            Información personal.
                        --%>
                        <fieldset>
                        <%--
                            Este campo aplica solo a las persona morales.
                        --%>
                            <div class="form-group">
                                <label for="razonSocial" class="col-sm-2 control-label">Razón social</label>
                                <div class="col-sm-10">
                                    <input id="razonSocial" name="razonSocial" type="text" class="form-control" />
                                </div>
                            </div>

                        <%--
                            Estos campos aplican a la persona física y/o al representante legal.
                        --%>
                            <div class="form-group">
                                <label for="nombre" class="col-sm-2 control-label">Nombre(s)</label>
                                <div class="col-sm-10">
                                    <input id="nombre" name="nombre" type="text" class="form-control" />
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label for="primerApellido" class="col-sm-2 control-label">Primer apellido</label>
                                <div class="col-sm-4">
                                    <input id="primerApellido" name="primerApellido" type="text" class="form-control" />
                                </div>
                            
                                <label for="segundoApellido" class="col-sm-2 control-label">Segundo apellido</label>
                                <div class="col-sm-4">
                                    <input id="segundoApellido" name="segundoApellido" type="text" class="form-control" />
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label for="curp" class="col-sm-2 control-label"><abbr title="Clave única de registro poblacional">CURP</abbr></label>
                                <div class="col-sm-4">
                                    <input id="curp" name="curp" type="text" class="form-control" />
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label for="nacionalidad" class="col-sm-2 control-label">Nacionalidad</label>
                                <div class="col-sm-4">
                                    <input id="nacionalidad" name="nacionalidad" type="text" class="form-control" />
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-4">
                                    <label for="sexoFemenino" class="radio-inline" >
                                        <input id="sexoFemenino" name="sexo" type="radio" value="F" /> Femenino
                                    </label>
                                </div>
                                <div class="col-sm-4">
                                    <label for="sexoMasculino" class="radio-inline" >
                                        <input id="sexoMasculino" name="sexo" type="radio" value="M" /> Masculino
                                    </label>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label for="fechaNacimiento" class="col-sm-2 control-label">Fecha de nacimiento</label>
                                <div class="col-sm-4">
                                    <input id="fechaNacimiento" name="fechaNacimiento" type="date" class="form-control" />
                                </div>
                            </div>
                        </fieldset>

                        <%--
                            Datos del domicilio.
                        --%>
                        <fieldset>
                        </fieldset>
                        
                        <%--
                            Información de contacto.
                        --%>
                        <fieldset>
                            <div class="form-group">
                                <label for="correoe" class="col-sm-2 control-label">Correo electrónico</label>
                                <div class="col-sm-4">
                                    <input id="correoe" name="correoe" type="text" class="form-control" />
                                </div>
                                
                                <label for="telefono" class="col-sm-2 control-label">Teléfono</label>
                                <div class="col-sm-2">
                                    <input id="telefono" name="telefono" type="text" class="form-control" />
                                </div>
                                <div class="col-sm-2">
                                    <select id="tipoTelefono" name="tipoTelefono" class="form-control">
                                        <option value="CASA">Casa</option>
                                        <option value="MOVIL">Móvil</option>
                                        <option value="OFICINA">Oficina</option>
                                        <option value="OTRO">Otro</option>
                                    </select>
                                </div>
                            </div>
                        </fieldset>
                        
                        <fieldset>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button id="btn-guardar" name="guardar" type="button" class="btn btn-default"><i class="fa fa-save"></i> Guardar</button>
                                </div>
                            </div>
                        </fieldset>

                    </form>
                </div>
            </div>
            
            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 2.3.0
                </div>
                <strong>Derechos de autor &copy; 2016 <a href="http://finanzas.gob.mx">Secretaría de finanzas de Zacatecas</a>.
                </strong>Todos los derechos reservados.
            </footer>
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

        <!-- jQuery UI -->
        <script src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.min.js"></script>

        <!-- jQuery Form -->
        <script src="${pageContext.request.contextPath}/resources/jquery-form/jquery.form.min.js"/></script>

        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

        <!-- Bootstrap WYSIHTML5 -->
        <script src="${pageContext.request.contextPath}/resources/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

        <!-- AdminLTE -->
        <script src="${pageContext.request.contextPath}/resources/admin-lte/js/app.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/admin-lte/js/demo.js"></script>

        <!-- jsTree -->
        <script src="${pageContext.request.contextPath}/resources/jstree/jstree.min.js" type="text/javascript"></script>	

        <!-- Sweetalert -->
        <script src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script> 

        <!-- FormValidation -->
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/formValidation.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/framework/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/formvalidation/js/language/es_ES.min.js"></script>
        
        <script type="text/javascript" >
// TODO: Freddy cambiar el formato de fecha. http://jsfiddle.net/Ajedi32/pgsawnk3/
$(document).ready(function() {
    
    //Agrega el evento clic al botón guardar
    $('#btn-guardar').click(function() {
        guardar();
    });
    
    /*
    $('#frmContribuyente').formValidation(
        {
            framework : 'bootstrap',
            icon : {
                valid : 'glyphicon glyphicon-ok',
                invalid : 'glyphicon glyphicon-remove',
                validating : 'glyphicon glyphicon-refresh'
            },
            fields: {
                correoe : {
                    validators: {
                        regexp : {
                            regexp : /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
                            message: 'Por favor ingrese un correo electrónico valido.'
                        }
                    }
                },
                rfc : {
                    validators: {
                        regexp : {
                            regexp : /^([A-Z,Ñ,&]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\d]{3})$/,
                            message : 'Por favor verifique el formato del RFC.'
                        }
                    }
                },
                curp : {
                    validators: {
                        regexp : {
                            regexp : /^([A-Z][AEIOUX][A-Z]{2}\d{2}(?:0[1-9]|1[0-2])(?:0[1-9][12]\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\d])(\d)$/,
                            message : 'Por favor verifique el formato de la CURP.'

                        }
                    }
                },
                'tipoPersona' : {
                    validators: {
                        notEmpty: {
                            message: 'Por favor seleccione el tipo de persona.'
                        }
                    }
                }
            }
        }
    );*/
});

/**
 * Guarda un contribuyente. 
 */
function guardar() {
        var contribuyente = {
            id : null,
            rfc : $('#rfc').val(),
            curp : $('#curp').val(),
            tipoPersona : $('input[name=tipoPersona]:checked', '#frmContribuyente').val(),
            nombre : $('#nombre').val(),
            primerApellido : $('#primerApellido').val(),
            segundoApellido : $('#segundoApellido').val(),
            sexo : $('input[name=sexo]:checked', '#frmContribuyente').val(),
            fechaNacimiento : $('#fechaNacimiento').val(),
            nacionalidad : $('#nacionalidad').val(),
            razonSocial : $('#razonSocial').val()
        };
        
        var contribuyenteJson = JSON.stringify(contribuyente);
        
        console.log(contribuyenteJson);
        
        var urlPost = '${pageContext.request.contextPath}/cajas/contribuyentes';
        var urlDestino = '${pageContext.request.contextPath}/views/contribuyentes/contribuyente.jsp';
        
        $.ajax(
            {
                type : 'POST',
                url : urlPost,
                data : contribuyenteJson,
                dataType : "json",
                contentType : 'application/json',
                success : function(data, textStatus, jQxhr) {
                    swal(
                        {
                            title : "El registro se ha realizado correctamente.",
                            type : "success",
                            closeOnCancel : false
                        },
                        function() {
                            window.location = urlDestino;
                        }
                    );
                },
                error : function(jqXHR, textStatus, errorThrown) {
                    console.log(textStatus+ " "+ errorThrown);
                }
            }
        );


}
        </script>
    </body>
</html>
