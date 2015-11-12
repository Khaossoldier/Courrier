/**
 * 
 */
package city;

import java.util.*;

import mail.Letter;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class City {

	private final String name;
	private List<Inhabitant> inhabitant;
	private List<Letter<?>> postbox;
	
	
	/**
	 * @param name
	 */
	public City(String name){
		this.name = name;
		this.inhabitant = new ArrayList<Inhabitant>();
		this.postbox = new ArrayList<Letter<?>>();
	}

	public String getName() {
		return name;
	}

	public List<Inhabitant> getInhabitant() {
		return inhabitant;
	}

	public List<Letter<?>> getPostbox() {
		return postbox;
	}
	
	public void sendLetter(Letter<?> l){
		this.getPostbox().add(l);
		System.out.println(l.getSender() + " mails " + l.description() + " to " + l.getReceiver() + " for a cost of " + l.getCost() + " euros.");
	}
	
	public void distributeLetter(){
		
		List<Letter<?>> bag = new LinkedList<Letter<?>>(this.postbox);
		
		this.postbox.clear();
		
		for (Letter<?> l : bag){
			l.getReceiver().receiveLetter(l);
			System.out.println(l.getSender() + " receives " + l.description() + " from " + l.getSender());
		}
		
	}
	
}
