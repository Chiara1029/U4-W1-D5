package it.exercise.classes;

import it.exercise.abstractClass.MultimediaElement;
import it.exercise.interfaces.Volume;

public class Audio extends MultimediaElement implements Volume{
    private int duration;
    private int volume;

    public Audio (String title, int duration, int volume){
        super(title);
        this.duration = duration;
        this.volume = volume;
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
                System.out.println("Playing: " + title + " Volume: " + "!".repeat(volume));
            }
        }
    }
}
