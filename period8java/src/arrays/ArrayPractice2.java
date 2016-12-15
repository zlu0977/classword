package arrays;

public class ArrayPractice2 {

	private static boolean[][] grid;
	
	public static void main(String[] args)
	{
		boolean[][] array2 = new boolean[5][5];
		array2[2][1] = true;
		printGrid(array2);
		buttonClick(3,3);
	}
	
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < grid.length)
			switchRow(grid[r], c);
		
		switchColumn(grid, r, c);
		
		for(boolean[] row: grid)
			for(boolean light: row)
				if(light)
					return;
		
		System.out.println("YOU HAVE SOLVED THE PUZZLE");
					
	}
	
	public static void switchRow(boolean[] row, int x)
	{
		for(int i = -1; i < 2; i++)
			if(x + i >= 0 && x + i < row.length)
				row[x+i] = !row[x+i];
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c)
	{
		switchIfValid(grid, r - 1, c);
		switchIfValid(grid, r + 1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c)
	{
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length)
			grid[r][c] = !grid[r][c];
	}
	
	public static void printGrid(boolean[][] array)
	{
		for(boolean[] row : array)
		{
			for(boolean bool : row)
				System.out.print(booleanToString(bool));
			
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	}
	
	private static String booleanToString(boolean bool)
	{
		if(bool) return "O ";
		return "X ";
	}
}
