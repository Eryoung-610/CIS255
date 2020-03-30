package test;

public class Class4  { // Note: This is NOT a child class of Class1!
	   

	   public void method() {
	      Class1 obj = new Class1();
	      // CODE STATEMENT WOULD GO HERE
	      System.out.println(this.a);
	      System.out.println(this.b); 
	      System.out.println(this.c); 
	      System.out.println(obj.a); 
	      System.out.println(obj.b);
	      System.out.println(obj.c); 
	   }
	} 