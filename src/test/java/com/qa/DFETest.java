package com.qa;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DFETest {
	
	@Test
	public void basicTest() {
		assertEquals(2, 1 + 1);
		
	}
	@Test
	public void testFail() {
		assertEquals(3, 1 + 1);
	}
		
		
	}


