package org.example.view.myComponents;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private final JPanel basePanel;
    public MyFrame(int width , int height){
        setSize(width,height);
        setVisible(true);
        setResizable(false);
        basePanel=(JPanel) this.getContentPane();
    }
    public MyFrame (int x,int y,int width,int height){
        this(width,height);
        setLocation(x,y);
    }
    public void myAddAll(Component ... components){
        for (Component component : components){
            basePanel.add(component);
        }
    }
    public JPanel getBasePanel(){
        return basePanel;
    }
}
