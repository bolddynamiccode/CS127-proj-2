package lab2;

public class StringTest {
	public static void main(String[] args) {
		String message;
		message = "Hello, world!";
		System.out.println(message);
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.println(theChar);

		theChar = message.charAt(12);
		System.out.println(theChar);
		
		String uppercasemessage;
		uppercasemessage = message.toUpperCase();
		System.out.println(uppercasemessage);
		
		String fivechar;
		fivechar = message.substring(0,5);
		System.out.println(fivechar);
		
		String replacechar;
		replacechar = message.replace('o','*');
		System.out.println(replacechar);
				
	}

}
