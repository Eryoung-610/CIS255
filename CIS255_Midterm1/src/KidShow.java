
public class KidShow extends Show implements Comparable<Show> {

	private int targetedAge;

	public int getTargetedAge() {
		return targetedAge;
	}

	public void setTargetedAge(int targetedAge) {
		this.targetedAge = targetedAge;
	}

	public KidShow(String name, TVShow showType, int targetedAge) {
		super(name, showType);
		this.targetedAge = targetedAge;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\n\nTargeted Age: " + getTargetedAge();
		return s;
	}

	@Override
	public int compareTo(Show newShow) {
		if(this.targetedAge == (newShow.getTargetedAge())) {
			return this.getName().compareTo(newShow.getName());
		} else if (this.targetedAge > (newShow.getTargetedAge())) {
			return 1;
		} else {
			return -1;
		}
	}

}
