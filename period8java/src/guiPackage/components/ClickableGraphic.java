package guiPackage.components;

public class ClickableGraphic extends Graphic implements Clickable {

	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(x > getX() && x < getX() + getWidth())
			if(y > getY() && y < getY() + getHeight())
				return true;
				
		return false;
	}
	
	public void setAction(Action act)
	{
		action = act;
		//update();
	}
	
	@Override
	public void act() {
		if(action != null)
			action.act();
	}

}
