package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameLoginPage  {

	public void display2() {
		
		JFrame mf2 = new JFrame("진격의 DRAGON");
		
		mf2.setSize(1080, 1080);
		
		mf2.setLocationRelativeTo(null);
		mf2.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/로그인화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		
		JTextField id = new JTextField();
		id.setBounds(320, 610, 330, 60);
		
		
		JTextField pwd = new JTextField();
		pwd.setBounds(320, 690, 330, 60);
		
		JButton btn1 = new JButton();
		btn1.setBounds(100, 950, 150, 60);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton();
		btn2.setBounds(480, 950, 150, 60);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		
		JButton btn3 = new JButton();
		btn3.setBounds(870, 950, 150, 60);
		btn3.setContentAreaFilled(false);
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GameStartPage start = new GameStartPage();
				start.display();
				mf2.setVisible(false);
			}
		});
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				GameUserLoginPage userLogin = new GameUserLoginPage();
				userLogin.display3();
				mf2.setVisible(false);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		panel.add(label);
		mf2.add(panel);
		panel.add(id);
		panel.add(pwd);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		mf2.setVisible(true);
		mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
