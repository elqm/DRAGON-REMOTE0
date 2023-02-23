package com.greedy.inGame.easy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.greedy.inGame.normal.GameOver;



public class easyGame3 extends JPanel implements ActionListener {
    private final int WIDTH = 1400;
    private final int HEIGHT = 800;
    private final int DELAY = 10;
    private Timer timer;
    private Image backgroundImage, characterImage, weaponImage;
    private int characterX, characterY, weaponX, weaponY;
    private int score = 5;
    private JLabel scoreLabel;
//    private boolean gameover;

//    JFrame frame = new JFrame("2D Game");
    JPanel panel = new JPanel();
    
    public easyGame3() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT)); 
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(new MyKeyAdapter());
        scoreLabel = new JLabel("Score: " + score);
        add(scoreLabel);
        loadImages();
        initGame();
    }

    private void loadImages() {
        backgroundImage = new ImageIcon("images/easyBackground1.png").getImage();
        characterImage = new ImageIcon("images/dragon1.png").getImage();
        weaponImage = new ImageIcon("images/easyarrow.png").getImage();
    }

    private void initGame() {
        characterX = WIDTH/2 - characterImage.getWidth(null)/2;
        characterY = HEIGHT - characterImage.getHeight(null);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(characterImage, characterX, characterY, null);
        g.drawImage(weaponImage, weaponX, weaponY, null);
    }

    private void moveCharacter() {
        if (characterX < 0) {
            characterX = 0;
        }
        if (characterX > WIDTH - characterImage.getWidth(null)) {
            characterX = WIDTH - characterImage.getWidth(null);
        }
    }
    
    

    private void moveWeapon() {
        weaponY += 7;
        if (weaponY > HEIGHT) {
            weaponY = -weaponImage.getHeight(null);
            weaponX = (int)(Math.random() * (WIDTH - weaponImage.getWidth(null)));
        }
    }

    private void checkCollision() {
        Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
        Rectangle weaponRect = new Rectangle(weaponX, weaponY, weaponImage.getWidth(null), weaponImage.getHeight(null));
        if (characterRect.intersects(weaponRect)) {
            weaponY = -weaponImage.getHeight(null);
            score--;
            scoreLabel.setText("Score: " + score);
            if (score == 0) {
                timer.stop();
                JOptionPane.showMessageDialog(null, "Game over!");
            }
            	  
         
//            Toolkit.getDefaultToolkit().sync();
//            g.dispose();
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveCharacter();
        moveWeapon();
        checkCollision();
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

    public static void main(String[] args) {
    	JFrame frame = new JFrame("2D Game");
    	easyGame3 game = new easyGame3();
        frame.add(game);
        frame.setBounds(300, 200, 1400, 800);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

