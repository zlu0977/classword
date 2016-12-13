package arrays;

public class EnhancedArrayMethods {

	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		swap(array, 0, array.length - 1);
	}

	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
