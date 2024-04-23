package practiceQuestions;

import java.util.Scanner;

public class SpaceCounter {
	
	public static int spaceCounter (String sentence) {
		int spaceCounter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				spaceCounter++;
			}
		}
		return spaceCounter;
	}

	public static void main(String[] args) {
		// 7.
		// Verilen bir cümlede kaç adet boşluk karakteri bulunduğunu bulan bir Java programı yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cümle: ");
		String sentence = input.nextLine();
		
		System.out.println("Cümledeki boşluk sayısı: " + spaceCounter(sentence));
		input.close();
	}

}
