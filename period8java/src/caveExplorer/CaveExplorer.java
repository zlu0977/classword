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
		caves[1][3] = new EventRoom("MAP ROOM", new GameStartEvent());
		
		currentRoom.enter();
		
		caves[1][2].setConnection(CaveRoomZheng.WEST, caves[1][1], new Door());
		caves[1][2].setConnection(CaveRoomZheng.SOUTH, caves[2][2], new Door());
		caves[1][2].setConnection(CaveRoomZheng.EAST, caves[1][3], new Door());
		
		 inventory = new InventoryZheng();
		startExploring();
	}


	private static void startExploring() {
		while(true)
		{
			print(currentRoom.getDescription());
			print("What would you like to do?");
			String input = in.nextLine().toLowerCase();
			
			currentRoom.interpretAction(input);
		}
	}

	public static void print(String s) {
		System.out.println(s);
	}

}
