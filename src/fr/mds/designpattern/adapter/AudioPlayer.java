package fr.mds.designpattern.adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String type, String name) {
		if (type.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + name);
		} else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type, name);
		} else {
			System.out.println("Type: " + type
					+ " not supported");
		}
	}


}
