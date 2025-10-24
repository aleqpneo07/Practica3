package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String mNumero;
    private String nTitular;
    private List<Movimiento> mMovimientos;
    private double saldo;
    
    public Cuenta(String numero, String titular) {
    	this.mNumero = numero;
    	this.nTitular = titular;
    	this.mMovimientos = new ArrayList<>();
    	this.saldo=0;
    }

    public void ingresar(double x) {
        Movimiento m = new Movimiento("Ingreso", x);
        mMovimientos.add(m);
        saldo += x;
    }

    public void retirar(double x) {
        Movimiento m = new Movimiento("Retirada", -x);
        mMovimientos.add(m);
        saldo -= x;
    }

	public double getSaldo() {
		return this.saldo;
	}
	 public List<Movimiento> getMovimientos() {
	        return mMovimientos;
	}
}


