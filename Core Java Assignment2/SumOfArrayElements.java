package coreJava2;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int sum = sum(arr);
		System.out.println("Sum of array elements: " + sum);
	}

	public static int sum(int[] array) {
		return sumHelper(array, array.length - 1);
	}

	private static int sumHelper(int[] array, int index) {
		if (index < 0) {
			return 0;
		}
		return array[index] + sumHelper(array, index - 1);
	}
}
