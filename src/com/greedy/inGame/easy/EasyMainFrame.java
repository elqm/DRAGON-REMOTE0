package com.greedy.inGame.easy;

import javax.swing.JFrame;

import com.greedy.inGame.easy.play1.easyGame6;


public class EasyMainFrame extends JFrame {
	
	public EasyMainFrame() {
        this.getContentPane().add(new easyGame3());
		this.setBounds(300, 200, 1400, 875);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
