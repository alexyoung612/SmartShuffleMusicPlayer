package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import data.ButtonCommand;

/**
 * MVC view for MusicPlayer
 * @author Alex Young
 *
 */
public class MusicPlayerView {

	// swing objects
	private JFrame frame;
	private JPanel bottomPanel;
	private JButton btnPrevious;
	private JButton btnPlayPause;
	private JButton btnNext;
	private JList<String> songDisplayList;
	
	// testing list display
	private static final String[] TEST_DISPLAY_STRINGS = {"this", "is", "a", "test"};
	/**
	 * Launch the application. for testing only. this will be done from outside of the view.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerView window = new MusicPlayerView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MusicPlayerView() {
		initialize();
	}
	public MusicPlayerView(ListSelectionListener songDisplayListener, ActionListener buttonListener){
		initialize();
		setButtonActionListener(buttonListener);
		setSongDisplayListener(songDisplayListener);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//topPanel = new JPanel();
		//frame.getContentPane().add(topPanel, BorderLayout.CENTER);
		
		bottomPanel = new JPanel();
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		btnPrevious = new JButton("<");
//		btnPrevious.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
		bottomPanel.add(btnPrevious);
		
		btnPlayPause = new JButton("Play");
		bottomPanel.add(btnPlayPause);
		
		btnNext = new JButton(">");
//		btnNext.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		bottomPanel.add(btnNext);
		

		//JList list = new JList(); 
		songDisplayList = new JList<String>(TEST_DISPLAY_STRINGS); // this line for testing purposes
		
		
		songDisplayList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.getContentPane().add(songDisplayList, BorderLayout.CENTER);
		
		//list.addListSelectionListener(new ListSelectionListener() {
		//      public void valueChanged(ListSelectionEvent le) {
		//        int idx = list.getSelectedIndex();
		//        if (idx != -1)
		          //System.out.println("Current selection: " + languages[idx]);
		//        else
		          //System.out.println("Please choose a language.");
		//      }
		//    });
	}
	
	/**
	 * change the text of the play/pause button
	 * @param text the string to set to play/pause
	 */
	public void setBtnPlayPauseText(String text){
		if(btnPlayPause == null || text == null){
			return;
		}
		btnPlayPause.setText(text);
	}
	
	/**
	 * add actionListener to all the buttons
	 * @param listener to connect to all buttons
	 */
	public void setButtonActionListener(ActionListener listener){
		btnPrevious.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnPlayPause.addActionListener(listener);
	}

	/**
	 * add ListSelectionListener to the songDisplayList
	 * @param listener to connect to songDisplayList
	 */
	public void setSongDisplayListener(ListSelectionListener listener){
		songDisplayList.addListSelectionListener(listener);
	}

}
