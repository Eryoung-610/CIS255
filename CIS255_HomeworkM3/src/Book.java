
public class Book {

	private String title;
	private static String author;
	private int publicationYear;

	public Book(String bookTitle, String theAuthor, int thePublicationYear) {
		title = bookTitle;
		author = theAuthor;
		publicationYear = thePublicationYear;
	}


	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setTitle(String newBookTitle) {
		title = newBookTitle;
	}

	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}

	public void setPublicationYear(int newPublicationYear) {
		publicationYear = newPublicationYear;
	}

	public String toString() {
		String s = "Title: " + title + "\nAuthor: " + author + "\nPublication Year : " + publicationYear;
		// + "\nDigital Era? : " + isDigitalEra();
		return s;
	}

	public void isDigitalEra() {
		if (publicationYear < 1990) {
			System.out.println("This book was published before the digital era of books.");
		} else {
			System.out.println("This book was published during the digital era of books.");
		}
	}

	public void totalAuthors() {
		int totalAuthors = 0;

		for (int i = 0; i < author.length(); i++) {
			if (author.charAt(i) == '&') {
				totalAuthors++;
			}else if (totalAuthors == 0) {
				totalAuthors = 1;
			}
		}
		
		System.out.println("The total number of author(s) is : " + totalAuthors);
	}
}
