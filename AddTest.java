import static org.junit.Assert.*;

import org.junit.Test;


public class AddTest {

	@Test
	public void Addtest() {
		Exp n = new Exp();
		int result = n.add(7, 9);
		assertEquals(16,result);
		
		
	}

}
