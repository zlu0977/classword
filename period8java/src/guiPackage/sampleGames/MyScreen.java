package guiPackage.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPackage.Screen;
import guiPackage.components.Action;
import guiPackage.components.Button;
import guiPackage.components.Graphic;
import guiPackage.components.TextArea;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class MyScreen extends Screen implements MouseListener{
	
	public Button myButton;
	public Graphic graph;
	public TextLabel label;
	
	public MyScreen(int width, int height) {
		super(width, height);
		setColor(Color.yellow);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(400, 300, 100, 50, "HELLO");
		graph = new Graphic(180, 40, 1.5, "resources/sampleImages/Potato.png");
		myButton = new Button(40,300,100,50,"ButtonB", Color.red, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
			});
		
		viewObjects.add(graph);
		viewObjects.add(myButton);
		viewObjects.add(label);

	}
	
	public MouseListener getMouseListener() {
		return this;
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(myButton.isHovered(e.getX(), e.getY()))
			myButton.act();
		
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
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
}
