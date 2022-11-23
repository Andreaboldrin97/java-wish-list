package org.generation.italy.christmas;

// importo le due librerie 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	//metodo di comparazione
	public static class VowelsComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// variabili di condizione
			int o1V = 0 ;
			int o2V = 0 ;
			
			//ciclo sulle parole per trovare il numero di vocali contenute
			for (int i = 0; i < o1.length(); i++) {
				//prendo il sinoglo carattere in base all'indice
				// confronto della presenza delle vocali
				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o' 
						|| o1.charAt(i) == 'u' ) {
					// incremeniamo la presenza di vocali
					o1V++;
				}
			}
			
			//ciclo sulle parole per trovare il numero di vocali contenute
			for (int i = 0; i < o2.length(); i++) {
				//prendo il sinoglo carattere in base all'indice
				// confronto della presenza delle vocali
				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o' 
						|| o2.charAt(i) == 'u' ) {
					// incremeniamo la presenza di vocali
					o2V++;
				}
			}
			// TODO Auto-generated method stub
			return - o2V;
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
		System.out.println("+---+-+-+-+--+-+-+-+-+-+--");
		//test comparatore
		VowelsComparator vowelsComparator = new VowelsComparator();
		wishList.sort(vowelsComparator);
		System.out.println(wishList);
		
		
		//chiudo lo scanner di comunicazione
		sc.close();
	}
}
