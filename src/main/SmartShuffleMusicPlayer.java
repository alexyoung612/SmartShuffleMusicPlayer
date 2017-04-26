/**
 * 
 */
package main;

import controllers.MusicPlayerController;
import data.MusicPlayer;
import models.SongListModel;
import views.MusicPlayerView;

/**
 * main class to set up MVC and MusicPlayer.
 * @author Alex Young
 *
 */
public class SmartShuffleMusicPlayer {

	// test path for audio
	public static final String TEST_AUDIOFILE_PATH = "C:/Users/alexy/Music/Dreams.wav";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare MVC
		MusicPlayerView view;
		SongListModel model;
		MusicPlayerController controller;
		
		// create MVC
		view = new MusicPlayerView();
		model = new SongListModel();
		controller = new MusicPlayerController(view, model);
		
		controller.start();
		
		// create MusicPlayer. currently used as a test
        //MusicPlayer player = new MusicPlayer();
        //player.play(TEST_AUDIOFILE_PATH);
    }
}
