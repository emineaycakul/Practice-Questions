package practiceQuestions;

import java.util.Scanner;

public class WordCounter {
	
	public static int wordCounter (String sentence, String word) {
		int wordCounter = 0;
		String sentenceSubstring;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				int j = i;
				while (sentence.charAt(j) != ' ' && j != sentence.length() - 1) {
					j++;
				}
				if (j == sentence.length() - 1) {
					sentenceSubstring = sentence.substring(i, j + 1);
				}
				else {
					sentenceSubstring = sentence.substring(i, j);
				}
				if (sentenceSubstring.equals(word)) {
					wordCounter++;
				}
				i += (j - i);
			}
		}
		return wordCounter;
	}

	public static void main(String[] args) {
		// 9.
		// Kullanıcıdan alınan bir cümlede belirli bir kelimenin kaç kez geçtiğini sayan bir Java programı yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		System.out.print("Belirli kelime: ");
		String word = input.nextLine();
		
		System.out.println("Belirli kelime cümlede " + wordCounter(sentence, word) + " defa kullanılıyor.");
		input.close();
	}

}
