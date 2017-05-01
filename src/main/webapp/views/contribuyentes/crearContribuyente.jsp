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
                    <form id="frmContribuyente">
                        <fieldset>                            
                            <label for="rfc" ><abbr title="Registro Federal de Contribuyentes">RFC</abbr></label>
                            <input id="rfc" name="rfc" type="text" />
                            
                            <label for="rec" ><abbr title="Registro Estatal de Contribuyentes">REC</abbr></label>
                            <input id="rec" name="rec" type="text" />
                        </fieldset>
                        <fieldset>
                            <label for="personaFisica" >Persona física</label>
                            <input id="personaFisica" name="tipoPersona" type="radio" value="FISICA" />
                            <label for="personaMoral" >Persona moral</label>
                            <input id="personaMoral" name="tipoPersona" type="radio" value="MORAL" />
                        </fieldset>

                        <%--
                            Información personal.
                        --%>
                        <fieldset>
                        <%--
                            Este campo aplica solo a las persona morales.
                        --%>
                            <label for="razonSocial" >Razón social</label>
                            <input id="razonSocial" name="razonSocial" type="text" />

                        <%--
                            Estos campos aplican a la persona física y/o al representante legal.
                        --%>
                            <label for="nombre" >Nombre(s)</label>
                            <input id="nombre" name="nombre" type="text" />
                            
                            <label for="primerApellido" >Primer apellido</label>
                            <input id="primerApellido" name="primerApellido" type="text" />
                            
                            <label for="segundoApellido" >Segundo apellido</label>
                            <input id="segundoApellido" name="segundoApellido" type="text" />
                            
                            <label for="curp" ><abbr title="Clave única de registro poblacional">CURP</abbr></label>
                            <input id="curp" name="curp" type="text" />
                            
                            <label for="nacionalidad" >Nacionalidad</label>
                            <input id="nacionalidad" name="nacionalidad" type="text" />
                            
                            <label for="sexoFemenino" >Femenino</label>
                            <input id="sexoFemenino" name="sexo" type="radio" value="F" />
                            <label for="sexoMasculino" >Masculino</label>
                            <input id="sexoMasculino" name="sexo" type="radio" value="M" />
                            
                            <label for="fechaNacimiento" >Fecha de nacimiento</label>
                            <input id="fechaNacimiento" name="fechaNacimiento" type="date" />
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
                            <label for="correoe">Correo electrónico</label>
                            <input id="correoe" name="correoe" type="text" />
                            
                            <label for="telefono">Teléfono</label>
                            <input id="telefono" name="telefono" type="text" />
                            <input id="tipoTelefono" name="tipoTelefono" type="text" />
                        </fieldset>
                        
                        <fieldset>
                            <button id="btn-guardar" name="guardar" type="button"><i class="fa fa-save"></i> Guardar</button>
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
$(document).ready(function() {
    
    //Agrega el evento clic al botón guardar
    $('#btn-guardar').click(function() {
        guardar();
    });
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
                error : function(jqXHR,textStatus,errorThrown) {
                    console.log(textStatus+ " "+ errorThrown);
                }
            }
        );


}
        </script>
    </body>
</html>
