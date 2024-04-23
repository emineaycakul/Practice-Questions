package practiceQuestions;

public class ArrayMax {
	
	public static int arrayMax (int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// 26. Dizi Maksimumu:
		// Bir tamsayı dizisinin maksimum değerini bulan bir Java fonksiyonu yazın.

		int[] numbers = new int [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println();
		System.out.println("Dizideki en büyük sayı: " + arrayMax(numbers));
	}

}
