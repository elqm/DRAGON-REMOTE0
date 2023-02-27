package com.greedy.userSetting;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class show {

	public void  show() {
	
		JFrame mF = new JFrame();		
		mF.setLocation(820, 450);
		mF.setSize(400,300);
		
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/show.PNG").getImage();
		
		JLabel label = new JLabel(new ImageIcon(image));
		
		JButton button1 = new JButton(new ImageIcon("images/Frame 12.png"));
		
		
		
		
	
	
		label.setLocation(-10, 0);
		label.setSize(400,270);
		button1.setBounds(160,220,70, 30);
		panel2.setSize(1050,750);
		
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			userSettingAll All = new userSettingAll();
			mF.setVisible(false);
			}
		});

		
		
		panel2.add(button1); 
		panel2.add(label);
		mF.add(panel2);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mF.setVisible(true);
		}


	}
	
