package coreJava2;

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int myArray = sc.nextInt();
		int[] arr = new int[myArray];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < myArray; i++) {
			arr[i] = sc.nextInt();
		}
		int min = findMin(arr, arr.length - 1);
		System.out.println("Chotta element in the array is: " + min);

	}

	public static int findMin(int[] array, int index) {
		if (index == 0) {
			return array[0];
		} else {
			return Math.min(array[index], findMin(array, index - 1));
		}
	}
}