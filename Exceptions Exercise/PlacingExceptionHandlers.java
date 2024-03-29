package exceptionExercise;

import java.util.Scanner;

public class PlacingExceptionHandlers {
	public static void main(String[] args) {
		int val, sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		Scanner scanLine = new Scanner(scan.nextLine());
		while (scanLine.hasNext()) {
			try {
				val = Integer.parseInt(scanLine.next());
				sum = sum + val;
			}
		catch(NumberFormatException nfe){
			
		}
			}
		scan.close();
		System.out.println("Totally you have "+ sum+ " pets");
	}
}
