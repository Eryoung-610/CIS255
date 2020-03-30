
public class TriangleType {

	enum Triangle {
		equilateral(3), isoceles(2), scalene(0); 

		private final int equalSides; 

		Triangle(int sides) { 
			this.equalSides = sides;
		}

		public int getEqual_sides() {
			return equalSides;
		}

		
		public String toString() {
			return "Triangle hase " + equalSides + " sides same.";
		}
	}
	
	public static void main(String[] args) {
		Triangle myFavorityTriangleType = Triangle.equilateral;
		System.out.println(myFavorityTriangleType);
	}
}
