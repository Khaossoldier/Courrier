package mail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.BankAccount;
import city.City;
import city.Inhabitant;
import content.LetterContent;

public class UrgentLetterTest {

	private Inhabitant monsieur;
	private Inhabitant madame;
	private City city;
	private BankAccount cb1;
	private BankAccount cb2;
	private SimpleLetter letter;
	private LetterContent letterC;
	private UrgentLetter urgent;
	
	@Before
	public void initialize(){
		cb1 = new BankAccount(5000);
		cb2 = new BankAccount(5000);
		city = new City("Lille");
		monsieur = new Inhabitant("Bob",city,cb1);
		madame = new Inhabitant("Mamy",city,cb2);
		city.getInhabitant().add(monsieur);
		city.getInhabitant().add(madame);
		letter = new SimpleLetter(1,monsieur,madame,"blabla", 0);
		letterC = new LetterContent(this.letter);
		urgent = new UrgentLetter(0, monsieur, madame, letterC);
	}
	
	@Test
	public void testUrgentLetter() {
		assertNotNull(urgent);
	}
	
	@Test
	public void testGetCost() {
		assertEquals(urgent.getCost(), 2);
	}

	@Test
	public void testDescription() {
		assertEquals(urgent.description(), "an urgent letter whose content is " + this.urgent.getContent().getDescription());
	}

	@Test
	public void testDoAction() {
		city.sendLetter(urgent);
		
		city.distributeLetter();
		assertEquals(cb1.getAmount(), 4998);
	}

}
