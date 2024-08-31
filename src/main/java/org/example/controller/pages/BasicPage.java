package org.example.controller.pages;

import org.example.view.myComponents.MyButton;
import org.example.view.myComponents.MyFrame;
import org.example.view.myComponents.panels.BasicPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class BasicPage {
    private final MyFrame frame;
    private final BasicPanel panel;

    public BasicPage(MyFrame frame,String title) {
        this.frame = frame;
        frame.setTitle(title);
        panel=setPanel();
        panel.repaint();
    }
    public abstract Component[] setMyComponent();
    public abstract BasicPanel setPanel();

    public MyFrame getFrame() {
        return frame;
    }

    public BasicPanel getPanel() {
        return panel;
    }
    public BasicPanel addsAndNewPanel(BufferedImage image){
        BasicPanel basicPanel=new BasicPanel(image);
        frame.add(basicPanel);
        basicPanel.myAddAll(setMyComponent());
        basicPanel.setOpaque(true);
        return basicPanel;
    }
    public static void setMyOpaque(boolean opaque, JComponent... components){
        for (JComponent c:components) {
            c.setForeground(Color.WHITE);
            c.setBackground(Color.BLACK);
            c.setOpaque(opaque);
            if (c instanceof MyButton) ((MyButton)c).setBorderPainted(opaque);
            c.repaint();
        }
    }
}