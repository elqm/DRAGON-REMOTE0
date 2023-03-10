package com.greedy.inGame.normal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import com.greedy.inGame.easy.GameOver;



public class NormalGameGlaun extends JPanel implements ActionListener {
	private String difficulty = "N";
	private final int WIDTH = 1400;
	private final int HEIGHT = 875;
	private final int DELAY = 10;
	private Timer timer;
	private Thread th;
	private Image backgroundImage, characterImage, characteEffectImage, lifeImage, goldImage;
	private int characterX, characterY, lifeX, lifeY, goldX, goldY;
	private Image weaponImage1, weaponImage2, weaponImage3, weaponImage4, weaponImage5, weaponImage6, weaponImage7, weaponImage8, weaponImage9;
	private Image[] weaponImageArr = { weaponImage1, weaponImage2, weaponImage3, weaponImage4, weaponImage5, weaponImage6, weaponImage7, weaponImage8, weaponImage9};
	private int weaponX1, weaponX2, weaponX3, weaponX4, weaponX5, weaponX6, weaponX7, weaponX8, weaponX9;
	private int[] weaponXArr = {weaponX1, weaponX2, weaponX3, weaponX4, weaponX5, weaponX6, weaponX7, weaponX8, weaponX9};
	private int weaponY1, weaponY2, weaponY3, weaponY4, weaponY5, weaponY6, weaponY7, weaponY8, weaponY9;	
	private int[] weaponYArr = {weaponY1, weaponY2, weaponY3, weaponY4, weaponY5, weaponY6, weaponY7, weaponY8, weaponY9};
	private int lifeScore = 10;
	private int goldScore = 0;
	private int timeScore = 0;
	private int totalScore = 0;
	private JLabel lifeScoreLb, goldScoreLb, totalScoreLb;
	private JLabel min, colon, sec;
	private int mm, ss, t=0;
	private int sTime, rTime, cTime;
    private boolean gameover;

	public NormalGameGlaun() {
		
        gameover = false;
		
		Font font = new Font("?????????", Font.BOLD, 50);

		Image easy = new ImageIcon("images/normalmode.png").getImage().getScaledInstance(213, 36, 0);
		Image life = new ImageIcon("images/life.png").getImage().getScaledInstance(50, 50, 0);
		Image gold = new ImageIcon("images/gold.png").getImage().getScaledInstance(60, 60, 0);
		Image time = new ImageIcon("images/time.png").getImage().getScaledInstance(60, 61, 0);
		Image total = new ImageIcon("images/total.png").getImage().getScaledInstance(60, 60, 0);		
//		Image preferences = new ImageIcon("images/preferences.png").getImage().getScaledInstance(67, 66, 0);

		JLabel easyImageLb = new JLabel();
		JLabel lifeImageLB = new JLabel();
		JLabel goldImageLb = new JLabel();
		JLabel timeImageLb = new JLabel();
		JLabel totalImageLb = new JLabel();
//		JLabel preferencesImageLb = new JLabel();
//		JButton preferencesBt = new JButton();

		setLayout(null);

		setPreferredSize(new Dimension(WIDTH, HEIGHT)); 
		setSize(WIDTH, HEIGHT);
		setBackground(Color.WHITE);
        setFocusable(true);
        requestFocus();
		addKeyListener(new MyKeyAdapter());

		easyImageLb.setIcon(new ImageIcon(easy));
		easyImageLb.setBounds(590, 20, 213, 36);
		add(easyImageLb);

		lifeImageLB.setIcon(new ImageIcon(life));
		lifeImageLB.setBounds(30, 20, 60, 60);
		add(lifeImageLB);
		lifeScoreLb = new JLabel("" + lifeScore);
		lifeScoreLb.setBounds(120, 23, 60, 60);
		lifeScoreLb.setFont(font);
		lifeScoreLb.setForeground(Color.WHITE);
		add(lifeScoreLb);

		goldImageLb.setIcon(new ImageIcon(gold));
		goldImageLb.setBounds(25, 85, 60, 60);
		add(goldImageLb);
		goldScoreLb = new JLabel("" + goldScore);
		goldScoreLb.setBounds(120, 58, 120, 120);
		goldScoreLb.setForeground(Color.WHITE);
		goldScoreLb.setFont(font);
		add(goldScoreLb);

		timeImageLb.setIcon(new ImageIcon(time));
		timeImageLb.setBounds(1120, 3, 80, 80);
		add(timeImageLb);
		min = new JLabel("00"); 
		min.setBounds(1210, 8, 80, 80);
		min.setFont(font);
		min.setForeground(Color.WHITE);
		add(min);
		colon = new JLabel(" : ");
		colon.setBounds(1240, 8, 80, 80);
		colon.setFont(font);
		colon.setForeground(Color.WHITE);
		add(colon);
		sec = new JLabel("00");
		sec.setBounds(1290, 8, 80, 80);
		sec.setFont(font);
		sec.setForeground(Color.WHITE);
		add(sec);

		totalImageLb.setIcon(new ImageIcon(total));
		totalImageLb.setBounds(1140, 68, 80, 80);
		add(totalImageLb);
		totalScoreLb = new JLabel("" + totalScore);
		totalScoreLb.setBounds(1240, 35, 160, 160);
		totalScoreLb.setForeground(Color.WHITE);
		totalScoreLb.setFont(font);
		add(totalScoreLb);

		//		preferencesImageLb.setIcon(new ImageIcon(preferences));
		//		preferencesImageLb.setBounds(1270, 730, 67, 66);
		//		add(preferencesImageLb);
		//		preferencesBt.setBorderPainted(false); 
		//		preferencesBt.setContentAreaFilled(false);
		//		preferencesBt.setFocusPainted(false);
		//		preferencesBt.setBounds(1270, 730, 67, 66);
		//		add(preferencesBt);
		//		preferencesBt.addActionListener(new ActionListener() {
		//
		//			@Override
		//			public void actionPerformed(ActionEvent e) {
		//				new userSettingAll().setting();
		//			}
		//		});

		loadImages();
		initGame();
		TimeThread();
	}

	private void loadImages() {
		backgroundImage = new ImageIcon("images/normalBg2.png").getImage();
		characterImage = new ImageIcon("images/glaun.png").getImage();
		for(int i = 0; i < weaponImageArr.length; i++) {
			weaponImageArr[i] = new ImageIcon("images/firearrow2.png").getImage();
		}
		characteEffectImage = new ImageIcon("images/dragon1Effect.png").getImage();
		lifeImage = new ImageIcon("images/life.png").getImage();
		goldImage = new ImageIcon("images/gold.png").getImage();
	}

	private void initGame() {
		characterX = WIDTH/2 - characterImage.getWidth(null)/2; // ????????? ?????? ?????? x??? ??????
		characterY = HEIGHT - characterImage.getHeight(null) - 90; // ????????? ?????? ?????? y??? ??????
		for(int i = 0; i < weaponImageArr.length; i++) {
			weaponXArr[i] = (int)(Math.random() * (WIDTH - weaponImageArr[i].getWidth(null))); // ?????? ?????? ?????? ?????? x??? ??????
			weaponYArr[i] = weaponImageArr[i].getHeight(null) - 300; // ?????? ?????? ?????? ?????? y??? ??????
		}
		lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null))); // ????????? ?????? ?????? ?????? x??? ??????
		lifeY = lifeImage.getHeight(null) - 300; // ????????? ?????? ?????? ?????? y??? ??????
		goldX = (int)(Math.random() * (WIDTH - goldImage.getWidth(null))); // ?????? ?????? ?????? ?????? x??? ??????
		goldY = goldImage.getHeight(null) - 300; // ?????? ?????? ?????? ?????? y??? ??????
		timer = new Timer(DELAY, this);
		timer.start();
	}

	/* ????????? ????????? ?????????(??????) */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, null);
		g.drawImage(characterImage, characterX, characterY, null);
		for(int i = 0; i < weaponImageArr.length; i++) {
			g.drawImage(weaponImageArr[i], weaponXArr[i], weaponYArr[i], null);
		}
		g.drawImage(lifeImage, lifeX, lifeY, null);
		g.drawImage(goldImage, goldX, goldY, null);
	}

	/* ????????? ?????? ??? ?????? ?????? ????????? */
	private void moveCharacter() {
		if (characterX < 0) { // ????????? ?????? ????????? ?????? ??????
			characterX = 0;
		}
		if (characterX > WIDTH - characterImage.getWidth(null) - 15) { // ????????? ?????? ????????? ?????? ??????
			characterX = WIDTH - characterImage.getWidth(null) - 15;
		}
		if (characterY < 0) { // ????????? ?????? ????????? ?????? ??????
			characterY = 0;
		}
		if (characterY > HEIGHT - characterImage.getHeight(null) - 30) { // ????????? ?????? ????????? ?????? ??????
			characterY = HEIGHT - characterImage.getHeight(null) - 30;
		}
	}

	/* ?????? ?????? ?????? ??? ?????? ?????? ?????? ?????? */
	private void moveWeapon() {
		for(int i = 0; i < weaponImageArr.length; i++) {
			if(weaponYArr[i] > 8) {
				weaponYArr[i] += 8; // ?????? ?????? ??????
			} else {
				weaponYArr[i] += (4 + i); // ?????? ?????? ??????
			}
			if (weaponYArr[i] > HEIGHT) {
				weaponYArr[i] = weaponImageArr[i].getHeight(null) - 300 - (i*5);
				weaponXArr[i] = (int)(Math.random() * (WIDTH - weaponImageArr[i].getWidth(null)));
			}
		}
	}

	private void moveLife() {
		lifeY += 4; // ????????? ?????? ??????
		if (lifeY > HEIGHT) {
			lifeY = lifeImage.getHeight(null) - 300;
			lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null)));
		}
	}

	private void moveGold() {
		goldY += 3; // ?????? ?????? ??????
		if (goldY > HEIGHT) {
			goldY = goldImage.getHeight(null) - 300;
			goldX = (int)(Math.random() * (WIDTH - goldImage.getWidth(null)));
		}
	}

	private void arrowCheckCollision() {
		for(int i = 0; i < weaponImageArr.length; i++ ) {
			Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
			Rectangle arrowRect = new Rectangle(weaponXArr[i], weaponYArr[i], weaponImageArr[i].getWidth(null), weaponImageArr[i].getHeight(null));
			if (characterRect.intersects(arrowRect)) {
				weaponXArr[i] = (int)(Math.random() * (WIDTH - weaponImageArr[i].getWidth(null)));
				weaponYArr[i] = weaponImageArr[i].getHeight(null);

				if (lifeScore <= 0) {
					lifeScore = 0;
		            gameover = true;
					timer.stop();
					th.interrupt();
		            JFrame endFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
		            endFrame.dispose();
					new GameOver();
				} else if(lifeScore == 1) {
					lifeScore -= 1;
		            gameover = true;
					timer.stop();
					th.interrupt();
		            JFrame endFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
		            endFrame.dispose();
					new GameOver();
				}  else {
					lifeScore -= 2;
					if (lifeScore <= 0) {
						lifeScore = 0;
			            gameover = true;
						timer.stop();
						th.interrupt();
			            JFrame endFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
			            endFrame.dispose();
						new GameOver();
					}
				} 
				lifeScoreLb.setText("" + lifeScore);
			}
		}
	}

	private void lifeCheckCollision() {
		Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
		Rectangle lifeRect = new Rectangle(lifeX, lifeY, lifeImage.getWidth(null), lifeImage.getHeight(null));
		if (characterRect.intersects(lifeRect)) {
			lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null)));
			lifeY = lifeImage.getHeight(null) - 200;
			if(lifeScore < 10) {
				lifeScore++;				
			} else {
				lifeScore = 10;
			}
			lifeScoreLb.setText("" + lifeScore);
		} 
	}

	private void goldCheckCollision() { 
		Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
		Rectangle goldRect = new Rectangle(goldX, goldY, goldImage.getWidth(null), goldImage.getHeight(null));
		if (characterRect.intersects(goldRect)) {
			goldX = (int)(Math.random() * (WIDTH - goldImage.getWidth(null)));
			goldY = goldImage.getHeight(null) - 200;
			goldScore += 10;
			goldScoreLb.setText("" + goldScore);
		} 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		moveCharacter();
		moveWeapon();
		moveLife();
		moveGold();
		arrowCheckCollision();
		lifeCheckCollision();
		goldCheckCollision();
		repaint();
	}

	private class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT) {
				characterX -= 15;
			}
			if (keyCode == KeyEvent.VK_RIGHT) {
				characterX += 15;
			}          
			if (keyCode == KeyEvent.VK_UP) {
				characterY -= 15;
			}
			if (keyCode == KeyEvent.VK_DOWN) {
				characterY += 15;
			}
		}
	}

	/* ?????? ?????? ?????? ??? ????????? */
	private void TimeThread(){

		sTime = (int)System.currentTimeMillis()/1000; // ?????? ?????? ??????. ????????? ??????/??????? ??????

		th = new Thread() {

			@Override
			public void run() {

				while(true) {

					cTime = (int)System.currentTimeMillis()/1000; // ?????? ?????? ??????. ????????? ??????/??????? ??????
					rTime = cTime - sTime; // ?????? ?????? - ?????? ?????? = ????????????
					//							int mTime = rTime/100; // ??????????????? ?????? ?????? ??????. ????????? ????????? ???????????? ????????? ????????????
					mm = (rTime / 60 % 60);	// ??? ???????????? ??????. 60?????? ??????. 1?????? 60????????? ????????? ????????? 60??? ?????????
					ss = (rTime % 60);	// ??? ???????????? ??????. 60?????? ??????
					timeScore = rTime;
					totalScore = timeScore + goldScore;

					try {
						Thread.sleep(100);

						min.setText(String.format("%02d", mm));
						sec.setText(String.format("%02d", ss));
						totalScoreLb.setText("" + totalScore);

						t++;


					} catch (InterruptedException e) {
						th.interrupt();
					}


				}


			}
		};
		th.start();

	}
	
}



