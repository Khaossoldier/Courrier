/**
 * 
 */
package content;


/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class PromissoryContent implements Content {
	
	private int amount;
	
	
//	CONSTRUCTOR
	public PromissoryContent(int tune){
		this.amount = tune;
	}

	
//	SETTERS AND GETTERS
	/* (non-Javadoc)
	 * @see mail.Content#getDescription()
	 */
	public String getDescription() {
		return ("a money content (" + this.amount + ")");

	}

	/* (non-Javadoc)
	 * @see mail.Content#getAmount()
	 */
	public int getAmount() {
		return amount;

	}

}
