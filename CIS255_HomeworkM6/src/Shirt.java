public class Shirt {

   private Size size;
   private String color;
   private double price;

   enum Size { SMALL, MEDIUM, LARGE }

   public Shirt(Size size, String color, double price) {
      this.size = size;
      this.color = color;
      this.price = price;
   }
   public Size getSize() {
      return size;
   }
   public String getColor() {
      return color;
   }
   public double getPrice() {
      return price;
   }
   public void setSize(Size size) {
      this.size = size;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public void setPrice(double price) {
      if(price > 0) {
         this.price = price;
      }
   }
   @Override
   public String toString() {
      return "Size = " + size + "\n" +
         "Color = " + color + "\n" + 
         "Price = " + price + "\n";
   }
   
   @Override
   public boolean equals (Object obj) {
	   if (obj instanceof Shirt) {
		   Shirt otherShirt = (Shirt) obj;
		   
		   boolean sameSize,sameColor,samePrice;
		   
		   if (this.getSize().equals(otherShirt.getSize())) {
				sameSize = true;
			} else {
				sameSize = false;
			}

			if (this.getColor().equalsIgnoreCase(otherShirt.getColor())) {
				sameColor = true;
			} else {
				sameColor = false;
			}

			if (this.getPrice() == otherShirt.getPrice()) {
				samePrice = true;
			} else {
				samePrice = false;
			}

			return sameSize && sameColor && samePrice;
		} else {
			return false;
	   }
   }
   
}