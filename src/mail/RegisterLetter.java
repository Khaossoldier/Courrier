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
public class RegisterLetter extends Letter<LetterContent> {

	
//	CONSTRUCTOR
	/**
	 * @param cost
	 * @param sender
	 * @param receiver
	 */
	public RegisterLetter(int cost, Inhabitant sender, Inhabitant receiver, LetterContent l) {
		super(cost, sender, receiver);
		this.content = l;
	}
	
	
//	GETTER
	/* (non-Javadoc)
	 * @see mail.Letter#getCost()
	 */
	public int getCost(){
		return this.getContent().getLetter().getCost() + 15;
	}
	
	
//	METHODS
	/* (non-Javadoc)
	 * @see mail.Letter#description()
	 */
	public String description(){
		return "a registered letter whose content is " + this.getContent().getDescription();
	}

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {		
		this.content.getLetter().doAction();
		sender.getCity().sendLetter(new SimpleLetter(0, this.getReceiver(), this.getSender(), "aknowledgment of receipt for  " + this.description(), 2));
		
	}

}
