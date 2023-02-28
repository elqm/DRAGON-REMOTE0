package com.greedy.inGame.normal;

import javax.swing.JFrame;


public class NormalMainFrameZorg extends JFrame {
	
	public NormalMainFrameZorg() {
        this.getContentPane().add(new NormalGameZorg());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}
