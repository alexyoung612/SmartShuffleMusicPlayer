package models;

import java.util.ArrayList;
import java.io.File;
import java.io.FilenameFilter;

import data.MusicPlayer;
import data.Song;

/**
 * holds the List of songs, as well as the MusicPlayer with which to play them.
 * @author Alex Young
 */
public class SongListModel {

	// list of Songs
	private ArrayList<Song> songs;
	// path location of all song files
	private String filePath;
	// MusicPlayer with which to play songs
	private MusicPlayer player;
	
	public static final String DEFAULT_PATH_LOCATION = "C:/Users/alexy/Music/";
	
	//test purposes. mp3 not currently supported.
	public static final String[] SUPPORTED_EXTENSIONS = {"wav", "mp3"};
	
	/**
	 * constructor
	 */
	public SongListModel(){
		filePath = DEFAULT_PATH_LOCATION;
	}
	/**
	 * overloaded constructor
	 * @param filePath to set
	 */
	public SongListModel(String filePath){
		this.filePath = filePath;
	}
	
	/**
	 * add a song to the list
	 * @param song to add
	 */
	public void addSong(Song song){
		if(song != null){
			songs.add(song);
		}
	}
	
	/**
	 * add a song to the list
	 * @param song String filepath of song to add
	 */
	public void addSong(String song){
		if(song != null){
			//TODO add song if exists in filePath
		}
	}
	
	/**
	 * load all songs from filepath directory to list.
	 */
	public void loadSongs(){
		//TODO read all songs in file path and load to songs arraylist
		File dir = new File(filePath);
		dir.listFiles(new FilenameFilter() { 
            public boolean accept(File dir, String filename)
                 { return filename.endsWith(".wav"); }
		});
	}
	
	/**
	 * play a single song with the MusicPlayer
	 * @param index the index of the song to play from the songs List
	 */
	public void playSong(int index) {
		if(songs.size() > index){
			if(songs.get(index) != null){
				player.play(filePath + songs.get(index).toString());
			}
		}
	}
}
