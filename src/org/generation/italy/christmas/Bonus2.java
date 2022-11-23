package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bonus2 {

	public static void main(String[] args) {
		
		//apriamo un scanner per la comunicazione
		Scanner sc = new Scanner(System.in);
		
		// creo la collection dove inseriro i caratteri
		Set<Character> charat = new HashSet<>();
		
		
		
		System.out.println("Inserisci una parola");
		String word = sc.nextLine();
		//ciclo sulle parole per trovare il numero di vocali contenute
		for (int i = 0; i < word.length(); i++) {
			//prendo il sinoglo carattere e lo aggingo collection
			char wordChar = word.charAt(i);
			charat.add(wordChar);
		}
		
		System.out.println(charat);
		// chiudiamo il canale di comunicazione
		sc.close();
	}
}
