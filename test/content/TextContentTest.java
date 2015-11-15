package content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextContentTest {

	private TextContent textC;
	
	@Before
	public void initialize(){
		this.textC = new TextContent("Hello World",false);
	}
	
	@Test
	public void testTextContent() {
		assertNotNull(this.textC);
	}

	@Test
	public void testIsThanks() {
		assertFalse(this.textC.isThanks());
	}

	@Test
	public void testGetDescription() {
		assertEquals(this.textC.getDescription(), "a text content (" + this.textC.getText() + ")");
	}

	@Test
	public void testGetAmount() {
		assertEquals(this.textC.getAmount(),0);
	}

}
