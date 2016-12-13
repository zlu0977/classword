package caveExplorer;

public class EventRoom extends CaveRoomZheng{

	private boolean eventHappened = false;
	private Playable event;
	
	public EventRoom(String description, Playable event) {
		super(description);
		this.event = event;
	}

	public void enter()
	{
		super.enter();
		if(!eventHappened)
		{
			eventHappened = true;
			event.play();
		}
	}
}
