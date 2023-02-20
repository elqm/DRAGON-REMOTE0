package com.greedy.inGame.easy.play1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class TestMoveItems1 extends JPanel implements ActionListener {
    private BufferedImage backgroundImage;
    private ImageIcon characterImage;
    private int x, y;
    private JButton button1, button2;
    
    public TestMoveItems1() {
        try {
            backgroundImage = ImageIO.read(new File("images/easyBackground1.png")); // replace with your background image file path
        } catch (Exception e) {
            e.printStackTrace();
        }
        characterImage = new ImageIcon("images/dragon1.png"); // replace with your character image file path
        x = 100;
        y = 100;
        
        button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 50);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle button 1 action
            }
        });
        add(button1);
        
        button2 = new JButton("Button 2");
        button2.setBounds(150, 150, 100, 50);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle button 2 action
            }
        });
        add(button2);
        
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    x -= 5;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    x += 5;
                } else if (keyCode == KeyEvent.VK_UP) {
                    y -= 5;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    y += 5;
                }
            }
        });
        setFocusable(true);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        characterImage.paintIcon(this, g, x, y);
    }
    
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new TestMoveItems1());
        frame.setSize(800, 600); // set the size of the frame to match the background image size
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
