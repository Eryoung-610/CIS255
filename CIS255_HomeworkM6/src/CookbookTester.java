
public class CookbookTester {

	public static void main(String[] args) {
		Cookbook test1 = new Cookbook("Gordon Ramsay's Ultimate Cookery Course", "Gordon Ramsay", 2012, 120);
		Cookbook test2 = new Cookbook("Gordon Ramsay's Ultimate Cookery Course", "Gordon Ramsay", 2012, 120);
		
		System.out.println("Cookbook1 featured? : " + test1.isFeatured(2014, 100));
		System.out.println(test2);
		System.out.println("EQUAL?" + test1.equals(test2));

	}
}
