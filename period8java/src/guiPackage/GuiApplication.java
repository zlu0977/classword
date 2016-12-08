package guiPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GuiApplication  extends JFrame{
	
	private Screen currentScreen;
	
	public static void main(String[] args) {
		new GuiApplication();
	}
	
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

	protected void initScreen() {
		Screen startScreen = new Screen(getWidth(), getHeight());
		currentScreen =startScreen;
		
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
