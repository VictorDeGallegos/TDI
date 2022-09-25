<html>
  <head>
    <title>Borrado de mensajes</title>
  </head>
  <!-- Eliminacion de mensajes -->
  <jsp:useBean id="mensa" scope="request" class="javabeans.Mensaje" />
  <jsp:setProperty name="mensa" property="*" />
  <% if ( request.getParameter("texto") != null ){%>
  <jsp:forward page="controlador?operacion=borrar" />
  <%}%>
  <body>
    <h1>Borrado</h1>
  </body>
</html>
