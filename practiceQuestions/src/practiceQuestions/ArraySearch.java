package practiceQuestions;

public class ArraySearch {
	
	public static int arraySearch (int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// 20. Dizi Arama:
		// Bir dizide belirli bir elemanı arayan ve indeksini döndüren bir Java fonksiyonu yazın. Eğer eleman bulunamazsa, -1 dönmelidir.
		
		int[] numbers = new int [5];
		System.out.print("Dizi:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
			System.out.print(" " + numbers[i]);
		}
		
		int target = (int) (Math.random() * 10);
		System.out.println();
		System.out.println("Dizide aranacak eleman: " + target);
		
		System.out.println("Elemanın dizideki indeksi (eğer eleman bulunamazsa -1 döner.): " + arraySearch(numbers, target));
	}

}
