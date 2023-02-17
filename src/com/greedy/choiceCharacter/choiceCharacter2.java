package com.greedy.choiceCharacter;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceCharacter2 {
		
		public void display() {
			
		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);

		JFrame mF = new JFrame();
		mF.setBounds(300, 200, 1280, 750);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		mF.setResizable(false);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/choiceCharacter2.PNG").getImage().getScaledInstance(1100, 700, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		
		JButton button1 = new JButton("선택");
		
		JButton button2 = new JButton("선택");
		JButton button3 = new JButton("선택");
		JButton button4 = new JButton("이전 메뉴");
		
		label.setBounds(10, 10, 1200, 700);
		button1.setBounds(100, 300, 60, 30);
		button2.setBounds(300, 300, 60, 30);
		button3.setBounds(500, 300, 60, 30);
		button4.setBounds(550, 600, 150, 60);
		
		panel.add(button1); 
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		
		mF.add(panel);
		
		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
