package wackAMole;

import guiPackage.GuiApplication;
import guiPackage.Screen;

public class WackAMoleGame extends GuiApplication {
	
	public static Screen mainScreen;
	public static GuiApplication game;
	
	public WackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		mainScreen = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(mainScreen);
	}

	public static void main(String[] args) {
		game = new WackAMoleGame();
		Thread app = new Thread(game);
		app.start();

	}
}
