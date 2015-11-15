package content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PromissoryContentTest {

	private PromissoryContent promC;
	
	@Before
	public void initialize(){
		this.promC = new PromissoryContent(500);
	}
	
	@Test
	public void testPromissoryContent() {
		assertNotNull(this.promC);
	}

	@Test
	public void testGetDescription() {
		assertEquals(this.promC.getDescription(),("a money content (" + this.promC.getAmount() + ")"));
	}

	@Test
	public void testGetAmount() {
		assertEquals(this.promC.getAmount(),500);
	}

}
