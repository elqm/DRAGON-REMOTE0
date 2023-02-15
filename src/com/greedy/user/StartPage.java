package com.greedy.user;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage {

	public StartPage() {
		
		JFrame mf = new JFrame();
		
		mf.setBounds(400, 10, 700, 800);
		
		mf.setTitle("진격의 DRAGON");
		
		JPanel panel = new JPanel();
		
		Image icon1 = new ImageIcon("images/startpage.png").getImage().getScaledInstance(700, 800, 0);
//		Image icon2 = new ImageIcon("images/dragon1.png").getImage().getScaledInstance(100, 100, 0);
//		Image icon3 = new ImageIcon("images/dragon2.png").getImage().getScaledInstance(100, 100, 0);
//		Image icon4 = new ImageIcon("images/dragon3.png").getImage().getScaledInstance(100, 100, 0);
		
		JLabel label1 = new JLabel(new ImageIcon(icon1));
//		JLabel label2 = new JLabel(new ImageIcon(icon2));
//		JLabel label3 = new JLabel(new ImageIcon(icon3));
//		JLabel label4 = new JLabel(new ImageIcon(icon4));
		
		panel.add(label1);
		
		JButton button = new JButton("GAME START");

		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				
			}
		});
		
		
		mf.add(label1, BorderLayout.CENTER);

		
		try {
			mf.setIconImage(ImageIO.read(new File("images/dragon1.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mf.setLayout(null);
		
		button.setBounds(160, 563, 380, 50);
		mf.add(button);
	}
	
}
