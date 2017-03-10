package homework3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class primeTest {
	public prime tes = null;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("begin");
		tes = new prime();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("end");
	}

	@Test
	public void testPrintPrimes() {
		assertEquals("2 3 5 ",tes.printPrimes(3));
		System.out.println(tes.printPrimes(3));
		//fail("Not yet implemented");
	}
}
