package practiceQuestions;

public class ArraySum {

	public static int arraySum (int[] numbers) {
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// 17. Dizi Toplamı:
		// Bir tamsayı dizisinin tüm elemanlarının toplamını bulan bir Java metodunu yazın.
		
		int[] numbers = new int [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println();
		System.out.println("Dizinin tüm elemanlarının toplamı: " + arraySum(numbers));
	}

}
