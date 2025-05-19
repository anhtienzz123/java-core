package designpattern.test.structural.adapter.mediaplayerapplication;

// Adaptee
public class LegacyMediaPlayer {

	public void playMp3(String fileName) {
		System.out.println("Playing MP3 file: " + fileName);
	}
}
