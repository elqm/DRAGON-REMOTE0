package com.greedy.resultPage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RankingPage {

	public void display2() {
		
		JFrame mf2 = new JFrame("진격의 DRAGON");
		mf2.setLocation(600, 200);
		mf2.setSize(600, 630);
		
		
		mf2.setLocationRelativeTo(null);
		mf2.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/랭킹화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(600, 600);
		
		JButton btn = new JButton();
		btn.setBounds(220, 515, 95, 30);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		
		
		mf2.add(panel);
		panel.add(label);
		panel.add(btn);
		
		mf2.setVisible(true);
		mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
