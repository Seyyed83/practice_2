package org.example.view.myComponents;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyLabel extends JLabel {
    private boolean hasBackgroundImage;
    private BufferedImage image;
    public MyLabel(int x,int y,int width,int height){
        setVisible(true);
        setBounds(x,y,width,height);
        setForeground(Color.WHITE);
    }
    public MyLabel(int x,int y,int width,int height,String text){
        this(x,y,width,height);
        setText(text);
        setFont(new Font("Arial", Font.PLAIN, 14));
    }

    public void setHasBackgroundImage(boolean hasBackgroundImage,BufferedImage image) {
        this.hasBackgroundImage = hasBackgroundImage;
        if (hasBackgroundImage) {
            this.image=image;
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (hasBackgroundImage){
            g.drawImage(image,0,0,getWidth(),getHeight(),null);
        }
    }
}
