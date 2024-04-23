package practiceQuestions;

import java.util.Scanner;

public class SimpleInterestCalculator {
	
	public static void main(String[] args) {
		// 3. Basit Faiz Hesaplayıcı:
		// Kullanıcıdan anapara miktarı, faiz oranı ve süre bilgilerini alın. Basit faiz hesaplamasını yapın ve sonucu ekrana yazdırın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Anapara miktarı: ");
		int principalAmount = input.nextInt();
		System.out.print("Faiz oranı(yüzde): ");
		double interestRate = input.nextDouble();
		System.out.print("Süre(yıl): ");
		int duration = input.nextInt();
		
		double interest = principalAmount * (interestRate / 100) * duration;
		System.out.println("Faiz miktarı: " + interest);
		input.close();
		
	}

}
