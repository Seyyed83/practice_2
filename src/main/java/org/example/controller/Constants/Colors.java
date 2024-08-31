package org.example.controller.Constants;

import java.awt.*;

public enum Colors {
    BALLS_COLOR;
    private Color color;

    public Color getValue() {
        return color;
    }

    public void setValue(Color color) {
        this.color = color;
    }
}
