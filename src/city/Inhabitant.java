/**
 * 
 */
package city;

import mail.Letter;

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
	/**
	 * @param name
	 * @param c
	 * @param b
	 */
	public Inhabitant(String name, City c, BankAccount b){
		this.name = name;
		this.city = c;
		this.b = b;
	}
	
//	SETTERS AND GETTER
	/**
	 * @return the name of the Inhabitant
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the Inhabitant's city
	 */
	public City getCity() {
		return city;
	}
	
	/**
	 * @return the bank account of the Inhabitant
	 */
	public BankAccount getB() {
		return b;
	}
	
	/**
	 * @param l
	 */
	public void receiveLetter(Letter<?> l){
		l.doAction();
	}
}
