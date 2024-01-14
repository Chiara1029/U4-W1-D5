package it.exercise.classes;

import it.exercise.abstractClass.MultimediaElement;
import it.exercise.interfaces.Brightness;
import it.exercise.interfaces.Volume;

public class Video extends MultimediaElement implements Volume, Brightness {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness){
        super(title);
        this.duration=duration;
        this.volume=volume;
        this.brightness = brightness;
    }

    @Override
    public void brightnessUp() {
        if (brightness < 5) {
            brightness++;
        }
    }

    @Override
    public void brightnessDown() {
        if(brightness > 0){
            brightness--;
        }
    }

    @Override
    public void volumeUp() {
        if(volume < 5){
            volume++;
        };
    }

    @Override
    public void volumeDown() {
        if(volume > 0){
            volume--;
        }
    }

    public void play(){
        if(duration > 0){
            for(int i=0; i < duration; i++){
                System.out.println("Playing: " + title + " Volume: " + "!".repeat(volume) + " Brightness: " + "*".repeat(brightness));
            }
        }
    }
}
