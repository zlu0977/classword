package guiPackage.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPackage.Screen;
import guiPackage.components.Button;
import guiPackage.components.Graphic;
import guiPackage.components.MovingComponent;
import guiPackage.components.Action;
import guiPackage.components.TextArea;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
	private Graphic graph;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "POTATO");
		paragraph = new TextArea(40, 85, 700, 500, "THIS IS A PARAGRAPH THOS OS O POROGROPH THES ES E PEREHREPH THAS AS A PARAGRAPH");
		myButton = new Button(40,300,100,50,"ButtonA", Color.green, new Action(){
			public void act(){
				
				System.out.println("PRESSED");
//				myButton.setClicks(myButton.getClicks() + 1);
//				
//				if(myButton.getClicks()%2 == 1)
//				{
//					myButton.setColor(Color.red);
//				}
//				else
//				{
//					myButton.setColor(Color.green);
//				}
				
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
			});
		
		MovingComponent blackBall = new MovingComponent(100, 100, 80, 80);
		
		graph = new Graphic(10, 40, 1.5, "resources/sampleImages/Potato.png");
		
		viewObjects.add(graph);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(myButton);
		viewObjects.add(blackBall);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("YO Mouse is at " + m.getX() + "," + m.getY());
		
		if(m.getX() < 400)
			paragraph.setText("YOU ARE NOT PAST X = 400");
		else
			paragraph.setText("YOU ARE PAST X = 400");
	}
	
	
	
	
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
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

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		
	}

}
