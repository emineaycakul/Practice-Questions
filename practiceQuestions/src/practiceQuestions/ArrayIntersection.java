package practiceQuestions;

import java.util.ArrayList;

public class ArrayIntersection {
	
	public static int[] arrayIntersection (int[] firstArray, int[] secondArray) {
		ArrayList<Integer> intersectionArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					intersectionArrayList.add(firstArray[i]);
				}
			}
		}
		
		for (int i = 0; i < intersectionArrayList.size(); i++) {
			for (int j = i + 1; j < intersectionArrayList.size(); j++) {
				if (intersectionArrayList.get(i) == intersectionArrayList.get(j)) {
					intersectionArrayList.remove(j);
				}
			}
		}
		
		int[] intersectionArray = new int[intersectionArrayList.size()];
		for (int i = 0; i < intersectionArray.length; i++) {
			intersectionArray[i] = intersectionArrayList.get(i);
		}
		return intersectionArray;
	}

	public static void main(String[] args) {
		// 23. Dizi Kesişimi:
		// İki dizinin kesişimini bulan ve sonucu yeni bir dizi olarak döndüren bir metod yazın.
		
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
		
		int[] intersectionArray = arrayIntersection(firstArray, secondArray);
		System.out.print("Dizilerin birleşimi:");
		
		for (int i = 0; i < intersectionArray.length; i++) {
			System.out.print(" " + intersectionArray[i]);
		}
		
	}

}
