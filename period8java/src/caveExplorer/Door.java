package caveExplorer;

public class Door {
	
	private boolean open;
	private boolean locked;
	private String desciption;
	private String details;
	
	public Door()
	{
		open = true;
		locked = false;
		desciption = "Door";
		details = "";
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
