package org.example.view.myComponents;



import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyButton extends JButton {
    private BufferedImage image;
    private boolean hasBackground=true;
    public MyButton(BufferedImage image){
        setLayout(null);
        setVisible(true);
        this.image=image;
    }
    public MyButton(int x,int y,int width,int height){
        hasBackground=false;
        setBounds(x,y,width,height);
        setLayout(null);
        setVisible(true);
    }
    public MyButton(int x,int y,int width,int height,BufferedImage image){
        this(image);
        setBounds(x,y,width,height);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (hasBackground) {
            g.drawImage(image,0,0,getWidth(),getHeight(),null);
        }
    }
    public void setHasBackground(boolean hasBackground,String text) {
        this.hasBackground = hasBackground;
        setBackground(Color.BLACK);
        setText(text);
        setForeground(Color.WHITE);
    }
}