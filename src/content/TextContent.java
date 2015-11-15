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
	private int mode;
	
//	CONSTRUCTOR
	/**
	 * @param s
	 * @param mode
	 * Constructor of TextContent
	 * Mode define if it's a simplelettre (0), a thankletter (1) or a aknowledgment of receipt (2)
	 */
	public TextContent(String s, int mode){
		this.text = s;
		this.mode = mode;
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
		return this.mode == 1;
	}
	
	/**
	 * @return <code> true </code> if the the Letter is a aknowledgment of receipt
	 * <code> false </code> if it is not
	 */
	public boolean isAknowledgment(){
		return this.mode == 2;
	}

}
