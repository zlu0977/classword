package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoomZheng[][] caves = new CaveRoomZheng[5][5];
	public static Scanner in = new Scanner(System.in);
	public static CaveRoomZheng currentRoom;
	public static InventoryZheng inventory;
	
	
	public static void main(String[] args) {
		
		for(int row = 0; row <caves.length; row++)
			for(int col = 0; col <caves[row].length; col++)
				caves[row][col] = new CaveRoomZheng("Row: " + row + ", Col: " + col);
		
		currentRoom = caves[1][2];
		currentRoom.enter();
		
		caves[1][2].setConnection(caves[1][1]);
		caves[1][2].setConnection(caves[2][1]);
		caves[1][2].setConnection(caves[1][3]);
	}

}
