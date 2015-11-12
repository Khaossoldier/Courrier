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
	
	public TextContent(String s){
		this.text = s;
	}
	
	public boolean isThanks(){
		return this.text.equals("Thank you");
	}
	
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

}
