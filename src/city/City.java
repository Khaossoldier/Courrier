/**
 * 
 */
package city;

import java.util.*;

import content.Content;

import mail.Letter;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class City {

	private String name;
	private List<Inhabitant> inhabitant;
	private List<Letter<Content>> postbox;
	
	
	/**
	 * @param name
	 */
	public City(String name){
		this.name = name;
		this.inhabitant = new ArrayList<Inhabitant>();
		this.postbox = new ArrayList<Letter<Content>>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Inhabitant> getInhabitant() {
		return inhabitant;
	}

	public void setInhabitant(List<Inhabitant> inhabitant) {
		this.inhabitant = inhabitant;
	}

	public List<Letter<Content>> getPostbox() {
		return postbox;
	}

	public void setPostbox(List<Letter<Content>> postbox) {
		this.postbox = postbox;
	}
	
	public void sendLetter(Letter<Content> l){
		this.getPostbox().add(l);
	}
	
	public void distributeLetter(){
		
		List<Letter<Content>> bag = new LinkedList<Letter<Content>>(this.postbox);
		
		this.postbox.clear();
		
		for (Letter<Content> l : bag){
			l.getReceiver().receiveLetter(l);
		}
		
	}
	
}
