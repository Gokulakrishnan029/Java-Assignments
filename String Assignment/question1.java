package assignment;

import java.util.Scanner;

public class question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String text = sc.nextLine();
		checkStringType(text);
		sc.close();
	}

	public static void checkStringType(String str) {
		boolean letters = false;
		boolean numbers = false;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				letters = true;
			} else if (Character.isDigit(str.charAt(i))) {
				numbers = true;
			}
		}
		if (letters && numbers) {
			System.out.println("Gokul says both Letters and Words are present");
		} else if (letters) {
			System.out.println("Gokul says only Letters is present");
		} else if (numbers) {
			System.out.println("Gokul says only Numbers are present");
		} else {
			System.out.println("Empty String, insert value first");
		}
	}
}