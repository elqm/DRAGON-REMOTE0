package com.greedy.user;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameStartPage  {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	
	
	public void  display() {
		
		
		JFrame mf = new JFrame("진격의 DRAGON");
		mf.setAlwaysOnTop(true);
		
		mf.setSize(1080, 1080);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		label = new JLabel(new ImageIcon("C:\\Users\\tjoeun\\Desktop\\로그인화면.png"));
		label.setLocation(0, 0);
		label.setSize(1080, 1050);
		
	
	
		
		panel.add(label);
		mf.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(481, 951, 155, 63);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(91, 951, 155, 63);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(860, 951, 155, 63);
		panel.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(91, 810, 507, 69);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 562, 507, 69);
		panel.add(textField_1);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
