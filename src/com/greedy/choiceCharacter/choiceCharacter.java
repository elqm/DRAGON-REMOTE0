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

	
	JLabel BackGround = new  JLabel(new ImageIcon("images/choiceCharacter.PNG"));
	JButton button1 = new JButton(new ImageIcon("images/choiceCharacterWant.PNG"));
	JButton button2 = new JButton(new ImageIcon("images/choiceCharacterWant2.PNG"));
	JButton button3 = new JButton(new ImageIcon("images/choiceCharacterWant3.PNG"));
	JFrame A = new JFrame();
	
	
	
	A.add(BackGround);
	A.setSize(1000,600);
	A.setVisible(true);
	A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	A.setLayout(null);
	
	button1.setBounds(350, 100, 250, 50);
	button2.setBounds(350, 200, 250, 50);
	button3.setBounds(350, 300, 250, 50);
	
	
	A.add(button1); 
	A.add(button2);
	A.add(button3);
	
	
	
	}
}
