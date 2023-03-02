package com.greedy.character2;



import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.character.choiceGlanun;
import com.greedy.inGame.easy.EasyDescriptionGlaun;
import com.greedy.inGame.hard.HardDescriptionGlaun;
import com.greedy.inGame.normal.NormalDescriptionGlaun;

public class gradeGlanun1 {
	
	
	public void gradeGlanun() {

		JFrame mf6 = new JFrame("진격의 DRAGON");
		
		
		mf6.setLocation(400, 200);
		mf6.setSize(1100, 730);
		
		
		ImageIcon img = new ImageIcon("images/glaun난이도창.png");
		
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
	        	new EasyDescriptionGlaun();
	        	mf6.setVisible(false);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new NormalDescriptionGlaun();
				mf6.setVisible(false);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		        new HardDescriptionGlaun();
		        mf6.setVisible(false);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceGlanun1 back = new choiceGlanun1();
				back.Glanun();
				mf6.setVisible(false);
			}
		});
		
		mf6.add(panel);
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		mf6.setVisible(true);
		mf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

		
		
	}
	
	
	



