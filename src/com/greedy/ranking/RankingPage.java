package com.greedy.ranking;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.inGame.easy.EasyMainFrameGlaun;
import com.greedy.user.GameStartPage;
import com.greedy.userSetting.userSettingAll;


public class RankingPage {
	private JButton button1 = new JButton();

	public void  RankingPage() {
	
		RankingController rankingController = new RankingController();
		
		Font font = new Font("궁서체", Font.BOLD, 25);
		
		JFrame mF = new JFrame("진격의 DRAGON");	
		mF.setSize(705,635);
		mF.setLocationRelativeTo(null);
		mF.setResizable(false);
		
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(null);
		
		JButton button = new JButton(); 
		
		Image image = new ImageIcon("images/GameRankingPage2.png").getImage();
		
		JLabel label = new JLabel(new ImageIcon(image));

		JLabel Rank1 = new JLabel();
		JLabel Rank2 = new JLabel();
		JLabel Rank3 = new JLabel();
		JLabel Rank4 = new JLabel();
		JLabel Rank5 = new JLabel();
		
	
		List<RankingDTO> text1 = rankingController.selectFirstRank();
		Rank1.setText("" + text1);
		List<RankingDTO> text2 = rankingController.selectSecondRank();
		Rank2.setText("" + text2);
		List<RankingDTO> text3 = rankingController.selectThirdRank();
		Rank3.setText("" + text3);
		List<RankingDTO> text4 = rankingController.selectFourthRank();
		Rank4.setText("" + text4);
		List<RankingDTO> text5 = rankingController.selectFifthRank();
		Rank5.setText("" + text5);
		
		
		label.setLocation(-10, 0);
		label.setSize(700,600);
		
		Rank1.setLocation(250, -125);
		Rank1.setSize(900,600);
		Rank1.setFont(font);
		Rank1.setForeground(Color.YELLOW);
		
		Rank2.setLocation(250, -50);
		Rank2.setSize(900,600);
		Rank2.setFont(font);
		Rank2.setForeground(Color.WHITE);
		
		Rank3.setLocation(250, 7);
		Rank3.setSize(900,600);
		Rank3.setFont(font);
		Rank3.setForeground(Color.ORANGE);
		
		Rank4.setLocation(250, 58);
		Rank4.setSize(900,600);
		Rank4.setFont(font);
		Rank4.setForeground(new Color(153, 255, 153));
		
		Rank5.setLocation(250, 103);
		Rank5.setSize(900,600);
		Rank5.setFont(font);
		Rank5.setForeground(new Color(102, 204, 255));
		
		button1.setBounds(260, 510, 160, 60);
		button1.setBorderPainted(false); 
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		
		panel2.setSize(1050,750);
		
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			mF.setVisible(false);
			new GameStartPage().display();
			}
		});

		
		
		panel2.add(button1); 
		panel2.add(Rank1);
		panel2.add(Rank2);
		panel2.add(Rank3);
		panel2.add(Rank4);
		panel2.add(Rank5);
		panel2.add(label);
		mF.add(panel2);
		mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mF.setVisible(true);
		}


	}
	


