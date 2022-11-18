<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>Pagina de Registro</title>
   <style>
     .error {
        color: #ff0000;
        font-style: italic;
      }
   </style>
</head>
<body>

<form:form method="POST" commandName="msg">
	<table border="0" bgcolor="11BBB0">	
		<tr>		 
			<td colspan="3">
			  <center>
			    <h1>Envio de mensajes</h1>
			  </center>
			</td>		 
		</tr>	
		<tr>
			<td>Nombre Remitente:</td>
			
		</tr>
		<tr>
			<td><form:input path="remitente" /></td>
			<td><form:errors path="remitente" cssClass="error" /></td>
		</tr>		
		<tr>
			<td>Mensaje :</td>
		</tr>
		<tr>
			<td><form:textarea path="mensaje" /></td>
			<td><form:errors path="mensaje" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Fecha :</td>
		</tr>
		<tr>
			<td><form:input path="fecha" /></td>
			<td><form:errors path="fecha" cssClass="error" /></td>
		</tr>
		<tr>
		  <td colspan="3">
		    <br>
		  </td>
		</tr>
		<tr>		 
			<td colspan="3">
			  <center>
			    <input type="submit" value="Enviar">
			  </center>
			</td>		 
		</tr>
	</table>
	<form:errors path="*" cssClass="error" />
</form:form>

</body>
</html>