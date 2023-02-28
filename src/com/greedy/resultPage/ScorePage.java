package com.greedy.resultPage;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ScorePage {

//	easyGame3 easy = new easyGame3();
	
	public void display() {
		Font font = new Font("궁서체", Font.BOLD, 30);
		
		JFrame mf = new JFrame("진격의 DRAGON");
		mf.setLocation(600, 200);
		mf.setSize(600, 630);
		mf.setLocationRelativeTo(null);
//		mf.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/스코어화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(600, 600);
		
		JLabel label1 = new JLabel();
//		label1.setText("" + easy.displayScore());
		label1.setLocation(360, 181);
		label1.setSize(30, 30);
		label1.setFont(font);
		label1.setForeground(Color.WHITE);
		
		JButton btn = new JButton();
		btn.setBounds(255, 400, 100, 40);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		
//		JTextField 
		// 버튼 한 개 더 만들어서 ranking page로 가게 만들어 주기
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OpenYesOrNo yn = new OpenYesOrNo();
				yn.radio();
				
				
			}
		});
		
		panel.add(btn);
		panel.add(label1);
		panel.add(label);
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
