package practiceQuestions;

import java.util.Scanner;

public class Exponentiation {
	
	// döngü ile
	public static int pow (int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}
	
	// recursive fonksiyon ile
	public static int powRec (int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		int result = 1;
		if (result == exponent) {
			return base;
		}
		result = base * powRec(base, exponent - 1);
		return result;
	}

	public static void main(String[] args) {
		// 5. Bir Sayının Üssünü Alma:
		// Verilen bir sayının üssünü hesaplayan bir programı uygulayın. Taban ve üsü giriş olarak alın ve sonucu yazdırın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Taban: ");
		int base = input.nextInt();
		System.out.print("Üs: ");
		int exponent = input.nextInt();
		
		System.out.println("Sonuç: " + pow(base, exponent));
		System.out.println("Sonuç: " + powRec(base, exponent));
		input.close();
	}

}
