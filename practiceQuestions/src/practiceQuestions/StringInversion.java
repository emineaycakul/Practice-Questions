package practiceQuestions;

import java.util.Stack;

public class StringInversion {
	
	public static String stringInversion (String str) {
		Stack<Character> characters = new Stack<Character>();
		String finalString = "";
		for (int i = 0; i < str.length(); i++) {
			characters.push(str.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			finalString += characters.pop();
		}
		return finalString;
	}
	
	public static void main(String[] args) {
		// 22. String Ters Çevirme:
		// Bir string'i StringBuilder veya StringBuffer sınıflarını kullanmadan ters çeviren bir Java fonksiyonu yazın.
		
		String str = "";
		int stringLength = (int) (3 + Math.random() * 8);
		
		for (int i = 0; i < stringLength; i++) {
			str += (char) (65 + Math.random() * 26); // büyük harflerle rastgele bir string oluşturur.
		}
		
		System.out.println("String: " + str);
		System.out.println("Stringin ters çevrilmiş hali: " + stringInversion(str));
	}

}
