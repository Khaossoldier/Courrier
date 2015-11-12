package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CityTest {

	private Inhabitant monsieur;
	private City city;
	private BankAccount cb;
	
	@Before
	public void initialize(){
		this.cb = new BankAccount();
		this.city = new City("Lille");
		this.monsieur = new Inhabitant("Bob",city,cb);
	}
	
	@Test
	public void testCity() {
		assertNotNull(this.city);
	}

	@Test
	public void testGetName() {
		assertEquals(this.city.getName(),"Lille");
	}

	@Test
	public void testGetInhabitant() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetPostbox() {
		fail("Not yes implemented");
	}

	@Test
	public void testSendLetter() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistributeLetter() {
		fail("Not yet implemented");
	}

}
