package com.greedy.resultPage;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import com.greedy.ranking.RankingPage;

public class OpenYesOrNo {
	// 이미지 넣기 수정

	public void radio() {
		
		JFrame rf = new JFrame("공개여부 설정");
		rf.setLocation(790, 450);
		rf.setSize(240, 170);
		rf.setLocationRelativeTo(null);
		
		Image img = new ImageIcon("images//공개여부.png").getImage();
		JPanel panel = new JPanel();
//		panel.setLayout(null);
		//panel set size//
		JLabel imglabel = new JLabel(new ImageIcon(img));
		imglabel.setSize(240, 140);
		
//		imglabel.add(panel);
		panel.add(imglabel);
		rf.add(panel);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("점수 공개여부를 설정해주세요.");
		topPanel.add(label);
		rf.add(topPanel, BorderLayout.NORTH);
//		panel.add(topPanel); //
		
		JPanel openPanel = new JPanel();
		JRadioButton open = new JRadioButton("공개");
		JRadioButton notOpen = new JRadioButton("비공개");
		
		ButtonGroup size = new ButtonGroup();
		size.add(open);
		size.add(notOpen);
		
		openPanel.add(open);
		openPanel.add(notOpen);
		
		
		rf.add(openPanel, BorderLayout.CENTER);
//		panel.add(openPanel);//
		
		JButton btn = new JButton();
//		btn.setSize(60, 30);
		JLabel oklabel = new JLabel("-------------------확인-------------------");
		
//		oklabel.setSize(60, 30);
		btn.add(oklabel);
		
		rf.add(btn, BorderLayout.SOUTH);
//		panel.add(btn);
		
		
	
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				rf.dispose();
				new RankingPage().RankingPage();
				
			}
		});
		
		rf.setVisible(true);
		rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}