import java.util.*;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// ForNumber 2
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(3);
		list.add(0);
		list.add(-3);
		list.add(5);
		list.add(-2);
		list.add(1);
		list.add(5);
		list.add(0);
		list.add(-2);
		list.add(2);
		System.out.println(list);
		System.out.println(getAbsoluteValueSet(list));

//		List<Sculpture> oldArtList = new ArrayList<Sculpture>();
//		oldArtList.add(new Artwork("A",2019,true));
//		oldArtList.add(new Sculpture("A",2019,true,Sculpture.medium.metal));
//		oldArtList.add(new Sculpture("A",2945,true,Sculpture.medium.clay));
//		
//		for(Artwork art : oldArtList) {
//			   Medium medium = art.getMedium();
//			   if(medium is clay)
//			      System.out.println("This sculpture is made with clay!");
//			   }
//			}

//		int value = 700;
//		
//		try {
//			System.out.println("A");
//			
//			if(value < 500) {
//				throw new Exception ("B");
//			}
//			
//			System.out.println("C");
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//		System.out.println("D");

//		try {
//			   System.out.println("Enter a number without a decimal.");
//			   Scanner scan = new Scanner(System.in);
//			   int num = scan.nextInt();
//			} catch(InputMismatchException ex) {
//			   System.out.println("bad input");
//			}

//		int[] numbers = { 5, 2, 3, 5, 4, 5, 1, 5 };
//		System.out.println(method(numbers,10,4));
//		System.out.println(sumUp(1,5));

		System.out.println(countValuesDivisible(6, 15, 3));

	}

//	public static int method(int[] array, int start, int number) {
//		if (start == array.length) {
//			return 0;
//		} else {
//			return (array[start] == number ? 1 : 0) + method(array, start + 1, number);
//		}
//	}

//	public static int method(int x) {
//		int result = 0;
//		if (x <= 0) {
//			result = x;
//		} else if (x % 2 == 0) {
//			method (x - 1);
//		} else {
//			method (x - 2);
//		}
//		return result;
//	}

	public static int sumUp(int n1, int n2) {
		int sum = n1;
		if (n1 < n2) {
			sumUp(n1 + 1, n2);
		}
		return sum;
	}

	// #1 RECURSIVE METHOD
	public static int countValuesDivisible(int start, int end, int divisibleByNumber) {

		if (start > end) {
			return 0;
		} else {
			if (start % divisibleByNumber == 0) {
				System.out.println(start);
			}
		}
		return countValuesDivisible(start + 1, end, divisibleByNumber);
	}

	// #2
	public static Set<Integer> getAbsoluteValueSet(ArrayList<Integer> list) {
		Set<Integer> test = new HashSet<Integer>();

		for (int i = 0; i < list.size(); i++) {
			test.add(Math.abs(list.get(i)));
		}
		return test;
	}
}
