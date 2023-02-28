package com.greedy.inGame.easy;

import javax.swing.JFrame;


public class EasyMainFrameHyton extends JFrame {
	
	public EasyMainFrameHyton() {
        this.getContentPane().add(new easyGameHyton());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}
