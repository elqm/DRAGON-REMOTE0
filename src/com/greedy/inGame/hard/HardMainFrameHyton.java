package com.greedy.inGame.hard;

import javax.swing.JFrame;


public class HardMainFrameHyton extends JFrame {
	
	public HardMainFrameHyton() {
        this.getContentPane().add(new HardGameHyton());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}
