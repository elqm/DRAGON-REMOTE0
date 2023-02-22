package com.greedy.gameSupportPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gameSupport {

	public void display() {
	
		JFrame mf = new JFrame("진격의 DRAGON");
		
		JPanel panel = new JPanel();
		panel.setLayout(null); //안에 컴퍼넌트 자동 정렬되는 방식 그것을 null 값에 넣으면 없어짐.
		
		mf.setBounds(300, 200, 600, 450);
		
		
		Image image = new ImageIcon("images/gamesupport.PNG").getImage().getScaledInstance(600, 400, 100);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0,0, 600, 450);
		
		JButton button = new JButton("play");
		button.setFont(new Font(null, Font.PLAIN, 20)); // null 폰트 형식, plain 글꼴, 크기
		button.setBounds(370, 330 , 140, 60);
		button.setBackground(Color.RED);
		
		panel.add(label); 
		panel.add(button);
		
		
		
		mf.add(panel);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
