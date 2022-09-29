package javabeans;

/**
 *
 * @author juan
 */
public class MensajeConCopia extends Mensaje {
    private String copia;
    
    public MensajeConCopia() {}
    
    public MensajeConCopia(String remite, String destino, String texto, String fecha, String copia) {
        super(remite, destino, texto, fecha);
        this.copia = copia;
    }

    public String getCopia() {
        return copia;
    }

    public void setCopia(String copia) {
        this.copia = copia;
    }
    
    public Mensaje getMensaje () {
        return new Mensaje(getRemite(), getDestino(), getTexto(), getFecha());
    }
    
    public Mensaje getMensajeCopia () {
        return new Mensaje(getRemite(), copia, getTexto(), getFecha());
    }
    
}
