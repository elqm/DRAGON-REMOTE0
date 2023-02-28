package com.greedy.inGame.easy;

import javax.swing.JFrame;

import com.greedy.inGame.easy.play1.easyGame6;


public class EasyMainFrameZorg extends JFrame {
	
	public EasyMainFrameZorg() {
        this.getContentPane().add(new easyGameZorg());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}
