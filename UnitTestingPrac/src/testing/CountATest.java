package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	void twoAsInAlphabet() {
		Calculator calcObj = new Calculator();
		int output = calcObj.countA("Alphabet");
		
		//assertEquals(Expected, Actual);
		assertEquals(2, output);
	}

}
