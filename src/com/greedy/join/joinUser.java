package com.greedy.join;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class  joinUser {

	public  void display() {
		
		
	JLabel BackGround = new  JLabel(new ImageIcon("images/1.PNG"));
	JButton jbutton = new JButton(new ImageIcon("images/go.PNG"));
	JFrame A = new JFrame();
	
	A.add(BackGround);
	
	
	A.setSize(800,600);
	A.setVisible(true);
	A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	A.setLayout(null);
	
	jbutton.setBounds(310,240,170,80);
	A.add(jbutton);
		}
	

	

}
