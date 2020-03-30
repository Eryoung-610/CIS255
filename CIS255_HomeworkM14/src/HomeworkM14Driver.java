import java.util.*;

public class HomeworkM14Driver {

	public static void main(String[] args) {

		System.out.println("******TESTING Q WITHOUT U");
		System.out.println(
				"\nAll of these should be false. They do NOT contain a \"q\" that is not immediately followed by a \"u\"");
		System.out.println("hello: \t\tfalse: " + qNotFollowedByU("hello") + "\t no q; odd length");
		System.out.println("cats: \t\tfalse: " + qNotFollowedByU("cats") + "\t no q; even length");
		System.out.println("a: \t\tfalse: " + qNotFollowedByU("a") + "\t no q; single letter");
		System.out.println("\"\": \t\tfalse: " + qNotFollowedByU("") + "\t no q; empty string");
		System.out.println(
				"quite: \t\tfalse: " + qNotFollowedByU("quite") + "\t q followed by u at the beginning of the word");
		System.out.println("equal: \t\tfalse: " + qNotFollowedByU("equal")
				+ "\t q followed by u in the middle of a word; odd length");
		System.out.println("aqua: \t\tfalse: " + qNotFollowedByU("aqua")
				+ "\t q followed by u in the middle of a word; even length");
		System.out.println("nonsensewordqu: false: " + qNotFollowedByU("nonsensewordqu")
				+ "\t q followed by u at the end of the word");
		System.out.println("QUOTE: \t\tfalse: " + qNotFollowedByU("QUOTE") + "\t q followed by u in caps");
		System.out.println("qu: \t\tfalse: " + qNotFollowedByU("qu") + "\t q followed by u and nothing else");

		System.out.println(
				"\nAll of these should be true. They DO contain a \"q\" that is not immediately followed by a \"u\"");
		System.out.println("qat: \t\ttrue: " + qNotFollowedByU("qat") + "\t q without u at the beginning of the word");
		System.out.println(
				"cinq: \t\ttrue: " + qNotFollowedByU("cinq") + "\t q without u at the end of the word; even length");
		System.out.println(
				"drinq: \t\ttrue: " + qNotFollowedByU("drinq") + "\t q without u at the end of the word; odd length");
		System.out.println("nonsenseqword: \ttrue: " + qNotFollowedByU("nonsenseqword")
				+ "\t q without u in the middle of the word");
		System.out.println("aquaq: \t\ttrue: " + qNotFollowedByU("aquaq")
				+ "\t q without u in a word that also has a \"qu\" before it");
		System.out.println("qaqu: \t\ttrue: " + qNotFollowedByU("qaqu")
				+ "\t q without u in a word that also has a \"qu\" after it");
		System.out.println(
				"qiteu: \t\ttrue: " + qNotFollowedByU("qiteu") + "\t q without u right after, but with a u later on");
		System.out.println("q: \t\ttrue: " + qNotFollowedByU("q") + "\t q all on its own- single letter");
		System.out.println("qq: \t\ttrue: " + qNotFollowedByU("qq") + "\t q all on its own- double letter");
		System.out.println("uq: \t\ttrue: " + qNotFollowedByU("uq") + "\t q with a u before it");
		System.out.println("Qtip: \t\ttrue: " + qNotFollowedByU("Qtip") + "\t q without a u in caps");

		System.out.println("\n******TESTING ARRAY REVERSER");
		int[] array1 = { 1, 2, 3, 4, 5 };
		System.out.println("Before reverse: " + Arrays.toString(array1));
		System.out.println("After reverse should be");
		printReverse(array1);
		reverseArray(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println("After reversing back should be");
		printReverse(array1);
		reverseArray(array1);
		System.out.println(Arrays.toString(array1));

		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("\nBefore reverse: " + Arrays.toString(array2));
		System.out.println("After reverse should be");
		printReverse(array2);
		reverseArray(array2);
		System.out.println(Arrays.toString(array2));
		System.out.println("After reversing back should be");
		printReverse(array2);
		reverseArray(array2);
		System.out.println(Arrays.toString(array2));

		int[] array3 = { 1, 2 };
		System.out.println("\nBefore reverse: " + Arrays.toString(array3));
		System.out.println("After reverse should be");
		printReverse(array3);
		reverseArray(array3);
		System.out.println(Arrays.toString(array3));
		int[] array4 = { 1 };
		System.out.println("\nBefore reverse: " + Arrays.toString(array4));
		System.out.println("After reverse should be");
		printReverse(array4);
		reverseArray(array4);
		System.out.println(Arrays.toString(array4));
		int[] array5 = {};
		System.out.println("\nBefore reverse: " + Arrays.toString(array5));
		System.out.println("After reverse should be");
		printReverse(array5);
		reverseArray(array5);
		System.out.println(Arrays.toString(array5));

	}

	public static boolean qNotFollowedByU(String word) {
		return qNotFollowedByUHelper(word.toLowerCase(), 0);
	}

	private static boolean qNotFollowedByUHelper(String word, int index) {
		word = word.toLowerCase();

		try {
			if (index >= word.length()) {
				return true;
			} else if ((word.contains("q") && word.charAt(index) == 'q' && word.charAt(index + 1) == 'u')) {
				return false;
			} else {
				return qNotFollowedByUHelper(word, index + 1);
			}
		} catch (StringIndexOutOfBoundsException ex) {
		}
		return qNotFollowedByUHelper(word, index + 1);
	}

	public static void reverseArray(int[] array) {
		// YOUR CODE HERE
		reverse(array, 0, array.length - 1);
	}

	private static void reverse(int[] array, int i, int j) {
		int test;
		if (i >= j) {
			return;
		}

		test = array[i];
		array[i] = array[j];
		array[j] = test;
		reverse(array, i + 1, j - 1);
	}

	// a printing method for testing purposes
	public static void printReverse(int[] array) {
		System.out.print("[");
		for (int i = array.length - 1; i > 0; i--) {
			System.out.print(array[i] + ", ");
		}
		if (array.length > 0) {
			System.out.print(array[0]);
		}
		System.out.println("]");
	}

}
