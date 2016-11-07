package caveExplorer;

public class CaveRoomZheng {

	private String description;
	private String directions;
	private String contents;
	private String defaultContents;

	private CaveRoomZheng[] borderingRooms;
	private Door[] doors; 

	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;


	public CaveRoomZheng(String description){
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		
		borderingRooms = new CaveRoomZheng[4];
		doors = new Door[4];

		setDirections();
	}

	protected void setDirections() {
		directions	= "";
		if(doors[NORTH] == null && 
				doors[EAST] == null &&
				doors[SOUTH] == null &&
				doors[WEST] == null){
			directions = "\n\nThis is a room with no exit. You will die here.";		
		}else{
			for(int dir = 0; dir < doors.length; dir++){
				if(doors[dir] != null){
					directions += "\n   There is a "+doors[dir].getDescription()+" to "+toDirection(dir)+". "+doors[dir].getDetails();
				}
			}
		}
	
	}

	public String toDirection(int dir) {
		String[] directions = {"the North", "the East", "the South", "the West"};
		
		return directions[dir];
		
	}

	public String getContents(){
		return contents;
	}
	
	public void enter(){
		contents = "X";
	}
	
	public void leave(){
		contents = defaultContents;
	}
	
	public void setDefaultContents(String symbol){
		defaultContents = symbol;
	}
	

	public void addRoom(int direction, CaveRoomZheng anotherRoom, Door door){
		borderingRooms[direction] = anotherRoom;
		doors[direction] = door;
		setDirections();
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa) and
	 * sets a door between them, and updates the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoomZheng anotherRoom, Door door){
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}

	/**
	 * 
	 * @param dir
	 * @return opposite direction of dir (NORTH returns SOUTH...)
	 */
	public static int oppositeDirection(int dir){
		return (dir+2)%4;
	}

	
	public String getDescription(){
		return description+directions;
	}

	

	
	public Door getDoor(int dir){
		return doors[dir];
	}


	public void setDescription(String string) {
		description = string;
	}

	public void interpretAction(String input) {
		while(!isValid(input))
		{
			System.out.println("W,A,S,D");
			input = CaveExplorer.in.nextLine().toLowerCase();
		}
		
		String[] keys = {"w", "d", "s", "a"};
		int indexFound = -1;
		
		for(int i = 0; i < keys.length; i++)
			if(keys[i].equals(input))
			{
				indexFound = i;
				break;
			}
		if(borderingRooms[indexFound] != null && doors[indexFound] != null && doors[indexFound].isOpen())
		{
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[indexFound];
			CaveExplorer.currentRoom.enter();
			
			
			CaveExplorer.inventory.updateMap();
		}
	}

	public static boolean isValid(String input) {
		String[] keys = {"w", "d", "s", "a"};
		
		for(String key: keys)
			if(input.equals(key))
				return true;
		
		return false;
	}
}
