package com.greedy.character;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choiceZorg{
	
	
	public void Zorg() {


		JFrame mF = new JFrame();
	    mF.setBounds(300, 200, 1280, 750);
		mF.setLocationRelativeTo(null);

	    JPanel panel = new JPanel();
	    panel.setLayout(null);
		mF.setResizable(false);
		
	    JButton button = new JButton(); 

		Image image = new ImageIcon("images/cz.PNG").getImage().getScaledInstance(1100, 700, 0);
		
	    JLabel label = new JLabel(new ImageIcon(image));

	    JButton button1 = new JButton(new ImageIcon("images/난이도선택.png"));
		JButton button2 = new JButton(new ImageIcon("images/캐릭터재선택.png"));
	

	    label.setBounds(10, 10, 1200, 700);
	    button1.setBounds(200, 600, 350, 50);
	    button2.setBounds(700, 600, 350, 50);
	   
	    button1.addActionListener(new ActionListener() {
	        @Override
	    	public void actionPerformed(ActionEvent e) {
	        	gradeZorg Zorg = new gradeZorg();
	        	Zorg.gradeZorg();
	        	mF.setVisible(false);
	        }
	    });
	    
	    button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceCharacter2 choice = new choiceCharacter2();
				choice.display();
				  mF.setVisible(false);
			}
		});
	


	    panel.add(button1); 
	    panel.add(button2);
	 
	    panel.add(label);

	    panel.setLayout(null);

	    mF.add(panel);

	    mF.setVisible(true);
	    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
	}
	
	
	

