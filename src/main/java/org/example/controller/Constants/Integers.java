package org.example.controller.Constants;

import java.awt.*;

public enum Integers {
    MONITOR_WIDTH,MONITOR_HEIGHT;
    public int getValue(){
        if (this.equals(MONITOR_WIDTH)) return Toolkit.getDefaultToolkit().getScreenSize().width;
        else if (this.equals(MONITOR_HEIGHT)) return Toolkit.getDefaultToolkit().getScreenSize().height;
        return 0;
    }
}
