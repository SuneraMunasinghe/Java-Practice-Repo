package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
	
	@Test
	void squareFiveEqualsTwentyFive() {
		Calculator myObj = new Calculator();
		int result = myObj.square(5);
		
		//assertEquals(Expected, Actual);
		assertEquals(25, result);
	}

}
