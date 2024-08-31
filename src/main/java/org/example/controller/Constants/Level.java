package org.example.controller.Constants;

public enum Level {
    EASY(5),MEDIUM(7),HARD(9);

    Level(int num) {
        this.num = num;
    }

    private final int num;

    public int getNum() {
        return num;
    }
}
