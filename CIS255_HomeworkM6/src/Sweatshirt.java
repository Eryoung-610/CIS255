
public class Sweatshirt extends Shirt {

	private boolean isHooded;
	private int totalHooded;

	public Sweatshirt(Size size, String color, double price, boolean isHooded) {
		super(size, color, price);
		this.isHooded = isHooded;
		
		if(isHooded = true) {
			totalHooded++;
		}
		
	}

	public boolean isHooded() {
		return isHooded;
	}

	public void setHooded(boolean isHooded) {
		this.isHooded = isHooded;
	}

	public int getTotalHooded() {
		return totalHooded;
	}

	@Override
	public String toString() {
		return "Size = " + getSize() + "\n" + "Color = " + getColor() + "\n" + "Price = " + getPrice() + "\n"
				+ "Hooded? : " + isHooded + "\n";
	}

}
