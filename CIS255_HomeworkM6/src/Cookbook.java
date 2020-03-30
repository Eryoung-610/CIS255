
public class Cookbook extends Book {

	private int yearOfPublication, totalRecipes;

	public static final int DEFAULT_YEAROFPUBLICATION = 1000;
	public static final int DEFAULT_TOTALRECIPES = 100;

	public Cookbook(String title, String author, int yearOfPublication, int totalRecipes) {
		super(title, author, yearOfPublication);
		this.totalRecipes = totalRecipes;
	}

	public Cookbook(String title, String author) {
		this(title, author, DEFAULT_YEAROFPUBLICATION, DEFAULT_TOTALRECIPES);
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public int getTotalRecipes() {
		return totalRecipes;
	}

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication > 0) {
			this.yearOfPublication = yearOfPublication;
		}
	}

	public void setTotalRecipes(int totalRecipes) {
		if (totalRecipes > 0) {
			this.totalRecipes = totalRecipes;
		}
	}

	@Override
	public String toString() {
		String s = super.toString();
		{
			s += "\ncontains " + totalRecipes + " recipes";
		}
		return s;
	}

	public boolean isFeatured(int year, int numOfRecipes) {
		boolean checkIfFeatured = false;
		if(getCopyrightYear() > year && getTotalRecipes() > numOfRecipes) {
			checkIfFeatured = true;
		} 
		return checkIfFeatured;
	}
	

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Book) {
//			Cookbook otherCookBook = (Cookbook) obj;
//
//			boolean sameTitle, sameAuthor, sameYear;
//
//			if (this.getTitle().equalsIgnoreCase(otherCookBook.getTitle())) {
//				sameTitle = true;
//			} else {
//				sameTitle = false;
//			}
//
//			if (this.getAuthor().equalsIgnoreCase(otherCookBook.getAuthor())) {
//				sameAuthor = true;
//			} else {
//				sameAuthor = false;
//			}
//
//			if (this.getCopyrightYear() == otherCookBook.getCopyrightYear()) {
//				sameYear = true;
//			} else {
//				sameYear = false;
//			}
//
//			return sameTitle && sameAuthor && sameYear;
//		} else {
//			return false;
//		}
//	}
	
	
}
