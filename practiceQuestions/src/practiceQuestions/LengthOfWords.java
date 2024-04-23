package practiceQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class LengthOfWords {
	
	public static void lengthOfWords (String sentence) {
		HashMap<String, Integer>  lengthOfWords = new HashMap<String, Integer>();
		String sentenceSubstring;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				int j = i;
				while (sentence.charAt(j) != ' ' && j != sentence.length() - 1) {
					j++;
				}
				if (j == sentence.length() - 1) {
					sentenceSubstring = sentence.substring(i, j + 1);
					lengthOfWords.put(sentenceSubstring, sentenceSubstring.length());
				}
				else {
					sentenceSubstring = sentence.substring(i, j);
					lengthOfWords.put(sentenceSubstring, sentenceSubstring.length());
				}
				i += (j - i);
			}
		}
		System.out.println(lengthOfWords);
	}

	public static void main(String[] args) {
		// 15.
		// Bir cümlede geçen her kelimenin uzunluğunu hesaplayarak, bu uzunlukları ekrana yazdıran bir Java programı yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		
		lengthOfWords(sentence);
		input.close();
	}

}
