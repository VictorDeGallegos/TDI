package servicio;
import baseDeDatos.MensajesJDBCTemplate;
import dominio.Mensaje;


public class MensajeServiceImpl implements MensajeService{
	
	@Override
	
	public void add(Mensaje msg) {
		
		System.out.println( "Mensaje enviado con exito:" );
		System.out.println( "Remitente: " + msg.getRemitente() );
		System.out.println( "Mensaje: " + msg.getMensaje() );
		System.out.println( "fecha: " + msg.getFecha() );

		MensajesJDBCTemplate conn = new MensajesJDBCTemplate();
		try {
			conn.insertarMensaje(msg);
		} catch(Exception e) {
			System.out.println("Error NamingException: " + e.toString());
		}
	}

}
