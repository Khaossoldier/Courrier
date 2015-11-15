package content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.BankAccount;
import city.City;
import city.Inhabitant;
import mail.SimpleLetter;

public class LetterContentTest {

	private Inhabitant monsieur;
	private Inhabitant madame;
	private City city;
	private BankAccount cb1;
	private BankAccount cb2;
	private SimpleLetter letter;
	private LetterContent letterC;
	
	@Before
	public void initialize(){
		this.cb1 = new BankAccount(5000);
		this.cb2 = new BankAccount(5000);
		this.city = new City("Lille");
		this.monsieur = new Inhabitant("Bob",city,cb1);
		this.monsieur = new Inhabitant("Mamy",city,cb2);
		this.city.getInhabitant().add(this.monsieur);
		this.city.getInhabitant().add(this.madame);
		this.letter = new SimpleLetter(1,monsieur,madame,"blabla");
		this.letterC = new LetterContent(this.letter);
	}
	
	@Test
	public void testLetterContent() {
		assertNotNull(this.letterC);
	}

	@Test
	public void testGetLetter() {
		assertEquals(this.letterC.getLetter(),)
	}

	@Test
	public void testGetDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAmount() {
		fail("Not yet implemented");
	}

}
