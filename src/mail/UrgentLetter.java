/**
 * 
 */
package mail;

import city.Inhabitant;
import content.LetterContent;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class UrgentLetter extends Letter<LetterContent> {

	
//	CONSTRUCTOR
	/**
	 * @param cost
	 * @param sender
	 * @param receiver
	 */
	public UrgentLetter(int cost, Inhabitant sender, Inhabitant receiver, LetterContent l) {
		super(cost, sender, receiver);
		this.content = l;
	}
	
	
//	GETTER
	public int getCost(){
		return this.getContent().getLetter().getCost() * 2;
	}
	
//	METHODS
	/* (non-Javadoc)
	 * @see mail.Letter#description()
	 */
	public String description(){
		return "an urgent letter whose content is " + this.getContent().getDescription();
	}
	
	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.getContent().getLetter().doAction();
	}

}
