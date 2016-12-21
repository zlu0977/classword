package guiPackage.sampleGames;

import guiPackage.GuiApplication;
import guiPackage.Screen;

public class MouseFollower extends GuiApplication {
	
	public static MouseFollower game;
	public static Screen myScreen;
	public static  Screen coordScreen;
	
	protected void initScreen() {
		myScreen = new MyScreen(getWidth(), getHeight());
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}
	
	public static void main(String[] args)
	{
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}

}
