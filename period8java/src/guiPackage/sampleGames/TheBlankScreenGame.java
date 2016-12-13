package guiPackage.sampleGames;

import guiPackage.GuiApplication;
import guiPackage.Screen;

public class TheBlankScreenGame extends GuiApplication {

	@Override
	protected void initScreen() {
		Screen s = new BlankScreen(getWidth(), getHeight());
		setScreen(s);

	}

	public static void main(String[] args) {
		new TheBlankScreenGame();
		

	}

}
