package practiceQuestions;

public class ArrayAverage {
	
	public static double arrayAverage (double[] numbers) {
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum / numbers.length;
	}
	
	public static void main(String[] args) {
		// 18. Dizi Ortalaması:
		// Bir double dizisinin değerlerinin ortalamasını hesaplayan bir Java programı yazın.
		
		double[] numbers = new double [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			double fraction = (10 + (int) (Math.random() * 100)) / 10;
			numbers[i] = ((int) (Math.random() * 5)) + fraction / 10;
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println();
		System.out.println("Dizinin ortalaması: " + arrayAverage(numbers));
	}

}
