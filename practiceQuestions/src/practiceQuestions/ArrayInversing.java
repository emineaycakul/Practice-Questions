package practiceQuestions;

public class ArrayInversing {
	
	public static int[] arrayInversing (int[] numbers) {
		int temp;
		
		for (int i = 0; i < numbers.length / 2; i++) {
			temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		
		return numbers;
	}
	
	public static void main(String[] args) {
		// 19. Dizi Ters Çevirme:
		// Bir dizinin elemanlarını yerinde ters çeviren bir metod yazın.
		
		int[] numbers = new int [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(" " + numbers[i]);
		}
		
		arrayInversing(numbers);
		System.out.println();
		System.out.print("Dizinin elemanları ters çevrilmiş hali:");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		
	}

}
