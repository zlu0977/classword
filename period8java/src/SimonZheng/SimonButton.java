package SimonZheng;

import java.awt.Color;
import java.awt.image.BufferedImage;

import guiPackage.components.Action;
import guiPackage.components.ClickableGraphic;

public class SimonButton extends ClickableGraphic implements ButtonInterface {

	public SimonButton(int i, int j, int k, int l, Color color) {
		super(i, j, 0.5, "resources/sampleImages/mole.png");
	}

	@Override
	public void blink() {
		
	}
}
