package practiceQuestions;

import java.util.ArrayList;

public class ArrayComposition {
	
	public static int[] arrayComposition (int[] firstArray, int[] secondArray) {
		ArrayList<Integer> compositionArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < firstArray.length; i++) {
			compositionArrayList.add(firstArray[i]);
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			compositionArrayList.add(secondArray[i]);
		}
		
		for (int i = 0; i < compositionArrayList.size(); i++) {
			for (int j = i + 1; j < compositionArrayList.size(); j++) {
				if (compositionArrayList.get(i) == compositionArrayList.get(j)) {
					compositionArrayList.remove(j);
				}
			}
		}
		
		int[] compositionArray = new int[compositionArrayList.size()];
		for (int i = 0; i < compositionArray.length; i++) {
			compositionArray[i] = compositionArrayList.get(i);
		}
		return compositionArray;
	}

	public static void main(String[] args) {
		// 24. Dizi Birleşimi:
		// İki dizinin birleşimini bulan ve sonucu yeni bir dizi olarak döndüren bir program yazın.
		
		int[] firstArray = new int [5];
		System.out.print("İlk dizi:");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = (int) (Math.random() * 10);
			System.out.print(" " + firstArray[i]);
		}
		
		System.out.println();
		
		int[] secondArray = new int [5];
		System.out.print("İkinci dizi:");
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = (int) (Math.random() * 10);
			System.out.print(" " + secondArray[i]);
		}
		
		System.out.println();
		
		int[] compositionArray = arrayComposition(firstArray, secondArray);
		System.out.print("Dizilerin birleşimi:");
		
		for (int i = 0; i < compositionArray.length; i++) {
			System.out.print(" " + compositionArray[i]);
		}

	}

}
