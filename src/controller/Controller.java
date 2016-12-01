package controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller
{
	double width;
	double height;
	Dimension screenSize;
	JFrame frame;
	ArrayList<String> messageList;
	
	public Controller()
	{
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screenSize.getWidth();
		height = screenSize.getHeight();
		messageList = new ArrayList<String>();
		setupMessageList();
	}
	
	private void setupMessageList()
	{
		messageList.add("Over here!");
		messageList.add("You can't get me!");
		messageList.add("Gotta be quick!");
		messageList.add("Hahaha");
		messageList.add("Nice try!");
		messageList.add("Too slow!");
		messageList.add("You shouldn't have ran this file!");
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
	
	private void spam()
	{
		int x = (int)(Math.random() * width);
		int y = (int)(Math.random() * height);
		
		frame.setLocation(x, y);
		JOptionPane.showMessageDialog(frame, getRandomMessage());
	}
	
	private String getRandomMessage()
	{
		String message;
		
		message = messageList.get((int) (Math.random() * messageList.size()));
		
		return message;
	}
}
