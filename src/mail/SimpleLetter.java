/**
 * 
 */
package mail;

import content.TextContent;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class SimpleLetter extends Letter<TextContent> {
	
	public SimpleLetter(String s){
		this.content = new TextContent(s);
	}

	/* (non-Javadoc)
	 * @see mail.Letter#doAction()
	 */
	@Override
	protected void doAction() {
		// TODO Auto-generated method stub
		
	}

}
