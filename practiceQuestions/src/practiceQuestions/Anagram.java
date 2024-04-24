package practiceQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	
	public static boolean anagram (String firstWord, String secondWord) {
		HashMap<Character, Integer> firstWordHashMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> secondWordHashMap = new HashMap<Character, Integer>();
		int sameLetterCounter = 1;
		
		if (firstWord.length() != secondWord.length()) {
			return false;
		}
		
		for (int i = 0; i < firstWord.length(); i++) {
			if (firstWordHashMap.containsKey(firstWord.charAt(i))) {
				continue;
			}
			else {
				for (int j = 0; j < firstWord.length(); j++) {
					if (i == j) {
						continue;
					}
					if (firstWord.charAt(i) == firstWord.charAt(j)) {
						sameLetterCounter++;
					}
				}
				firstWordHashMap.put(firstWord.charAt(i), sameLetterCounter);
				sameLetterCounter = 1;
			}
		}
		
		for (int i = 0; i < secondWord.length(); i++) {
			if (secondWordHashMap.containsKey(secondWord.charAt(i))) {
				continue;
			}
			else {
				for (int j = 0; j < secondWord.length(); j++) {
					if (i == j) {
						continue;
					}
					if (secondWord.charAt(i) == secondWord.charAt(j)) {
						sameLetterCounter++;
					}
				}
				secondWordHashMap.put(secondWord.charAt(i), sameLetterCounter);
				sameLetterCounter = 1;
			}
		}
		return firstWordHashMap.equals(secondWordHashMap);
	}

	public static void main(String[] args) {
		// 12.
		// Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir Java programı yazın.
		// (Anagramlar, aynı harfleri içeren fakat sıralamaları farklı olan kelimelerdir.)
		
		Scanner input = new Scanner(System.in);
		System.out.print("İlk kelime: ");
		String firstWord = input.nextLine();
		System.out.print("İkinci kelime: ");
		String secondWord = input.nextLine();
		
		if (anagram(firstWord, secondWord)) {
			System.out.println("Bu iki kelime anagramdır.");
		}
		else {
			System.out.println("Bu iki kelime anagram değildir.");
		}
		input.close();
	}

}
