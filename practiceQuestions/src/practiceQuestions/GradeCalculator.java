package practiceQuestions;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void gradeCalculator (int grade) {
		if (grade >= 0 && grade <= 49) {
			System.out.print("Harf notunuz: FF");
		}
		else if (grade >= 50 && grade <= 54) {
			System.out.print("Harf notunuz: DD");
		}
		else if (grade >= 55 && grade <= 59) {
			System.out.print("Harf notunuz: DC");
		}
		else if (grade >= 60 && grade <= 69) {
			System.out.print("Harf notunuz: CC");
		}
		else if (grade >= 70 && grade <= 74) {
			System.out.print("Harf notunuz: CB");
		}
		else if (grade >= 75 && grade <= 84) {
			System.out.print("Harf notunuz: BB");
		}
		else if (grade >= 85 && grade <= 89) {
			System.out.print("Harf notunuz: BA");
		}
		else if (grade >= 90 && grade <= 100) {
			System.out.print("Harf notunuz: AA");
		}
	}

	public static void main(String[] args) {
		// 4. Not Hesaplayıcı:
		// Kullanıcıdan alınan bir puanı belirli bir not skalasına göre değerlendirin ve sonucu ekrana yazdırın.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Notunuz: ");
		int grade = input.nextInt();
		gradeCalculator(grade);
		
		if (grade < 0 || grade > 100) {
			do {
				System.out.println("Geçersiz değer.");
				System.out.print("Notunuz: ");
				grade = input.nextInt();
				gradeCalculator(grade);
			} while (grade < 0 || grade > 100);
		}
		input.close();
	}

}
