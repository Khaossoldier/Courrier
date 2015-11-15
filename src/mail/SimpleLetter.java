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
	
	
//	CONSTRUCTOR
	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, String s, boolean thank) {
		super(cost, sender, receiver);
		this.content = new TextContent(s, thank);
	}

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
		this.getSender().getB().debit(1);
		
	}

	/* (non-Javadoc)
	 * @see mail.Letter#description()
	 */
	public String description(){
		String s = "";
		if (this.getContent().isThanks()){
			s = "a thanks letter which is";
		}
		return s + "a simple letter whose content is " + this.getContent().getDescription();
	}

}
