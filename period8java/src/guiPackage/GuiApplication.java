package guiPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GuiApplication  extends JFrame implements Runnable{

	private static final long serialVersionUID = 1L;
	private Screen currentScreen;
	
	public GuiApplication()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		int x = 0;
		int y = 0;
		int width = 1200;
		int height = 900;
		setBounds(x, y, width, height);
		initScreen();
		//setBackground(Color.pink);
		//setResizable(false);
		setVisible(true);
		
	}
	
	protected abstract void initScreen();
	
	public void setScreen(Screen screen)
	{
		if(currentScreen != null)
		{
			if(currentScreen.getMouseListener() != null)
				removeMouseListener(currentScreen.getMouseListener());
			
			if(currentScreen.getMouseMotionListener() != null)
				removeMouseMotionListener(currentScreen.getMouseMotionListener());
		}
		currentScreen = screen;
		if(currentScreen != null)
		{
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run()
	{
		while(true)
		{
			currentScreen.update();
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
