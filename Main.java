package day1;
import java.util.ArrayList;
interface Playable {
	
    void play();
    void pause();
    void stop();
}

// MusicPlayer.java
 class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}

 class VideoPlayer implements Playable {
	    @Override
	    public void play() {
	        System.out.println("Video is playing.");
	    }

	    @Override
	    public void pause() {
	        System.out.println("Video is paused.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Video has stopped.");
	    }
	}
public class Main {

	public static void main(String[] args) {
		ArrayList<Playable> playableList = new ArrayList<>();

        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        playableList.add(musicPlayer);
        playableList.add(videoPlayer);

        for (Playable playable : playableList) {
            playable.play();
            playable.pause();
            playable.stop();
            System.out.println("---------");

	}

}
}