package content;

import mail.Letter;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class LetterContent implements Content {

	private Letter<?> letter;
	
//	CONSTRUCTOR
	public LetterContent(Letter<?> l){
		this.letter = l;
	}
	
	
//	SETTERS AND GETTERS
	/**
	 * @return the Letter which is the content
	 */
	public Letter<?> getLetter(){
		return this.letter;
	}
	
	
	/* (non-Javadoc)
	 * @see mail.Content#getDescription()
	 */
	public String getDescription() {
		return this.letter.description();

	}

	/* (non-Javadoc)
	 * @see mail.Content#getAmount()
	 */
	public int getAmount() {
		return letter.getContent().getAmount();

	}

}
