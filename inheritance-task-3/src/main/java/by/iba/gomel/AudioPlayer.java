package by.iba.gomel;

/**
 * This class plays various audio formats. It implements the MediaPlayer interface. The play()
 * method plays mp3 by default and can play more formats using the MediaAdapter class.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public String play(final String audio) {
        String returningAudioFormat;

        if ("mp3".equals(audio)) {
            returningAudioFormat = "mp3 is playing";
        } else {
            final MediaAdapter mediaAdapter = new MediaAdapter();
            returningAudioFormat = mediaAdapter.play(audio);
        }
        return returningAudioFormat;
    }

}
