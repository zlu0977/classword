package wackAMole;

import java.awt.image.BufferedImage;

import guiPackage.components.Action;
import guiPackage.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	public static int moleWidth;
	public static int moleHeight;
	public int time;
	public Mole(int x, int y) {
		super(x, y, "resources/sampleImages/mole.png");
		moleWidth = getWidth();
		moleHeight = getHeight();
	}

	@Override
	public int getTime() {
		return time;
	}

	@Override
	public void setTime(int time) {
		this.time = time;	
	}

}
