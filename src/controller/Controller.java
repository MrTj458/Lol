package controller;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller
{
	double width;
	double height;
	Dimension screenSize;
	JFrame frame;
	
	public Controller()
	{
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screenSize.getWidth();
		height = screenSize.getHeight();
	}
	
	public void start()
	{
		frame = new JFrame();
		frame.setSize(1, 1);
		frame.setTitle("lol");
		frame.setResizable(false);
		frame.setVisible(true);
		
		while(true)
		{
			spam();
		}
	}
	
	public void spam()
	{
		int x = (int)(Math.random() * width);
		int y = (int)(Math.random() * height);
		
		frame.setLocation(x, y);
		JOptionPane.showMessageDialog(frame, "Hi");
	}
}
