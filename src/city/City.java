/**
 * 
 */
package city;

import java.util.LinkedList;
import java.util.List;

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
	
	
	
	
	public void sendLetter(){
		//TODO add letter in the postbox
	}
	
	public void distributeLetter(){
		
		List<Letter<Content>> bag = new LinkedList<Letter<Content>>(this.postbox);
		
		for (Letter<Content> l : bag){
			l.getReceiver().receiveLetter(l);
		}
		
	}
	
}
