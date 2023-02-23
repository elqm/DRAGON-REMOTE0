package com.greedy.inGame.easy.play1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class easyGame5 extends JPanel implements ActionListener {

    private Image backgroundImage;
    private Image characterImage;
    private Image weaponImage;
    private Timer timer;
    private int characterX;
    private int characterY;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    private int score = 10;

    public easyGame5() {
        setPreferredSize(new Dimension(1400, 800));
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                moveCharacter(e.getKeyCode());
            }
        });
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        backgroundImage = new ImageIcon("images/easyBackground1.png").getImage();
        characterImage = new ImageIcon("images/dragon1.png").getImage();
        weaponImage = new ImageIcon("images/easyarrow.png").getImage();

        timer = new Timer(20, this);
        timer.start();
    }

    private void moveCharacter(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                characterY -= 10;
                break;
            case KeyEvent.VK_DOWN:
                characterY += 10;
                break;
            case KeyEvent.VK_LEFT:
                characterX -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                characterX += 10;
                break;
        }
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(characterImage, characterX, characterY, null);

        Random rand = new Random();
        if (weapons.size() < 5) {
            int x = rand.nextInt(500);
            Weapon weapon = new Weapon(x, 0);
            weapons.add(weapon);
        }
        
//        weapons = new Image[weaponImage];
//        for (int i = 0; i < weaponImage.; i++) {
//            weapon[i] = weaponIcon.getImage();
//        }
//
//        characterX = WIDTH / 2 - CHAR_WIDTH / 2;
//        characterY = HEIGHT - CHAR_HEIGHT - 20;
//
//        weaponX = new int[NUM_WEAPONS];
//        weaponY = new int[NUM_WEAPONS];
//        weaponVisible = new boolean[NUM_WEAPONS];
//        for (int i = 0; i < NUM_WEAPONS; i++) {
//            weaponX[i] = (int) (Math.random() * (WIDTH - WEAPON_WIDTH));
//            weaponY[i] = -((int) (Math.random() * 800));
//            weaponVisible[i] = true;
//        }

        for (int i = 0; i < weapons.size(); i++) {
            Weapon weapon = weapons.get(i);
            weapon.move();
            g.drawImage(weaponImage, weapon.getX(), weapon.getY(), null);
            if (weapon.intersects(characterX, characterY)) {
                weapons.remove(i);
                score--;
                if (score == 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Game over!");
                }
            }
        }
        g.drawString("Score: " + score, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new easyGame5());
        frame.pack();
        frame.setVisible(true);
    }

    private class Weapon {
        private int x;
        private int y;

        public Weapon(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void move() {
            y += 5;
        }

        public boolean intersects(int characterX, int characterY) {
            Rectangle characterRect = new Rectangle(characterX, characterY, characterImage.getWidth(null), characterImage.getHeight(null));
            Rectangle weaponRect = new Rectangle(x, y, weaponImage.getWidth(null), weaponImage.getHeight(null));
            return characterRect.intersects(weaponRect);
        }
    }
}
