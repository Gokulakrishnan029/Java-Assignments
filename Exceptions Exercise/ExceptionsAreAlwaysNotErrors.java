package exceptionExercise;

import java.util.Scanner;

public class ExceptionsAreAlwaysNotErrors {

	public static void main(String[] args) {
		int [] counts = new int[26];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String word = sc.nextLine();
		sc.close();
		word = word.toUpperCase();
		for (int i=0; i<word.length(); i++)
		try {
				counts[word.charAt(i)-'A']++;
		}
		catch(ArrayIndexOutOfBoundsException aoobe){
			System.out.println("'" + word.charAt(i) + "' is not a letter.");
		}
			
		for(int i=0; i<counts.length; i++)
			if (counts [i] !=0)
				System.out.println((char)(i+'A') + ": " + counts[i]);			
	}
}
