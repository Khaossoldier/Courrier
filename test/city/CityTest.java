package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mail.SimpleLetter;

public class CityTest {

	private Inhabitant monsieur;
	private Inhabitant madame;
	private City city;
	private BankAccount cb1;
	private BankAccount cb2;
	private SimpleLetter letter;
	
	@Before
	public void initialize(){
		this.cb1 = new BankAccount(5000);
		this.cb2 = new BankAccount(5000);
		this.city = new City("Lille");
		this.monsieur = new Inhabitant("Bob",city,cb1);
		this.madame = new Inhabitant("Mamy",city,cb2);
		this.city.getInhabitant().add(this.monsieur);
		this.city.getInhabitant().add(this.madame);
		this.letter = new SimpleLetter(1,monsieur,madame,"blabla", 0);
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
		assertEquals(this.city.getInhabitant().get(0),this.monsieur);
		assertEquals(this.city.getInhabitant().get(1),this.madame);
		assertEquals(this.city.getInhabitant().size(),2);
	}
	
	@Test
	public void testSendLetterAndGetPostbox() {
		this.city.sendLetter(this.letter);
		assertEquals(this.city.getPostbox().get(0),this.letter);
	}

	@Test
	public void testDistributeLetter() {
		this.city.sendLetter(this.letter);
		this.city.distributeLetter();
		assertEquals(this.monsieur.getB().getAmount(),4999);
		assertTrue(this.city.getPostbox().isEmpty());
	}

}
