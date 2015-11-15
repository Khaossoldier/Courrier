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
		this.cb1 = new BankAccount(5000);
		this.cb2 = new BankAccount(5000);
		this.city = new City("Lille");
		this.monsieur = new Inhabitant("Bob",city,cb1);
		this.monsieur = new Inhabitant("Mamy",city,cb2);
		this.city.getInhabitant().add(this.monsieur);
		this.city.getInhabitant().add(this.madame);
		this.letter = new SimpleLetter(1,monsieur,madame,"blabla", false);
		this.letterC = new LetterContent(this.letter);
		this.urgent = new UrgentLetter(0, monsieur, madame, this.letterC);
	}
	
	@Test
	public void testUrgentLetter() {
		assertNotNull(this.urgent);
	}
	
	@Test
	public void testGetCost() {
		assertEquals(this.urgent.getCost(), 2);
	}

	@Test
	public void testDescription() {
		assertEquals(this.urgent.description(), "an urgent letter whose content is " + this.urgent.getContent().getDescription());
	}

	@Test
	public void testDoAction() {
		urgent.doAction();
		assertEquals(this.monsieur.getB().getAmount(), 4998);
	}

}
