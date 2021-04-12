package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers 
{

	@Test
	void test()
	{
		JUnitTesting obj = new JUnitTesting();
		int result = obj.addNumbers(40, 60);
		assertEquals(100, result); 
	}

}
