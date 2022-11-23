package org.generation.italy.christmas;

// importo le due librerie 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	//metodo di comparazione
	public static class vowelsComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	//metodo di eseguzione
	public static void main(String[] args) {
		
		
		// creo un arrayList di string
		List<String> wishList = new ArrayList<>();
		
		// apro lo scanner per comunicare con l'utente 
		Scanner sc = new Scanner(System.in);
		
		// condizione di partenza
		boolean userChoise = true;
		
		// condizione sulla scelta dellìuser
		while(userChoise) {
			System.out.println("La tua lista è di N: " + wishList.size() + " Prodotti");
			System.out.println("********************");
			// chiedo a l'user se vuole inserire un elemento o visualizzare la lista 
			System.out.println("se vuole aggiungere in prodotto alla sua lista scriva TRUE");
			System.out.println("se vuole vedere la lista dei prodotti scriva FALSE");
			// salviamo la scelta in stringa per poi trasformarla
			String userChoiseStr = sc.nextLine();
			userChoise =  Boolean.parseBoolean(userChoiseStr);
			
			// se userChoise e positivo aggiungiamo un prodotto
			if(userChoise) {
				System.out.println("inserisci nome prodotto");
				String product = sc.nextLine();
				
				//aggiungiamo il prodotto all' ArrayList
				wishList.add(product);
			}
			System.out.println("-------------------------------------------------");
		}
	
		//condizione di uscita dell'user
		if(!userChoise) {
			
			// usiamo il sort per crearlo in ordine alfabetico
			wishList.sort(null);
			System.out.println("Lista desideri: " + wishList);
			
			
		}
		
		
		
		//chiudo lo scanner di comunicazione
		sc.close();
	}
}
