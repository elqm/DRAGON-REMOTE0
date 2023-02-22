package com.greedy.userSetting;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class characterStroty{

	public void story() {



		JFrame mF = new JFrame();
		mF.setBounds(300, 200, 1280, 750);


		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);

		JButton button = new JButton(); 

		Image image = new ImageIcon("images/캐릭터스토리.png").getImage().getScaledInstance(1100, 700, 0);

		JLabel label = new JLabel(new ImageIcon(image));

		JButton button1 = new JButton(new ImageIcon("images/선택.PNG"));
		JButton button2 = new JButton(new ImageIcon("images/선택.PNG"));
		JButton button3 = new JButton(new ImageIcon("images/선택.PNG"));
		JButton button4 = new JButton(new ImageIcon("images/확인.png"));

		label.setBounds(10, 10, 1200, 700);
		button1.setBounds(230, 585, 100, 40);
		button2.setBounds(490, 585, 100, 40);
		button3.setBounds(760, 585, 100, 40);
		button4.setBounds(930, 580, 125, 50);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Glaun glaun = new Glaun();
				glaun.Glaun();
				mF.setVisible(false);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Zorg zorg = new Zorg();
				zorg.Zorg();
				mF.setVisible(false);
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Hyton hyton = new Hyton();
				hyton.Hyton();

				mF.setVisible(false);
			}
		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userSettingAll setting = new userSettingAll();
				setting.setting();

				mF.setVisible(false);
			}
		});

		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(label);

		mF.add(panel2);

		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}