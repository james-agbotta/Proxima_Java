package com.proxima.view;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.*;

import com.proxima.control.EventsController;


public class Main {

	public static void main(String[] args) {
		// TODO Complete UI
		// initialising UI Elements
		
		JFrame initialFrame = new JFrame("Proxima - The Dispatcher Companion");
		JPanel mainPanel = new JPanel();
		
		//initialising menubar Elements
		JMenuBar mainMenuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		JMenuItem exitOption= new JMenuItem("Exit");
		exitOption.setMnemonic('x');
		
		JMenu optionsMenu = new JMenu("Options");
		optionsMenu.setMnemonic('O');
		
		
		JMenu HelpMenu = new JMenu("Help");
		JMenuItem aboutOption = new JMenuItem("About", KeyEvent.VK_A);
		
		
		
		//Setting Up Menu Elements

		exitOption.setVisible(true);
		fileMenu.add(exitOption);
		fileMenu.setVisible(true);
		
		optionsMenu.setVisible(true);
		
		
		aboutOption.setVisible(true);
		HelpMenu.add(aboutOption);
		HelpMenu.setVisible(true);
		
		mainMenuBar.add(fileMenu);
		mainMenuBar.add(optionsMenu);
		mainMenuBar.add(HelpMenu);
		mainMenuBar.setVisible(true);
		
		//mainPanel.setSize(240,480);
		
		mainPanel.add(mainMenuBar);
		mainPanel.setBackground(Color.GRAY);
		mainPanel.setVisible(true);
		
		
		
		//Setting Up Frame
		initialFrame.add(mainPanel);
		initialFrame.setSize(720,480);
		initialFrame.setLocation(30, 50);
		initialFrame.setVisible(true);
		

		EventsController events = new EventsController();
		
		//events.errorMessage("Testing");
		
		//End of Setting Up UI
		
		//



	}

}
