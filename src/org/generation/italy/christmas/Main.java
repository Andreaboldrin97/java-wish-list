package org.generation.italy.christmas;

// importo le due librerie 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		// creo un arrayList di string
		List<String> wishList = new ArrayList<>();
		
		// apro lo scanner per comunicare con l'utente 
		Scanner sc = new Scanner(System.in);
		
		// condizione di partenza
		boolean userChoise = true;
		
		// condizione sulla scelta dellìuser
		while(userChoise) {
			
			// chiedo a l'user se vuole inserire un elemento o visualizzare la lista 
			System.out.println("se vuole aggiungere in prodotto alla sua lista scriva TRUE");
			System.out.println("se vuole vedere la lista dei prodotti scriva FALSE");
			// salviamo la scelta in stringa per poi trasformarla
			String userChoiseStr = sc.nextLine();
			userChoise =  Boolean.parseBoolean(userChoiseStr);		
			
		}
	
		//condizione di uscita dell'user
		if(!userChoise) {
			System.out.println("uscita");
		}
		
		
		
		//chiudo lo scanner di comunicazione
		sc.close();
	}
}
