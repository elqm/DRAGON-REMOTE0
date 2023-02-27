package com.greedy.inGame.easy.spare;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class display1 {

	private int x, y;
    private Timer timer;
    
	public void displayInfo() {
		
		JFrame mF = new JFrame();
		
		mF.setBounds(300, 200, 1000, 700);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		Image image = new ImageIcon("images/easyGameInfo.png").getImage().getScaledInstance(800, 550, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		
//		JButton button1 = new JButton("게임 시작");
		JButton button1 = new JButton(new ImageIcon("images/playButton.png"));
		button1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
//	        mF.setVisible(false);
	        mF.remove(panel);
	        mF.add(new TestMoveCharacter());
	        mF.repaint();
	        mF.revalidate();
	        mF.setSize(1400, 800);
	        }
	    });
		
		label.setBounds(10, 10, 900, 600);
		button1.setBounds(580, 480, 140, 35);
		
		panel.add(button1);
		panel.add(label);
		
		mF.add(panel);
		
		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}







