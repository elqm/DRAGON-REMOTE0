
package com.greedy.character;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.userSetting.userSettingAll;

public class choiceCharacter {

	public void display() {

		JFrame mF = new JFrame();
		mF.setBounds(300, 200, 1200, 720);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		mF.setResizable(false);

		JButton button = new JButton(); 


		Image image = new ImageIcon("images/choiceCharacter.png").getImage().getScaledInstance(1100, 700, 0);

		JLabel label = new JLabel(new ImageIcon(image));

		JButton button1 = new JButton(new ImageIcon("images/choiceCharacterWant.png"));
		JButton button2 = new JButton(new ImageIcon("images/choiceCharacterWant2.png"));
		JButton button3 = new JButton(new ImageIcon("images/choiceCharacterWant3.png"));

		label.setBounds(10, 10, 1200, 700);
		button1.setBounds(133, 500, 260, 50);
		button2.setBounds(487, 500, 260, 50);
		button3.setBounds(840, 500, 260, 50);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceCharacter2 character2 = new choiceCharacter2();
				character2.display();
				mF.setVisible(false);
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userSettingAll user = new userSettingAll();
				user.setting();

				button3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

					}
				});
			}
		});


		panel.add(button1); 
		panel.add(button2);
		panel.add(button3);
		panel.add(label);



		mF.add(panel);

		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
