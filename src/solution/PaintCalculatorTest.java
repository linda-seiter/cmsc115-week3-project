package solution;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PaintCalculatorTest {
	
	//Task #1
	@Test
	void testConvertToFeet() {
		double delta = 0.001;
		assertEquals(2.5, PaintCalculator.convertToFeet(2,6));  //2.5' == 2'6"
		assertEquals(3.75, PaintCalculator.convertToFeet(3,9)); //3.75' == 3'9"
		assertEquals(1, PaintCalculator.convertToFeet(1,0));    //1' == 1'0"
		assertEquals(0.083, PaintCalculator.convertToFeet(0,1), delta); //0.083' ~= 0'1" == 0.8333..
	}

	//Task #2
	@Test
	void testCalculateCeilingArea() {
		assertEquals(240.0, PaintCalculator.calculateCeilingArea(24.0, 10.0));
		assertEquals(86.25, PaintCalculator.calculateCeilingArea(7.5, 11.5));
		assertEquals(83.784375, PaintCalculator.calculateCeilingArea(10.125, 8.275));
	}

	//Task #3
	@Test
	void testCalculateWallArea() {
		assertEquals(540.0,   PaintCalculator.calculateWallArea(15.0, 12.0, 10.0));
		assertEquals(362.675, PaintCalculator.calculateWallArea(11.75, 10.5, 8.15));
	}

	//Task #4
	@Test
	void testCalculateRoomArea() {
		assertEquals(720, PaintCalculator.calculateRoomArea(15.0, 12.0, 10.0));
		assertEquals(466.54, PaintCalculator.calculateRoomArea(8.9, 9.6, 10.3));
	}

	//Task #5
	@Test
	void testCalculatePaintGallons() {
		assertEquals(2, PaintCalculator.calculatePaintGallons(8, 10, 12));
		assertEquals(5, PaintCalculator.calculatePaintGallons(16.75, 19.5, 16.0));
	}

	//Task #6
	@Test
	void testCalculatePaintCost() {
		assertEquals(29.98, PaintCalculator.calculatePaintCost(12, 6, 10, 9, 8, 6, 14.99));  //12'6" x 10'9" x 8'6" 14.99 gallon
		assertEquals(33.98, PaintCalculator.calculatePaintCost(12, 6, 10, 9, 8, 6, 16.99));  //12'6" x 10'9" x 8'6" 16.99 gallon
		assertEquals(55.47, PaintCalculator.calculatePaintCost(15, 7, 12, 5, 10, 2, 18.49)); //15'7" x 12'5" x 10'2" 18.49 gallon
	}

}
