package com.greedy.character;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceCharacter {
	
	public void display() {

		JFrame mF = new JFrame();
	
	    mF.setBounds(300, 200, 1280, 750);

	    JPanel panel = new JPanel();
 
	    JButton button = new JButton(); 

	    Image image = new ImageIcon("images/choiceCharacter.png").getImage().getScaledInstance(600, 400, 0);

	    JLabel label = new JLabel(new ImageIcon(image));

	    JButton button1 = new JButton("캐릭터 선택");
	    JButton button2 = new JButton("게임 설정");
	    JButton button3 = new JButton("로그 아웃");

	    label.setBounds(10, 10, 1200, 00);
	    button1.setBounds(200, 100, 150, 50);
	    button2.setBounds(200, 200, 150, 50);
	    button3.setBounds(200, 300, 150, 50);
	 
	    button1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            choiceCharacter2 character2 = new choiceCharacter2( );
	            character2.display();
	            mF.setVisible(false);
	        }
	    });
	    button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  mF.setVisible(false);
			}
		});
	    button2.addActionListener(new ActionListener() {
			
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				  mF.setVisible(false);
	 			}
	 		});


	    panel.add(button1); 
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(label);

	    panel.setLayout(null);

	    mF.add(panel);

	    mF.setVisible(true);
	    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	}
	

