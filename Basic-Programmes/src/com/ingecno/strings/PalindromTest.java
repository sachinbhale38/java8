package com.ingecno.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalindromTest {
	
	@Test
	public void checkPalindromStringTest() {
		Palindrom ppp=new Palindrom();
		
		Boolean result=ppp.checkPalindromString("sas");
		Assert.assertTrue(result);		
	
		


		
	}

}
