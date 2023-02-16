package com.greedy.user;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.design.RoundedButton;

public class StartPage extends JFrame implements Runnable {

	private ImageIcon bg = null;
	private ImageIcon dg1 = null;
	private ImageIcon dg2 = null;
	private ImageIcon dg3 = null;
	
	public void StartPage() {}
	
	@Override
	public void run() {

		try {
		JFrame mf = new JFrame();
		mf.setBounds(600, 100, 715, 835);
		mf.setLayout(null);
		bg = new ImageIcon("images/startpage.png");
		dg1 = new ImageIcon("images/dragon1.png");
		dg2 = new ImageIcon("images/dragon2.png");
		dg3 = new ImageIcon("images/dragon3.png");
		
		JPanel panel1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(bg.getImage(), 0, 0, 700, 800, null);
			}
		};
		panel1.setBounds(0, 0, 700, 800);
		
		JPanel panel2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(dg1.getImage(), 0, 0, 100, 120, null);
			}
		};
		panel2.setBounds(100, 430, 200, 200);
		
		JPanel panel3 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(dg2.getImage(), 0, 0, 100, 120, null);
			}
		};
		panel3.setBounds(300, 430, 200, 200);
		
		JPanel panel4 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(dg3.getImage(), 0, 0, 100, 120, null);
			}
		};
		panel4.setBounds(500, 430, 200, 200);
		
		RoundedButton rButton = new RoundedButton("GAME START");
		rButton.setBounds(150, 582, 400, 60);
		
		Font font = new Font("돋움", Font.BOLD, 30);
		
		rButton.setFont(font);
		mf.add(rButton);
		mf.add(panel4);
		mf.add(panel3);
		mf.add(panel2);
		mf.add(panel1);

		mf.setVisible(true);
		} catch (Exception e) {
		}
		
	}
	
	public static void main(String[] args) {

		Thread t = new Thread(new StartPage());
		t.start();
		
	}
	
	
	


}

