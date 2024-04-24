package practiceQuestions;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		// 1. Hesap Makinesi:
		// İki sayı alın. Toplama, çıkarma, çarpma ve bölme gibi temel matematiksel işlemleri gerçekleştiren basit bir hesap makinesi programı oluşturun.
		
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.print("İlk sayı: ");
		int firstNumber = input.nextInt();
		System.out.print("İkinci sayı: ");
		int secondNumber = input.nextInt();
		System.out.print("Gerçekleştirmek istediğiniz işlem(toplama -> + , çıkarma -> - , çarpma -> * , bölme -> /): ");
		char symbol = input.next().charAt(0);
		
		if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/') {
			do {
				System.out.println("Lütfen geçerli bir işlem giriniz.");
				System.out.print("Gerçekleştirmek istediğiniz işlem(toplama -> + , çıkarma -> - , çarpma -> * , bölme -> /): ");
				symbol = input.next().charAt(0);
			} while (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/');
		}
		
		if (symbol == '+') {
			result = firstNumber + secondNumber;
		}
		
		if (symbol == '-') {
			result = firstNumber - secondNumber;
		}
		
		if (symbol == '*') {
			result = firstNumber * secondNumber;
		}
		
		if (symbol == '/') {
			result = firstNumber / secondNumber;
		}
		
		System.out.println("Sonuç: " + result);
		input.close();
	}

}
