package guiPackage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPackage.components.Clickable;
import guiPackage.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener, MouseMotionListener{

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible v: viewObjects)
			 if(v instanceof Clickable)
				 clickables.add((Clickable) v);
	}
	
	public abstract void initAllObjects(ArrayList<Visible> viewObjects);
	
	@Override
	public MouseListener getMouseListener() {
		return this;
	}

	@Override
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for(Clickable c : clickables)
			if(c.isHovered(e.getX(), e.getY()))
			{
				c.act();
				break;
			}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
