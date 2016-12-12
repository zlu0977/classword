package guiPackage.sampleGames;

import java.util.ArrayList;

import guiPackage.Screen;
import guiPackage.components.TextArea;
import guiPackage.components.TextLabel;
import guiPackage.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(25, 25, 760, 40, "POTATO");
		TextArea paragraph = new TextArea(40, 85, 760, 500, "THIS IS A PARAGRAPH AGFIEGUF GEIGF IEWFGIEU GFIUEGF IUGEF UIG gjig jsrtgj rtjg;sg jsio;gj");
		viewObjects.add(label);
		viewObjects.add(paragraph);
	}

}
