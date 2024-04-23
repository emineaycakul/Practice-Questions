package practiceQuestions;

import java.util.Scanner;
import java.util.Stack;

public class BackwardSentence {
	
	public static String backwardSentence (String sentence) {
		Stack<String> wordsOfSentence = new Stack<>();
		String sentenceSubstring;
		String backwardSentence = "";
		
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
				wordsOfSentence.push(sentenceSubstring);
				i += (j - i);
			}
		}
		
		for (int i = 0; i < wordsOfSentence.size();) {
			if (i == wordsOfSentence.size() - 1) {
				backwardSentence += wordsOfSentence.pop();
			}
			else {
				backwardSentence += wordsOfSentence.pop() + " ";
			}
		}
		return backwardSentence;
	}

	public static void main(String[] args) {
		// 10.
		// Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		
		System.out.print("Tersten sıralanmış hali: " + backwardSentence(sentence));
		input.close();
	}

}
