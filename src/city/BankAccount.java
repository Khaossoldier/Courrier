/**
 * 
 */
package city;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class BankAccount {
	
	private int amount;
	
//	CONSTRUCTOR
	/**
	 * Constructor of BankAccount
	 * Put the amout to 5000
	 */
	public BankAccount(int amount){
		this.amount = amount;
	}
	
//	SETTERS AND GETTERS
	/**
	 * @return the amount
	 * Getter of amout
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 * Setter of amout
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
//	METHODS
	/**
	 * @param amount
	 * Credit cash to the amout
	 */
	public void credit(int amount){
		this.setAmount(this.getAmount() + amount);
	}
	
	/**
	 * @param amount
	 * Debit cash to the amout
	 */
	public void debit(int amount){
		this.setAmount(this.getAmount() - amount);
	}
	
}
