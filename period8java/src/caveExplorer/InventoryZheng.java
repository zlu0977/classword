package caveExplorer;

public class InventoryZheng {

	private boolean hasMap;
	private String map;
	
	public InventoryZheng()
	{
		hasMap = true;
		updateMap();
	}
	
	private void updateMap() {
		// TODO Auto-generated method stub
		CaveRoomZheng[][] caves = CaveExplorer.caves;
	}

	public String getDescription()
	{
		if(hasMap)
			return map;
		else
			return "no inventory";
	}
}
