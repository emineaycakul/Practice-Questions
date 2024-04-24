package practiceQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Uppercase {
	
	public static String uppercase (String sentence) {
		String sentenceSubstring = "";
		String finalSentence = "";
		Queue<String> uppercaseWords = new LinkedList<>();
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				int j = i;
				while (sentence.charAt(j) != ' ' && j != sentence.length() - 1) {
					j++;
				}
				if (j == sentence.length() - 1) {
					sentenceSubstring += sentence.charAt(i);
					sentenceSubstring = sentenceSubstring.toUpperCase();
					sentenceSubstring += sentence.substring(i + 1, j + 1);
					uppercaseWords.add(sentenceSubstring);
					sentenceSubstring = "";
				}
				else {
					sentenceSubstring += sentence.charAt(i);
					sentenceSubstring = sentenceSubstring.toUpperCase();
					sentenceSubstring += sentence.substring(i + 1, j) + " ";
					uppercaseWords.add(sentenceSubstring);
					sentenceSubstring = "";
				}
				i += (j - i);
			}
		}
		
		for (int i = 0; i < uppercaseWords.size();) {
			finalSentence += uppercaseWords.remove();
		}
		return finalSentence;
	}

	public static void main(String[] args) {
		// 13.
		// Bir cümledeki tüm kelimelerin ilk harfini büyük harfe dönüştüren bir Java programı yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		
		System.out.println("İlk harfleri büyük harfe dönüştürülmüş cümle: " + uppercase(sentence));
		input.close();
	}

}
