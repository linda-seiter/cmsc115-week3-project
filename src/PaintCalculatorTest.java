import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PaintCalculatorTest {
	
	//Task #1
	@Test
	void testConvertToFeet() {
		assertEquals(2.5, PaintCalculator.convertToFeet(2,6));  //2.5' == 2'6"
		assertEquals(3.75, PaintCalculator.convertToFeet(3,9)); //3.75' == 3'9"
		assertEquals(1, PaintCalculator.convertToFeet(1,0));    //1' == 1'0"
		assertEquals(0.083, PaintCalculator.convertToFeet(0,1), 0.001); //0.083' ~= 0'1" == 0.8333..
	}

}
