
public class Sculpture extends Artwork {

	private medium medium;
	
	enum medium {
		clay, metal, stone, wood;
	}

	public medium getMedium() {
		return medium;
	}

	public Sculpture(String title, int yearCreated, boolean forSale, medium medium) {
		super(title, yearCreated, forSale);
		this.medium = medium;

	}

	public String toString() {
		String s = super.toString();
		s += "\t " + medium;
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sculpture) {
			Sculpture otherSculpture = (Sculpture) obj;

			boolean sameTitle, sameYear, saleStatus, sameMedium;

			if (this.getTitle().equalsIgnoreCase(otherSculpture.getTitle())) {
				sameTitle = true;
			} else {
				sameTitle = false;
			}

			if (this.getYearCreated() == otherSculpture.getYearCreated()) {
				sameYear = true;
			} else {
				sameYear = false;
			}

			if (this.isForSale() == otherSculpture.isForSale()) {
				saleStatus = true;
			} else {
				saleStatus = false;
			}

			if (this.getMedium().equals(otherSculpture.getMedium())) {
				sameMedium = true;
			} else {
				sameMedium = false;
			}

			return sameTitle && sameYear && saleStatus && sameMedium;
		} else {
			return false;

		}
	}
}
