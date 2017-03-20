<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Log in</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- jQuery -->
<script
	src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- AdminLTE -->
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
	rel="stylesheet" />

 <!-- iCheck -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/iCheck/square/blue.css">
 <script src="${pageContext.request.contextPath}/resources/iCheck/icheck.min.js"></script>

 <!-- Sweetalert -->
<link href="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.css"	rel="stylesheet" type="text/css">

<script	src="${pageContext.request.contextPath}/resources/sweetalert/sweetalert.min.js"></script>


</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="#"><strong>Cajas</strong></a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">

    <form>

      <div class="form-group has-feedback">
        <input id="nombreUsuario" name="nombreUsuario" class="form-control"	placeholder="Usuario" /> 
		<span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" id="password" class="form-control" placeholder="Contraseña">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <!-- Checkbox 
       <div class="form-group has-feedback">
       		<input type="checkbox" id="input" > Recordar Usuario
       </div>
       Fin checkbox -->
      <div class="row">
      	<div class="col-xs-12">
          <button id="login" type="button" class="btn btn-primary btn-block btn-flat">Iniciar Sesión</button>
        </div>
      </div>
    </form>

<!--     <a href="#">¿Olvide mi contraseña?</a><br> -->
<!--     <a href="#" class="text-center">Registrarse</a> -->

  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<script>
$(document).ready(function(){

	/*
    $('#input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue'
    });
    */

  $('#login').click(function(){
  	    nombreUsuario = $('#nombreUsuario').val();
  	    password = $('#password').val();
		
		var credenciales = {
			nombreUsuario : nombreUsuario,
			password : password
		};
		
		var loginWerbServlet = "${pageContext.request.contextPath}/loginServlet";
		var index = "${pageContext.request.contextPath}/views/index.jsp";
		jQuery.ajax({
			type : 'POST',
			url : loginWerbServlet,
			data : credenciales,
			success: function(data,textStatus, xhr){
				console.log("TEXT"+ textStatus + " " + xhr.status);
				if(xhr.status == 200){
					window.location = index;
				}				
			}
		});
	});

  //Errores
   $.ajaxSetup({
       error: function (x, status, error) {	  

           if (x.status == 400) {
           	var result = x.responseJSON;
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
            }else if(x.status == 403){
            	var result = x.responseJSON;
                console.log(result.respuesta);
				swal(
					{
						 title : "Aviso",
						 text: result.respuesta,
						 type: "info",
						 closeOnCancel : false
					},
					function() {
						window.location = "${pageContext.request.contextPath}/views/seguridad/login.jsp";
				});
			}
        }
    });

});
</script>
</body>
</html>