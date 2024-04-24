package practiceQuestions;

import java.util.Scanner;

public class Max {
	
	public static int max (int x, int y, int z) {
		int max = x;
		if (y > x) {
			max = y;
		}
		if (z > y) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		// 6. Üç Sayı Arasından En Büyük:
		// Üç sayıyı giriş olarak alan ve bunlardan en büyüğünü yazdıran bir program yazın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("İlk sayı: ");
		int firstNumber = input.nextInt();
		System.out.print("İkinci sayı: ");
		int secondNumber = input.nextInt();
		System.out.print("Üçüncü sayı: ");
		int thirdNumber = input.nextInt();
		
		System.out.println("En büyük sayı: " + max(firstNumber, secondNumber, thirdNumber));
		input.close();
	}

}
