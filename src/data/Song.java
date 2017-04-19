/**
 * 
 */
package data;

/**
 * @author alexy
 *
 */
public class Song {

	private String fileName;
	private int rating;
	/**
	 * @param fileName
	 * @param rating
	 */
	public Song(String fileName, int rating) {
		super();
		this.fileName = fileName;
		this.rating = rating;
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
	
	
}
