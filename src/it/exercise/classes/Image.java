package it.exercise.classes;

import it.exercise.abstractClass.MultimediaElement;
import it.exercise.interfaces.Brightness;

public class Image extends MultimediaElement implements Brightness {
    private int brightness;

    public Image(String title, int brightness){
        super(title);
        this.brightness = brightness;
    }
    @Override
    public void brightnessUp() {
        if(brightness < 5){
            brightness++;
        }
    }

    @Override
    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public void show(){
        System.out.println("Showing: " + title + " Brightness: " + "*".repeat(brightness));
    }
}
