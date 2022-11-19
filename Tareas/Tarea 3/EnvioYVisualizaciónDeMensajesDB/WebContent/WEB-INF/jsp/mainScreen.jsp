<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarea 3</title>
</head>
<body>
	<h1>Por favor elige una opcion</h1>
	<form:form method="POST">
	<center>
	
	<button name="boton" type="submit">
        <h3><b><font color="blue">Enviar Mensaje</font></b></h3>
    </button>
	
	<h1><b><a href="controlador?operacion=muestra">
        Leer Mensajes
    </a></b></h1>
    </center>
	</form:form>
</body>
</html>