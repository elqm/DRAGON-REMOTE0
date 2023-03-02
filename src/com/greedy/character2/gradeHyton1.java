package com.greedy.character2;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.character.choiceHyton;
import com.greedy.inGame.easy.EasyDescriptionHyton;
import com.greedy.inGame.hard.HardDescriptionHyton;
import com.greedy.inGame.normal.NormalDescriptionHyton;

public class gradeHyton1 {
	
	
	public void gradeHyton() {


		JFrame mf7 = new JFrame("진격의 DRAGON");
		
		
		mf7.setLocation(400, 200);
		mf7.setSize(1100, 730);
		
		
		ImageIcon img = new ImageIcon("images/hyton난이도창.png");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1100, 700);
		
		JButton btn1 = new JButton();
		btn1.setBounds(90, 570, 270, 70);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton();
		btn2.setBounds(425, 570, 270, 70);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		
		JButton btn3 = new JButton();
		btn3.setBounds(760, 570, 270, 70);
		btn3.setContentAreaFilled(false);
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		
		JButton btn4 = new JButton();
		btn4.setBounds(20, 25, 80, 80);
		btn4.setContentAreaFilled(false);
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mf7.setVisible(false);
	        	new EasyDescriptionHyton();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 mf7.setVisible(false);
				  new NormalDescriptionHyton();
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mf7.setVisible(false);
				  new HardDescriptionHyton();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceHyton1 back = new choiceHyton1();
				back.Hyton();
				mf7.setVisible(false);
			}
		});
		
		mf7.add(panel);
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		mf7.setVisible(true);
		mf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
	}
	
	
	

