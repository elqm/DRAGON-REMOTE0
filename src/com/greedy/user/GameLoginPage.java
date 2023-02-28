package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.greedy.character.choiceCharacter;

public class GameLoginPage  {

	private static JTextField id = new JTextField();
	private static JTextField pwd = new JTextField();
	
	public void display2() {
		
		RegistController registController = new RegistController();
		
		JFrame mf2 = new JFrame("진격의 DRAGON");
		mf2.setLocation(400, 0);
		mf2.setSize(1080, 1080);
		
//		mf2.setLocationRelativeTo(null);
//		mf2.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/로그인화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		

		id.setBounds(320, 610, 330, 60);
		
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
			
				GameUserRegistPage userRegist = new GameUserRegistPage();
				userRegist.display3();
				mf2.setVisible(false);
			}
		});
		
		gamestartbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				registController.loginMember(inputMember());
//				choiceCharacter cc = new choiceCharacter();
//				cc.display();
//				mf2.setVisible(false);
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
	
	private static Map<String, String> inputMember() {
		
	Map<String, String> parameter = new HashMap<>();
	parameter.put("id", id.getText());
	parameter.put("pwd", pwd.getText());
	
	return parameter;
}
	
}
