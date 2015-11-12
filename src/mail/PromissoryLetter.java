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

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	protected void doAction() {
		Inhabitant sender = this.getSender();
		Inhabitant receiver = this.getReceiver();
		
		//Credit et debit des comptes en banque
		sender.getB().debit(1 + this.getContent().getAmount());
		receiver.getB().credit(this.getContent().getAmount());
		
		sender.getCity().sendLetter(new SimpleLetter("Thank you"));
		
	}

}
