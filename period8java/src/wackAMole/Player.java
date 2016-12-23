package wackAMole;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import guiPackage.components.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;
	
	public Player(int x, int y) {
		super(x, y, 100, 100);
		score = 0;
	}

	@Override
	public void increaseScore(int i) {
		score ++;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.black);
		g.drawString("" + score, 45, 55);
		
	}
	
//	public boolean isAnimated()
//	{
//		return true;
//	}
}
