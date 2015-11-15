package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InhabitantTest {

	private Inhabitant monsieur;
	private City city;
	private BankAccount cb;
	
	@Before
	public void initialize(){
		this.cb = new BankAccount(5000);
		this.city = new City("Lille");
		this.monsieur = new Inhabitant("Bob",city,cb);
	}
	
	@Test
	public void testInhabitant() {
		assertNotNull(monsieur);
	}

	@Test
	public void testGetName() {
		assertEquals(monsieur.getName(),"Bob");
	}

	@Test
	public void testGetCity() {
		assertEquals(monsieur.getCity(), city);
	}

	@Test
	public void testGetB() {
		assertEquals(monsieur.getB(), cb);
	}

}
