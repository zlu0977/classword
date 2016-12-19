package guiPackage.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import guiPackage.Screen;
import guiPackage.components.Action;
import guiPackage.components.Button;
import guiPackage.components.Graphic;
import guiPackage.components.TextArea;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class MyScreen extends Screen {
	
	public Button myButton;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel label = new TextLabel(40, 45, 760, 40, "POTATO2");
		TextArea paragraph = new TextArea(40, 85, 700, 500, "BLAH");
		myButton = new Button(40,300,100,50,"ButtonZ", Color.green, new Action(){
			public void act(){
				System.out.println("PRESSED");
				myButton.setClicks(myButton.getClicks() + 1);
				
				if(myButton.getClicks()%2 == 1)
				{
					myButton.setColor(Color.red);
				}
				else
				{
					myButton.setColor(Color.green);
				}
				
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
			});

		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(myButton);


	}

}
