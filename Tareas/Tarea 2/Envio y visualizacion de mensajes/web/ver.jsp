<%@ page import="javabeans.*,java.util.*"%>
<html>
  <head>
    <title>Ver Mansajes</title>
  </head>
<body>
<center>    
<%String nombre = request.getParameter( "nombre" );%>
<h1>
  Mensajes para <%= (nombre == null)?"Desconocido":nombre %>
</h1>
<table border=1>
    <tr><th>Remitente</th><th>Mensaje</th><th>Fecha</th><th>Borrar</th></tr>
<%boolean men = false;
ArrayList mensajes = (ArrayList)request.getAttribute( "mensajes" );
if( mensajes != null )
  // Si existen mensajes para ese destinatario,
  // se generar� una tabla con los mismos:
  for( int i=0; i<mensajes.size(); i++ ) {
    Mensaje m = (Mensaje)mensajes.get(i);
    if (( m.getDestino()).equalsIgnoreCase( nombre )) {
      men = true;%>
<tr>
    <td><%= (m.getRemite() == null || m.getRemite().equals("null"))?"Sin remitente":m.getRemite()%></td>
    <td><%= (m.getTexto() == null || m.getTexto().equals("null"))?"Sin texto para mostrar":m.getTexto()%></td>
    <td><%= (m.getFecha() == null || m.getFecha().equals("null"))?"Sin fecha":m.getFecha()%></td>
    <td><a href="controlador?operacion=borrar&destinatario=<%=nombre%>&remitente=<%=m.getRemite()%>&texto=<%=m.getTexto()%>">
        <img style="width: 25px; height: 25px;" src="images/Borrar_mail.png">
    </a></td>
</tr>
    <%}
  }
if ( !men ) {%>
    <!-- Si no hay mensajes se env�a al usuario
    a la p�gina de nomensajes.jsp -->
    <jsp:forward page="nomensajes.jsp"/>
<%}%>
</table>
<br/><br/>
<h1><b><a href="inicio.htm">Inicio</a></b></h1>
</center>
</body>
</html>
