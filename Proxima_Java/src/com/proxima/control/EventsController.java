package com.proxima.control;

import javax.swing.*;
public class EventsController {
	
	private JOptionPane messages;
	

	
	public void errorMessage(String content) 
	{
		messages.showMessageDialog(messages, content, "ERROR!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void errorMessage(String content, String title) 
	{
		messages.showMessageDialog(messages, content, title, JOptionPane.ERROR_MESSAGE);
	}

}
