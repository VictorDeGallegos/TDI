package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import dominio.Mensaje;

public class MensajeValidator implements Validator {
	

	String Caractinvalidos = "1234567890!@?��{].-|";
	
	public boolean ValidaCaracteres( String Cadena ) {
		
		for( int i=0; i < Cadena.length(); i++ )
		   if ( Caractinvalidos.indexOf( Cadena.charAt(i)) >= 0)		   
			   return false;
		return true;			
	}
	
	@Override
	public boolean supports( Class<?> clazz ) {
		//just validate the Mensaje instances
		return Mensaje.class.isAssignableFrom( clazz );
     }

	@Override
	public void validate( Object target, Errors errors ) {

		ValidationUtils.rejectIfEmptyOrWhitespace( errors, "destinatario",
				"destinatario.required" );
		ValidationUtils.rejectIfEmptyOrWhitespace( errors, "copia",
				"copia.required" );
		ValidationUtils.rejectIfEmptyOrWhitespace( errors, "remitente",
				"remitente.required" );
		ValidationUtils.rejectIfEmptyOrWhitespace( errors, "mensaje",
				"mensaje.required" );
		ValidationUtils.rejectIfEmpty( errors, "fecha", "fecha.required" );
				
		Mensaje msg = (Mensaje) target;
			 
		System.out.println( "Validando Nombre: " + msg.getRemitente());		
		if ( !ValidaCaracteres( msg.getRemitente() ))
			errors.rejectValue( "remitente", "remitente.carsinvalidos");
		try {
			int fecha = Integer.parseInt( msg.getFecha());
		}
		catch( NumberFormatException e  ) {
			errors.rejectValue( "fecha", "fecha.invalida");
		  }
	}
	
	public boolean validadorSQL( Mensaje msg )
	  {
		String pReservadas[] = {"select ", "insert ", "delete ","update ", "create ", "like "};
		boolean error = false;
		for( int i=0; i<pReservadas.length; i++)
		  {	 
			if( msg.getDestinatario().contains(pReservadas[i] ))
			  	error = true;			  
			if( msg.getCopia().contains(pReservadas[i] ))
			  	error = true;
			if( msg.getRemitente().contains(pReservadas[i] ))
			  	error = true;			  
			if( msg.getMensaje().contains(pReservadas[i] ))
			  	error = true;
			if( msg.getFecha().contains(pReservadas[i] ))
			  	error = true;					  
		  }
		return error;
	  }	
	
}
