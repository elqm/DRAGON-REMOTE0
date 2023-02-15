package com.greedy;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class dragontest {
	
	class Ex1 extends JFrame{
	    ImageIcon i = new ImageIcon("back.jpg");
	    Image im=i.getImage();
	    Ex1(){
	        this.setTitle("이미지 그리기 연습");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        MyPanel panel = new MyPanel();
	        panel.setLayout(new FlowLayout());
	        panel.add(new JButton("Hello"));
	        
	        this.add(panel);
	        this.setSize(400,400);
	        this.setVisible(true);
	    }
	    
	    class MyPanel extends JPanel{
	            
	        public void paintComponent(Graphics g){
	            super.paintComponent(g);
	            g.drawImage(im,0,0,getWidth(),getHeight(),this);
	        }
	    }
	}
	public static class JavaApplication38 {
	    public static void main(String[] args) {
	    	
	         new Ex1();
	    } 
	}
}
