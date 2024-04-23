package practiceQuestions;

public class StringLength {
	
	public static int stringLength (String str) {
		int length = 0;
		char[] charactersOfStr = str.toCharArray();
		for (char c : charactersOfStr) {
			length++;
		}
		return length;
	}
	
	public static void main(String[] args) {
		// 21. String Uzunluğu:
		// Verilen bir string'in uzunluğunu, length() metodunu kullanmadan hesaplayan bir metod geliştirin.
		
		String str = "";
		int stringLength = (int) (3 + Math.random() * 8);
		
		for (int i = 0; i < stringLength; i++) {
			str += (char) (65 + Math.random() * 26); // büyük harflerle rastgele bir string oluşturur.
		}
		
		System.out.println("String: " + str);
		System.out.println("Stringin uzunluğu: " + stringLength(str));
		 
	}

}
