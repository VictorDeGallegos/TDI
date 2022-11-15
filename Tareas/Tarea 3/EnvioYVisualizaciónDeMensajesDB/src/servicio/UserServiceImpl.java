package servicio;

import baseDeDatos.UsuariosJDBCTemplate;
import dominio.User;

public class UserServiceImpl implements UserService {

	@Override

	public void add( User user ) {
		
		String Comunidades = "";
		
		System.out.println( "Usuario agregado correctamente:" );
		System.out.println( "Nombre: " + user.getNombre() );
		System.out.println( "Edad: " + user.getEdad() );
		System.out.println( "G�nero: " + user.getGenero() );
		System.out.println( "Pa�s: " + user.getPais() );
		System.out.println( "Sobre t�: " + user.getSobreTi() );
		System.out.print( "Comunidad: " ) ;
		 for( int i=0; i<user.getComunidad().length; i++)
		 {	 System.out.print( user.getComunidad()[i] + " " );
		 	Comunidades= Comunidades + "-" + user.getComunidad()[i];
		 }
		System.out.println();
		System.out.println( "Lista de correo: " + user.getListaCorreo());

		UsuariosJDBCTemplate conn = new UsuariosJDBCTemplate();
		try {
			  conn.insertarU( user );
		  } catch(Exception e)
		{
			System.out.println("Error NamingException: " + e.toString());
		}
	}
}
