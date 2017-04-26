package data;

import java.util.EnumSet;
import java.util.HashMap;

/**
 * enum for button input commands and string representations for all buttons
 * @author Alex Young
 */
public enum ButtonCommand {
	PLAY("Play"), PAUSE("Pause"), PREVIOUS("<"), NEXT(">");
	
	private final String buttonText;
	
	private static final HashMap<String,ButtonCommand> lookup = new HashMap<String,ButtonCommand>();

	static {
	for(ButtonCommand b : EnumSet.allOf(ButtonCommand.class))
	    lookup.put(b.toString(), b);
	}
	/**
	 * @param buttonText to set
	 */
	private ButtonCommand(String buttonText){
		this.buttonText = buttonText;
	}
	
	public static ButtonCommand get(String s) { 
        return lookup.get(s); 
    }
    
	@Override
	public String toString(){
		return buttonText;
	}
	
}
