package modelo;

import java.sql.*;
import javabeans.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class Operaciones {
    
    HttpServletRequest request;
    
   public Operaciones( HttpServletRequest request )  {
       
       this.request = request;
   }
    
  // Método común para la obtención
  // de conexiones
  public Connection getConnection() {
    Connection cn = null;
    try {
//      Antes de Java 8: 
//      Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
//      cn = DriverManager.getConnection( "jdbc:odbc:mensajes" );

//      A partir de Java 8:
//      Ya no se requiere registrar la BD en odbcad32.exe located in C:\Windows\WOW64 
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

//        cn = DriverManager.getConnection("jdbc:ucanaccess://C:/Temp/mensajes.mdb");
         ServletContext ctx = request.getServletContext();
         String urldb = ctx.getRealPath( "mensajes" + ".mdb" );
         cn = DriverManager.getConnection("jdbc:ucanaccess://" + urldb );   
    }
    catch( Exception e ) { e.printStackTrace(); }
    return cn;
  }
  
  public ArrayList obtenerMensajes( String destino ) {
    Connection cn = null;
    ArrayList mensajes = null;
    Statement st;
    ResultSet rs;
    try {
      cn = getConnection();
      st = cn.createStatement();
      String tsql;
      tsql = "select * from mensajes where destinatario = '" + destino + "'";
      rs = st.executeQuery( tsql );
      mensajes = new ArrayList();
      // Para cada mensaje encontrado crea un objeto
      // Mensaje y lo añade a la colección ArrayList
      while( rs.next() ) {
        Mensaje m = new Mensaje( rs.getString("remitente"), rs.getString("destinatario"), rs.getString("texto"));
        mensajes.add( m );
      }
      cn.close();
    }
    catch( Exception e ){ e.printStackTrace(); }
    return( mensajes );
  }

  public void grabaMensaje( Mensaje m ) {
    Connection cn;
    Statement st;
    ResultSet rs;
    try {
      cn = getConnection();
      st = cn.createStatement();
      String tsql;
      // A partir de los datos del mensaje construye
      // la cadena SQL para realizar su insersión
      tsql = "Insert into mensajes values( '";
      tsql += m.getDestino()+ "','" + m.getRemite() + "','" + m.getTexto() + "')";
      st.execute( tsql );
      cn.close();
    }
    catch( Exception e ) { e.printStackTrace(); }
  }
}