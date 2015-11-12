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
	
	
//	SETTERS AND GETTERS
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	/**
	 * @param amount
	 */
	public void credit(int amount){
		this.setAmount(this.getAmount() + amount);
	}
	
	/**
	 * @param amount
	 */
	public void debit(int amount){
		this.setAmount(this.getAmount() - amount);
	}
	
}
