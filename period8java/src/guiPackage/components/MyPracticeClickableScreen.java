package guiPackage.components;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import guiPackage.ClickableScreen;

public class MyPracticeClickableScreen extends ClickableScreen {
	
	private ClickableGraphic graph1;
	private ClickableGraphic graph2;
	private ClickableGraphic graph3;
	
	public MyPracticeClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		graph1 = new ClickableGraphic(40, 40, "resources/sampleImages/Potato.png");
		graph1.setAction(new Action(){
			public void act()
			{
				graph1.setX(graph1.getX() + 10);
			}
		});
		
		graph2 = new ClickableGraphic(40, 400, 0.5, "resources/sampleImages/Potato.png");
		graph2.setAction(new Action(){
			public void act()
			{
				graph2.setX(graph2.getX() + 10);
			}
		});
		
		graph3 = new ClickableGraphic(40, 600, 0.25, "resources/sampleImages/Potato.png");
		graph3.setAction(new Action(){
			public void act()
			{
				//graph3.setX(graph3.getX() + 10);
			}
		});
		
		viewObjects.add(graph1);
		viewObjects.add(graph2);
		viewObjects.add(graph3);
	}
	
	public void mouseMoved(MouseEvent m) {
		
		graph3.setX(m.getX());
		graph3.setY(m.getY() + (int)(Math.sin((double)m.getX()/200) * 100));
		
		graph2.setX(m.getX() + m.getX()/2);
		graph2.setY(m.getY() + m.getY()/2);
		
//		graph3.setX(m.getX() - m.getX()/2);
//		graph3.setY(m.getY() - m.getY()/2);
	}

}
