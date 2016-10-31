package caveExplorer;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.print(Arrays.toString(xox));
		
		String[][] arr2D = new String[5][4];
		
		for(int row = 0; row <arr2D.length; row++)
			for(int col = 0; col <arr2D[row].length; col++)
				arr2D[row][col] = "(" + row + "," + col + ")";
		
		for(String[] row : arr2D)
			System.out.print(Arrays.toString(row));
	}

}
