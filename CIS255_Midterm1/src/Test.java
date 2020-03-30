import java.util.*;

public class Test {

	public static int countLongerThan(String[] stringArray,int num) {
		int validStrings = 0;	
		for(int i = 0; i < stringArray.length;i++) {
			if(stringArray[i].length() > num) {
				validStrings++;
			}
		}
		return validStrings;
	}
	
	public static int countLongerThan(String[]stringArray) {
		int validStrings = 0;
		
		for(int i = 0; i < stringArray.length;i++) {
			if(!stringArray[i].isEmpty()) {
				validStrings++;
			}
		}
		
		return validStrings;
	}

	public static void main(String[] args) {
		
		String[] stringArray = {"hello", "there", "", "bye", "seeya", "later"};
		
		System.out.println(countLongerThan(stringArray,3));
		System.out.println(countLongerThan(stringArray));
		
		
		
		
//		Show show1 = new Show("Spongebob", TVShow.COMEDY);
//		Show show2 = new Show("Spongebob");
//		
//		System.out.println(show1);
//		System.out.println(show2);
//		
//		System.out.println(show1.equals(show2));
//		System.out.println(Show.isSameType(show1, show2));

//		ArrayList<Show> showList = new ArrayList<Show>();
//		showList.add(new Show("B", TVShow.DOCUMENTARY));
//		showList.add(new KidShow("A", TVShow.DRAMA,8));
//		showList.add(new Show("D", TVShow.COMEDY));
//		showList.add(new KidShow("C", TVShow.DOCUMENTARY,8));
//		showList.add(new KidShow("E",TVShow.DEFAULT_SHOWTYPE, 8));
//		
//		System.out.println(Show.isSameType(showList.get(1),showList.get(2))+"\n\n\n");
//		
//
//		int showWithTargetAge = 0;
//		Collections.sort(showList);
//		
//		for(Show show : showList) {
//			if(show instanceof KidShow) {
//				if(show.getTargetedAge() >= 3) {
//					showWithTargetAge++;
//				}
//			}
//			System.out.println(show);
//		}
//		System.out.println("Shows with Target Age of 3 or higher : " + showWithTargetAge);
	}
}
