package by.iba.gomel;

/**
 * This interface plays media.
 */
public interface MediaPlayer {
    /**
     * Takes an audio to play and returns type of the playing audio.
     *
     * @param audio
     *            - a String variable, audio format
     * @return returns audio format or that format is undefined.
     */
    String play(String audio);

}
