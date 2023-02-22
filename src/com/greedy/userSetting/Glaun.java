package com.greedy.userSetting;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Glaun{

	public void Glaun() {



		JFrame mF = new JFrame();
		mF.setBounds(300, 200, 1280, 750);


		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		mF.setResizable(false);

		JButton button = new JButton(); 

		Image image = new ImageIcon("images/g스토리.png").getImage().getScaledInstance(1100, 700, 0);

		JLabel label = new JLabel(new ImageIcon(image));

		JButton button1 = new JButton(new ImageIcon("images/확인.png"));

		label.setBounds(10, 10, 1200, 700);
		button1.setBounds(930, 580, 125, 50);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				characterStroty story = new characterStroty();
				story.story();

				mF.setVisible(false);
			}
		});


		panel2.add(button1); 

		panel2.add(label);

		mF.add(panel2);

		mF.setVisible(true);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}