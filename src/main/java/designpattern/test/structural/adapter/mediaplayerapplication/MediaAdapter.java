package designpattern.test.structural.adapter.mediaplayerapplication;

// Adapter object
public class MediaAdapter implements MediaPlayer {

	private LegacyMediaPlayer legacyMediaPlayer;

	public MediaAdapter() {
		this.legacyMediaPlayer = new LegacyMediaPlayer();
	}

	@Override
	public void play(String audioType, String filename) {
		if (audioType.equalsIgnoreCase("mp3")) {
			legacyMediaPlayer.playMp3(filename);
		} else {
			System.out.println("Unsupported audio type: " + audioType);
		}

	}

}
