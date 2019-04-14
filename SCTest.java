package SumCoding;

import static org.junit.Assert.*;

import org.junit.Test;

public class SCTest {

	@Test
	public void testSum1() {
		assertEquals(0,new SC().sum(new int [] {}));
	}

	@Test
	public void testSum2() {
		assertEquals(20,new SC().sum(new int[] {-2,11,-4,13,-5,-2} ));
	}
	
	@Test
	public void testSum3(){
		assertEquals(0, new SC().sum(new int[] {-1,-2,-3,-4,-5,-6} ));
	}

}
