package com.greedy.inGame.normal;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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

	public int xpos = 510;
	public int ypos = 590;

	public GamePage() {

		this.mf = this;
		mf.setSize(1190, 770);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon bg = new ImageIcon("images/normalBg.png");
		Image glaun = new ImageIcon("images/glaunCha.png").getImage().getScaledInstance(122, 118, 0);
		Image normal = new ImageIcon("images/normal.png").getImage().getScaledInstance(213, 37, 0);
		Image life = new ImageIcon("images/life.png").getImage().getScaledInstance(38, 38, 0);
		Image time = new ImageIcon("images/time.png").getImage().getScaledInstance(60, 61, 0);
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
		lifeLb.setBounds(20, 20, 38, 38);

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

		panel.add(preferencesBt);
		panel.add(glaunLb);
		panel.add(normalLb);
		panel.add(lifeLb);
		panel.add(timeLb);
		panel.add(goldLb);
		panel.add(preferencesLb);
		panel.add(bgLb);

		mf.add(panel);

		this.compInit();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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


	class MyLabel extends JLabel{
		public int timing;
		public int bkTiming;

		Image life = new ImageIcon("images/firearrow.png").getImage().getScaledInstance(80, 80, 0);

		//눈 속도조절
		public MyLabel(){
			this.timing = ((int)(Math.random()*400) + 200000);
			this.bkTiming = timing;
			this.setSize(80, 80);
			this.setLocation((int)(Math.random()*1190),(int)(Math.random()*770));
			this.setIcon(new ImageIcon(life));
		}

	}

	private JButton button = new JButton(new ImageIcon());

	private MyLabel[] labels = new MyLabel[]{
			new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),
			//						new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),new MyLabel(),

	}; 


	private void compInit(){


		for(MyLabel tmp: labels){
			this.add(tmp);
		}
		//쓰레드를 활용하여 눈 내리는 동작
		Thread th = new Thread(){
			public void run(){
				int i =0;
				while(true){
					for(MyLabel tmp: labels){
						if(tmp.timing-- == 0){
							tmp.setLocation(tmp.getX(),tmp.getY()+1);
							if(tmp.getY() > 700){
								tmp.setLocation((int)(Math.random()*1190),0);
							}
							else if(tmp.getY() == 700){   //점수계산
								i++;
								System.out.println(i);  //점수계산  노출


							}
							
						       //만약 주체와 눈의 좌표값이 일치하면 게임종료
						       if(button.getLocation().equals(tmp.getLocation())){
						        System.out.println("게임종료");
						        System.exit(0);
						       }

							tmp.timing = tmp.bkTiming;

						}

					}

				}

			}

		}; th.start();

	}

}
