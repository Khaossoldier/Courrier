package mail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.PromissoryContent;

import city.BankAccount;
import city.City;
import city.Inhabitant;

public class PromissoryLetterTest {

	private int cost;
	private BankAccount b1;
	private BankAccount b2;
	private City c;
	private Inhabitant monsieur;
	private Inhabitant madame;
	private PromissoryContent content;
	private Letter<PromissoryContent> l;
	
	@Before
	public void initTest(){
		cost = 1;
		b1 = new BankAccount(5000);
		b2 = new BankAccount(5000);
		c = new City("Lille");
		monsieur = new Inhabitant("Bob", c, b1);
		madame = new Inhabitant("Gertrude", c, b2);
		this.c.getInhabitant().add(this.monsieur);
		this.c.getInhabitant().add(this.madame);
		content = new PromissoryContent(25);
		l = new PromissoryLetter(cost, monsieur, madame, content);
		
	}
	
	@Test
	public void testDescription() {
		assertEquals(l.description(), "a promissory note letter whose content is " + l.getContent().getDescription());
	}

	@Test
	public void testDoAction() {
		c.sendLetter(l);
		c.distributeLetter();
		assertEquals(b1.getAmount(), 4974);
		assertEquals(b2.getAmount(), 5024);
	}

	@Test
	public void testPromissoryLetter() {
		assertNotNull(l);
	}

	@Test
	public void testGetCost() {
		assertEquals(l.getCost(), 1);
	}

	@Test
	public void testGetSender() {
		assertEquals(l.getSender(), monsieur);
	}

	@Test
	public void testGetReceiver() {
		assertEquals(l.getReceiver(), madame);
	}

	@Test
	public void testGetContent() {
		assertEquals(l.getContent(), content);
	}

}
