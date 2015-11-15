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
	
	
	
//	CONSTRUCTOR
	/**
	 * @param name
	 */
	public City(String name){
		this.name = name;
		this.inhabitant = new ArrayList<Inhabitant>();
		this.postbox = new ArrayList<Letter<?>>();
	}

	
//	SETTERS AND GETTERS
	/**
	 * @return the name of the City
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the list of inhabitants
	 */
	public List<Inhabitant> getInhabitant() {
		return inhabitant;
	}

	/**
	 * @return the list of the letters in the postbox of the city
	 */
	public List<Letter<?>> getPostbox() {
		return postbox;
	}
	
	
//	METHODS
	/**
	 * Add a letter in the postbox
	 * @param l
	 */
	public void sendLetter(Letter<?> l){
		this.getPostbox().add(l);
		l.getSender().getB().debit(l.getCost());
		switch(l.getCost()){
		case 0: System.out.println("-> " + l.getSender().getName() + " mails " + l.description() + " to " + l.getReceiver().getName());
				break;
		case 1: System.out.println("-> " + l.getSender().getName() + " mails " + l.description() + " to " + l.getReceiver().getName() + " for a cost of " + l.getCost() + " euro");
				break;
		default: System.out.println("-> " + l.getSender().getName() + " mails " + l.description() + " to " + l.getReceiver().getName() + " for a cost of " + l.getCost() + " euros");
				break;
		}
		l.printDebit(l.getSender(), l.getCost());
	}
	
	/**
	 * Distributes all the letters in the city and adds the thanks letter in the postbox
	 */
	public void distributeLetter(){
		
		List<Letter<?>> bag = new LinkedList<Letter<?>>(this.postbox);
		
		this.postbox.clear();
		
		for (Letter<?> l : bag){
			System.out.println("<- " + l.getReceiver().getName() + " receives " + l.description() + " from " + l.getSender().getName());
			l.getReceiver().receiveLetter(l);
		}
		
	}
	
}
