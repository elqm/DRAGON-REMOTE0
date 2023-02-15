package com.greedy.choiceCharacter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceCharacter {
	
	public void display() {

	JFrame mF = new JFrame();
	
	JPanel panel = new JPanel();
	panel.setLayout(null);
	
	mF.setBounds(300, 200, 600, 450);
	
	Image image = new ImageIcon("images/choiceCharacter.PNG").getImage().getScaledInstance(600, 400, 0);
	
	JLabel label = new JLabel(new ImageIcon(image));
	
	JButton button1 = new JButton("캐릭터 선택");
	JButton button2 = new JButton("게임 설정");
	JButton button3 = new JButton("로그 아웃");
	
	label.setBounds(10, 10, 500, 400);
	button1.setBounds(200, 100, 150, 50);
	button2.setBounds(200, 200, 150, 50);
	button3.setBounds(200, 300, 150, 50);
	
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	
	mF.add(panel);
	
	mF.setVisible(true);
	mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
