package guiPackage.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	
	private Color color;
	private Action action;
	
	public Button(int x, int y, int width, int height, String text, Color color, Action action) {
		super(x, y, width, height, text);
		this.color = color;
		this.action = action;
	}
	
	@Override
	public void update(Graphics2D g)
	{
		g = clear();
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth() - 5, getHeight() - 5, 25, 25);
		
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth() - 5, getHeight() - 5, 25, 25);
		
		if(getText() != null)
		{
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.drawString(getText(), 4, getHeight() - 5);
		}
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(x > getX() && x < getX() + getWidth())
			if(y > getY() && y < getY() + getHeight())
				return true;
				
		return false;
	}

	@Override
	public void act() {
		action.act();
	}
}
