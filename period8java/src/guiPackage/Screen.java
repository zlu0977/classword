package guiPackage;

import java.awt.image.BufferedImage;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPackage.components.Visible;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public abstract class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height)
	{
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		
		initObjects(viewObjects);
		initImage();
		
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects2);

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		g.setColor(Color.pink);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.blue);
		g.setFont(new Font("Helvetica", Font.BOLD, 50));
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		drawAllVisibleComponents(g);
		
//		int startx = 20;
//		for(int i = 0; i < 5; i++)
//		{
//			g.drawString("HELLO", startx, 150);
//			startx += 200;
//		}
//		
//		g.drawOval(15, 40, 180, 180);
//		g.drawRect(50, 300, 700, 50);
//		
//		g.setColor(Color.white);
//		for(int i = 0; i < image.getWidth()/10; i++)
//		{
//			g.drawLine(i * 10, 0, i * 10, 600);
//			g.drawLine(0, i * 10, 800, i * 10);
//		}
	}
	
	private void drawAllVisibleComponents(Graphics2D g) {
		for(Visible v: viewObjects)
		{
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		
	}

	public BufferedImage getImage()
	{
		return image;
	}

	public MouseListener getMouseListener() {
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
}
