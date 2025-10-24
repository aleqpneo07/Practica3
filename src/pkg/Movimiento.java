package pkg;

public class Movimiento {
    private String concepto;
    private double importe;

    public Movimiento(String concepto, double importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getImporte() {
        return importe;
    }
}
