
public class BookTester {

		public static void main(String[]args) {
			Book b1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);
			Book b2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998);
			Book b3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999);
			
			System.out.println(b1);
			b2.totalAuthors();
			b3.isDigitalEra();
		}
}