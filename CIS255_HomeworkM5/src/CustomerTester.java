import java.util.*;

public class CustomerTester {

	public static void main(String[] args) {
		Customer test1 = new Customer("Eric",1005);
		Customer test2 = new Customer("Erik");
		Customer test3 = new Customer("Erick");
		Customer test4 = new Customer("Derrick");
		Customer test5 = new Customer("AirRick");

		
		test1.getTotalOwed();
		test1.addBill(10);
		
		System.out.println(test1.getTotalOwed());
		
//		String[] wordArray1 = new String[5];
//		wordArray1[0] = "a";
//		wordArray1[1] = "b";
//		wordArray1[2] = "c";
//
//		oneParameterMethod(wordArray1);
//		twoParameterMethod(wordArray1,4);
//
//		String[] wordArray2 = new String[10];
//		wordArray2[0] = "apple";
//		wordArray2[1] = "";
//		wordArray2[2] = "cat";
//		wordArray2[3] = " ";
//
//		oneParameterMethod(wordArray2);
//		twoParameterMethod(wordArray2,7);
	}

//	public static void oneParameterMethod(String[] array) {
//
//		int totalNull = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == null) {
//				totalNull++;
//			}
//		}
//		System.out.println(totalNull);
//	}
//	
//	public static void twoParameterMethod(String[]array,int index) {
//		
//		int totalNull = 0;
//
//		for (int i = index; i < array.length; i++) {
//			if (array[i] == null) {
//				totalNull++;
//			}
//		}
//		System.out.println(totalNull);
//	}
}
