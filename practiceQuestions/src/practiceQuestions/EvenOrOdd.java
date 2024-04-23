package practiceQuestions;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		// 2. Çift veya Tek:
		// Kullanıcıdan bir sayı alın. Bu sayının çift mi yoksa tek mi olduğunu kontrol edin ve sonucu ekrana yazdırın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayıyı girin: ");
		int userNumber = input.nextInt();
		
		if (userNumber % 2 == 0) {
			System.out.println(userNumber + " bir çift sayıdır.");
		}
		
		if (userNumber % 2 != 0) {
			System.out.println(userNumber + " bir tek sayıdır.");
		}
		input.close();
	}

}
