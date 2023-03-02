
package com.greedy.character2;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.user.GameStartPage;
import com.greedy.userSetting.userSettingAll;

public class choiceCharacter1 {

	public void display() {

		JFrame mf1 = new JFrame("진격의 DRAGON");
		
		mf1.setLocation(400, 200);
		mf1.setSize(1100, 730);
		
		
		ImageIcon img = new ImageIcon("images/캐릭터설정창.png");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel(img);
		label.setLocation(0, 0);
		label.setSize(1100, 700);
		
		JButton btnG = new JButton();
		btnG.setBounds(440, 156, 220, 50);
		btnG.setContentAreaFilled(false);
		btnG.setFocusPainted(false);
		btnG.setBorderPainted(false);
		JButton btnZ = new JButton();
		btnZ.setBounds(440, 286, 220, 50);
		btnZ.setContentAreaFilled(false);
		btnZ.setFocusPainted(false);
		btnZ.setBorderPainted(false);
		JButton btnH = new JButton();
		btnH.setBounds(440, 416, 220, 50);
		btnH.setContentAreaFilled(false);
		btnH.setFocusPainted(false);
		btnH.setBorderPainted(false);
//		JButton btnBACK = new JButton();
//		btnBACK.setBounds(100, 300, 150, 50);
//		gohomebtn.setContentAreaFilled(false);
//		gohomebtn.setFocusPainted(false);
//		gohomebtn.setBorderPainted(false);		
		
		btnG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceCharacter21 c2 = new choiceCharacter21();
				c2.display();
				mf1.setVisible(false);
			}
		});
		
		btnZ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				userSettingAll user = new userSettingAll();
				user.setting();
			}
		});
		
		
		btnH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GameStartPage start = new GameStartPage();
				start.display();
				mf1.setVisible(false);
			}
		});
		
		mf1.add(panel);
		panel.add(label);
//		panel.add(btnBACK);
		panel.add(btnG);
		panel.add(btnZ);
		panel.add(btnH);
		mf1.setVisible(true);
		mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
