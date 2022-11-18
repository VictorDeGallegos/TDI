package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.PreparedStatement;
import javax.naming.NamingException;

import com.mysql.cj.jdbc.MysqlDataSource; // Driver; jdbc2.optional.MysqlDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dominio.Mensaje;
import dominio.BDMySql;


public class MensajesJDBCTemplate {
	MysqlDataSource ds = null;
    Connection connect = null;
    Statement statement = null;
    BDMySql bdMySql;
        

   public Connection getConexion () {
	   
	   MysqlDataSource ds = null;
	   Connection connect = null;
	   
	   try {
          ds = new MysqlDataSource();

          ApplicationContext context = new ClassPathXmlApplicationContext( "Spring-Datasource.xml" );	            
          BDMySql bdMySql = (BDMySql)context.getBean( "servicioPropiedades" );
       	            
          ds.setUrl( bdMySql.getUrlBD() );
          ds.setUser( bdMySql.getUser() );
          ds.setPassword( bdMySql.getPassword() ); 
          connect = ds.getConnection();
          return connect ;
	   } 
       catch (SQLException error) 
         { 
     	   System.out.println( error.toString() );
     	    return connect ;
         }          
   }

   public void insertarMensaje( Mensaje msg ) throws NamingException {
	        Connection connect = null;
	        Statement statement = null;
	        try {
	            connect = getConexion();
	            statement = connect.createStatement();
	            String sql = "insert into mensajes ( id, destinatario, copia, remitente, mensaje, fecha) values (?, ?, ?, ?, ?, ?)";
	            PreparedStatement ps = connect.prepareStatement( sql );
	            ps.setInt( 1, msg.getId() );
	            ps.setString( 2, msg.getDestinatario() );
	            ps.setString( 3, msg.getCopia() );
				ps.setString( 4, msg.getRemitente() );
	            ps.setString( 5, msg.getMensaje() );
	            ps.setString( 6,msg.getFecha() );
	            ps.executeUpdate();
	        } catch (SQLException error) { 
	        	System.out.println( error.toString() );
	        } finally {
	            try { 
					statement.close();
				}catch (SQLException error) { 
					System.out.println( "Error Statement : " + error.toString()); 
				}
				try { 
					connect.close(); 
				}catch (SQLException error) { 
					System.out.println ("Error Connect :" + error.toString()); 
				}
	        }		   
	   }
	  
	   public int getIntentos( String IP ) 
	     {
		   	int intentos = 0;
	        Connection connect = null;
	        try 
	        {	            
	            connect = getConexion();
	 		    String sql = "Select intentos, Pintento from actividad where IP= ?";
	            PreparedStatement ps = connect.prepareStatement( sql );
	            ps.setString( 1, IP );
	            ResultSet resultSet = ps.executeQuery();
	            while ( resultSet.next() ) 
	             {
	                String fecha = resultSet.getString( "Pintento" );
	                intentos = resultSet.getInt( "intentos" );
	                System.out.println( "Conexi�n IP: " + IP );
	                System.out.println( "Fecha de �ltimo intento: " + fecha );
	                System.out.println( "No. Intentos actuales: " + intentos );
	             }
	        } 
	        catch (Exception error)
	          { 
	        	System.out.println( error.toString() );
	          } 
	        finally 
	          {
	            try { connect.close(); } 
	            catch (SQLException error) 
	             { System.out.println( "Error Connect :" + error.toString() ); }
	          }
	        return intentos;
	     }
	   
	  public void addIntento( String IP ) {
		   
	        Connection connect = null;
	        PreparedStatement ps = null;
	        String sql;
	        int intentos = 0;
	        String fecha = "";
	        try 
	        {	            
	            connect = getConexion();
	 		    sql = "Select intentos, Pintento from actividad where IP= ?";
	            ps = connect.prepareStatement( sql );
	            ps.setString( 1, IP );
	            ResultSet resultSet = ps.executeQuery();
	            while (resultSet.next()) {
	                fecha = resultSet.getString( "Pintento" );
	                intentos = resultSet.getInt( "intentos" );
	                System.out.println( "Total de intentos: " + intentos );
	            }	            	           
	            if (intentos == 0 )
	              {
	            	sql = "insert into actividad ( IP, Pintento, intentos ) values ( ?, ?, ? )";
	            	ps = connect.prepareStatement( sql );
	            	ps.setString( 1, IP );
	            	ps.setDate( 2, new java.sql.Date(System.currentTimeMillis() ));
	            	ps.setInt( 3, 1 );
	            	ps.executeUpdate();		
	            	System.out.println( "Conexi�n IP: " + IP + " con 1 intento");
	              }
	            else
	              {
	            	Calendar f = new GregorianCalendar();
	            	String mes = "";
	            	String dia = "";
	            	if( f.get(Calendar.MONTH) + 1 < 10)
	            		mes = "0" + ( f.get(Calendar.MONTH) + 1 );	            	
	            	else
	            		mes = String.valueOf( f.get(Calendar.MONTH) + 1);
	            	
	            	if( f.get(Calendar.DAY_OF_MONTH) < 10)
	            	    dia = "0" + ( f.get(Calendar.DAY_OF_MONTH) );	            	
	            	else
	            	    dia = String.valueOf( f.get(Calendar.DAY_OF_MONTH) );
	            	  
	            	String fechaHoy= f.get(Calendar.YEAR) + "-" + mes + "-" + dia;
	            	System.out.println( fechaHoy + " " + fecha );
	            	if( fechaHoy.compareTo(fecha) == 0 )
	            	 {
		            	sql="update actividad set intentos = ? where IP = ?";
		            	ps = connect.prepareStatement(sql );
		            	ps.setInt( 1, intentos + 1);
		            	ps.setString( 2, IP );
		            	ps.executeUpdate();	
		            	System.out.println( "Otro intento el mismo d�a ..." );
	            	 }
	            	else
	            	 {	
	            		sql="update actividad set intentos = ?, Pintento = ? where IP = ?";
		            	ps = connect.prepareStatement(sql);
		            	ps.setInt( 1, 1 );
		            	ps.setDate( 2, new java.sql.Date(System.currentTimeMillis()) );
		            	ps.setString( 3, IP );
		            	ps.executeUpdate();	
		            	System.out.println( "Un intento en otro d�a ... va 1" );
	            	 }
	            }     
	        } catch (Exception error) { System.out.println(error.toString()); }
	          finally {
	        	try { ps.close(); } catch (SQLException error) { System.out.println("Error Connect :"+error.toString()); }
	            try { connect.close(); } catch (SQLException error) { System.out.println("Error Connect :"+error.toString()); }
	          }
		 } 
	   
	  
}
