package pkg;
 enum Signo {
    D, 
    H  
}
public class Movimiento {
	private Signo signo;
	private Double importe;
    private String detalle;
    public Movimiento(Double importe, String detalle, Signo signo) {
        super();
        this.importe = importe;
        this.detalle = detalle;
        this.signo = signo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    
}
