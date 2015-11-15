package mail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.BankAccount;
import city.City;
import city.Inhabitant;
import content.LetterContent;

public class RegisterLetterTest {

	private int cost;
	private BankAccount b1;
	private BankAccount b2;
	private City c;
	private Inhabitant monsieur;
	private Inhabitant madame;
	private LetterContent content;
	private Letter<LetterContent> l;
	
	@Before
	public void initTest(){
		cost = 1;
		b1 = new BankAccount(5000);
		b2 = new BankAccount(5000);
		c = new City("Lille");
		monsieur = new Inhabitant("Bob", c, b1);
		madame = new Inhabitant("Gertrude", c, b2);
		content = new LetterContent(new SimpleLetter(1, monsieur, madame, "text", false));
		l = new RegisterLetter(cost, monsieur, madame, content);
	}
	
	@Test
	public void testGetCost() {
		assertEquals(l.getCost(), 16);
	}

	@Test
	public void testDescription() {
		assertEquals(l.description(), "a registered letter whose content is " + l.getContent().getDescription());
	}

	@Test
	public void testDoAction() {
		l.doAction();
		assertEquals(b1.getAmount(), 4984);
	}

	@Test
	public void testRegisterLetter() {
		assertNotNull(l);
	}

}
