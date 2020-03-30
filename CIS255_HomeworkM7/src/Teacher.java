
public class Teacher extends Person {

	private int yearsTeaching;
	private final static int YEARS_TEACHING = 1;

	public Teacher() {
		this.yearsTeaching = YEARS_TEACHING;
	}

	public Teacher(String name, int yearsTeaching) {
		super(name);
		this.yearsTeaching = yearsTeaching;
	}

	public int getYearsTeaching() {
		return yearsTeaching;
	}

	public void setYearsTeaching(int yearsTeaching) {
		if (yearsTeaching > 0) {
			this.yearsTeaching = yearsTeaching;
		}
	}

	public String toString() {
		String s = "Name : " + getName() + "\nYears Taught : " + yearsTeaching;
		return s;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Teacher) {
			Teacher otherTeacher = (Teacher) obj;

			boolean sameYears, sameName;

			if (this.getName().equalsIgnoreCase(otherTeacher.getName())) {
				sameName = true;
			} else {
				sameName = false;
			}

			if (this.getYearsTeaching() == (otherTeacher.getYearsTeaching())) {
				sameYears = true;
			} else {
				sameYears = false;
			}

			return sameName && sameYears;
		} else {
			return false;
		}
	}

	public static boolean isGoodMatch(Teacher teacher1, Teacher teacher2) {
		if (teacher1.getYearsTeaching() <= 5 && (teacher2.getYearsTeaching() - 7) > teacher1.getYearsTeaching()) {
			return true;
		} else {
			return false;
		}
	}

}
