package solution;
import java.util.Scanner;

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
	 * Returns the total feet equivalent to the specified quantity of feet and inches.
	 * 
	 * @param feet - the amount of feet 
	 * @param inches  - the amount of inches
	 * @return the total feet equivalent to the specified feet and inches.
	 * 
	 * */
	public static double convertToFeet(int feet, int inches) {
		double inchesToFeet = inches/12.0;
		return feet + inchesToFeet;
	}


	/**
	 * Task#2 - calculateCeilingArea
	 * 
	 * Returns the ceiling area of a rectangular room based
	 * on the specified length and width.
	 * 
	 * @param length - the room length
	 * @param width - the room width 
	 * @return the area of ceiling based on room length and width. 
	 */
	public static double calculateCeilingArea( double length, double width) {
		return length * width;
	}

	/**
	 * Task#3 - calculateWallArea
	 * 
	 * Returns the total wall area of a rectangular room based 
	 * on the room length, width, and height.
	 * 
	 * @param length - the room length
	 * @param width - the room width
	 * @param height - the room height
	 * @return the total area of wall space based on the
	 *  room length, width, and height. 
	 */
	public static double calculateWallArea( double length, double width, double height) {
		return 2 * (length + width) * height ;
	}

	/**
	 * Task#4 - calculateRoomArea
	 * 
	 * Returns the combined ceiling and wall area of a 
	 * rectangular room based on the room length, width, and height.
	 * 
	 * @param length - the room length
	 * @param width - the room width
	 * @param height - the room height
	 * @return the combined ceiling and wall area based on the
	 *  room length, width, and height. 
	 */
	public static double calculateRoomArea( double length, double width, double height) {
		return calculateCeilingArea(length, width) + calculateWallArea(length, width, height);
	}

	/**
	 * Task#5 - calculatePaintGallons
	 * 
	 * Returns the number of gallons of paint required for a rectangular
	 * room given the length, width, and height.  Assume coverage of 350
	 * square feet of wall space per gallon. The method should
	 * return the number of gallons rounded up to the nearest integer.
	 * 
	 * @param length - the room length
	 * @param width - the room width
	 * @param height - the room height
	 * @return the number of gallons of paint required to cover the walls and ceiling of the rectangular room. 
	 */
	public static int calculatePaintGallons( double length, double width, double height) {
		double sqFt = calculateRoomArea(length, width, height);
		return (int)Math.ceil(sqFt / 350);
	}

	/**
	 * Task#6 - calculatePaintCost
	 * 
	 * Returns the total cost of painting a room given the specified room dimensions and price per gallon.
	 * 
	 * @param length - the room length
	 * @param width - the room width
	 * @param height - the room height
	 * @return the number of gallons of paint required to cover the walls and ceiling of the rectangular room. 
	 */
	public static double calculatePaintCost( 
			int lengthFt, int lengthInches, 
			int widthFt, int widthInches, 
			int heightFt, int heightInches,
			double pricePerGallon) {
		double length = convertToFeet(lengthFt, lengthInches);
		double width = convertToFeet(widthFt, widthInches);
		double height = convertToFeet(heightFt, heightInches);
		double cost = calculatePaintGallons(length, width, height) * pricePerGallon;
		return cost;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Room length in feet and inches:") ;
		int lengthFt = input.nextInt();
		int lengthInches = input.nextInt();
		
		System.out.println("Room width in feet and inches:") ;
		int widthFt = input.nextInt();
		int widthInches = input.nextInt();
		
		System.out.println("Room height in feet and inches:") ;
		int heightFt = input.nextInt();
		int heightInches = input.nextInt();
		
		System.out.println("Paint price per gallon:");
		double pricePerGallon = input.nextDouble();
		
		double cost = calculatePaintCost(lengthFt, lengthInches, widthFt, widthInches, 
				heightFt, heightInches, pricePerGallon);
		System.out.println("Cost to paint the room is $" + cost);
	
	}

}
