/** 
 * 
 * PaintCalculator is a utility class with static
 * methods for calculating the cost of painting a 
 * rectangular room.
 * 
 * */
public class PaintCalculator {


	/** 
	 * Task#1 - convertToFeet
	 * 
	 * Returns the total feet equivalent to the specified feet and inches.
	 * 
	 * @param feet - the number of feet
	 * @param inches - the number of inches
	 * @return equivalent value in feet
	 * 
	 * */
	public static double convertToFeet(int feet, int inches) {
		double inchesToFeet = inches/12.0;  //Integer division error!
		return feet + inchesToFeet;
	}
	
	
	/**
	 * Print the value returned from each method call
	 */
	public static void main(String[] args) {

		//Task#1 
		System.out.println(convertToFeet(2, 6));  //2.5
		System.out.println(convertToFeet(3, 9));  //3.75
		System.out.println(convertToFeet(1,0));   //1
		System.out.println(convertToFeet(0,1));   //0.8333.. 
	}

}
