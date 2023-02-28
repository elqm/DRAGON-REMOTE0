package com.greedy.inGame.easy.spare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Description extends JFrame {

	private JFrame mf = new JFrame();

	public Description() { 

		this.mf = this;
		mf.setSize(1190, 770);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon desc = new ImageIcon("images/normalDesc3.png");

		JLabel descLb = new JLabel(desc);
		descLb.setSize(1178, 737);

		JButton playBt = new JButton();
		playBt.setBorderPainted(false); 
		playBt.setContentAreaFilled(false);
		playBt.setFocusPainted(false);
		playBt.setBounds(710, 530, 250, 100);

		playBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mf.dispose();
//				new EasyMainFrame();

			}
		});
		panel.add(playBt);
		panel.add(descLb);

		mf.add(panel);


		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}

