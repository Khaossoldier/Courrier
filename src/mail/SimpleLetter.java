/**
 * 
 */
package mail;

import city.Inhabitant;
import content.TextContent;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class SimpleLetter extends Letter<TextContent> {
	
	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, String s) {
		super(cost, sender, receiver);
		this.content = new TextContent(s);
	}

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.getSender().getB().debit(1);
		
	}

	public String description(){
		String s = "";
		if (this.getContent().isThanks()){
			s = "a thanks letter which is";
		}
		return s + "a simple letter whose content is " + this.getContent().getDescription();
	}

}
