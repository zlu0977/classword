package guiPackage.sampleGames;

import guiPackage.GuiApplication;
import guiPackage.Screen;

public class MouseFollower extends GuiApplication {
	
	public static MouseFollower game;
	public static MyScreen myScreen;
	public static  Screen coordScreen;
	
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new MyScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}
	
	public static void main(String[] args)
	{
		GuiApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}

}
