import static org.junit.Assert.*;

import org.junit.Test;


public class ConcatTest {

	@Test
	public void test() {
		Exp t = new Exp();
		String x = t.ConCat("Hello", "World");
		assertEquals("HelloWorld",x);
	}

}
