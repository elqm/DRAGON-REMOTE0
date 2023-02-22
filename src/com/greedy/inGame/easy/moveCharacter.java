package com.greedy.inGame.easy;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class moveCharacter implements ActionListener  {
	
	private BufferedImage backgroundImage;
    private ImageIcon characterImage;
    private int x, y;
    private Timer timer;
    JFrame frame = new JFrame();
	public void diplay() {
	
	
//    frame.add(new TestMoveCharacter());
    frame.setSize(1400, 800); // set the size of the frame to match the background image size
    
    JPanel panel = new JPanel();
	panel.setLayout(null);
    
    try {
        backgroundImage = ImageIO.read(new File("images/easyBackground1.png")); // replace with your background image file path
    } catch (Exception e) {
        e.printStackTrace();
    }
    characterImage = new ImageIcon("images/dragon1.png"); // replace with your character image file path
    x = 100;
    y = 100;
    
    timer = new Timer(10, this);
    timer.start();
    
    addKeyListener(new KeyAdapter() { 
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT) {
                x -= 15;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                x += 15;
            } else if (keyCode == KeyEvent.VK_UP) {
                y -= 15;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                y += 15;
            }
        }
    });
    setFocusable(true);
    
    frame.add(panel);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
    
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        characterImage.paintIcon(this, g, x, y);
    }
    
	public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
