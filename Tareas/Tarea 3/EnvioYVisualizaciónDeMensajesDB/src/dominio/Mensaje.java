package dominio;

public class Mensaje {
	private String remitente;
	private String mensaje;
	private String fecha;
	
	public String getRemitente() {
		return remitente;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setRemitente(String remitente) {
		this.remitente=remitente;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public void setFecha(String fecha) {
		this.fecha=fecha;
	}

}
