package test;

public class Subclass1 {
	public int a=10;
	public static int b=20;
	public class Subclass2{
		
		public void m2() {
			System.out.println("----m2()----");
		    System.out.println("The value of a:"+a);
			System.out.println("The value of b:"+b);
		}
	}
	
}
