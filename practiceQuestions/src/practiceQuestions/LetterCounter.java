package practiceQuestions;

import java.util.Scanner;

public class LetterCounter {
	
	public static void letterCounter (String word) {
		int vowelCounter = 0;
		int consonantCounter = 0;
		String vowel = "aeıioöuüAEIİOÖUÜ";
		String consonant = "bcçdfgğhjklmnprsştvyzBCÇDFGĞHJKLMNPRSŞTVYZ";
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowel.length(); j++) {
				if (word.charAt(i) == vowel.charAt(j)) {
					vowelCounter++;
				}
			}
			for (int j = 0; j < consonant.length(); j++) {
				if (word.charAt(i) == consonant.charAt(j)) {
					consonantCounter++;
				}
			}
		}
		System.out.println(word + ": " + vowelCounter + " sesli harfi, " + consonantCounter + " sessiz harfi bulunur.");
	}

	public static void main(String[] args) {
		// 16.
		// Bir kelimenin içindeki sesli harfleri ve sessiz harfleri sayan bir Java programı yazın.
		// (Örneğin, "Merhaba" kelimesi için 3 sesli, 4 sessiz harf sonucu alınmalıdır.)
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kelime: ");
		String word = input.nextLine();
		
		letterCounter(word);
		input.close();
	}

}
