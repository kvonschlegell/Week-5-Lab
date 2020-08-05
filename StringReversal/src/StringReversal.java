import java.util.Scanner;

public class StringReversal {
	
	public static String reverseString(String s) {
		
		if (s.length()<=1)
			return s;
		else 
			return reverseString(s.substring(1)) + s.charAt(0);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or sentence: ");
		String sentence= input.nextLine();	
		System.out.println("Your original word/sentence: " + sentence + "\nWord/sentence in reverse is: " + reverseString(sentence)); 
		
		
		
	}
	
}
