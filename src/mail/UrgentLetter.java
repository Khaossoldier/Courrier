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

	/**
	 * @param cost
	 * @param sender
	 * @param receiver
	 */
	public UrgentLetter(int cost, Inhabitant sender, Inhabitant receiver, LetterContent l) {
		super(cost, sender, receiver);
		this.content = l;
	}
	
	public int getCost(){
		return this.getContent().getLetter().getCost() * 2;
	}
	
	public String description(){
		return "an urgent letter whose content is " + this.getContent().getDescription();
	}
	
	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.getSender().getB().debit(this.getCost());
		
	}

}
