package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() 
	{
		JUnitTesting obj = new JUnitTesting();
		String result = obj.addStrings("Parle", "G");
		assertEquals("ParleG", result); 
	}

}
