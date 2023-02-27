package com.greedy.userSetting;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.Clip;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;


import com.greedy.character.choiceCharacter;
import com.greedy.music.musicOn;


public class userSound {

	public void  Sound() {
	
		JFrame mF = new JFrame();
		mF.setBounds(820,450,401,300);
		
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/사운드설정.PNG").getImage();
		
		JLabel label = new JLabel(new ImageIcon(image));
		
		JButton button1 = new JButton(new ImageIcon("images/Frame 12.png"));
		JButton on = new JButton("켜기");
		JButton off = new JButton("끄기");
		
		
		
		on.setBounds(130,120,70,30);
		off.setBounds(220, 120, 70, 30);
		label.setBounds(-10, -70,400, 400);
		button1.setBounds(160,200,70, 30);
		panel2.setSize(1050,750);
		on.setContentAreaFilled(false);
		on.setFocusPainted(false);
		off.setContentAreaFilled(false);
		off.setFocusPainted(false);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			userSettingAll All = new userSettingAll();
		
			mF.setVisible(false);
			}
		});
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			choiceCharacter All = new choiceCharacter();
			
			mF.setVisible(false);
			}
		});

		on.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				        musicOn musicPlayer = new musicOn();
				        musicPlayer.musicOn();
				        
				       
				        while (true) {
				            try {
				                Thread.sleep(94000);
				                musicPlayer.musicOn();
				            } catch (InterruptedException e1) {
				                e1.printStackTrace();				                
				            }
				           
				        }
				         }
		});
		
			off.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				
			}
		});
		
		
		panel2.add(on);
		panel2.add(off);
		panel2.add(button1); 
		panel2.add(label);
		mF.add(panel2);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mF.setVisible(true);
		}


	}
	


