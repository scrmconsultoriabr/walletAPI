package com.wallet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWord extends TestCase{
	
	@Test
	public void testHelloWorld() {
		assertEquals(1,1);
	}

}
