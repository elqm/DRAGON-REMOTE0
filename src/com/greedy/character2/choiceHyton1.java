package com.greedy.character2;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.character.choiceCharacter2;
import com.greedy.character.gradeHyton;

public class choiceHyton1{
	
	
	public void Hyton() {

		JFrame mf4 = new JFrame("진격의 DRAGON");
		
		
		mf4.setLocation(400, 200);
		mf4.setSize(1100, 730);
		
		
		ImageIcon img = new ImageIcon("images/hyton선택창.png");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1100, 700);
		
		JButton btn1 = new JButton();
		btn1.setBounds(385, 505, 400, 60);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton();
		btn2.setBounds(385, 603, 400, 60);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gradeHyton1 Hyton = new gradeHyton1();
	        	Hyton.gradeHyton();
	        	mf4.setVisible(false);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceCharacter21 choice = new choiceCharacter21();
				choice.display();
				  mf4.setVisible(false);
			}
		});
		
		mf4.add(panel);
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		mf4.setVisible(true);
		mf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
}
	
	
	

