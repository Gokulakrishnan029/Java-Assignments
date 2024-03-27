package assignment;

import java.util.Scanner;

public class AssnEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String lname = sc.nextLine();
		System.out.println("Enter last name: ");
		String fname = sc.nextLine();
		System.out.println(lname + " " +fname.charAt(0));
//		System.out.println("Your Initial is: " + fname.charAt(0));
		sc.close();
	}

}
