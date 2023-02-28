package com.greedy.inGame.normal;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NormalDescriptionZorg extends JFrame {

	private JFrame mf = new JFrame();

	public NormalDescriptionZorg() { 

		this.mf = this;
		mf.setSize(1400, 875);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		Image desc = new ImageIcon("images/normalDesc2.png").getImage().getScaledInstance(1390, 875, 0);;

		JLabel descLb = new JLabel();
		descLb.setIcon(new ImageIcon(desc));
		descLb.setSize(1400, 875);

		JButton playBt = new JButton();
		playBt.setBorderPainted(false); 
		playBt.setContentAreaFilled(false);
		playBt.setFocusPainted(false);
		playBt.setBounds(845, 630, 280, 100);

		playBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mf.dispose();
				new NormalMainFrameZorg();

			}
		});
		panel.add(playBt);
		panel.add(descLb);
 
		mf.add(panel);


		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}

