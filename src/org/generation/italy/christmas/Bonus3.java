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
				for (int i = 0; i < word.length(); i++) {
					//prendo il sinoglo carattere e lo aggingo collection
					char wordChar = word.charAt(i);
					charat.put(wordChar , i);
				}
				
				System.out.println(charat);
				// chiudiamo il canale di comunicazione
				sc.close();
	}
}
