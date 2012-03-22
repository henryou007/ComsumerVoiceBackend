package edu.upenn.cis350.util.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.upenn.cis350.util.ProviderHelper;

public class ProviderHelperTest {
	
	ProviderHelper providerhelper;
	
	@Before
	public void setUp() throws Exception {
	
		providerhelper = ProviderHelper.getProviderHelper();
	}

	@Test
	public void testGetProviderAddress() {

		String testAddress = providerhelper.getProviderAddress("0");
		assertEquals(testAddress, "walnut st");
	}

}
