package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;
    
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
    	this.codice = generaCodice();
    	this.nome = nome;
    	this.descrizione = descrizione;
    	this.prezzo = prezzo;
    	this.iva = iva;
    }
    
    public int getCodice() {
    	return codice;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getDescrizione() {
    	return descrizione;
    }
    
    public void setDescrizione(String descrizione) {
    	this.descrizione = descrizione;
    }
    
    public double getPrezzo() {
    	return prezzo;
    }
    
    public void setPrezzo(double prezzo) {
    	this.prezzo = prezzo;
    }
    
    public double getIva() {
    	return iva;
    }
    
    public void setIva(double iva) {
    	this.iva = iva;
    }
    
    public double getPrezzoBase() {
    	return prezzo;
    }
    
    public double getPrezzoConIva() {
    	return prezzo + (prezzo*iva)/100;
    }
    
    public String getNomeEsteso() {
    	return codice + "-" + nome;
    }
    
    private int generaCodice() {
    	Random r = new Random();
    	return r.nextInt(1000);
    }
    
    public String getCodiceSpecialFormat() {
    	return String.format("%08d", codice);
    }
    
    

}
