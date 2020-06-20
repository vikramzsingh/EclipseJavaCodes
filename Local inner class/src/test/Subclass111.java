package test;

public class Subclass111 {
	public int a=10;
	public static int b=20;
	public void m1() {
		class Subclass222{
			public void m2() {
				System.out.println("----m2()----");
				System.out.println("The val of a:"+a);
				System.out.println("The val of b:"+b);
			}//end inner class method
			
		}//end inner class 
		Subclass222 ob1 = new Subclass222();
		ob1.m2();
	}//outer class method end

}//outer class end
