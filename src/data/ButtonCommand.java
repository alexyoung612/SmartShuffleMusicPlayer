package data;


/**
 * enum for button input commands and string representations for all buttons
 * @author Alex Young
 */
public enum ButtonCommand {
	PLAY("Play"), PAUSE("Pause"), PREVIOUS("<"), NEXT(">");
	
	private final String buttonText;
	
	
	/**
	 * @param buttonText to set
	 */
	private ButtonCommand(String buttonText){
		this.buttonText = buttonText;
	}
	
	@Override
	public String toString(){
		return buttonText;
	}
}
