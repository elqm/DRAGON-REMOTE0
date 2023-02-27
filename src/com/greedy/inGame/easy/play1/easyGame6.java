package com.greedy.inGame.easy.play1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.greedy.inGame.normal.GameOver;

public class easyGame6 extends JPanel implements ActionListener {

    private Timer timer;
    private int characterX, characterY, score;
    private boolean gameover;
    private Image character, background, weapon, bonus;
    private ArrayList<Integer> weaponX, weaponY;
    private ArrayList<Integer> bonusX, bonusY;
    private Random rand;

    public easyGame6() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1400, 800));
        setFocusable(true);
        requestFocus();

        character = new ImageIcon("images/dragon1.png").getImage();
        background = new ImageIcon("images/easyBackground1.png").getImage();
        weapon = new ImageIcon("images/easyarrow.png").getImage();
        bonus = new ImageIcon("images/gold.png").getImage();

        characterX = 300;
        characterY = 600;
        score = 5;
        gameover = false;

        weaponX = new ArrayList<>();
        weaponY = new ArrayList<>();
        bonusX = new ArrayList<>();
        bonusY = new ArrayList<>();
        rand = new Random();

        for (int i = 0; i < 10; i++) {
            weaponX.add(rand.nextInt(1300));
            weaponY.add(rand.nextInt(300) - 800);
        }
        
        for (int i = 0; i < 1; i++) { // set 1 bonus item
            bonusX.add(rand.nextInt(1300));
            bonusY.add(rand.nextInt(300) - 800);
        }

        addKeyListener(new KeyAdapter() {                         
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    if (characterX > 0)
                        characterX -= 10;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    if (characterX < 1300)
                        characterX += 10;
                }
                repaint();
            }
        });

        timer = new Timer(25, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.drawImage(character, characterX, characterY, this);

        for (int i = 0; i < weaponX.size(); i++) {
            g.drawImage(weapon, weaponX.get(i), weaponY.get(i), this);
            if (weaponY.get(i) > 800) {
                weaponX.set(i, rand.nextInt(1300));
                weaponY.set(i, rand.nextInt(300) - 800);
            } else if (weaponY.get(i) > characterY && weaponY.get(i) < characterY + 50
                    && weaponX.get(i) > characterX && weaponX.get(i) < characterX + 50) {
                score--;
                weaponX.set(i, rand.nextInt(1300));
                weaponY.set(i, rand.nextInt(300) - 800);
            }
        }
        
        for (int i = 0; i < bonusX.size(); i++) {
            g.drawImage(bonus, bonusX.get(i), bonusY.get(i), this);
            if (bonusY.get(i) > 800) {
                bonusX.set(i, rand.nextInt(1300));
                bonusY.set(i, rand.nextInt(300) - 800);
            } else if (bonusY.get(i) > characterY && bonusY.get(i) < characterY + 50
                    && bonusX.get(i) > characterX && bonusX.get(i) < characterX + 50) {
                score++;
                bonusX.set(i, rand.nextInt(1300));
                bonusY.set(i, rand.nextInt(300) - 800);
            }
        }
        
        g.setColor(Color.WHITE);                             	  
        g.setFont(new Font("Arial", Font.BOLD, 20));         	  
        g.drawString("Score: " + score, 20, 40);				

        if (gameover) {
        	g.setColor(Color.YELLOW);							
        	g.setFont(new Font("Arial", Font.BOLD, 100));		
            g.drawString("Game Over", 500, 400);				
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < weaponX.size(); i++) {
            weaponY.set(i, weaponY.get(i) + 15); 					
            if (weaponY.get(i) > 800) {
                weaponX.set(i, rand.nextInt(1300));         	 	 
                weaponY.set(i, rand.nextInt(300) - 800);     		 
            } else if (weaponY.get(i) > characterY && weaponY.get(i) < characterY + 50
                    && weaponX.get(i) > characterX && weaponX.get(i) < characterX + 50) {
                score--;
                weaponX.set(i, rand.nextInt(1300));      	 	 
                weaponY.set(i, rand.nextInt(300) - 800);  		
            }
            
        }
        
        for (int i = 0; i < bonusX.size(); i++) {
        	bonusY.set(i, bonusY.get(i) + 10); 					
            if (bonusY.get(i) > 800) {
            	bonusX.set(i, rand.nextInt(1300));         	 	 
            	bonusY.set(i, rand.nextInt(300) - 800);     		 
            } else if (bonusY.get(i) > characterY && bonusY.get(i) < characterY + 50
                  && bonusX.get(i) > characterX && bonusX.get(i) < characterX + 50) {
                  score++;
                  bonusX.set(i, rand.nextInt(1300));      	 	 
                  bonusY.set(i, rand.nextInt(300) - 800);  		
              }
        }
        
        if (score == 0) {
            gameover = true;
            timer.stop();
            new GameOver();
        }
        
        repaint();
    }
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dragon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new easyGame6());
        frame.pack();
        frame.setVisible(true);
    }
}