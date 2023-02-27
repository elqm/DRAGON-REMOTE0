package com.greedy.character;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceCharacter2{
		
		public void display() {
			
		

			JFrame mF = new JFrame();
		mF.setBounds(300, 200, 1280, 750);
		mF.setLocationRelativeTo(null);
		
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/cc.PNG").getImage().getScaledInstance(1100, 700, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		
		JButton button1 = new JButton(new ImageIcon("images/선택.png"));
		JButton button2 = new JButton(new ImageIcon("images/선택.png"));
		JButton button3 = new JButton(new ImageIcon("images/선택.png"));
		JButton button4 = new JButton(new ImageIcon("images/이전메뉴.png"));
		
		label.setBounds(10, 10, 1200, 700);
		button1.setBounds(230, 500, 100, 40);
		button2.setBounds(580, 500, 100, 40);
		button3.setBounds(920, 500, 100, 40);
		button4.setBounds(410, 600, 410, 60);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			choiceGlanun Glanun = new choiceGlanun();
			Glanun.Glanun();
			mF.setVisible(false);
			}
		});
		
		button2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
			choiceZorg zorg = new choiceZorg();
			zorg.Zorg();
			mF.setVisible(false);
			}
		});
	
		button3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		choiceHyton Hyton = new choiceHyton();
		Hyton.Hyton();
		mF.setVisible(false);
		}
	});
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			choiceCharacter choice = new choiceCharacter();
			choice.display();
			mF.setVisible(false);
			}
		});
		
		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(label);
		
		mF.add(panel2);
		
		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}