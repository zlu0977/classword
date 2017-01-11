package guiPackage.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPackage.Screen;
import guiPackage.components.Button;
import guiPackage.components.Graphic;
import guiPackage.components.MovingComponent;
import guiPackage.components.Action;
import guiPackage.components.AnimatedComponent;
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
		
		//MovingComponent blackBall = new MovingComponent(100, 100, 80, 80);
		
		graph = new Graphic(10, 40, 1.5, "resources/sampleImages/Potato.png");
		
		viewObjects.add(graph);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(myButton);
		//viewObjects.add(blackBall);
		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent(300, 300, 100, 100);
		try{
			ImageIcon img = new ImageIcon("resources/sampleImages/boom.png");
			int numberInRow = 5;
			int rows = 4;
			int width = 95;
			int height = 95;
			int leftMargin = 0;
			int topMargin = 0;
			
			for(int i = 0; i < numberInRow * rows; i ++)
			{
				BufferedImage cropped = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
				int x1 = leftMargin + width*(i%numberInRow);
				int y1 = topMargin + height*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(img.getImage(), 0, 0, width, height,x1, y1, x1 + width, y1 + height, null);
				a.addFrame(cropped, 50);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		viewObjects.add(a);
		a.play();
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
