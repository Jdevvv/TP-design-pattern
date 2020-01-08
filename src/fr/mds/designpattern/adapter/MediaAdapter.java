package fr.mds.designpattern.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		if (type.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (type.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String type, String name) {
			if (type.equalsIgnoreCase("vlc")) {
				advancedMediaPlayer.playVlc(name);
			} else if (type.equalsIgnoreCase("mp4")) {
				advancedMediaPlayer.playMp4(name);
			}
	}	

	
	
}
