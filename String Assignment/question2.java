package assignment;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word = sc.nextLine();

		int vowels = 0, cons = 0;

		for (int i = 0; i < word.length(); i++) {
			char x = word.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				vowels++;
			} else if (x >= 'b' && x <= 'z') {
				cons++;
			}
		}
		System.out.println("No.Of.Vowels: " + vowels);
		System.out.println("No.Of.Consonants: " + cons);
		sc.close();
	}
}