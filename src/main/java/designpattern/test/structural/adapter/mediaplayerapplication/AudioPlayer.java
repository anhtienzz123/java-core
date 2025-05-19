package designpattern.test.structural.adapter.mediaplayerapplication;

// Client
public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;
	private MediaClassAdapter mediaClassAdapter;

	public AudioPlayer() {
		this.mediaAdapter = new MediaAdapter();
		this.mediaClassAdapter = new MediaClassAdapter();
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			// Object Adapter
			mediaAdapter.play(audioType, fileName);
			
			// Class Adapter
			mediaClassAdapter.play(audioType, fileName);
		}else if (audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("mp4")) {
			System.out.println("Playing " + audioType + " file: " + fileName);
		}else {
			System.out.println("Invalid media type: " + audioType);
		}
		
	}

}
