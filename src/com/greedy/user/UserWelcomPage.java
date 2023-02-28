package com.greedy.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserWelcomPage {

	public void display5() {
		
		JFrame mf4 = new JFrame();
		mf4.setSize(700, 360);
		
		mf4.setLocationRelativeTo(null);
//		mf4.setAutoRequestFocus(false);
		
		ImageIcon img2 = new ImageIcon("images/확인버튼팝업.png");
		
		JPanel panel2 = new JPanel();
		 
		panel2.setLayout(null);
		
		JLabel label2 = new JLabel(img2);
		label2.setLocation(0, 0);
		label2.setSize(690, 330);
		
		
		JButton okbtn = new JButton();
		okbtn.setBounds(250, 220, 200, 80);
		okbtn.setContentAreaFilled(false);
		okbtn.setFocusPainted(false);
		okbtn.setBorderPainted(false);
		
		
		/* 확인 버튼을 눌렀을 떄 확인버튼 팝업만 닫게 하는 기능 */
		okbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				GameUserLoginPage ul = new GameUserLoginPage();
//				ul.display3();
				mf4.setVisible(false);
			}
		});
		
		mf4.add(panel2);
		panel2.add(label2);
		panel2.add(okbtn);
		mf4.setVisible(true);
	}
}
