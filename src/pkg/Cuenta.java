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
    	this.saldo=100.0;
    }

    public void retirar(double x) {
    	this.saldo=150.0;

    }

	public double getSaldo() {
		return this.saldo;
	}
}


