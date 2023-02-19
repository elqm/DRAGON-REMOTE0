package com.greedy.character;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceGlanun extends choiceCharacter2{
	
	
	public void Glanun() {


		JFrame mF = new JFrame();
	    mF.setBounds(300, 200, 1280, 750);

	    JPanel panel = new JPanel();
	    panel.setLayout(null);
		mF.setResizable(false);
		
	    JButton button = new JButton(); 

		Image image = new ImageIcon("images/cc.PNG").getImage().getScaledInstance(1100, 700, 0);
		
	    JLabel label = new JLabel(new ImageIcon(image));

	    JButton button1 = new JButton("난이도 선택");
	    JButton button2 = new JButton("캐릭터 재선택");
	 

	    label.setBounds(10, 10, 1200, 00);
	    button1.setBounds(200, 100, 150, 50);
	    button2.setBounds(200, 200, 150, 50);
	   
//	    button1.addActionListener(new ActionListener() {
//	        @Override
//	       
//	        }
//	    });
//	    button2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				  mF.setVisible(false);
//			}
//		});
	


	    panel.add(button1); 
	    panel.add(button2);
	 
	    panel.add(label);

	    panel.setLayout(null);

	    mF.add(panel);

	    mF.setVisible(true);
	    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
	}
	
	
	

