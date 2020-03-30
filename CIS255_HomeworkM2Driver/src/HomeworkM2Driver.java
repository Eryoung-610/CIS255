
import java.util.*;

public class HomeworkM2Driver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\n\n******TESTING ISOCELES");
		System.out.println("Should print Not a triangle and then print false");
		System.out.println(isIsoscelesTriangle(1, 2, 4));
		System.out.println("\nShould print Not a triangle and then print false");
		System.out.println(isIsoscelesTriangle(4, 5, 1));
		System.out.println("\nShould print Not a triangle and then print false");
		System.out.println(isIsoscelesTriangle(5, 5, 10));
		System.out.println("\nShould print true");
		System.out.println(isIsoscelesTriangle(5, 9, 5));
		System.out.println("\nShould print Equilateral triangle and then print false");
		System.out.println(isIsoscelesTriangle(5, 5, 5));
		System.out.println("\nShould print Scalene triangle and then print false");
		System.out.println(isIsoscelesTriangle(3, 4, 5));
		System.out.println("\nShould print true");
		System.out.println(isIsoscelesTriangle(3, 2, 3));

		System.out.println("\n\n******TESTING READ IN STRING");
		// words to test:
		// words that pass: apple, ostrich, umbrella, enter
		// words that fail: emu, caterpillar, house, over
		String word = readWord();

		System.out.println("\n\n******TESTING METHOD TO CALCULATE AVERAGE ASSIGNMENT SCORE");
		// YOUR CODE HERE
		int totalAssignments = 0;
		boolean ValidAssignmentNum = false;
		double EarnedTotal = 0;
		double totalPoints = 0;

		while (!ValidAssignmentNum) {
			System.out.print("How many total assignments are there? : ");
			totalAssignments = input.nextInt();
			if (totalAssignments >= 0) {
				ValidAssignmentNum = true;
			} else {
				System.out.println("Please enter a positive number for total assignments");
			}
		}

		for (int i = 1; i <= totalAssignments; i++) {
			System.out.print("What is the total amount for points for assignment " + i + " : ");
			int AssignmentPoints = input.nextInt();
			totalPoints += AssignmentPoints;
			System.out.print("What is the amount of points earned for assignment " + i + " : ");
			int EarnedScore = input.nextInt();
			EarnedTotal += EarnedScore;
		}

		double avg = (100 * (EarnedTotal / totalPoints));
		System.out.println("The average score for all assignemnts is : " + avg);
	}

	public static boolean isIsoscelesTriangle(int a, int b, int c) {
		// YOUR CODE HERE
		if (a == b && b == c) {
			System.out.println("Equilateral triangle");
		} else if (a == b && b == c || a == c) {
			System.out.println("Isosceles triangle");
			return true;
		} else if ((a != b) && (b != c) && (a != c) && (a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("Scalene triangle");
		} else {
			System.out.println("Not a triangle");
		}
		return false;
	}

	public static String readWord() {
		// YOUR CODE HERE
		boolean ValidUserWord = false;
		Scanner input = new Scanner (System.in);
		String word = " ";
		
		
		while (!ValidUserWord) {
			System.out.print("Enter word here (5+ letter word and must start with a vowel (a,e,i,o,u)) : ");
			word = input.nextLine();
			
			char a = word.charAt(0);
			if ((a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') && word.length() >= 5) {
				System.out.println("The user entered " + word + ", which is 5 or more characters long and starts with a vowel.");
				ValidUserWord = true;
				
			} else {
				System.out.println("Please enter a valid word");
			}
		}
		return "";
	}

}
