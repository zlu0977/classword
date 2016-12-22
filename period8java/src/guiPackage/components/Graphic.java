package guiPackage.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
	
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		
		loadedImages = false;
		loadImages(imageLocation, 0 , 0);
	}
	
	public Graphic(int x, int y, double scale, String imageLocation) {
		this.x = x;
		this.y = y;
		
		loadedImages = false;
		loadImages(imageLocation, scale);
	}
	
	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.x = x;
		this.y = y;
		
		loadedImages = false;
		loadImages(imageLocation, w, h);
	}

	private void loadImages(String imageLocation, int w, int h) {
		try
		{
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w == 0 && h == 0)
			{
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else
			{
				image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, w, h, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
			}
			
			loadedImages = true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, double scale) {
		try
		{
			ImageIcon icon = new ImageIcon(imageLocation);
			
			int newWidth = (int)(icon.getIconWidth() * scale);
			int newHeight = (int)(icon.getIconHeight() * scale);
			
			image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
			
			loadedImages = true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
