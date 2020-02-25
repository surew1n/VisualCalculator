package VisualCalc;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class PlayAudio {
    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    InputStream audioSrc = getClass().getResourceAsStream(url);
                    InputStream bufferedIn = new BufferedInputStream(audioSrc);
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedIn);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}