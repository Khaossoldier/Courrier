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
	
	
//	CONSTRUCTOR
	public TextContent(String s){
		this.text = s;
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
	
	
//	METHODS
	/**
	 * @return <code> true </code> if the the Letter is a thanks letter
	 * <code> false </code> if it is not
	 */
	public boolean isThanks(){
		return this.text.equals("Thank you");
	}

}
