package com.greedy.user;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameUserLoginPage {

public void display3() {
		
		JFrame mf = new JFrame("진격의 DRAGON");
		
		mf.setSize(700, 600);
		
		mf.setLocationRelativeTo(null);
		mf.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/GameUserLoginPage1.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(700, 570);
		
		JTextField id = new JTextField();
		id.setBounds(200, 330, 330, 38);
		
		
		JTextField pwd = new JTextField();
		pwd.setBounds(200, 375, 330, 38);
		
		JTextField name = new JTextField();
		name.setBounds(200, 420, 330, 38);
		
		JButton btn1 = new JButton();
		btn1.setBounds(60, 525, 100, 38);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
   	    btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton();
		btn2.setBounds(310, 525, 100, 38);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		
		JButton btn3 = new JButton();
		btn3.setBounds(560, 525, 100, 38);
		btn3.setContentAreaFilled(false);
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		
		JButton btn4 = new JButton();
		btn4.setBounds(580, 400, 88, 50);
		btn4.setContentAreaFilled(false);
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(false);
		
		
		panel.add(label);
		mf.add(panel);
		panel.add(id);
		panel.add(pwd);
		panel.add(name);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
