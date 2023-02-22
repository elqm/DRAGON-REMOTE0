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
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class TestMoveCharacter extends JPanel implements ActionListener {
    private BufferedImage backgroundImage;
    private ImageIcon characterImage;
    private int x, y;
    private Timer timer;
//    private JButton button1;
    
    public TestMoveCharacter() {
    	
    	JTextField text1 = new JTextField("EASY GAME");
    	text1.setLayout(getLayout());
    	
    	
        try {
        backgroundImage = ImageIO.read(new File("images/easyBackground1.png")); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        characterImage = new ImageIcon("images/dragon1.png"); 
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
        frame.add(new TestMoveCharacter());
        frame.setSize(1400, 800); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        TestMoveCharacter TMC = new TestMoveCharacter();
    }
    
}
