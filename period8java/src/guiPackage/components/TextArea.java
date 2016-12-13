package guiPackage.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {
	
	
	public TextArea(int x, int y, int width, int height, String text) {
		super(x, y, width, height, text);
		
	}
	
	public void update(Graphics2D g)
	{
		g = clear();
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.cyan);
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText() != null){
			//split text into array of words
			String[] words = getText().split(" ");
			if(words.length >0){
				//index of word
				int i = 0;
				final int SPACING = 2;
				//y value represents y-coordinate of each line
				int y = 0 + fm.getHeight()+SPACING;
				String line = words[i] + " ";
				i++;
				//loop as long as there are words left
				while(i < words.length){
					//add to current line until horizontal space is outside of bounds
					while(i < words.length && fm.stringWidth(line) + fm.stringWidth(words[i]) < getWidth()){
						line += words[i]+" ";
						i++;
					}
					//keep adding lines while there is vertical space
					if(y < getHeight()){
						g.drawString(line, 2, y);
						y += fm.getDescent() + fm.getHeight()+SPACING;
						//rest line
						line = "";
					}else{
						//no more vertical space
						break;//print no more text
					}
				}
			}

		}
		
//		if(getText() != null)
//		{	
//			
//			String[] words = getText().split(" ");
//			int pixelSum = 0;
//			String newString = "";
//			
//			for(int i = 0; i < words.length; i++)
//			{
//				String word = words[i];
//				
//				int wordWidth = fm.stringWidth(word + " ");
//				System.out.println(word + " " + wordWidth);
//				if(pixelSum + wordWidth >= getWidth())
//				{
//					newString += "\n";
//					pixelSum = 0;
//					i--;
//				}
//				else
//				{
//					newString += word + " ";
//					pixelSum += wordWidth;
//				}
//			}
//			
//			String[] newLines = newString.split("\n");
//			
//			for(int i = 0; i < newLines.length; i++)
//				g.drawString(newLines[i], getX(), getY() + (i * fm.getHeight()));
//		}
	}
}
