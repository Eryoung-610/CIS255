import java.util.*;


public class ShirtTester {
	public static void main (String[]args) {
		ArrayList<Shirt> shirtList = new ArrayList<Shirt>();
		shirtList.add(new Shirt(Shirt.Size.SMALL, "Black", 9.99));
		shirtList.add(new Sweatshirt(Shirt.Size.MEDIUM,"Grey",15.99,true));
		shirtList.add(new Shirt(Shirt.Size.LARGE, "Black", 9.99));
		shirtList.add(new Sweatshirt(Shirt.Size.MEDIUM,"White",15.99,true));
		shirtList.add(new Shirt(Shirt.Size.SMALL, "Black", 9.99));
		
		
		int totalHooded = 0;
		for(Shirt shirt : shirtList) {
			System.out.println(shirt);
			
			if(shirt instanceof Sweatshirt) {
				totalHooded += ((Sweatshirt) shirt).getTotalHooded();
			}
		}
		
		System.out.println("Total hooded shirts : " + totalHooded);
	}
	
}
