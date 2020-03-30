
public class Artwork implements Comparable<Artwork>{

	private String title;
	private int yearCreated;
	private boolean forSale;

	private static final int DEFAULT_YEARCREATED = 2019;
	private static final boolean DEFAULT_SALE = false;

	public Artwork(String title, int yearCreated, boolean forSale) {
		this.title = title;
		this.yearCreated = yearCreated;
		this.forSale = forSale;
	}

	public Artwork(String title) {
		this(title, DEFAULT_YEARCREATED, DEFAULT_SALE);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearCreated() {
		return yearCreated;
	}

	public void setYearCreated(int yearCreated) {
		if (yearCreated > 0) {
			this.yearCreated = yearCreated;
		}
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}

	@Override
	public String toString() {
		return title + "\t" + yearCreated + "\t" + forSale;
	}

	@Override
	public int compareTo(Artwork newArtwork) {

		if (title.equalsIgnoreCase(newArtwork.title)) {
			if (yearCreated < newArtwork.yearCreated) {
				return -1;
			}
		} else if (yearCreated > newArtwork.yearCreated) {
			return 1;
		} else {
			return 0;
		}
		return yearCreated;
	}

}
