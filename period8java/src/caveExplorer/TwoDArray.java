package caveExplorer;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		/*String[] xox = {"x", "o", "x", "o", "x"};
		System.out.print(Arrays.toString(xox));
		
		String[][] arr2D = new String[5][4];
		
		for(int row = 0; row <arr2D.length; row++)
			for(int col = 0; col <arr2D[row].length; col++)
				arr2D[row][col] = "(" + row + "," + col + ")";
		
		for(String[] row : arr2D)
			System.out.print(Arrays.toString(row));*/
		
		String[][] pic = new String[6][6];
		
		for(int row = 0; row <pic.length; row++)
			for(int col = 0; col <pic[row].length; col++)
				pic[row][col] = " ";
		
		for(int i = 0; i < 6; i++)
			pic[0][i] = "M";
		
		pic[1][0] = "|";
		pic[1][2] = "o";
		pic[1][3] = "o";
		pic[1][5] = "|";
		
		pic[2][0] = "n";
		pic[2][2] = "-";
		pic[2][3] = "-";
		pic[2][5] = "n";
		
		pic[3][0] = "|";
		pic[3][5] = "|";
		
		for(int i = 1; i < 5; i++)
			pic[3][i] = "_";
		
		pic[4][0] = "|";
		pic[4][5] = "|";
		pic[4][2] = "_";
		pic[4][3] = "_";
		
		pic[5][0] = "|";
		pic[5][5] = "|";
		pic[5][1] = "/";
		pic[5][4] = "\\";
		
		for(String[] row : pic)
		{
			for(String col : row)
				System.out.print(col);
			
			System.out.println();
		}
	}
}
