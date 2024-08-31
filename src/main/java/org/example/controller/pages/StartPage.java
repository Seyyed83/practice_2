package org.example.controller.pages;

import org.example.controller.Constants.Integers;
import org.example.controller.Constants.Strings;
import org.example.view.myComponents.MyFrame;
import org.example.view.myComponents.panels.BasicPanel;

import java.awt.*;

public class StartPage extends BasicPage{
    public StartPage(MyFrame frame, String title) {
        super(frame, title);
    }

    @Override
    public Component[] setMyComponent() {
        return new Component[0];
    }

    @Override
    public BasicPanel setPanel() {
        return addsAndNewPanel(Strings.START_BACKGROUND.getImageOfStringAddress());
    }
}
