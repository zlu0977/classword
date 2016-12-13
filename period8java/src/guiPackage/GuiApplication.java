package guiPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GuiApplication  extends JFrame{
	
	private Screen currentScreen;
	
	public GuiApplication()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		int x = 0;
		int y = 0;
		int width = 800;
		int height = 600;
		setBounds(x, y, width, height);
		initScreen();
		setBackground(Color.pink);
		//setResizable(false);
		setVisible(true);
		
	}

	protected abstract void initScreen();
	
	public void setScreen(Screen screen)
	{
		currentScreen = screen;
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
