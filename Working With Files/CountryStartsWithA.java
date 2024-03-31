package FileIO;

import java.util.Map;

public class CountryStartsWithA {
	public static void main(String[] args) {
		String filePath = "D:\\file.csv";
		Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
		char startsWith = 'A';
		String outputFile = "D:\\filtered_countries.txt";
		Countrymap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
		System.out.println("GO check Filtered countries.");
	}
}