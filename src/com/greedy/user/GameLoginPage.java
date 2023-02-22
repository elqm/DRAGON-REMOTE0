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
		
//		mf2.setLocationRelativeTo(null);
//		mf2.setAutoRequestFocus(false);
		
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
		
		JButton gohomebtn = new JButton();
		gohomebtn.setBounds(100, 950, 150, 60);
		gohomebtn.setContentAreaFilled(false);
		gohomebtn.setFocusPainted(false);
		gohomebtn.setBorderPainted(false);
		
		JButton userloginbtn = new JButton();
		userloginbtn.setBounds(480, 950, 150, 60);
		userloginbtn.setContentAreaFilled(false);
		userloginbtn.setFocusPainted(false);
		userloginbtn.setBorderPainted(false);
		
		JButton gamestartbtn = new JButton();
		gamestartbtn.setBounds(870, 950, 150, 60);
		gamestartbtn.setContentAreaFilled(false);
		gamestartbtn.setFocusPainted(false);
		gamestartbtn.setBorderPainted(false);
		
		
		gohomebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GameStartPage start = new GameStartPage();
				start.display();
				mf2.setVisible(false);
			}
		});
		
		
		userloginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				GameUserLoginPage userLogin = new GameUserLoginPage();
				userLogin.display3();
				mf2.setVisible(false);
			}
		});
		
	
		
		panel.add(label);
		mf2.add(panel);
		panel.add(id);
		panel.add(pwd);
		panel.add(gohomebtn);
		panel.add(userloginbtn);
		panel.add(gamestartbtn);
		
		mf2.setVisible(true);
		mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
