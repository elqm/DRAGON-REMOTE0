package com.greedy.inGame.normal;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.design.PlayButton;
import com.greedy.design.RoundedButton;
import com.greedy.inGame.option.Time;

public class Description extends JFrame {

	private JFrame mf = new JFrame();

	public Description() { 

		this.mf = this;
		mf.setSize(1190, 770);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon desc = new ImageIcon("images/normalDesc3.png");

		JLabel descLb = new JLabel(desc);
		descLb.setSize(1178, 737);

		JButton playBt = new JButton();
		playBt.setBorderPainted(false); 
		playBt.setContentAreaFilled(false);
		playBt.setFocusPainted(false);
		playBt.setBounds(710, 530, 250, 100);

		playBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mf.dispose();
				new GamePage();

			}
		});
		panel.add(playBt);
		panel.add(descLb);

		mf.add(panel);


import com.greedy.design.RoundedButton;

public class Description extends JFrame {
	
	private JFrame mf = new JFrame();
	
	public Description() {
		
		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
		
		
		this.mf = this;
		mf.setSize(1280, 720);
		mf.setLocationRelativeTo(null);
//		mf.setResizable(false);
		
		mf.setTitle("진격의 DRAGON");
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("images/NormalDesc.png");
		
		JLabel label1 = new JLabel(icon1);
		label1.setSize(1500, 600);
		
		label1.setLayout(null);
		

		
		RoundedButton button = new RoundedButton("GAME START");
		
		button.setFont(labelFont);
		button.setSize(400, 50);
		button.setLocation(155, 550);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

//	            mf.dispose();
//	            new Application();
				
			}
		});
		panel1.add(button);
		panel1.add(label1);
		
		mf.add(panel1);
	
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

=======
	
}