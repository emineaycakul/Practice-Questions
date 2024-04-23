package practiceQuestions;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String removeDuplicates (String word) {
		String finalString = "";
		boolean[] isUnique = new boolean[word.length()];
		char[] characters = new char[word.length()];
		
		for (int i = 0; i < isUnique.length; i++) {
			isUnique[i] = true;
		}
		
		for (int i = 0; i < characters.length; i++) {
			characters[i] = word.charAt(i);
		}
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (i == j || isUnique[i] == false) {
					continue;
				}
				if (word.charAt(i) == word.charAt(j)) {
					isUnique[i] = true;
					isUnique[j] = false;
				}
			}
		}
		
		for (int i = 0; i < isUnique.length; i++) {
			if (isUnique[i]) {
				finalString += characters[i];
			}
		}
		return finalString;
	}

	public static void main(String[] args) {
		// 11.
		// Bir kelimenin içindeki tekrar eden harfleri kaldıran bir Java programı yazın. 
		// (Örneğin, "programming" kelimesi için "progamin" sonucu alınmalıdır.)
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kelime: ");
		String word = input.nextLine();
		
		System.out.println("Tekrarlanan harfler çıkarıldıktan sonra kelime: " + removeDuplicates(word));
		input.close();
	}

}
