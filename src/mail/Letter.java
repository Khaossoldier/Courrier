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

	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected C content;
	
	public Letter(int cost, Inhabitant sender, Inhabitant receiver){
		this.cost = cost;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	
	public int getCost(){
		return this.cost;
	}
	
	public Inhabitant getSender(){
		return this.sender;
	}
	
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	public C getContent(){
		return this.content;
	}
	
	public abstract String description();
	
	public abstract void doAction();
}
