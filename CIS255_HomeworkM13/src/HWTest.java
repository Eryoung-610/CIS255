import java.util.*;

public class HWTest {

	public static void main(String[] args) {
		Stack<String> sList = new Stack<String>();
		
		sList.add("carrot");
		System.out.println(sList);	
		
		sList.add("apple");	
		System.out.println(sList);
	
		sList.add("grape");
		System.out.println(sList);
		
		sList.add("banana");	
		System.out.println(sList);
		
		System.out.println(sList.remove(0));
		System.out.println(sList);
		
		System.out.println(sList.remove(0));
		System.out.println(sList);
		
		sList.add("pineapple");
		System.out.println(sList);
		
		sList.add("mango");
		System.out.println(sList);
		
		System.out.println(sList.size());
		System.out.println(sList);
		
		sList.add(2, "peach");
		System.out.println(sList);
		
		sList.add(1, "plum");
		System.out.println(sList);



	}

}
