package org.example.controller.pages;

import org.example.controller.Constants.Integers;
import org.example.view.myComponents.MyButton;
import org.example.view.myComponents.MyFrame;
import org.example.view.myComponents.panels.BasicPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.example.controller.Constants.Strings.*;

public class MenuPage extends BasicPage {
    private static MenuPage instance;

    private MenuPage(MyFrame frame, String title) {
        super(frame, title);
        getFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static MenuPage getInstance() {
        if (instance == null)
            instance = new MenuPage(new MyFrame(Integers.MONITOR_WIDTH.getValue(), Integers.MONITOR_HEIGHT.getValue()), "Brick breakers");
        return instance;
    }

    @Override
    public Component[] setMyComponent() {
        int w = getFrame().getWidth(), h = getFrame().getHeight();
        MyButton startButton = new MyButton(w * 9 / 20, h / 5, w / 10, h / 10, START_BUTTON.getImageOfStringAddress());
        MyButton recordButton = new MyButton(w * 9 / 20, h * 3 / 10, w / 10, h / 10, RECORD_BUTTON.getImageOfStringAddress());
        MyButton historyButton = new MyButton(w * 9 / 20, h * 2 / 5, w / 10, h / 10, HISTORY_BUTTON.getImageOfStringAddress());
        MyButton settingButton = new MyButton(w * 9 / 20, h / 2, w / 10, h / 10, SETTING_BUTTON.getImageOfStringAddress());
        MyButton exitButton = new MyButton(w * 9 / 20, h * 3 / 5, w / 10, h / 10, EXIT_BUTTON.getImageOfStringAddress());

        startButton.addActionListener((ActionEvent e)->new StartPage(new MyFrame(w*11/32, h/8,w*3/8,h*3/4),"Start"));
        exitButton.addActionListener((ActionEvent e)->System.exit(0));

        setMyOpaque(false,startButton, recordButton, historyButton, settingButton, exitButton);
        return new Component[]{startButton, recordButton, historyButton, settingButton, exitButton};
    }

    @Override
    public BasicPanel setPanel() {
        BasicPanel panel=addsAndNewPanel(MENU_BACKGROUND.getImageOfStringAddress());
        panel.setSize(getFrame().getWidth(), getFrame().getHeight());
        return panel;
    }
}
