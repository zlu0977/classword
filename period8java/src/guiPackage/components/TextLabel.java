package guiPackage.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {
	
	private String text;
	private String font;
	private int size;
	
	public TextLabel(int x, int y, int width, int height, String text) {
		super(x, y, width, height);
		setText(text);
		setFont("Helvetica");
		setSize(20);
		update();
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	public void setFont(String font)
	{
		this.font = font;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.cyan);
		
		if(text != null)
		{
			g.setFont(new Font(font, Font.BOLD, size));
			g.drawString(text, 4, getHeight() - 5);
		}
	}

	public String getText() {
		return text;
	}

	public String getFont() {
		return font;
	}

	public int getSize() {
		return size;
	}

}
