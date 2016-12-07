package sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
		System.out.println("- - - SELECTION SORT - - -");
		System.out.println(Arrays.toString(arrayToSort));
		bubbleSort(copy(arrayToSort));
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
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

	private static int[] bubbleSort(int[] numbers) {
		for(int i=0; i < numbers.length-1; i++){
	        for(int j=1; j < numbers.length-i; j++){
	            if(numbers[j-1] > numbers[j]){
	                swap(numbers,j-1,j);
	            }
	        }
	    }
		return numbers;
	}
	
	private static int[] mergeSort(int[] numbers) {
		
		return numbers;
	}
	
	private static int[] quickSort(int[] numbers) {
		
		return numbers;
	}
}
