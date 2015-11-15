/**
 * 
 */
package content;


/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class TextContent implements Content {

	private String text;
	private boolean thank;
	
//	CONSTRUCTOR
	public TextContent(String s, boolean thank){
		this.text = s;
		this.thank = thank;
	}
	
	
//	SETTERS AND GETTERS
	/* (non-Javadoc)
	 * @see mail.Content#getDescription()
	 */
	public String getDescription() {
		return ("a text content (" + this.text + ")");

	}

	/* (non-Javadoc)
	 * @see mail.Content#getAmount()
	 */
	public int getAmount() {
		return 0;

	}
	
	/**
	 * @return the text
	 * Getter of text
	 */
	public String getText(){
		return this.text;
	}
	
	/**
	 * @return <code> true </code> if the the Letter is a thanks letter
	 * <code> false </code> if it is not
	 */
	public boolean isThanks(){
		return this.thank;
	}

}
