package com.greedy.inGame.normal;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePage extends JFrame{
	
	private JFrame mf = new JFrame();
	private JPanel panel = new JPanel();

	private Font font = new Font("궁서체", Font.BOLD, 50);
	
	
	public int xpos = 510;
	public int ypos = 590;
	
	private JLabel min, colon, sec;
	private int mm, ss, t=0;
	


	public GamePage() {

		this.mf = this;
		mf.setSize(1190, 770);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");


		panel.setLayout(null);

		ImageIcon bg = new ImageIcon("images/normalBg.png");
		Image glaun = new ImageIcon("images/glaunCha.png").getImage().getScaledInstance(122, 118, 0);
		Image normal = new ImageIcon("images/normal.png").getImage().getScaledInstance(213, 37, 0);
		Image time = new ImageIcon("images/time.png").getImage().getScaledInstance(60, 61, 0);
		Image life = new ImageIcon("images/life.png").getImage().getScaledInstance(50, 50, 0);
		Image gold = new ImageIcon("images/gold.png").getImage().getScaledInstance(60, 60, 0);
		Image preferences = new ImageIcon("images/preferences.png").getImage().getScaledInstance(67, 66, 0);

		JLabel bgLb = new JLabel(bg);
		bgLb.setSize(1178, 737);

		JLabel glaunLb = new JLabel();
		glaunLb.setIcon(new ImageIcon(glaun));
		glaunLb.setBounds(xpos, ypos, 122, 118);

		JLabel normalLb = new JLabel();
		normalLb.setIcon(new ImageIcon(normal));
		normalLb.setBounds(460, 10, 213, 37);

		JLabel lifeLb = new JLabel();
		lifeLb.setIcon(new ImageIcon(life));
		lifeLb.setBounds(20, 20, 50, 50);

		JLabel timeLb = new JLabel();
		timeLb.setIcon(new ImageIcon(time));
		timeLb.setBounds(950, 10, 60, 61);

		JLabel goldLb = new JLabel();
		goldLb.setIcon(new ImageIcon(gold));
		goldLb.setBounds(950, 80, 60, 60);

		JLabel preferencesLb = new JLabel();
		preferencesLb.setIcon(new ImageIcon(preferences));
		preferencesLb.setBounds(1050, 620, 67, 66);

		JButton preferencesBt = new JButton();
		preferencesBt.setBorderPainted(false); 
		preferencesBt.setContentAreaFilled(false);
		preferencesBt.setFocusPainted(false);
		preferencesBt.setBounds(1050, 620, 67, 66);

		preferencesBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mf.dispose();
				new GameOver();
			}
		});

//		this.ArrowThread();
//		this.LifeThread();
		this.GoldThread();
		this.TimeThread();
		min = new JLabel("00"); 
		min.setBounds(1030, 8, 80, 80);
		min.setFont(font);
		min.setForeground(Color.WHITE);
		colon = new JLabel(" : ");
		colon.setBounds(1050, 8, 80, 80);
		colon.setFont(font);
		colon.setForeground(Color.WHITE);
		sec = new JLabel("00");
		sec.setBounds(1100, 8, 80, 80);
		sec.setFont(font);
		sec.setForeground(Color.WHITE);
		panel.add(min);
		panel.add(colon);
		panel.add(sec);
		panel.add(preferencesBt);
		panel.add(glaunLb);
		panel.add(normalLb);
		panel.add(lifeLb);
		panel.add(timeLb);
		panel.add(goldLb);
		panel.add(preferencesLb); 
		panel.add(bgLb);

		mf.add(panel);

		mf.setVisible(true); 
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		/* 캐릭터 움직임 구현 */
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP :
					if(ypos > 0) {
						glaunLb.setLocation(glaunLb.getX(), glaunLb.getY()-20);							
						ypos-=20;
					}
					break;
				case KeyEvent.VK_DOWN :
					if(ypos < 620) {
						glaunLb.setLocation(glaunLb.getX(), glaunLb.getY()+20);						
						ypos+=20;
					}
					break;
				case KeyEvent.VK_LEFT :
					if(xpos > 0) {
						glaunLb.setLocation(glaunLb.getX()-20, glaunLb.getY());							
						xpos-=20;
					}
					repaint();
					break;
				case KeyEvent.VK_RIGHT :
					if(xpos < 1050) {
						glaunLb.setLocation(glaunLb.getX()+20, glaunLb.getY());							
						xpos+=20;
					}
					break;
				}
			}

		});

		this.requestFocus();
		setFocusable(true);


	}

	
	/* 화살 구현 및 낙하 스레드 */
	class Arrow extends JLabel{
		
		public int arrowTiming;
		public int arrowBkTiming;

		Image fireArrow = new ImageIcon("images/firearrow.png").getImage().getScaledInstance(60, 60, 0);

		//눈 속도조절
		public Arrow(){
			this.arrowTiming = ((int)(Math.random()*400000) + 400000);
			this.arrowBkTiming = arrowTiming;
			this.setSize(60, 60);
			this.setLocation((int)(Math.random()*1130),(int)(Math.random()*-300));
			this.setIcon(new ImageIcon(fireArrow));
		}

	}
	
	private Arrow[] arrows = new Arrow[]{
			new Arrow(), new Arrow(), new Arrow(), new Arrow(), new Arrow(), new Arrow(), new Arrow(), new Arrow()
	};


	private void ArrowThread(){

		for(Arrow tmp: arrows){
			this.add(tmp);
		}
		//쓰레드를 활용하여 눈 내리는 동작
		Thread th = new Thread(){
			public void run(){
				int i =0;
				while(true){
					for(Arrow tmp: arrows){
						if(tmp.arrowTiming-- == 0){
							tmp.setLocation(tmp.getX(),tmp.getY()+2);
							if(tmp.getY() > 700){
								tmp.setLocation((int)(Math.random()*1130),0);
							}
							else if(tmp.getY() == 700){   //점수계산
								i++;
								System.out.println(i);  //점수계산  노출


							}
							
								// 만약 주체와 눈의 좌표값이 일치하면 게임종료
//						       if(glaunLb.getLocation().equals(tmp.getLocation())){
//						        System.out.println("게임종료");
//						        System.exit(0);
//						       }

							tmp.arrowTiming = tmp.arrowBkTiming;
						}
					}
				}
			}
		}; th.start();
	}
	
	
	/* 라이프 구현 및 낙하 스레드 */
	class Life extends JLabel{
		
		public int lifeTiming;
		public int lifeBkTiming;

		Image life = new ImageIcon("images/life.png").getImage().getScaledInstance(45, 45, 0);

		//눈 속도조절
		public Life(){
			this.lifeTiming = ((int)(Math.random()*900000) + 900000);
			this.lifeBkTiming = lifeTiming;
			this.setSize(60, 60);
			this.setLocation((int)(Math.random()*1130),(int)(Math.random()*-500));
			this.setIcon(new ImageIcon(life));
		}

	}
	
	private Life[] lifes = new Life[]{
			new Life()
	};
	
	private void LifeThread(){

		for(Life tmp: lifes){
			this.add(tmp);
		}
		//쓰레드를 활용하여 눈 내리는 동작
		Thread th = new Thread(){
			public void run(){
				int i =0;
				while(true){
					for(Life tmp: lifes){
						if(tmp.lifeTiming-- == 0){
							tmp.setLocation(tmp.getX(),tmp.getY()+1);
							if(tmp.getY() > 700){
								tmp.setLocation((int)(Math.random()*1130),0);
							}
							else if(tmp.getY() == 700){   //점수계산
								i++;
								System.out.println(i);  //점수계산  노출


							}
							
								// 만약 주체와 눈의 좌표값이 일치하면 게임종료
//						       if(glaunLb.getLocation().equals(tmp.getLocation())){
//						        System.out.println("게임종료");
//						        System.exit(0);
//						       }

							tmp.lifeTiming = tmp.lifeBkTiming;

						}
					}
				}	
			}
		}; th.start();
	}
	
	
	/* 골드 구현 및 낙하 스레드 */
	class Gold extends JLabel{
		
		public int goldTiming;
		public int goldBkTiming;

		Image gold = new ImageIcon("images/gold.png").getImage().getScaledInstance(45, 45, 0);

		//눈 속도조절
		public Gold(){
			this.goldTiming = ((int)(Math.random()*100000) + 900000); // 전혀 모르겠음...
			this.goldBkTiming = goldTiming;
			this.setSize(60, 60);
			this.setLocation((int)(Math.random()*1130),(int)(Math.random())-300); //첫 아이템 낙하 위치 지점
			this.setIcon(new ImageIcon(gold));
		}

	}
	
	private Gold[] golds = new Gold[]{
			new Gold(), new Gold(), new Gold()
	};
	
	private void GoldThread(){

		for(Gold tmp: golds){
			this.add(tmp);
		}
		//쓰레드를 활용하여 눈 내리는 동작
		Thread th = new Thread(){
			public void run(){
				int i =0;
				while(true){
					for(Gold tmp: golds){
						if(tmp.goldTiming-- == 0){ // 잘 모르겠음...
							tmp.setLocation(tmp.getX(),tmp.getY()+2); // 스레드 한 번으로 이동하는 거리(?)
							if(tmp.getY() > 700){
								tmp.setLocation((int)(Math.random()*1130),-300); // 떨어진 아이템의 초기화된 위치 지점. 정해진 구간보다 더 아래로 떨어지면 위치가 위로 초기화됨
							}
							else if(tmp.getY() == 700){   //점수계산
								i++;
								System.out.println(i);  //점수계산  노출


							}
							
								// 만약 주체와 눈의 좌표값이 일치하면 게임종료
//						       if(glaunLb.getLocation().equals(tmp.getLocation())){
//						        System.out.println("게임종료");
//						        System.exit(0);
//						       }
							
							tmp.goldTiming = tmp.goldBkTiming;
//							if(tmp.getY() == -290) {
//								try {
//									Thread.sleep(2000);	// 스레드 일시정지. 근데 내 맘처럼 구현이 안됨...
//								} catch (InterruptedException e) {
//									e.printStackTrace();
//								}
//							}
						}
					}
				}
			}
		}; th.start();
	}
	
	
	/* 시간 표시 구현 및 스레드 */
	private void TimeThread(){

		int sTime = (int)System.currentTimeMillis()/1000; // 시간 계산 공식. 스레드 시작/선언? 시간
		
		Thread th = new Thread() {
		
					@Override
					public void run() {
						
						while(true) {
							
							int cTime = (int)System.currentTimeMillis()/1000; // 시간 계산 공식. 스레드 시작/동작? 시간
							int rTime = cTime - sTime; // 동작 시간 - 시작 시간 = 스톱워치
//							int mTime = rTime/100; // 밀리세컨드 시간 계산 공식. 우리는 초부터 계산하기 때문에 불필요함
							mm = (rTime / 60 % 60);	// 분 계산하는 공식. 60진법 사용. 1분은 60초이기 때문에 추가로 60을 나눠줌
							ss = (rTime % 60);	// 초 계산하는 공식. 60진법 사용
							
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


}
