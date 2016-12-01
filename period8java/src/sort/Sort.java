package sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] numbers = {1, 7, 3, 4, 8, 6, 3, 9};
		
		int[] sorted = insertionSort(numbers);
		System.out.println(Arrays.toString(sorted));
	}

	private static int[] insertionSort(int[] numbers) {
		for(int i = 1; i < numbers.length; i++)
		{
			int j = i - 1;
			if(i > 0 && numbers[i] < numbers[j])
			{
				swap(numbers, i, j);
				i = i - 2;
			}
		}
		return numbers;
	}

	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	private static int[] bubbleSort(int[] numbers) {
		
		return numbers;
	}
}
