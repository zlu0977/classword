package caveExplorer;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String[] xox = {"x", "o", "x", "o", "x"};
		System.out.print(Arrays.toString(xox));
		
		String[][] arr2D = new String[5][4];
		
		for(int row = 0; row <arr2D.length; row++)
			for(int col = 0; col <arr2D[row].length; col++)
				arr2D[row][col] = "(" + row + "," + col + ")";
		
		for(String[] row : arr2D)
			System.out.print(Arrays.toString(row));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String[][] pic = new String[10][18];
		
		for(int row = 0; row <pic.length; row++)
			for(int col = 0; col <pic[row].length; col++)
				pic[row][col] = " ";
		
		int startCol = 5;
		for(int i = startCol; i < startCol + 6; i++)
			pic[1][i] = "M";
		
		pic[2][startCol] = "|";
		pic[2][startCol + 2] = "o";
		pic[2][startCol + 3] = "o";
		pic[2][startCol + 5] = "|";
		
		pic[3][startCol] = "n";
		pic[3][startCol + 2] = "-";
		pic[3][startCol + 3] = "-";
		pic[3][startCol + 5] = "n";
		
		pic[4][startCol] = "|";
		pic[4][startCol + 5] = "|";
		
		for(int i = startCol + 1; i < startCol + 5; i++)
			pic[4][i] = "_";
		
		pic[5][startCol] = "|";
		pic[5][startCol + 5] = "|";
		pic[5][startCol + 2] = "_";
		pic[5][startCol + 3] = "_";
		
		pic[6][startCol] = "|";
		pic[6][startCol + 5] = "|";
		pic[6][startCol + 1] = "/";
		pic[6][startCol + 4] = "\\";
		
		for(int i = 0; i < pic.length; i++)
		{
			pic[i][0] = "|";
			pic[i][pic[0].length - 1] = "|";
		}
		
		for(int i = 0; i < pic[0].length; i++)
		{
			pic[pic.length - 1][i] = "_";
			pic[0][i] = "_";
		}
		
		printPic(pic);*/
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		
		for(int row = 0; row < mines.length; row++)
			for(int col = 0; col < mines[row].length; col++)
				if(mines[row][col])
					field[row][col] = "X";
				else
				{
					field[row][col] = countNearby(mines, row, col);
				}
		
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		int minesNearby = 0;
		
		for(int r = row - 1; r < row + 1; row++)
			for(int c = col + 1; c < col + 1; c++)
				if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length && mines[r][c])
					minesNearby ++;
		
		return "" + minesNearby;
	}

	private static void plantMines(boolean[][] mines) {
		int mineNum = 10;
		
		while(mineNum > 10)
		{
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			
			if(!mines[row][col])
			{
				mineNum --;
				mines[row][col] = true;
			}
		}
	}

	public static void printPic(String[][] pic)
	{
		for(String[] row : pic)
		{
			for(String col : row)
				System.out.print(col);
			
			System.out.println();
		}
	}
}
