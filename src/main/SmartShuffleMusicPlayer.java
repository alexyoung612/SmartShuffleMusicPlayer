/**
 * 
 */
package main;

import data.MusicPlayer;

/**
 * @author alexy
 *
 */
public class SmartShuffleMusicPlayer {

	public static final String TEST_AUDIOFILE_PATH = "C:/Users/alexy/Music/Dreams.wav";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play(TEST_AUDIOFILE_PATH);
    }
}
