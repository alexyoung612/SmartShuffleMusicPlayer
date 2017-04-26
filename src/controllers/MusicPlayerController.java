/**
 * 
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import data.ButtonCommand;
import models.SongListModel;
import views.MusicPlayerView;


/**
 * MVC controller for MusicPlayer
 * @author Alex Young
 */
public class MusicPlayerController{

	private MusicPlayerView view;
	private SongListModel model;
	
	/**
	 * constructor
	 * @param view to set
	 * @param model to set
	 */
	public MusicPlayerController(MusicPlayerView view, SongListModel model) {
		super();
		this.view = view;
		this.model = model;
		
	}

	/**
	 * method for pressed command button logic
	 * @param command the ButtonCommand to enter
	 */
	public void buttonPress(ButtonCommand command){
		switch(command){
		case PLAY:
			view.setBtnPlayPauseText(ButtonCommand.PAUSE.toString());
			//model.playSong(view.getSelectedSong());
			break;
		case PAUSE:
			view.setBtnPlayPauseText(ButtonCommand.PLAY.toString());
			//model.stopSong();
			break;
		case PREVIOUS:
			break;
		case NEXT:
			break;
		default:
			System.out.println("invalid button command");
			break;
		}
	}
	
	/**
	 * connects listeners to the view
	 */
	public void connectListeners(){
		view.setButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO add enums for single button listener
			}
		});
	}
}
