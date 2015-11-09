/**
 * 
 */
package mail;

import city.Inhabitant;
import content.Content;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public abstract class Letter <C extends Content> {

	private int cost;
	private Inhabitant sender;
	private Inhabitant receiver;
	private C content;
	
	public Letter(){
		
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public C getContent(){
		return this.content;
	}
	
	public void description(){
		
	}
	
	protected abstract void doAction();
}
