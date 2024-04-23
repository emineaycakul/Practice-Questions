package practiceQuestions;

import java.util.ArrayList;

public class ArrayRotate {
	
	public static int[] arrayRotate (int[] numbers, int rotate) {
		ArrayList<Integer> rotatedArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			rotatedArrayList.add(numbers[i]);
		}
		
		for (int i = 0; i < rotate; i++) {
			rotatedArrayList.add(0, rotatedArrayList.remove(rotatedArrayList.size() - 1));
		}
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rotatedArrayList.get(i);
		}
		
		return numbers;
	}

	public static void main(String[] args) {
		// 25. Dizi Döndürme:
		// Bir dizinin elemanlarını sağa belirli bir sayıda pozisyon kaydıran bir metod yazın.
		
		int[] numbers = new int [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println();
		int rotate = (int) (1 + Math.random() * 5);
		System.out.println("Kaydırma sayısı: " + rotate);
		
		System.out.print("Sağa " + rotate + " kez kaydırıldıktan sonra dizi:");
		arrayRotate(numbers, rotate);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		
	}

}
