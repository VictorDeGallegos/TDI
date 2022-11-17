<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Pagina correcta</title>
</head>
<body>
  Detalle del Mensaje
  <hr>
  Nombre Destinatario  	: ${msg.destinatarioa} <br/>
  Copia para 	: ${msg.destinatariob} <br/>
  Nombre Remitente  	: ${msg.remitente} <br/>
  Mensaje 	    : ${msg.mensaje} <br/>  
  Fecha     		: ${msg.fecha} <br/>
</body>
</html>