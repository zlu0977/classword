package guiPackage.components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPackage.Screen;
import guiPackage.sampleGames.ClickGraphic;

public class ClickScreen extends Screen implements MouseListener {
	
	private ClickableGraphic graph1;
	
	public ClickScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(graph1.isHovered(e.getX(), e.getY()))
			graph1.act();
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

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		graph1 = new ClickableGraphic(40, 40, "resources/sampleImages/Potato.png");
		graph1.setAction(new Action(){
			public void act()
			{
				graph1.setX(graph1.getX() + 10);
			}
		});
		
//		Button button = new Button(200, 400, 100, 50, "Back", Color.red, new Action(){
//			public void act()
//			{
//				System.out.println("ASD");
//				graph1.setX(graph1.getX() - 10);
//			}
//		});
		
		viewObjects.add(graph1);
		//viewObjects.add(button);
	}
	
	@Override
	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public MouseMotionListener getMouseMotionListener() {
		// TODO Auto-generated method stub
		return null;
	}

}
