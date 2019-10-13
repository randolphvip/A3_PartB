

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weltec.IT7320.assignment3.A3_partB.Arithmetic;

public class ArithmeticTest3 {
	Arithmetic obj =null;
	int x,y, expect, actual;
	@Before
	public void setUp() throws Exception {
		obj = new Arithmetic(10,12);
		actual=obj.add(x, y);
		expect= x+y;
	}
	@Test
	public final void test2() {
		assertEquals(expect,actual);
	}
	
	@Test
	public final void test7() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test8() {
		assertEquals(expect,actual);
	}


	@After
	public void tearDown() throws Exception {
		Arithmetic obj =null;
	}

	
}
