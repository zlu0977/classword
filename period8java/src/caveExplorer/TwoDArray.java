package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	
	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D = new String[5][5];
	static String[][] pic = new String[5][5];
	
	static int starti = 2;
	static int startj = 2;
	static int treasurei = 3;
	static int treasurej = 4;
	
	public static void main(String[] args) {
		
//		String[][] map = new String[6][8];
//		
//		for(int row = 0; row <map.length; row++)
//			for(int col = 0; col <map[row].length; col++)
//				map[row][col] = " ";
//		
//		while(true)
//		{
//			System.out.println("01234567");
//			printPic(map);
//			System.out.println("What column do u want to drop your piece?");
//			String input = in.nextLine();
//			int something = Integer.parseInt(input);
//			if (something >=0 && something <8) {
//				for (int rows = map.length - 1; rows >= 0;rows--) {
//					if(!map[rows][something].equals("0")) {
//						map[rows][something] = "0";
//						break;
//					}
//						
//						
//					else if (map[rows][something].equals("0") && rows == 0) {
//						System.out.println("This column is filled");
//					}
//				}
//			}
//		}
		
		
		
		
//		for(int row = 0; row < arr2D.length; row++)
//			for(int col = 0; col < arr2D[row].length; col++)
//				arr2D[row][col] = "(" + row + ", " + col + ")";
//		
//		startExploring();
		
		
		
//		boolean[][] mines = new boolean[6][6];
//		plantMines(mines);
//		String[][] field = createField(mines);
//		printPic(field);
//		
//		printGrid(mines);
		
		

		
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
	
	private static void startExploring() {
		while(true)
		{
			for(int row = 0; row < pic.length; row++)
				for(int col = 0; col < pic[row].length; col++)
					pic[row][col] = " ";
			
			pic[starti][startj] = "X";
			
			printPic(pic);
			System.out.println("you are in room" + arr2D[starti][startj]);
			if(starti == treasurei && startj == treasurej)
				break;
			
			System.out.println("Que Quieres hacer?");
			String input = in.nextLine();
			
			int[] newCoords = interpretInput(input);
			starti = newCoords[0];
			startj = newCoords[1];
		}
		
		System.out.println("Tu Ganas!");
	}

	private static int[] interpretInput(String input) {
		int[] newCoords = {starti, startj};
		
		while(!isValid(input))
		{
			System.out.println("solo W,A,S,D. Que Quieres hacer?");
			input = in.nextLine();
		}
		
		int currenti = starti;
		int currentj = startj;
		
		input = input.toLowerCase();
		
		if(input.equals("w")) currenti --;
		if(input.equals("s")) currenti ++;
		if(input.equals("a")) currentj --;
		if(input.equals("d")) currentj ++;
		
		if(inRange(currenti, 0, arr2D.length) && inRange(currentj, 0, arr2D[0].length))
		{
			newCoords[0] = currenti;
			newCoords[1] = currentj;
		}
		else
			System.out.println("no eres en la mapa");
		
		return newCoords;
	}

	private static boolean inRange(int i, int min, int max) {
		if(i >= min && i < max)
			return true;
		
		return false;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		
		for(String key: validKeys)
			if(input.toLowerCase().equals(key))
				return true;
		
		return false;
	}

	private static void printGrid(boolean[][] mines) {
		
		int width = 3;
		int height = 3;
		
		String[][] map = new String[mines.length * height][mines[0].length * width];
		for(int row = 0; row < map.length; row++)
			for(int col = 0; col < map[row].length; col++)
				map[row][col] = " ";
		
		for(int col = 0; col < mines[0].length; col++)
			for(int i = 0; i < map.length - 2; i++)
				map[col * width][i] = "_";
		
		for(int row = 0; row < mines.length; row++)
			for(int i = 1; i < map.length - 2; i++)
				map[i][row * height] = "|";
		
		printPic(map);
	}

	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		
		for(int row = 0; row < mines.length; row++)
			for(int col = 0; col < mines[row].length; col++)
				if(mines[row][col])
					field[row][col] = "X";
				else
					field[row][col] = countNearby(mines, row, col);
		
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		int minesNearby = 0;
		
//		for(int r = row - 1; r < row + 1; r++)
//			for(int c = col + 1; c < col + 1; c++)
//				if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length && mines[r][c])
//					minesNearby ++;
		
		for(int r = 0; r < mines.length; r++)
			for(int c = 0; c < mines[r].length; c++)
				if(Math.abs(r-row) + Math.abs(c-col) == 1 && mines[r][c])
					minesNearby ++;
		
//		minesNearby += isValidAndTrue(mines, row-1, col);
//		minesNearby += isValidAndTrue(mines, row+1, col);
//		minesNearby += isValidAndTrue(mines, row, col-1);
//		minesNearby += isValidAndTrue(mines, row-1, col+1);
		
		return "" + minesNearby;
	}

	private static int isValidAndTrue(boolean[][] mines, int r, int c) {
		if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length && mines[r][c])
			return 1;
		
		return 0;
	}

	private static void plantMines(boolean[][] mines) {
		int mineNum = 10;
		
		while(mineNum > 0)
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
