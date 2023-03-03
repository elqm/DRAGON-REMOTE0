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
import com.greedy.character.choiceHyton;
import com.greedy.character.choiceZorg;

public class choiceCharacter21{
		
		public void display() {
			
		
			JFrame mf2 = new JFrame("진격의 DRAGON");
			
			
			mf2.setLocation(400, 200);
			mf2.setSize(1100, 730);
			
			
			ImageIcon img = new ImageIcon("images/캐릭터선택창.png");
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			JLabel label = new JLabel(img);
			label.setLocation(0, 0);
			label.setSize(1100, 700);
			
			JButton btn1 = new JButton();
			btn1.setBounds(150, 480, 120, 60);
			btn1.setContentAreaFilled(false);
			btn1.setFocusPainted(false);
			btn1.setBorderPainted(false);
			JButton btn2 = new JButton();
			btn2.setBounds(500, 490, 120, 60);
			btn2.setContentAreaFilled(false);
			btn2.setFocusPainted(false);
			btn2.setBorderPainted(false);
			JButton btn3 = new JButton();
			btn3.setBounds(870, 490, 120, 60);
			btn3.setContentAreaFilled(false);
			btn3.setFocusPainted(false);
			btn3.setBorderPainted(false);
			JButton btnback = new JButton();
			btnback.setBounds(390, 570, 400, 80);
			btnback.setContentAreaFilled(false);
			btnback.setFocusPainted(false);
			btnback.setBorderPainted(false);
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					choiceGlanun1 Glanun = new choiceGlanun1();
					Glanun.Glanun();
					mf2.setVisible(false);
				}
			});
			
			btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					choiceZorg1 zorg = new choiceZorg1();
					zorg.Zorg();
					mf2.setVisible(false);
				}
			});
			
			btn3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					choiceHyton1 Hyton = new choiceHyton1();
					Hyton.Hyton();
					mf2.setVisible(false);
				}
			});
			
			btnback.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					choiceCharacter1 cc = new choiceCharacter1();
					cc.display();
					mf2.setVisible(false);
				}
			});
			
			mf2.add(panel);
			panel.add(label);
			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			panel.add(btnback);
			mf2.setVisible(true);
			mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}