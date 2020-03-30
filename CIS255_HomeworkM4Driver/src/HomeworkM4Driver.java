import java.util.*;

public class HomeworkM4Driver {

	public static void main(String[] args) {

//		System.out.println("*****TESTING RANDOM NUMBER ARRAY GENERATOR***");
//		System.out.println("Note: run some of these tests multiple times since they involve random numbers.");
//		int[] array = generateRandomArray(10, 1, 100, true);
//		System.out.println("Size 10: " + array.length + "\t" + "Contents should be between 1 and 100, inclusive.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(5, 1, 10, false);
//		System.out.println("Size 5: " + array.length + "\t"
//				+ "Contents should be between 1 and 10, with the upper bound exclusive, meaning between 1 and 9 inclusive.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(15, 1, 5, true);
//		System.out.println("Size 15: " + array.length + "\t" + "Contents should be between 1 and 5, inclusive.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(15, 1, 5, false);
//		System.out.println("Size 15: " + array.length + "\t"
//				+ "Contents should be between 1 and 5, with the upper bound exclusive, meaning between 1 and 4, inclusive.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(15, 4, 5, false);
//		System.out.println("Size 15: " + array.length + "\t" + "Contents should be only the number 4.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(12, 7, 7, true);
//		System.out.println("Size 12: " + array.length + "\t" + "Contents should be only the number 7.\n\t"
//				+ Arrays.toString(array));
//
//		array = generateRandomArray(10, 4, 3, true);
//		System.out.println("Should print null (without crashing): " + array);
//
//		array = generateRandomArray(10, 4, 4, false);
//		System.out.println("Should print null (without crashing): " + array);
//
//		array = generateRandomArray(10, 4, 2, false);
//		System.out.println("Should print null (without crashing): " + array);
//
//		array = generateRandomArray(-1, 4, 14, true);
//		System.out.println("Should print null (without crashing): " + array);
//
//		System.out.println("\n\n*****TESTING ARRAY COPY AND EXPAND***");
//		String[] words1 = { "a", "b", "c" };
//		words1 = copyToEndAndExpand(words1);
//		System.out.println("Array holds \t[null, null, null, a, b, c]");
//		System.out.println("\t\t" + Arrays.toString(words1));
//
//		String[] words2 = new String[1];
//		words2[0] = "hi";
//		words2 = copyToEndAndExpand(words2);
//		System.out.println("Array holds \t[null, hi]");
//		System.out.println("\t\t" + Arrays.toString(words2));
//
//		String[] words3 = { "apple", "cat", "dog", "banana" };
//		String[] moreWords = copyToEndAndExpand(words3);
//		System.out.println("Original array holds \t[apple, cat, dog, banana]");
//		System.out.println("\t\t\t" + Arrays.toString(words3));
//		System.out.println("New array holds \t[null, null, null, null, apple, cat, dog, banana]");
//		System.out.println("\t\t\t" + Arrays.toString(moreWords));
//
//		System.out.println(
//				"\n\n*****TESTING THE METHOD TO CREATE A LIST OF WORDS THAT DON'T START WITH A CHARACTER OR DIGIT***");
//		ArrayList<String> wordList = new ArrayList<>(
//				Arrays.asList("hello!", "?what", "email@com", "#javarules", "3blindmice", "&more"));
//		ArrayList<String> wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
//		System.out.println(
//				"List holds \t[?what, #javarules, &more]" + "\n\t\t" + createListNonCharacterDigitWords(wordList));
//
//		wordList = new ArrayList<>(Arrays.asList("no!", "answers?", "found#here", "4sure"));
//		wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
//		System.out.println("List holds \t[]" + "\n\t\t" + wordsNotStartingWithCharDigit);
//
//		wordList = new ArrayList<>(Arrays.asList("$money", "^carrot", "(parens", ")parensclose", "\ttab"));
//		wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
//		System.out.println("List holds \t[$money, ^carrot, (parens, )parensclose, 	tab]" + "\n\t\t"
//				+ wordsNotStartingWithCharDigit);

		// YOUR CODE HERE TO COMMUNICATE WITH THE USER TO CREATE A LIST, PRINT, AND
		// INVOKE THE ABOVE METHOD

//		Scanner input = new Scanner(System.in);
//		ArrayList<String> userList = new ArrayList<String>();
//
//		System.out.print("\n\nHow many entries would you like to enter? : ");
//		Integer totalEntries = new Integer(Integer.parseInt(input.nextLine()));
//
//		while (!(totalEntries > 0)) {
//			System.out.println("Please enter a non-negative or 0 number");
//			System.out.print("How many entries would you like to enter? : ");
//			totalEntries = new Integer(Integer.parseInt(input.nextLine()));
//
//		}
//
//		for (int i = 1; i <= totalEntries; i++) {
//			System.out.println("Please enter entry #" + i + " : ");
//			String userInput = input.nextLine();
//			userList.add(userInput);
//		}
//
//		System.out.println("Original List : " + userList);
//		Collections.reverse(userList);
//		System.out.println("Reversed List : " + userList);
//
//		wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(userList);
//		System.out.println("List holds [" + userList + "]" + "\n\t\t" + wordsNotStartingWithCharDigit);
		
		
		String[] wordArray1 = new String[5];
		wordArray1[0] = "a";
		wordArray1[1] = "b";
		wordArray1[2] = "c";

		// invoking the one-parameter method will return 2 (there are 2 nulls- one at index 3 and one at index 4)
		// invoking the two-parameter method with starting index 4 will return 1 (starting with index 4, there is 1 null at index 4)

		String[] wordArray2 = new String[10];
		wordArray2[0] = "apple";
		wordArray2[1] = "";
		wordArray2[2] = "cat";
		wordArray2[3] = " ";

		// invoking the one-parameter method will return 6 (there are 6 null spaces- index 4, 5, 6, 7, 8, 9)
		// invoking the two-parameter method with starting index 7 will return 3 (starting with index 7, there are 3 empty spaces- index 7, 8, and 9)
		
		
		
		
		
		
		
		
		
		

	}
	
	

	public static int[] generateRandomArray(int size, int lower, int upper, boolean inclusive) {
		// YOUR CODE HERE
		Random generator = new Random();

		if (size < 1) {
			return null;
		}

		int[] randomArray = new int[size];
		int EXCLUSIVE = 1;
		int OFFSET = 1;

		if (inclusive != true) {
			upper = upper - EXCLUSIVE;
		}

		if (upper - lower >= 0 || upper - lower >= 0) {
			for (int i = 0; i < randomArray.length; i++) {
				randomArray[i] = generator.nextInt(upper - lower + OFFSET) + lower;
			}
		} else {
			return null;
		}

		return randomArray;

	}

	public static String[] copyToEndAndExpand(String[] array) {
		// YOUR CODE HERE
		String[] stringArray = new String[array.length * 2];

		for (int i = 0; i < array.length; i++) {
			stringArray[i] = array[i];
			String savedArray = stringArray[i];
			stringArray[i] = stringArray[i + stringArray.length / 2];
			stringArray[i + stringArray.length / 2] = savedArray;
		}

		return stringArray;
	}

	public static ArrayList<String> createListNonCharacterDigitWords(ArrayList<String> words) {
		// YOUR CODE HERE
		ArrayList<String> newArray = new ArrayList<String>();

		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			char letterOrDigit = word.charAt(0);

			if (!(Character.isLetterOrDigit(letterOrDigit) == true)) {
				newArray.add(word);
			}
		}

		return newArray;

	}

}
