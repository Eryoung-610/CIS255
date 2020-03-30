import java.text.DecimalFormat;
import java.util.*;

public class HomeworkM1Driver {
	
	public static void main(String[] args) {
		System.out.println("******TESTING PRINT AVERAGE");
		System.out.print("Should print \n2.0: ");
		printAverage(1, 2, 3);
		System.out.print("Should print \n1.33333 (repeating): ");
		printAverage(1, 2, 1);
		System.out.print("Should print \n0.0: ");
		printAverage(1, -1, 0);
		System.out.print("Should print \n2.33333 (repeating): ");
		printAverage(1, -1, 7);

		System.out.println("\n\n******TESTING CALCULATE MILES");
		System.out.println("Should print 6.337984: " + calculateMiles(10, 200));
		System.out.println("Should print 0.0621371: " + calculateMiles(0, 100));
		System.out.println("Should print 68.972181: " + calculateMiles(111, 0));
		System.out.println("Should print 2.496047307: " + calculateMiles(4, 17));

		System.out.println("\n\n******TESTING CALCULATE OUNCES");
		System.out.println("Should print \n2 gallons, 1 quart, 0 pints, 1 cup, and 2 ounces left over.");
		printGallonQuartPintCupOz(298);
		System.out.println("Should print \n75 gallons, 2 quart, 1 pints, 1 cup, and 5 ounces left over.");
		printGallonQuartPintCupOz(9693);
		

	}

	public static void printAverage(double num1, double num2, double num3) {
		// YOUR CODE HERE
		DecimalFormat df = new DecimalFormat("#.######");
		double avg = (num1 + num2 + num3) / 3;
		System.out.println(df.format(avg));
	}
	

	public static String calculateMiles(double kilometers, double meters) {
		// YOUR CODE HERE
		double meter = meters / 1000;
		double miles = (kilometers + meter) * 0.621371;
		return new DecimalFormat("#.######").format(miles);
	}

	public static void printGallonQuartPintCupOz(int ounces) {
		// YOUR CODE HERE
		int gallon = (ounces / 128);
		int quart = ((ounces % 128) / 32);
		int pint = (((ounces % 128) % 32) / 16);
		int cup = ((((ounces % 128) % 32) % 16) / 8);
		int oz = ((((ounces % 128) % 32) % 16) % 8);

		System.out.println(gallon + " Gallons, " + quart + " Quart, " + pint + " Pints, " + cup + " Cup, " + oz
				+ " and ounces left over.");
	}

}