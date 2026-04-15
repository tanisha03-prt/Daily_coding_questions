class MediaPlayer{
    void play(String mediaName){
        System.out.println(mediaName);
    }
}
class AudioPlayer extends MediaPlayer{
    void play(String mediaName){
        System.out.println(mediaName);
    }
}
class VideoPlayer extends MediaPlayer{
    void play(String mediaName){
        System.out.println(mediaName);
    }
}
public class ninth{
    public static void main(String[] args) {
        String mediaType = "AudioPlayer";
        String mediaName = "abc";
        MediaPlayer player;   
        if (mediaType.equalsIgnoreCase("AudioPlayer")) {
            player = new AudioPlayer();
        } else {
            player = new VideoPlayer();
        }
        player.play(mediaName);
    }
}
