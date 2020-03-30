public class MyClass {

   private int valueA = 0;
   private static int valueB = 0;
   
   public void methodA() {
       // CODE HERE IN methodA
	 System.out.println(valueA); 
	 System.out.println(valueB); 
   }
   public static void methodB() {
       // CODE HERE IN methodB
	   System.out.println(valueA); 
	   System.out.println(valueB); 
	   System.out.println(this.valueA); 
	   System.out.println(this.valueB);
    }
}