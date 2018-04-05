<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="./css/styles.css">
	<title>Sistema SGRRHH</title>
	
	<script type="text/javascript">
	
		function execute(entityName,newAction) {
			document.getElementById("newAction").value = newAction;
			document.getElementById("entityName").value = entityName;
			document.getElementById("form").submit();
		}
	
	</script>
</head>
<body>
	<form id="form" name="form" method="post" action="dispatcher" target="main">
		<input type="hidden" id="newAction" name="newAction" />
		<input type="hidden" id="entityName" name="entityName" />
	</form>
	<div class="divMainTitulo">
		Sistema de Gestion para Recursos Humanos
	</div>
	<div class="divMenu">
		<div class="titulo">MENU</div>
		<div class="menuItem"><a class="linkMenu" href="javascript:execute('Ciudad','goFind');">Ciudad</a></div>
		
	</div>
	<div class="divMain">
		<iframe class="iframeMain" name="main" frameborder="1" style="border: 1px solid; border-color:#ff0000"></iframe>
	</div>
</body>
</html>