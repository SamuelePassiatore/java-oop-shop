package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Inserisci il tuo nome: ");
		 String nome = sc.nextLine();
		 
		 Random rand = new Random();
	     int numeroConto = rand.nextInt(1000) + 1;
	     
	     Conto contoUtente = new Conto(numeroConto, nome);
	     
	     System.out.println("Proprietario conto: " + nome);
	     System.out.println("Numero conto: " + numeroConto);
	     
	     int scelta;
	     do {
	            System.out.println("Cosa vuoi fare?");
	            System.out.println("1 - Versare una somma");
	            System.out.println("2 - Prelevare una somma");
	            System.out.println("3 - Uscire");

	            scelta = sc.nextInt();

	            if (scelta == 1) {
	                System.out.print("Quanto vuoi versare? ");
	                double somma = sc.nextDouble();
	                contoUtente.versa(somma);
	                System.out.println("Saldo attuale: " + contoUtente.formattaSaldo(contoUtente.getSaldo()));
	            } else if (scelta == 2) {
	                System.out.print("Quanto vuoi prelevare? ");
	                double somma = sc.nextDouble();
	                contoUtente.preleva(somma);
	                System.out.println("Saldo attuale: " + contoUtente.formattaSaldo(contoUtente.getSaldo()));
	            } else if (scelta != 3) {
	                System.out.println("Scelta non valida. Riprova.");
	            }

	      } while (scelta != 3);

	      System.out.println("Grazie per avere usufruito dei nostri servizi!");
	 }
}
