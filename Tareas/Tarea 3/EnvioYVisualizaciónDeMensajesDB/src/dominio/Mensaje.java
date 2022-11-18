package dominio;

public class Mensaje {

	private int id;
	
	private String destinatario;
	private String copia;
	private String remitente;
	private String mensaje;
	private String fecha;
	
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public String getCopia() {
		return copia;
	}
	
	public int getId() {
		return id;
	}
	
	

	public String getRemitente() {
		return remitente;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario=destinatario;
	}
	
	public void setCopia(String copia) {
		this.copia= copia;
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
