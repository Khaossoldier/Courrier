/**
 * 
 */
package mail;

import city.Inhabitant;
import content.PromissoryContent;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class PromissoryLetter extends Letter<PromissoryContent> {

	/**
	 * @param cost
	 * @param sender
	 * @param receiver
	 */
	public PromissoryLetter(int cost, Inhabitant sender, Inhabitant receiver, PromissoryContent c) {
		super(cost, sender, receiver);
		this.content = c;
		// TODO Auto-generated constructor stub
	}
	
	public String description(){
		return "a promissory note letter whose content is " + this.getContent().getDescription();
	}

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
		Inhabitant sender = this.getSender();
		Inhabitant receiver = this.getReceiver();
		
		//Credit et debit des comptes en banque
		sender.getB().debit(1 + this.getContent().getAmount());
		receiver.getB().credit(this.getContent().getAmount());
		
		sender.getCity().sendLetter(new SimpleLetter(1, this.getReceiver(), this.getSender(), "Thank you"));
		
	}

}
