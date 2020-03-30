
public class Trio<E> {

	private E Item1, Item2, Item3;

	public Trio(E item1, E item2, E item3) {
		this.Item1 = item1;
		this.Item2 = item2;
		this.Item3 = item3;

	}

	public E getItem1() {
		return Item1;
	}

	public void setItem1(E item1) {
		Item1 = item1;
	}

	public E getItem2() {
		return Item2;
	}

	public void setItem2(E item2) {
		Item2 = item2;
	}

	public E getItem3() {
		return Item3;
	}

	public void setItem3(E item3) {
		Item3 = item3;
	}

	@Override
	public String toString() {
		return Item1.toString() + ", " + Item2.toString() + ", " + Item3.toString();
	}

	public boolean isATriplicate() {
		if (Item1.equals(Item2) && Item2.equals(Item3) && Item3.equals(Item1)) {
			return true;
		}
		return false;
	}

}
