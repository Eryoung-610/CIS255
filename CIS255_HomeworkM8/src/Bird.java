
public class Bird extends Pet {

	private boolean canSing;
	private int totalSongBirds;
	private int totalNonSing;

	public Bird(String name, int age, boolean canSing) {
		super(name, age);
		this.canSing = canSing;

		if (canSing == true) {
			totalSongBirds++;
		}

		if (canSing == false) {
			totalNonSing++;
		}
	}

	public int getTotalNonSing() {
		return totalNonSing;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public int getTotalSongBirds() {
		return totalSongBirds;
	}

	@Override
	public String toString() {
		String s = super.toString(); 
		s += "\nCan Sing ? : " + isCanSing();
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bird) {
			Bird otherBird = (Bird) obj;
			boolean sameName, sameAge, canSing;

			if (this.getName().equalsIgnoreCase(otherBird.getName())) {
				sameName = true;
			} else {
				sameName = false;
			}

			if (this.getAge() == otherBird.getAge()) {
				sameAge = true;
			} else {
				sameAge = false;
			}

			if (this.isCanSing() == otherBird.isCanSing()) {
				canSing = true;
			} else {
				canSing = false;
			}

			return sameName && sameAge && canSing;
		} else {
			return false;
		}
	}

	@Override
	public void vetAppointmentReminder() {
	}

}
