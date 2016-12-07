package guiPackage;

import java.awt.Color;

import javax.swing.JFrame;

public class GuiApplication  extends JFrame{

	public static void main(String[] args) {
		new GuiApplication();
	}
	
	public GuiApplication()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x, y, width, height);
		setVisible(true);
		Color red = new Color(80, 115, 200);
		setBackground(red);
	}
}
