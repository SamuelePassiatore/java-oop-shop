package jana60.bank;

import java.text.DecimalFormat;

public class Conto {
	private int numeroConto;
    private String nomeProprietario;
    private double saldo;
    
    public Conto(int numeroConto, String nomeProprietario) {
    	this.numeroConto = numeroConto;
    	this.nomeProprietario = nomeProprietario;
    	this.saldo = 0;
    }
    
    public int getNumeroConto() {
    	return numeroConto;
    }
    
    public String getNomeProprietario() {
    	return nomeProprietario;
    }
    
    public void setNomeProprietario(String nomeProprietario) {
    	this.nomeProprietario = nomeProprietario;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void versa(double somma) {
    	if(somma > 0) {
    		saldo += somma;
    	} else {
    		System.out.println("Errore, somma da versare non valida!");
    	}
    }
    
    public void preleva(double somma) {
    	if(somma > 0 && saldo >= somma) {
    		saldo -= somma;
    	} else {
    		System.out.println("Errore, somma da prelevare non valida!");
    	}
    }
    
    public String getInfoConto() {
    	return "Numero conto: " + numeroConto
    			+ "Nome proprietario: " + nomeProprietario
    			+ "Saldo: " + saldo;
    }
    
    public String formattaSaldo(double saldo) {
    	DecimalFormat df = new DecimalFormat("#,###.##");
    	return df.format(saldo) + "€";
    }
}
