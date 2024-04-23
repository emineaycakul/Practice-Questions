package practiceQuestions;

import java.util.Scanner;

public class LongestWord {
	
	// iki veya daha fazla aynı uzunlukta en uzun kelime varsa ilkini bulur
	public static String longestWord (String sentence) {
		String longestWord = "";
		String sentenceSubstring;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				int j = i;
				while (sentence.charAt(j) != ' ' && j != sentence.length() - 1) {
					j++;
				}
				if (j == sentence.length() - 1) {
					sentenceSubstring = sentence.substring(i, j + 1);
					if (sentenceSubstring.length() > longestWord.length()) {
						longestWord = sentenceSubstring;
					}
				}
				else {
					sentenceSubstring = sentence.substring(i, j);
					if (sentenceSubstring.length() > longestWord.length()) {
						longestWord = sentenceSubstring;
					}
				}
				i += (j - i);
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		// 14.
		// Bir cümledeki en uzun kelimeyi bulan bir Java programı yazın.

		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		
		System.out.print("Cümledeki en uzun kelime: " + longestWord(sentence));
		input.close();
	}

}
