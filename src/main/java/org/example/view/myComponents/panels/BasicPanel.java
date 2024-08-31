package org.example.view.myComponents.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BasicPanel extends JPanel {
    private boolean hasBackGroundImage=true;
    private BufferedImage image;
    public BasicPanel(BufferedImage image) {
        this.image=image;
        setLocation(new Point(0, 0));
        setLayout(null);
        setVisible(true);
    }
    public void myAddAll(Component ... components){
        for (Component component:components){
            try {
                add(component);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(hasBackGroundImage){
            g.drawImage(image,0,0,getWidth(),getHeight(),null);
        }
    }

    public boolean isHasBackGroundImage() {
        return hasBackGroundImage;
    }

    public void setHasBackGroundImage(boolean hasBackGroundImage) {
        this.hasBackGroundImage = hasBackGroundImage;
    }
}

