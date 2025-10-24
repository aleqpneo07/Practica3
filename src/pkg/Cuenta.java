package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String mNumero;
    private String nTitular;
    private List<Movimiento> mMovimientos;
    private double saldo;
    private static final double LIMITE_DESCUBIERTO = -500.0;

    
    public Cuenta(String numero, String titular, double saldo) {
    	this.mNumero = numero;
    	this.nTitular = titular;
    	this.mMovimientos = new ArrayList<>();
    	this.saldo= saldo;
    }

    public void ingresar(double x) {
        Movimiento m = new Movimiento(x,"Ingreso",Signo.H);
        mMovimientos.add(m);
        saldo += x;
    }
    public void retirar(double x) throws FondosInsuficientesException{
        if(saldo-x<LIMITE_DESCUBIERTO) {
            throw new FondosInsuficientesException("Fondos insuficietes (saldo: "+saldo+"€ en la cuenta "+mNumero+" para el reintegro de "+x+"€");
        }
        Movimiento m = new Movimiento(x,"Retirada",Signo.D);
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


