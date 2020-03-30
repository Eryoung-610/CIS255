import java.util.*;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Pet> petList = new ArrayList<Pet>();
		petList.add(new Bird("Parakeet",2,true));
		petList.add(new Rabbit("Brer", 2, "Brown"));
		petList.add(new Bird("Nightingale",1,true));
		petList.add(new Rabbit("Roger",4,"White"));
		petList.add(new Bird("Canary",1,false));
		
		Bird bird1 = new Bird("Parakeet",2,true);
		Bird bird2 = new Bird("Nightingale", 1, true);
		
		int comparisonNumber = bird1.compareTo(bird2);
		System.out.println("COMPARISON TESTER : " + comparisonNumber);
		
		String string = "hello world";
		
		string.indexOf("h");
		
		int totalSongBirds = 0;
		int totalNonSing = 0;
		
		for(Pet pet : petList) {
			System.out.println(pet);
			
			if(pet instanceof Bird) {
				totalNonSing += ((Bird)pet).getTotalNonSing();
			}
		}
		
		System.out.println("Total Birds that can not sing : " + totalNonSing);
		
		Collections.sort(petList);
		
		System.out.println("\n\nSORTED LIST\n\n");
		for(Pet pet : petList) {
			System.out.println(pet);
		}
	}

}
