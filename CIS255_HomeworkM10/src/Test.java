import java.util.*;
import java.io.*;
import java.nio.*;

public class Test {

	public static void main(String[] args) throws IOException {

		createValidEmailFile("input.txt", "Homework10_validEmails.txt");
	}

	public static void createValidEmailFile(String inputName, String outputName) {
		try {

			final int OFFSET = 1;
			final int TWO_CHARACTERS = 2;
			String substring = "";
			String substring2;

			// Using supplied input file and a created output file to test method.
			Scanner fileScan = new Scanner(new FileInputStream(new File("input.txt")));
			PrintWriter out = new PrintWriter(new FileOutputStream("Homework10_validEmails.txt"));

			while (fileScan.hasNext()) {
				inputName = fileScan.nextLine();

				int index = inputName.lastIndexOf("@");
				int index2 = inputName.lastIndexOf(".");
				// Use .contains to determine if there is a "." after the @.
				substring = inputName.substring(index + OFFSET);

				// Use .length to determine if there are at least two characters after the "."
				// that comes after the "@"
				substring2 = inputName.substring(index2 + OFFSET);

				if (inputName.contains("@") && substring.contains(".") && substring2.length() >= TWO_CHARACTERS) {
					out.println(inputName);
				}
			}
			fileScan.close();
			out.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		} finally {
			System.out.println("Done");
		}
	}
}

//public static void createValidEmailFile(String inputName, String outputName) {
//	try {
//
//		final int OFFSET = 1;
//		final int TWO_CHARACTERS = 2;
//		String substring = "";
//		String substring2;
//
//		// Using supplied input file and a created output file to test method.
//		Scanner fileScan = new Scanner(new FileInputStream(new File("input.txt")));
//		PrintWriter out = new PrintWriter(new FileOutputStream("Homework10_validEmails.txt"));
//
//		while (fileScan.hasNext()) {
//			inputName = fileScan.nextLine();
//
//			int index = inputName.lastIndexOf("@");
//			int index2 = inputName.lastIndexOf(".");
//			// Use .contains to determine if there is a "." after the @.
//			substring = inputName.substring(index + OFFSET);
//			
//			// Use .length to determine if there are at least two characters after the "." that comes after the "@"
//			substring2 = inputName.substring(index2 + OFFSET);
//			
//			System.out.println("ORIGINAL STRING : " + inputName);
//			System.out.println("SUBSTRING AFTER @ : " + substring);
//			System.out.println("INDEX OF @ : " + index);
//			System.out.println("SUBSTRING AFTER . : " + substring2);
//			System.out.println("\n");
//			
//			
//			if (inputName.contains("@") && substring.contains(".") && substring2.length() >= 2) {
//				out.println(inputName);
//			}
//		}
//		fileScan.close();
//		out.close(); 
//	} catch (FileNotFoundException ex) {
//		System.out.println("File Not Found");
//	} catch (StringIndexOutOfBoundsException ex) {
//		System.out.println("Index out of bounds");
//	}
//	finally {
//		System.out.println("Done");
//	}
//}
//}

//public static void main(String[] args) {
//	   try {
//	      statement1;  
//	      methodA();
//	      statement2;
//	   } catch (ExceptionQ ex) {
//	      statement3;
//	   } finally {
//	      statement4;
//	   }
//	   statement5;
//	}
//
//	public static void methodA() {
//	   try {
//	      statemen6;
//	      methodB();
//	      statement7;
//	   } catch (ExceptionR ex) {
//	      statement8;
//	   } finally {
//	      statement9;
//	   }
//	   statement10;
//	}
//
//	public static void methodB() {
//	   try {
//	      statement11;
//	   } catch (ExceptionS ex) {
//	      statement12;
//	   } catch (ExceptionT ex) {
//	      statement13;
//	   } finally {
//	      statement14;
//	   }
//	   statement15;
//	}