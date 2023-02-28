package com.greedy.inGame.hard;

import javax.swing.JFrame;

import com.greedy.inGame.easy.play1.easyGame6;


public class HardMainFrameZorg extends JFrame {
	
	public HardMainFrameZorg() {
        this.getContentPane().add(new HardGameZorg());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
 