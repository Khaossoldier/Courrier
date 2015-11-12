/**
 * 
 */
package city;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class Inhabitant {
	
	private String name;
	private City city;
	private BankAccount b;
	
//	CONSTRUCTOR
	public Inhabitant(String name, City c, BankAccount b){
		this.name = name;
		this.city = c;
		this.b = b;
	}
	
//	SETTERS AND GETTER
	public String getName() {
		return name;
	}
	public City getCity() {
		return city;
	}
	public BankAccount getB() {
		return b;
	}
	
	public void receiveLetter(Letter<C>){
		
	}
}
