package caveExplorer;

public class InventoryZheng {

	private boolean hasMap;
	private String map;
	
	public InventoryZheng()
	{
		hasMap = false;
		updateMap();
	}
	
	public void updateMap() {
		// TODO Auto-generated method stub
		CaveRoomZheng[][] caves = CaveExplorer.caves;
		map = " ";
		
		for(int i = 0; i < caves[0].length - 1; i++)
			map += "____";
		
		map += "___\n";
		
		for(CaveRoomZheng[] row: caves)
			for(int textRow = 0; textRow < 3; textRow++)
			{
				for(CaveRoomZheng cr: row)
				{
					String wall = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && cr.getDoor(CaveRoomZheng.WEST) != null)
						wall = "  "+contents+" ";
					else if(textRow == 2)
						if(cr.getDoor(CaveRoomZheng.SOUTH) != null)
							wall = "|_ _";
						else
							wall = "|___";
					
					map+= wall;
				}
				map+= "|\n";
			}
		
		System.out.println(map);
	}

	public String getDescription()
	{
		if(hasMap)
			return map;
		else
			return "no inventory";
	}

	public void setHasMap(boolean b) {
		hasMap = b;
	}
}
