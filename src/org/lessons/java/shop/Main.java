package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto prodotto = new Prodotto("Iphone 13", "Telefono meraviglioso", 700, 22);
		
        
//        prodotto.setNome("Iphone 14");
//        prodotto.setPrezzo(800);
//        prodotto.setIva(25);
        
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("IVA: " + prodotto.getIva());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Codice Formato Speciale: " + prodotto.getCodiceSpecialFormat());
	}
}
