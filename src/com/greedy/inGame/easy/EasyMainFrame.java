package com.greedy.inGame.easy;

import javax.swing.JFrame;


public class EasyMainFrame extends JFrame {
	
	public EasyMainFrame() {
		this.add(new easyGame3());
		this.setBounds(300, 200, 1400, 875);
		//		frame.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
