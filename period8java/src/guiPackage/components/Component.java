package guiPackage.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Component implements Visible {

	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage image;
	
	public Component(int x, int y, int width, int height)
	{
		this.x = x;
		this.y =y;
		this.width = width;
		this.height = height;
		
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
	}
	
	public abstract void update(Graphics2D g);

	public BufferedImage getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public boolean isAnimated() {
		return false;
	}

	public void update() {
		update(image.createGraphics());
	}

}
