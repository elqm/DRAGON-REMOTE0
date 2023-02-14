package com.greedy;

import java.awt.BorderLayout;
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
	
	mF.setBounds(300, 200, 800, 500);
	
	Image image = new ImageIcon("images/choiceCharacter.PNG").getImage().getScaledInstance(500, 400, 0);
	
	JLabel label = new JLabel(new ImageIcon(image));
	JButton button1 = new JButton("캐릭터 선택");
	JButton button2 = new JButton("게임 설정");
	JButton button3 = new JButton("로그 아웃");
	
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	
	mF.add(label, BorderLayout.CENTER);
	mF.add(button1, BorderLayout.SOUTH);
	mF.add(button2, BorderLayout.WEST);
	mF.add(button3, BorderLayout.EAST);
	
	mF.setVisible(true);
	mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
