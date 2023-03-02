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
import com.greedy.character.gradeZorg;

public class choiceZorg1{
	
	
	public void Zorg() {

		JFrame mf5 = new JFrame("진격의 DRAGON");
		
		
		mf5.setLocation(400, 200);
		mf5.setSize(1100, 730);
		
		
		ImageIcon img = new ImageIcon("images/zorg선택창.png");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1100, 700);
		
		JButton btn1 = new JButton();
		btn1.setBounds(390, 500, 400, 60);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		JButton btn2 = new JButton();
		btn2.setBounds(390, 600, 400, 60);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gradeZorg1 Zorg = new gradeZorg1();
	        	Zorg.gradeZorg();
	        	mf5.setVisible(false);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceCharacter21 choice = new choiceCharacter21();
				choice.display();
				  mf5.setVisible(false);
			}
		});
		
		mf5.add(panel);
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		mf5.setVisible(true);
		mf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
	}
	
	
	

