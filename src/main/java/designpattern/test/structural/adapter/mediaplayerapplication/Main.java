package designpattern.test.structural.adapter.mediaplayerapplication;

public class Main {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "song.mp3");
		audioPlayer.play("wav", "audio.wav");
		audioPlayer.play("mp4", "video.mp4");
		audioPlayer.play("avi", "avi.mp3");
	}
}
