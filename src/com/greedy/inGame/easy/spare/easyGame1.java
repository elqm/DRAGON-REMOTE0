package com.greedy.inGame.easy.spare;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class easyGame1 extends JPanel implements ActionListener {

    private Image backgroundImage;
    private Image characterImage;
    private Image weaponImage;
    private int characterX;
    private int characterY;
    private int weaponX;
    private int weaponY;
    private int score;

    public easyGame1() {
        ImageIcon bgImage = new ImageIcon("images/easyBackground1.png");
        backgroundImage = bgImage.getImage();
        ImageIcon charImage = new ImageIcon("images/dragon1.png");
        characterImage = charImage.getImage();
        ImageIcon weapImage = new ImageIcon("images/easyarrow.png");
        weaponImage = weapImage.getImage();
        characterX = 50;
        characterY = 250;
        weaponX = 0;
        weaponY = 0;
        score = 10;

        setPreferredSize(new Dimension(800, 600));

        // Set up key listener
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    characterX -= 15;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    characterX += 15;
                } else if (keyCode == KeyEvent.VK_UP) {
                    characterY -= 15;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    characterY += 15;
                }
            }
        });

        // Set up timer to generate falling weapon images
        Timer timer = new Timer(2000, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(characterImage, characterX, characterY, null);
        g.drawImage(weaponImage, weaponX, weaponY, null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Score: " + score, 10, 20);
    }

    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        weaponX = rand.nextInt(700);
        weaponY = 0;
        while (weaponY < 500) {
            weaponY += 5;
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            if (weaponX > characterX && weaponX < characterX + 50 && weaponY > characterY && weaponY < characterY + 50) {
                score--;
                weaponX = 0;
                weaponY = 0;
            }
        }
        if (weaponY >= 500) {
            weaponX = 0;
            weaponY = 0;
        }
        if (score == 0) {
            JOptionPane.showMessageDialog(null, "Game Over");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("easyGame1");
        easyGame1 easygame = new easyGame1();
        frame.add(easygame);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}