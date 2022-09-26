<%@ page import="javabeans.*,java.util.*"%>
<html>
  <head>
    <title>Borrar Mensaje</title>
  </head>
<body>

<%
  String nombre = request.getParameter( "nombre" );
  String remite = request.getParameter( "remite" );
  String texto = request.getParameter( "texto" );
  String fecha = request.getParameter( "fecha" );
  ArrayList mensajes = (ArrayList)request.getAttribute( "mensajes" );
  if( mensajes != null )
    // Si existen mensajes para ese destinatario,
    // se generar� una tabla con los mismos:
    for( int i=0; i<mensajes.size(); i++ ) {
      Mensaje m = (Mensaje)mensajes.get(i);
      if (( m.getDestino()).equalsIgnoreCase( nombre ) && ( m.getRemite()).equalsIgnoreCase( remite ) && ( m.getTexto()).equalsIgnoreCase( texto ) && ( m.getFecha()).equalsIgnoreCase( fecha )) {
        mensajes.remove(i);
      }
    }
  request.setAttribute( "mensajes", mensajes );
  // Se envia al usuario a la pagina de ver.jsp
  // para que pueda ver los mensajes:
  RequestDispatcher rd = request.getRequestDispatcher( "ver.jsp" );
  rd.forward( request, response );
%>

</body>
</html>