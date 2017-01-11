package guiPackage.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPackage.sampleGames.MouseFollower;

public class AnimatedComponent extends MovingComponent {
	
	private ArrayList<BufferedImage> frame; //the images that can be displayed
	private ArrayList<Integer> times; //the time each image is displayed
	private long displayTime; //the time when the last image switched
	private int currentFrame; //the frame that is currently being displayed
	private boolean repeat;
	
	public AnimatedComponent(int x, int y, int width, int height) {
		super(x, y, width, height);
		frame = new ArrayList<BufferedImage>();
		times = new ArrayList<Integer>();
		currentFrame = 0;
		repeat = true;
	}
	
	public void setRepeat(boolean b)
	{
		repeat = b;
	}
	
	public boolean isRepeat()
	{
		return repeat;
	}
	
	public void addFrame(BufferedImage img, int time)
	{
		frame.add(img);
		times.add(time);
	}

	@Override
	public void checkBehaviors() {
		if(MouseFollower.coordScreen != null)
		{
			if(getX() > MouseFollower.coordScreen.getWidth() - getWidth()|| getX() < 0)
				setVx(getVx() * -1);
			
			if(getY() > MouseFollower.coordScreen.getHeight() - getHeight()|| getY() < 0)
				setVy(getVy() * -1);
		}
	}

	@Override
	public void drawImage(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		if(frame != null && frame.size() > 0 && frame.size() == times.size() && currentTime - displayTime > times.get(currentFrame))
		{
			displayTime = currentTime;
			currentFrame = (currentFrame + 1)%frame.size();
			
			if(currentFrame == 0 && !repeat)
			{
				setRunning(false);
				return;
			}
			
			g = clear();
			g.drawImage(frame.get(currentFrame), 0, 0, getWidth(), getHeight(), 0, 0, frame.get(currentFrame).getWidth(), frame.get(currentFrame).getHeight(), null);
		}
		
	}
}
