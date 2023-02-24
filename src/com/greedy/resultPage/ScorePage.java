package com.greedy.resultPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScorePage {

	public void display() {
		
		JFrame mf = new JFrame("진격의 DRAGON");
		mf.setLocation(600, 200);
		mf.setSize(600, 630);
		
//		
//		mf.setLocationRelativeTo(null);
//		mf.setAutoRequestFocus(false);
		
		ImageIcon img = new ImageIcon("images/스코어화면.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(600, 600);
		
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
		
		mf.add(panel);
		panel.add(label);
		panel.add(btn);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
