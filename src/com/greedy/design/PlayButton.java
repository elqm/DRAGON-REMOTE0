package com.greedy.design;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class PlayButton extends JButton {
    public PlayButton() { super(); decorate(); } 
    public PlayButton(String text) { super(text); decorate(); } 
    public PlayButton(Action action) { super(action); decorate(); } 
    public PlayButton(Icon icon) { super(icon); decorate(); } 
    public PlayButton(String text, Icon icon) { super(text, icon); decorate(); } 
    public void decorate() { setBorderPainted(false); setOpaque(false); }
    @Override 
    public void paintComponent(Graphics g) {
       Color c=new Color(250,60,60); //배경색 결정
       Color o=new Color(250,250,250); //글자색 결정
       int width = getWidth(); 
       int height = getHeight(); 
       Graphics2D graphics = (Graphics2D) g; 
       graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
       if (getModel().isArmed()) { graphics.setColor(c.darker()); } 
       else if (getModel().isRollover()) { graphics.setColor(c.brighter()); } 
       else { graphics.setColor(c); } 
       graphics.fillRoundRect(0, 0, width, height, 100, 100); 
       FontMetrics fontMetrics = graphics.getFontMetrics(); 
       Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
       int textX = (width - stringBounds.width) / 2; 
       int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
       graphics.setColor(o); 
       graphics.setFont(getFont()); 
       graphics.drawString(getText(), textX, textY); 
       graphics.dispose(); 
       super.paintComponent(g); 
       }
    }
