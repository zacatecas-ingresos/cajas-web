<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">

<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">

<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" />

<!-- AdminLTE -->
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/AdminLTE.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/admin-lte/css/skins/_all-skins.min.css"
	rel="stylesheet" />

</head>

<body>
	<ul class="sidebar-menu">
		<li><a> <i class="fa fa-list" aria-hidden="true"></i><span>Catalogos</span>
		</a>
			<ul class="treeview-menu">
				<li><a
					href="${pageContext.request.contextPath}/views/catalogos/marca/marca.jsp"><span>Marcas</span></a></li>
			</ul></li>
	</ul>
	<ul class="sidebar-menu">
		<li><a> <i class="fa fa-users" aria-hidden="true"></i> <span>Usuarios</span>
		</a>
			<ul class="treeview-menu">
				<li><a
					href="${pageContext.request.contextPath}/views/usuario/usuario.jsp"><span>Administrar</span></a></li>
			</ul></li>
	</ul>
	<ul class="sidebar-menu">
		<li><a> <i class="fa fa-money" aria-hidden="true"></i> <span>Cajas</span>
		</a>
			<ul class="treeview-menu">
				<li><a
					href="${pageContext.request.contextPath}/views/cajas/cobroNomina.jsp"><span>Presupuesto
							Estatal</span></a></li>
			</ul></li>
	</ul>
	<ul class="sidebar-menu">
		<li><a><i class="fa fa-car" aria-hidden="true"></i> <span>Control
					Vehicular</span></a>
			<ul class="treeview-menu">
				<li><ul class="sidebar-menu">
						<li><a><i class="fa fa-search" aria-hidden="true"></i> <span>Verificaciones</span></a>
							<ul class="treeview-menu">
								<li><a
									href="${pageContext.request.contextPath}/views/verificacion/verificaciones.jsp"><span>Adminstrar
											Verificaciones</span> </a></li>
								<li><a
									href="${pageContext.request.contextPath}/views/verificacion/altaVerificacion.jsp"><span>Crear
											Verificación</span> </a></li>
							</ul></li>
					</ul></li>
			</ul></li>
	</ul>

</body>
</html>