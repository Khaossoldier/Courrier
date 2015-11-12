/**
 * 
 */
package mail;

import city.Inhabitant;
import content.Content;
import content.PromissoryContent;
import content.TextContent;

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
		TextContent c = new TextContent("Thank you");
		
		//Credit et debit des comptes en banque
		sender.getB().debit(1 + this.getContent().getAmount());
		receiver.getB().credit(this.getContent().getAmount());
		
		sender.getCity().sendLetter(new SimpleLetter(c));
		
	}

}
