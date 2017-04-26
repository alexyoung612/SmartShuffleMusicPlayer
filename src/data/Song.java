/**
 * 
 */
package data;

/**
 * this class represents a Song for use in the MusicPlayer
 * @author Alex Young
 *
 */
public class Song {

	private String fileName;
	private int rating;
	/**
	 * constructor
	 * @param fileName to set
	 * @param rating to set
	 */
	public Song(String fileName, int rating) {
		super();
		setFileName(fileName);
		setRating(rating);
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return fileName;
	}
	
	
	
}
