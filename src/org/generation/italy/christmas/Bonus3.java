package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Bonus3 {
	public static void main(String[] args) {
		//apriamo un scanner per la comunicazione
				Scanner sc = new Scanner(System.in);
				
				// creo la collection dove inseriro i caratteri
				Map<Character, Integer> charat = new TreeMap<>();
				
				
				
				System.out.println("Inserisci una parola");
				String word = sc.nextLine();
				//ciclo sulle parole per trovare il numero di vocali contenute
				for (Character letter : word.toCharArray()) {
					//creo una variabile contatore
					int counter = 0;
					//controllo se l'elemento è già esistente
					if (!charat.containsKey(letter)) {
						//se non esiste il contatore va a 1
						counter = 1;
						//inserisco all'interno della collection
						charat.put(letter, counter);
					} else {
						//se non esiste il contatore va a +1
						counter = charat.get(letter) + 1;
						//inserisco all'interno della collection
						charat.put(letter, counter);
					}
					
				}
				System.out.println(charat);
				// chiudiamo il canale di comunicazione
				sc.close();
	}
}
