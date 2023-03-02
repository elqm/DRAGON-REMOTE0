package com.greedy.user;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameStartPage  {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	
	
	public void  display() {
		
		
		JFrame mf = new JFrame("진격의 DRAGON");
		mf.setLocation(400, 0);
		mf.setSize(1080, 1050);
		mf.setLocationRelativeTo(null);
//		mf.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/시작화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		
		
		JButton startbtn = new JButton();
		startbtn.setBounds(300, 775, 500, 60);
		startbtn.setContentAreaFilled(false);
		startbtn.setFocusPainted(false);
		startbtn.setBorderPainted(false);
		
		
		startbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

			GameLoginPage login = new GameLoginPage();
			login.display2();
			mf.setVisible(false);
				
			}
		});
		
		
		panel.add(label);
		mf.add(panel);
		
		panel.add(startbtn);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
