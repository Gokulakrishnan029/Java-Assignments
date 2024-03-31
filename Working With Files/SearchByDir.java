package FileIO;

import java.io.File;
import java.util.Scanner;

public class SearchByDir {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your file extension: ");
		String fileExtension = scan.nextLine();

		System.out.print("Enter the directory path to search: ");
		String searchDirectory = scan.nextLine();

		File dir = new File(searchDirectory);
		String[] filesInDirectory = null;
		if (dir.isDirectory()) {
			filesInDirectory = dir.list();
		}

		if (filesInDirectory != null) {
			System.out.println("Matching files: ");
			for (String sFile : filesInDirectory) {
				String[] fileDetails = sFile.split("[.]");
				if ((fileDetails[1]).equals(fileExtension)) {
					System.out.println("File found with name : " + sFile);
				}
			}
		} else {
			System.out.println("No files found.");
		}
		scan.close();
	}
}