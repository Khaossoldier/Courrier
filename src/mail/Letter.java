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
	
//	CONSTRUCTOR
	public Letter(int cost, Inhabitant sender, Inhabitant receiver){
		this.cost = cost;
		this.sender = sender;
		this.receiver = receiver;
	}
	
//	SETTERS AND GETTERS
	/**
	 * @return the cost of the letter
	 */
	public int getCost(){
		return this.cost;
	}
	
	/**
	 * @return the sender of the letter
	 */
	public Inhabitant getSender(){
		return this.sender;
	}
	
	/**
	 * @return the receiver of the letter
	 */
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	/**
	 * @return the content of the letter
	 */
	public C getContent(){
		return this.content;
	}
	
//	METHODS
	/**
	 * @return the description of the letter and of its content
	 */
	public abstract String description();
	
	/**
	 * Triggers the action to achieve depending on the type of the letter
	 */
	public abstract void doAction();
}
