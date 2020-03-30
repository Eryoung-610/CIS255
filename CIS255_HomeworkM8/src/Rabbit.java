
public class Rabbit extends Pet {

	private String color;

	public Rabbit(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rabbit) {
			Rabbit otherRabbit = (Rabbit) obj;
			boolean sameName, sameAge, sameColor;

			if (this.getName().equalsIgnoreCase(otherRabbit.getName())) {
				sameName = true;
			} else {
				sameName = false;
			}

			if (this.getAge() == otherRabbit.getAge()) {
				sameAge = true;
			} else {
				sameAge = false;
			}

			if (this.getColor().equalsIgnoreCase(otherRabbit.getColor())) {
				sameColor = true;
			} else {
				sameColor = false;
			}

			return sameName && sameAge && sameColor;
		} else {
			return false;
		}
	}

	@Override
	public void vetAppointmentReminder() {
	}

}
