package org.example.controller.Constants;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public enum Strings {
    BASE_OF_ADDRESS(false),START_BUTTON(),RECORD_BUTTON(), HISTORY_BUTTON(), SETTING_BUTTON(),
    EXIT_BUTTON(), PLAY_BUTTON()/*, BALL(),AIM(),BRICK()*/,START_BACKGROUND(), GAME_BACKGROUND(),MENU_BACKGROUND();
    private BufferedImage image;
    private final boolean isCompleteAddress;
    Strings(boolean isCompleteAddress){
        this.isCompleteAddress=isCompleteAddress;
        if (isCompleteAddress) {
            try {
                image= ImageIO.read(new File(Objects.requireNonNull(getValue())));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    Strings(){
        isCompleteAddress=true;
        try {
            image= ImageIO.read(new File(getValue()));
        } catch (IOException e) {
            System.out.println(Objects.requireNonNull(getValue()));
            e.printStackTrace();
        }
    }
    public String getValue(){
        if (this.isCompleteAddress) {
            if (this.name().endsWith("BACKGROUND")) return BASE_OF_ADDRESS.getValue()+"images/"+this+".jpg";
            else if (this.name().endsWith("BUTTON")) return BASE_OF_ADDRESS.getValue()+"images/"+this+".png";
//            else todo
        }
        else if (this.equals(BASE_OF_ADDRESS)) return "src/main/resources/";
        return null;
    }
    public BufferedImage getImageOfStringAddress(){
        return image;
    }
}
