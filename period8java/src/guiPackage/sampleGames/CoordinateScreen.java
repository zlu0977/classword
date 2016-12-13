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
		TextArea paragraph = new TextArea(40, 85, 500, 300, "THIS IS A PARAGRAPH THOS OS O POROGROPH THES ES E PEREHREPH THAS AS A PARAGRAPH THUS US U PURUGRAPH. THIS IS A PARAGRAPH THOS OS O POROGROPH THES ES E PEREHREPH THAS AS A PARAGRAPH THUS US U PURUGRAPH");
		viewObjects.add(label);
		viewObjects.add(paragraph);
	}

}
