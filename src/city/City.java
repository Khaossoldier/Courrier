/**
 * 
 */
package city;

import java.util.LinkedList;
import java.util.List;

import mail.Letter;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class City {

	private String name;
	private List<Inhabitant> inhabitant;
	private List<Letter> postbox;
	
	

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

	public List<Letter> getPostbox() {
		return postbox;
	}

	public void setPostbox(List<Letter> postbox) {
		this.postbox = postbox;
	}
	
	
	
	
	public void sendLetter(){
		//TODO add letter in the postbox
	}
	
	public void distributeLetter(){
		
		List<Letter> bag = new LinkedList<Letter>(this.postbox);
		
		for (Letter l : bag){
			l.getReceiver().receiveLetter(l);
		}
		
	}
	
}
