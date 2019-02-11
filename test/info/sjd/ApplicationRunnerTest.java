package info.sjd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicationRunnerTest {

	@Test
	void testByDivisionRemainder() {
		ApplicationRunner runner = new ApplicationRunner();
		assertEquals(15, runner.byDivisionRemainder(12345));
	} 

	@Test  
	void testByConvertToChar() { 
		ApplicationRunner runner = new ApplicationRunner();
		assertEquals(21, runner.byConvertToChar(123456));
	}

	@Test
	void testFindPalindrom() {
		ApplicationRunner runner = new ApplicationRunner();
		assertEquals(515, runner.findPalindrom(4602, 3178));
	}

}
