package guiPackage.sampleGames;

import guiPackage.GuiApplication;
import guiPackage.Screen;
import guiPackage.components.ClickScreen;
import guiPackage.components.MyPracticeClickableScreen;

public class ClickGraphic extends GuiApplication {

	public static ClickGraphic game;
	public static Screen myScreen;
	
	protected void initScreen() {
		myScreen = new MyPracticeClickableScreen(getWidth(), getHeight());
		setScreen(myScreen);
	}
	
	public static void main(String[] args)
	{
		game = new ClickGraphic();
		Thread app = new Thread(game);
		app.start();
	}

}
