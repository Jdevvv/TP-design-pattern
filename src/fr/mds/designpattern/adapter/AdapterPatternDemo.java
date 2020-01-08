package fr.mds.designpattern.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "feel_good.mp3");
		audioPlayer.play("mp4", "watch_me_nae_nae.mp4");
		audioPlayer.play("avi", "la_moulaga.avi");
		audioPlayer.play("vlc", "old_town_road.vlc");

		MediaPlayer player = new MediaAdapter("mp4");
		player.play("mp4", "jazz.mp4");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "rock.mp4");
	}
}
