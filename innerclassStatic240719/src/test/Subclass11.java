package test;

public class Subclass11 {
	public int a=10;
	public static int b=20;
	public static class Subclass22{
		public void m11() {
			System.out.println("----m11()----");
		  //System.out.println("The value of a:"+a);
			System.out.println("The value of b:"+b);
		}
		public static void m22() {
			System.out.println("----m22()----");
		  //System.out.println("The value of a:"+a);
			System.out.println("The value of b:"+b);
		}
	}
	
}
