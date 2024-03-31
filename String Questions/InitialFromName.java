package StringQuestion;

import java.util.Scanner;

public class InitialFromName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String lname = sc.nextLine();
		System.out.println("Enter last name: ");
		String fname = sc.nextLine();
		System.out.println("Hello " + lname + " " + fname);
		System.out.println("Your Initial is: " + fname.charAt(0));
		sc.close();
	}

}
