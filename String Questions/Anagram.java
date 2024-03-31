package StringQuestion;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// getting input from user
		String str1 = "parliament";
		String str2 = "partial men";

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings you gave are anagrams.");
		} else {
			System.out.println("The strings you gave are not anagrams.");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		// Ignoring white spaces and punctuation
		str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		// Check if equal lengths
		if (str1.length() != str2.length()) {
			return false;
		}
		// Sort the characters in both strings
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		// Compare sorted strings
		return Arrays.equals(charArray1, charArray2);
	}
}
