package by.iba.gomel;

/**
 * This class implements the MediaPlayer interface. The play() method is used to play various audio
 * formats (as mp4, vlc etc.). To add new format a new class should be created and added as a new
 * case to the switch operator. If format is undefined - returns 'undefined format'.
 */
public class MediaAdapter implements MediaPlayer {

    @Override
    public String play(final String audio) {
        String returningAdvancedFormat;

        switch (audio) {
            case "mp4":
                final Mp4Player mp4 = new Mp4Player();
                returningAdvancedFormat = mp4.playAdvancedFormat();
                break;
            case "vlc":
                final VlcPlayer vlc = new VlcPlayer();
                returningAdvancedFormat = vlc.playAdvancedFormat();
                break;
            default:
                returningAdvancedFormat = "undefined format";
        }
        return returningAdvancedFormat;
    }
}
