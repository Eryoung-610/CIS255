import java.util.*;

public class RaffleWinners {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Raffle Winner Program!");
		System.out.println("What is the name of the raffle? : ");
		String name = input.nextLine();
		name = name.replace(" ", "_");

		int smallest = 0;
		int largest = 0;
		RaffleSim(smallest, largest, name);

	}

	public static void RaffleSim(int smallest, int largest, String name) {
		Random generator = new Random();
		boolean startRaffle = false;
		char choice = ' ';
		Scanner input = new Scanner(System.in);

		while (!startRaffle) {
			System.out.println("What is the smallest raffle ticket number ?");
			smallest = input.nextInt();

			System.out.println("What is the largest raffle ticket number ? ");
			largest = input.nextInt();
				
			while (largest - smallest < 2 || smallest > largest || largest < 1 || smallest < 1) {

				if (smallest < 1 || largest < 1) {
					System.out.println("Please enter positive numbers");
				} else if (smallest > largest) {
					System.out.println("The largest ticket number must be greater than " + (smallest + 2));
				} else if (largest - smallest < 2) {
					System.out.println("There must be at least 3 tickets sold");
				}

				System.out.println("What is the smallest raffle ticket number ?");
				smallest = input.nextInt();

				System.out.println("What is the largest raffle ticket number ? ");
				largest = input.nextInt();
			}

			System.out.println("The winning raffle ticket numbers in the " + name.toUpperCase() + " raffle are :");
			int ticket1 = generator.nextInt(largest - smallest + 1) + smallest;
			int ticket2 = generator.nextInt(largest - smallest + 1) + smallest;
			int ticket3 = generator.nextInt(largest - smallest + 1) + smallest;

			while (ticket1 == ticket2 ) {
				ticket2 = generator.nextInt(largest - smallest + 1) + smallest;
			}
			
			while (ticket1 == ticket3 || ticket3 == ticket2) {
				ticket3 = generator.nextInt(largest - smallest + 1) + smallest;
			}

			System.out.println("Winner 1 : " + ticket1);
			System.out.println("Winner 2 : " + ticket2);
			System.out.println("Winner 3 : " + ticket3);

			System.out.println("Do you want to run another round of the raffle? y or n");
			choice = input.next().charAt(0);

			if (choice == 'y') {
				startRaffle = false;
				continue;
			} else {
				System.out.println("Good bye!");
				startRaffle = true;
			}
		}

	}

}
