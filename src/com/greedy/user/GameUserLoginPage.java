package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameUserLoginPage {

public void display3() {
		
		JFrame mf3 = new JFrame("진격의 DRAGON");
		
		mf3.setSize(1080, 1080);
		
//		mf3.setLocationRelativeTo(null);
//		mf3.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/회원가입창.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		
		JTextField id = new JTextField();
		id.setBounds(320, 610, 330, 60);
		
		
		JTextField pwd = new JTextField();
		pwd.setBounds(320, 690, 330, 60);
		
		JTextField name = new JTextField();
		name.setBounds(320, 770, 330, 60);
		
		JButton gohomebtn = new JButton();
		gohomebtn.setBounds(100, 950, 150, 60);
		gohomebtn.setContentAreaFilled(false);
		gohomebtn.setFocusPainted(false);
   	    gohomebtn.setBorderPainted(false);
		
		JButton userloginbtn = new JButton();
		userloginbtn.setBounds(490, 950, 150, 60);
		userloginbtn.setContentAreaFilled(false);
		userloginbtn.setFocusPainted(false);
		userloginbtn.setBorderPainted(false);
		
		JButton gamestartbtn = new JButton();
		gamestartbtn.setBounds(870, 950, 150, 60);
		gamestartbtn.setContentAreaFilled(false);
		gamestartbtn.setFocusPainted(false);
		gamestartbtn.setBorderPainted(false);
		
		JButton welcombtn = new JButton();
		welcombtn.setBounds(890, 750, 150, 80);
		welcombtn.setContentAreaFilled(false);
		welcombtn.setFocusPainted(false);
		welcombtn.setBorderPainted(false);
		

		gohomebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GameStartPage start = new GameStartPage();
				start.display();
				mf3.setVisible(false);
			}
		});
		
		gamestartbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		welcombtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				UserWelcomPage wp = new UserWelcomPage();
				wp.display5();
				
			}
		});
		
		
			
				
				
		
		
		
		
		
		
		
		
		
		mf3.add(panel);
		panel.add(label);
		panel.add(id);
		panel.add(pwd);
		panel.add(name);
		panel.add(gohomebtn);
		panel.add(userloginbtn);
		panel.add(gamestartbtn);
		panel.add(welcombtn);
		mf3.setVisible(true);
		mf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
