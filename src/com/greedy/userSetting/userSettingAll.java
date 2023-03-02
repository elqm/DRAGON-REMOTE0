package com.greedy.userSetting;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.ranking.RankingPage;
public class userSettingAll{
		
		public void setting() {
			
		

		JFrame mF = new JFrame();
		mF.setBounds(500, 200, 1016, 750);
		mF.setLocationRelativeTo(null);
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/setting.PNG").getImage().getScaledInstance(1040, 750, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		
		JButton button1 = new JButton(new ImageIcon("images/playingAndStory.png"));
		JButton button2 = new JButton(new ImageIcon("images/settingSound.png"));
		JButton button3 = new JButton(new ImageIcon("images/count.png"));
		JButton button4 = new JButton(new ImageIcon("images/back.png"));
		
		label.setSize(1000, 750);
		button1.setBounds(330, 240, 360, 60);
		button2.setBounds(330, 400, 360, 60);
		button3.setBounds(330, 560, 360, 60);
		button4.setBounds(90, 40, 50, 50);
		panel2.setBounds(300,200,1050,750);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				characterStroty story = new characterStroty();
				story.story();
				mF.setVisible(false);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userSound sound = new userSound();
				sound.Sound();

			
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RankingPage rankingPage = new RankingPage();
				
				rankingPage.RankingPage();

				
			}
		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mF.setVisible(false);
			}
		});
		
		
		
		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(label);
		
		mF.add(panel2);
		
		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}