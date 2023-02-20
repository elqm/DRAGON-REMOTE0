package com.greedy.user;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStartPage  {

	public void  display() {
		
		
		JFrame mf = new JFrame("진격의 DRAGON");
		
		mf.setSize(700, 600);
		
		mf.setLocationRelativeTo(null);
		mf.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/GameStartPage1.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(700, 570);
		
		JButton btn = new JButton();
		btn.setBounds(200, 420, 330, 38);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		
		panel.add(label);
		mf.add(panel);
		panel.add(btn);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
