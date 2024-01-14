import it.exercise.abstractClass.MultimediaElement;
import it.exercise.classes.Audio;
import it.exercise.classes.Image;
import it.exercise.classes.Video;

import java.util.Scanner;

public class Main {
    static MultimediaElement[] mediaPlayer = new MultimediaElement[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mediaPlayer.length; i++) {
            System.out.println("Choose your type (Audio, Video, Image)");
            String mediaType = scanner.nextLine();

            switch (mediaType.toLowerCase().trim()) {
                case "audio":
                    System.out.println("Choose a title: ");
                    String audioTitle = scanner.nextLine();
                    System.out.println("Set duration: ");
                    int audioDuration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set volume(from 1 to 5): ");
                    int audioVolume = scanner.nextInt();
                    scanner.nextLine();
                    mediaPlayer[i] = new Audio(audioTitle, audioDuration, audioVolume);
                    break;
                case "video":
                    System.out.println("Choose a title: ");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Set duration: ");
                    int videoDuration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set volume(from 1 to 5): ");
                    int videoVolume = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Set brightness(from 1 to 5): ");
                    int videoBrightness = scanner.nextInt();
                    scanner.nextLine();
                    mediaPlayer[i] = new Video(videoTitle, videoDuration, videoVolume, videoBrightness);
                    break;
                case "image":
                    System.out.println("Choose a title: ");
                    String imageTitle = scanner.nextLine();
                    System.out.println("Set brightness(from 1 to 5): ");
                    int imageBrightness = scanner.nextInt();
                    scanner.nextLine();
                    mediaPlayer[i] = new Image(imageTitle, imageBrightness);
                    break;
                default:
                    System.out.println("Invalid type. Try again.");
                    i--;
                    break;
            }

        }
        while (true) {
            System.out.println("Choose a media to play (from 1 to 5, or 0 to exit)");
            Integer choice = scanner.nextInt();
            scanner.nextLine();
            if (choice.equals(0)) {
                System.out.println("Media player closed.");
                scanner.close();
                break;
            } else if (mediaPlayer[choice - 1] instanceof Image) {
                ((Image) mediaPlayer[choice - 1]).show();
                System.out.println("Do you want to set the brightness? (y/n)");
                String resp = scanner.nextLine();
                if(resp.equals("y")){
                    label:
                    while(true){
                        System.out.println("Enter 'down' to reduce/Enter 'up' to increase (or 'q' to go back)");
                        String setBrightness = scanner.nextLine();
                        switch (setBrightness) {
                            case "down":
                                ((Image) mediaPlayer[choice - 1]).brightnessDown();
                                ((Image) mediaPlayer[choice - 1]).show();
                                break;
                            case "up":
                                ((Image) mediaPlayer[choice - 1]).brightnessUp();
                                ((Image) mediaPlayer[choice - 1]).show();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Wrong input. Try again.");
                                break;
                        }
                    }
                } else if (resp.equals("n")) {}
                else{
                    System.out.println("Wrong input. Try again.");
                    break;
                }
            } else if (mediaPlayer[choice - 1] instanceof Audio) {
                ((Audio) mediaPlayer[choice - 1]).play();
                System.out.println("Do you want to set the volume? (y/n)");
                String respVol = scanner.nextLine();
                if(respVol.equals("y")){
                    label:
                    while(true){
                        System.out.println("Enter 'down' to reduce/Enter 'up' to increase (or 'q' to go back)");
                        String setVolume = scanner.nextLine();
                        switch (setVolume) {
                            case "down":
                                ((Audio) mediaPlayer[choice - 1]).volumeDown();
                                ((Audio) mediaPlayer[choice - 1]).play();
                                break;
                            case "up":
                                ((Audio) mediaPlayer[choice - 1]).volumeUp();
                                ((Audio) mediaPlayer[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Wrong input. Try again.");
                                break;
                        }
                    }
                } else if (respVol.equals("n")) {}
                else{
                    System.out.println("Wrong input. Try again.");
                    break;
                }
            } else if (mediaPlayer[choice - 1] instanceof Video) {
                ((Video) mediaPlayer[choice - 1]).play();
                System.out.println("Do you want to set the brightness? (y/n)");
                String respBr = scanner.nextLine();
                if(respBr.equals("y")){
                    label:
                    while(true){
                        System.out.println("Enter 'down' to reduce/Enter 'up' to increase (or 'q' to go back)");
                        String setBrightness = scanner.nextLine();
                        switch (setBrightness) {
                            case "down":
                                ((Video) mediaPlayer[choice - 1]).brightnessDown();
                                ((Video) mediaPlayer[choice - 1]).play();
                                break;
                            case "up":
                                ((Video) mediaPlayer[choice - 1]).brightnessUp();
                                ((Video) mediaPlayer[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Wrong input. Try again.");
                                break;
                        }
                    }
                } else if (respBr.equals("n")) {}
                else{
                    System.out.println("Wrong input. Try again.");
                    break;
                }
                System.out.println("Do you want to set the volume? (y/n)");
                String respVol = scanner.nextLine();
                if(respVol.equals("y")){
                    label:
                    while(true){
                        System.out.println("Enter 'down' to reduce/Enter 'up' to increase (or 'q' to go back)");
                        String setVolume = scanner.nextLine();
                        switch (setVolume) {
                            case "down":
                                ((Video) mediaPlayer[choice - 1]).volumeDown();
                                ((Video) mediaPlayer[choice - 1]).play();
                                break;
                            case "up":
                                ((Video) mediaPlayer[choice - 1]).volumeUp();
                                ((Video) mediaPlayer[choice - 1]).play();
                                break;
                            case "q":
                                break label;
                            default:
                                System.out.println("Wrong input. Try again.");
                                break;
                        }
                    }
                } else if (respVol.equals("n")) {}
                else{
                    System.out.println("Wrong input. Try again.");
                    break;
                }
            }
        }
    }
}