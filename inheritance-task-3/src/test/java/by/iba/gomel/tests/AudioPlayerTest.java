package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AudioPlayer;

/**
 * This class tests the AudioPlayer class. It passes some audio formats and expects appropriate
 * return.
 */
public class AudioPlayerTest {

    /**
     * Using an object of type AudioPlayer sends audio formats to the play() method and expects that
     * format is playing or undefined.
     */
    @Test
    public void testPlayAudio() {
        final AudioPlayer audioPlayer = new AudioPlayer();

        Assert.assertEquals("mp4 format should be played", "mp4 is playing",
                audioPlayer.play("mp4"));
        Assert.assertEquals("mp3 format should be played", "mp3 is playing",
                audioPlayer.play("mp3"));
        Assert.assertEquals("vlc format should be played", "vlc is playing",
                audioPlayer.play("vlc"));
        Assert.assertEquals("undefined format", "undefined format", audioPlayer.play("wav"));
    }
}
