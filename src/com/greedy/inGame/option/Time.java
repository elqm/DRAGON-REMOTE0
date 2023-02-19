package com.greedy.inGame.option;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Time extends JFrame {

	private JFrame mf = new JFrame("스탑워치");
	private JPanel p = new JPanel();
	
	private Font font = new Font("궁서체", Font.BOLD, 25);
	
	private JButton start;
	private Thread p_display, t_display;
	private JLabel l1, l2, l3;
	private int mm, ss, t=0;
	
	public Time() {
		
		mf.setSize(600, 300);
		
		p.setLayout(null);
		
		l1 = new JLabel("00"); 
		l1.setBounds(50, 10, 50, 50);
		l1.setFont(font);
		l3 = new JLabel(" : ");
		l3.setBounds(70, 10, 50, 50);
		l3.setFont(font);
		l2 = new JLabel("00");
		l2.setBounds(100, 10, 50, 50);
		l2.setFont(font);
		
		start = new JButton("start");
		start.setBounds(300, 20, 100, 50);
		p.add(start);
		p.add(l1);
		p.add(l3);
		p.add(l2);
		
		mf.add(p);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
					p_display = new Thread(new Runnable() {

						@Override
						public void run() {

							mm = Integer.parseInt(l1.getText());
							ss = Integer.parseInt(l2.getText());
							
							while(p_display == Thread.currentThread()) {
								
								mm = t % (1000*60) / 100 / 60;
								ss = t % (1000*60) / 100 % 60;
								
								try {
									Thread.sleep(9);
									
									l1.setText(String.format("%02d", mm));
									l2.setText(String.format("%02d", ss));
									
									t++;
									
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								
								
							}
						
						
						}
						
					});
					
					p_display.start();
					start.setVisible(false);
			}
			
		});
		
	}
}
