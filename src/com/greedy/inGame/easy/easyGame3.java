package com.greedy.inGame.easy;

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
import javax.swing.Timer;

import com.greedy.inGame.normal.GameOver;



public class easyGame3 extends JPanel implements ActionListener {
	private final int WIDTH = 1400;
	private final int HEIGHT = 875;
	private final int DELAY = 10;
	private Timer timer;
	private Image backgroundImage, characterImage, characteEffectImage, timeImage, lifeImage, goldImage, preferencesImage;
	private int characterX, characterY, lifeX, lifeY, goldX, goldY;
	private Image weaponImage1, weaponImage2, weaponImage3, weaponImage4, weaponImage5, weaponImage6, weaponImage7, weaponImage8;
	private Image[] weaponImageArr = { weaponImage1, weaponImage2, weaponImage3, weaponImage4, weaponImage5, weaponImage6, weaponImage7, weaponImage8};
	private int weaponX1, weaponX2, weaponX3, weaponX4, weaponX5, weaponX6, weaponX7, weaponX8;
	private int[] weaponXArr = {weaponX1, weaponX2, weaponX3, weaponX4, weaponX5, weaponX6, weaponX7, weaponX8};
	private int weaponY1, weaponY2, weaponY3, weaponY4, weaponY5, weaponY6, weaponY7, weaponY8;	
	private int[] weaponYArr = {weaponY1, weaponY2, weaponY3, weaponY4, weaponY5, weaponY6, weaponY7, weaponY8};
	private int lifeScore = 10;
	private int goldScore = 0;
	private int timeScore = 0;
	private int totalScore = 0;
	private JLabel lifeScoreLb, goldScoreLb, totalScoreLb;
	private JLabel lifeImageLB, goldImageLb, timeImageLb, normalImageLb, preferencesImageLb;
	private JLabel min, colon, sec;
	private int mm, ss, t=0;
	private int sTime, rTime, cTime;

	private static JFrame frame = new JFrame("진격의 DRAGON");
	private JPanel panel = new JPanel();
	
	private Font font = new Font("궁서체", Font.BOLD, 50);
	

	public easyGame3() {
//		setPreferredSize(new Dimension(WIDTH, HEIGHT)); 
//		setSize(WIDTH, HEIGHT);
		setBackground(Color.WHITE);
		setFocusable(true);
		addKeyListener(new MyKeyAdapter());
		lifeScoreLb = new JLabel("" + lifeScore);
		lifeScoreLb.setLocation(100, 800);
		lifeScoreLb.setFont(font);
		add(lifeScoreLb);
		goldScoreLb = new JLabel("" + goldScore);
		add(goldScoreLb);
		min = new JLabel("00"); 
		min.setBounds(1230, 8, 80, 80);
		min.setFont(font);
		min.setForeground(Color.WHITE);
		add(min);
		colon = new JLabel(" : ");
		colon.setBounds(1050, 8, 80, 80);
		colon.setFont(font);
		colon.setForeground(Color.WHITE);
		add(colon);
		sec = new JLabel("00");
		sec.setBounds(1100, 8, 80, 80);
		sec.setFont(font);
		sec.setForeground(Color.WHITE);
		add(sec);
		totalScoreLb = new JLabel("" + totalScore);
		add(totalScoreLb);
		loadImages();
		initGame();
		TimeThread();
	}

	private void loadImages() {
		backgroundImage = new ImageIcon("images/easyBackground1.png").getImage();
		characterImage = new ImageIcon("images/dragon1.png").getImage();
		for(int i = 0; i < weaponImageArr.length; i++) {
			weaponImageArr[i] = new ImageIcon("images/easyarrow.png").getImage();
		}
		characteEffectImage = new ImageIcon("images/dragon1Effect.png").getImage();
		timeImage = new ImageIcon("images/time.png").getImage();
		lifeImage = new ImageIcon("images/life.png").getImage();
		goldImage = new ImageIcon("images/gold.png").getImage();
		preferencesImage = new ImageIcon("images/preferences.png").getImage();
	}

	private void initGame() {
		characterX = WIDTH/2 - characterImage.getWidth(null)/2; // 캐릭터 시작 지점 x축 위치
		characterY = HEIGHT - characterImage.getHeight(null) - 200; // 캐릭터 시작 지점 y축 위치
		for(int i = 0; i < weaponImageArr.length; i++) {
			weaponXArr[i] = (int)(Math.random() * (WIDTH - weaponImageArr[i].getWidth(null))); // 화살 낙하 시작 지점 x축 위치
			weaponYArr[i] = weaponImageArr[i].getHeight(null) - 300; // 화살 낙하 시작 지점 y축 위치
		}
		lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null))); // 라이프 낙하 시작 지점 x축 위치
		lifeY = lifeImage.getHeight(null) - 300; // 라이프 낙하 시작 지점 y축 위치
		goldX = (int)(Math.random() * (WIDTH - goldImage.getWidth(null))); // 골드 낙하 시작 지점 x축 위치
		goldY = goldImage.getHeight(null) - 300; // 골드 낙하 시작 지점 y축 위치
		timer = new Timer(DELAY, this);
		timer.start();
	}

	/* 이미지 그리는 메소드(생성) */
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

	/* 캐릭터 화면 밖 탈출 방지 메소드 */
	private void moveCharacter() {
		if (characterX < 0) { // 캐릭터 화면 밖으로 이동 방지
			characterX = 0;
		}
		if (characterX > WIDTH - characterImage.getWidth(null)) { // 캐릭터 화면 밖으로 이동 방지
			characterX = WIDTH - characterImage.getWidth(null);
		}
		if (characterY < 0) { // 캐릭터 화면 밖으로 이동 방지
			characterY = 0;
		}
		if (characterY > HEIGHT - characterImage.getHeight(null)) { // 캐릭터 화면 밖으로 이동 방지
			characterY = HEIGHT - characterImage.getHeight(null);
		}
	}
	
	/* 화살 낙하 속도 및 랜덤 낙하 지점 설정 */
	private void moveWeapon() {
		for(int i = 0; i < weaponImageArr.length; i++) {
			if(weaponYArr[i] > 7) {
				weaponYArr[i] += 7; // 무기 속도 조절
			} else {
				weaponYArr[i] += (3 + i); // 무기 속도 조절
			}
			if (weaponYArr[i] > HEIGHT) {
				weaponYArr[i] = weaponImageArr[i].getHeight(null) - 300 - (i*5);
				weaponXArr[i] = (int)(Math.random() * (WIDTH - weaponImageArr[i].getWidth(null)));
			}
		}
	}

	private void moveLife() {
		lifeY += 4; // 무기 속도 조절
		if (lifeY > HEIGHT) {
			lifeY = lifeImage.getHeight(null) - 300;
			lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null)));
		}
	}

	private void moveGold() {
		goldY += 3; // 무기 속도 조절
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
				
				lifeScore -= 1;
				lifeScoreLb.setText("" + lifeScore);
				if (lifeScore == 0) {
					timer.stop();
					new GameOver();
				}
			}
		}
	}

	private void lifeCheckCollision() {
		Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
		Rectangle lifeRect = new Rectangle(lifeX, lifeY, lifeImage.getWidth(null), lifeImage.getHeight(null));
		if (characterRect.intersects(lifeRect)) {
			lifeX = (int)(Math.random() * (WIDTH - lifeImage.getWidth(null)));
			lifeY = lifeImage.getHeight(null) - 200;
			lifeScore++;
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
	
	/* 시간 표시 구현 및 스레드 */
	private void TimeThread(){

		sTime = (int)System.currentTimeMillis()/1000; // 시간 계산 공식. 스레드 시작/선언? 시간

		Thread th = new Thread() {

			@Override
			public void run() {

				while(true) {

					cTime = (int)System.currentTimeMillis()/1000; // 시간 계산 공식. 스레드 시작/동작? 시간
					rTime = cTime - sTime; // 동작 시간 - 시작 시간 = 스톱워치
					//							int mTime = rTime/100; // 밀리세컨드 시간 계산 공식. 우리는 초부터 계산하기 때문에 불필요함
					mm = (rTime / 60 % 60);	// 분 계산하는 공식. 60진법 사용. 1분은 60초이기 때문에 추가로 60을 나눠줌
					ss = (rTime % 60);	// 초 계산하는 공식. 60진법 사용
					timeScore = rTime;
					totalScore = timeScore + goldScore;
					totalScoreLb.setText("" + totalScore);
					
					try {
						Thread.sleep(10);

						min.setText(String.format("%02d", mm));
						sec.setText(String.format("%02d", ss));

						t++;

					} catch (InterruptedException e) {
						e.printStackTrace();
					}


				}


			}
		};
		th.start();

	}

	public static void main(String[] args) {
		easyGame3 game = new easyGame3();
		frame.add(game);
		frame.setBounds(300, 200, 1400, 875);
//		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}



