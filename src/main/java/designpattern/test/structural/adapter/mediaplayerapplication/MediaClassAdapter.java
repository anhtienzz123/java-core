package designpattern.test.structural.adapter.mediaplayerapplication;

public class MediaClassAdapter extends LegacyMediaPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String filename) {
		if (audioType.equalsIgnoreCase("mp3")) {
			this.playMp3(filename);
		} else {
			System.out.println("Unsupported audio type: " + audioType);
		}
	}
}
