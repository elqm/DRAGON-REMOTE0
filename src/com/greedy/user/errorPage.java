package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class errorPage {

	public void display10() {
		
		JFrame ef = new JFrame("진격의 DRAGON");
		ef.setLocation(600, 400);
		ef.setSize(700, 360);
		
		ImageIcon img = new ImageIcon("images/비밀번호확인.png");
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(690, 330);
		
		JButton ok2btn = new JButton();
		ok2btn.setBounds(250, 220, 200, 80);
		ok2btn.setContentAreaFilled(false);
		ok2btn.setFocusPainted(false);
		ok2btn.setBorderPainted(false);
		
		ok2btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ef.setVisible(false);
			}
		});
		
		ef.add(panel);
		panel.add(label);
		panel.add(ok2btn);
		ef.setVisible(true);
	}
}
