package guiPackage.components;

import java.awt.image.BufferedImage;

public class Graphic implements Visible {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		
		loadedImages = false;
		loadImages(imageLocation, 0.0);
	}

	private void loadImages(String imageLocation, double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
