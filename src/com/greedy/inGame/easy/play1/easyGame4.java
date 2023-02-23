package com.greedy.inGame.easy.play1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class easyGame4 extends JFrame {
    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel[] weaponLabels;
    private Timer timer;
    private int score;
    private JLabel scoreLabel;

    public easyGame4() {
        // Set up the window
        setTitle("Weapon Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Set up the background
        ImageIcon backgroundImage = new ImageIcon("images/easyBackground1.png");
        backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1400, 800);
        add(backgroundLabel);

        // Set up the character
        ImageIcon characterImage = new ImageIcon("images/dragon1.png");
        characterLabel = new JLabel(characterImage);
        characterLabel.setBounds(350, 500, 100, 100);
        backgroundLabel.add(characterLabel);

        // Set up the weapons
        weaponLabels = new JLabel[5];
        for (int i = 0; i < 5; i++) {
            ImageIcon weaponImage = new ImageIcon("images/easyarrow.png");
            weaponLabels[i] = new JLabel(weaponImage);
            weaponLabels[i].setBounds((i * 160) + 20, -100, 100, 100);
            backgroundLabel.add(weaponLabels[i]);
        }

        // Set up the score label
        score = 10;
        scoreLabel = new JLabel("Score: " + score);
        scoreLabel.setBounds(20, 20, 100, 50);
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 24));
        backgroundLabel.add(scoreLabel);

        // Set up the timer to move the weapons
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveWeapons();
            }
        });
        timer.start();

        // Set up the key listener to move the character
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        moveCharacter(-10);
                        break;
                    case KeyEvent.VK_RIGHT:
                        moveCharacter(10);
                        break;
                }
            }
        });

        // Set the window to focusable and request focus
        setFocusable(true);
        requestFocus();
    }

    private void moveWeapons() {
        for (int i = 0; i < 5; i++) {
            weaponLabels[i].setLocation(weaponLabels[i].getX(), weaponLabels[i].getY() + 10);
            if (weaponLabels[i].getBounds().intersects(characterLabel.getBounds())) {
                weaponLabels[i].setVisible(false);
                score--;
                scoreLabel.setText("Score: " + score);
                if (score == 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Game over!");
                    System.exit(0);
                }
            }
            if (weaponLabels[i].getY() >= 600) {
                weaponLabels[i].setLocation((i * 160) + 20, -100);
            }
        }
    }

    private void moveCharacter(int dx) {
        int newX = characterLabel.getX() + dx;
        if (newX >= 0 && newX <= 700) {
            characterLabel.setLocation(newX, characterLabel.getY());
        }
    }

    public static void main(String[] args) {
        easyGame4 game = new easyGame4();
        game.setSize(1400, 800);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
