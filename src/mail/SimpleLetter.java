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
	
	/**
	 * @param cost
	 * @param sender
	 * @param receiver
	 * @param s
	 * @param mode
	 * Constructor of SimpleLetter
	 * Mode define if it's a simplelettre (0), a thankletter (1) or a aknowledgment of receipt (2)
	 */
	public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, String s, int mode) {
		super(cost, sender, receiver);
		this.content = new TextContent(s, mode);
	}

//	METHODS
	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	public void doAction() {
				
	}

	/* (non-Javadoc)
	 * @see mail.Letter#description()
	 */
	public String description(){
		String s = "";
		if (this.getContent().isThanks()){
			s = "a thanks letter which is ";
		}
		if (this.getContent().isAknowledgment()){
			s = "an aknowledgment of receipt which is ";
		}
		return s + "a simple letter whose content is " + this.getContent().getDescription();
	}

}
