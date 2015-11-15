package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	private BankAccount cb;
	
	@Before
	public void initialize(){
		this.cb = new BankAccount(5000);
	}
	
	@Test
	public void testBankAccount() {
		assertNotNull(cb);
	}

	@Test
	public void testGetSetAmount() {
		assertEquals(cb.getAmount(), 5000);
		cb.setAmount(2000);
		assertEquals(cb.getAmount(), 2000);
	}

	@Test
	public void testDebitCredit() {
		cb.debit(1000);
		assertEquals(cb.getAmount(), 4000);
		cb.credit(4000);
		assertEquals(cb.getAmount(), 8000);
	}

}
