package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.greedy.character.choiceCharacter;

public class GameUserRegistPage {
	
	private static JTextField id = new JTextField();
	private static JTextField pwd = new JTextField();
	private static JTextField name = new JTextField();

public void display3() {
		
		RegistController registController = new RegistController();
	
		JFrame mf3 = new JFrame("진격의 DRAGON");
		mf3.setLocation(400, 0);
		mf3.setSize(1080, 1080);
		
//		mf3.setLocationRelativeTo(null);
//		mf3.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/회원가입창.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		
		id.setBounds(320, 610, 330, 60);
		
		pwd.setBounds(320, 690, 330, 60);
		
		name.setBounds(320, 770, 330, 60);
		
//		JLabel label2 = new JLabel();
//		label2.setText(id.getText());
//		JLabel label3 = new JLabel();
//		JLabel label4 = new JLabel();
		
		JButton gohomebtn = new JButton();
		gohomebtn.setBounds(100, 950, 150, 60);
//		gohomebtn.setContentAreaFilled(false);
//		gohomebtn.setFocusPainted(false);
//   	    gohomebtn.setBorderPainted(false);
		
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
				
						
			choiceCharacter cc = new choiceCharacter();
				cc.display();
			mf3.setVisible(false);
				
				
			}
		});
		
		welcombtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				registController.registNewMember(inputMember());
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

	private static Map<String, String> inputMember() {
	
	Map<String, String> parameter = new HashMap<>();
	parameter.put("id", id.getText());
	parameter.put("pwd", pwd.getText());
	parameter.put("name", name.getText());
	
	return parameter;
}

}
