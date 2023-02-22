package com.greedy.inGame.easy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class easyGame2 extends JPanel implements ActionListener {
    private Image backgroundImage;
    private Image characterImage;
    private Image weaponImage;
    private int characterX;
    private int characterY;
    private int weaponX;
    private int weaponY;
    private int score;
    private Timer timer;

    public easyGame2() {
        // Load images
        backgroundImage = new ImageIcon("images/easyBackground.png").getImage();
        characterImage = new ImageIcon("images/dragon1.png").getImage();
        weaponImage = new ImageIcon("images/easyarrow.png").getImage();

        // Set initial positions and score
        characterX = 200;
        characterY = 400;
        weaponX = 100;
        weaponY = 0;
        score = 0;

        // Set up timer to update game
        timer = new Timer(10, this);
        timer.start();

        // Set up keyboard input
        setFocusable(true);
        addKeyListener(new MyKeyListener());
    }

    public void actionPerformed(ActionEvent e) {
        // Update weapon position
        weaponY += 5;

        // Check for collision between weapon and character
        if (weaponX + weaponImage.getWidth(null) > characterX &&
            weaponX < characterX + characterImage.getWidth(null) &&
            weaponY + weaponImage.getHeight(null) > characterY &&
            weaponY < characterY + characterImage.getHeight(null)) {
            // Weapon hit character, so update score and reset weapon position
            score--;
            weaponX = (int) (Math.random() * (getWidth() - weaponImage.getWidth(null)));
            weaponY = 0;
        }

        // Redraw game
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw background
        g.drawImage(backgroundImage, 0, 0, null);

        // Draw character
        g.drawImage(characterImage, characterX, characterY, null);

        // Draw weapon
        g.drawImage(weaponImage, weaponX, weaponY, null);

        // Draw score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 30);
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            // Move character with arrow keys
            if (key == KeyEvent.VK_LEFT && characterX > 0) {
                characterX -= 5;
            }
            else if (key == KeyEvent.VK_RIGHT && characterX < getWidth() - characterImage.getWidth(null)) {
                characterX += 5;
            }
            else if (key == KeyEvent.VK_UP && characterY > 0) {
                characterY -= 5;
            }
            else if (key == KeyEvent.VK_DOWN && characterY < getHeight() - characterImage.getHeight(null)) {
                characterY += 5;
            }

            // Redraw game
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Game");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new easyGame2());
        frame.setVisible(true);
    }
}
