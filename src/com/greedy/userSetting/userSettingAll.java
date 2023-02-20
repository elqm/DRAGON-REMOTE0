package com.greedy.userSetting;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.character.choiceCharacter;

public class userSettingAll extends choiceCharacter {



	public void setting() {
		JFrame mF = new JFrame();
		mF.setBounds(800,280,320,300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		mF.setResizable(false);

		JButton button = new JButton(); 

		Image image = new ImageIcon("images/setting.png").getImage().getScaledInstance(300, 260, 0);

		JLabel label = new JLabel(new ImageIcon(image));

		JButton button1 = new JButton(new ImageIcon("images/playAndStrory.png"));
		JButton button2 = new JButton(new ImageIcon("images/settingSound.png"));
		JButton button3 = new JButton(new ImageIcon("images/count.png"));
		JButton button4 = new JButton(new ImageIcon("images/back.png"));

		label.setBounds(1, 20, 300, 240);
	    button1.setBounds(20, 500, 260, 50);
	    button2.setBounds(487, 500, 260, 50);
	    button3.setBounds(840, 500, 260, 50);
	  
	    panel.add(button1); 
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(label);

	  

	    mF.add(panel);

	    mF.setVisible(true);
	    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	}