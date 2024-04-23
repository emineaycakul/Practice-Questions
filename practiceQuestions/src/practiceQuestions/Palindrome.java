package practiceQuestions;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPal (String word) {
		boolean isPal = true;
		for (int i = 0, j = word.length() - 1; i < word.length(); i++) {
			if (word.charAt(i) == word.charAt(j)) {
				j--;
			}
			else {
				isPal = false;
			}
		}
		return isPal;
	}

	public static void main(String[] args) {
		// 8.
		// Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın.
		// (Örneğin, "kayak" kelimesi bir palindromdur.)
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sözcük / cümle: ");
		String word = input.nextLine();
		
		if (isPal(word)) {
			System.out.println(word + " palindromdur.");
		}
		else {
			System.out.println(word + " palindrom değildir.");
		}
		input.close();
	}

}
