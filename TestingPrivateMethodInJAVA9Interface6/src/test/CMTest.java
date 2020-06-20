package test;

public interface CMTest {//WAP to show Private concrete method are executed by non-private methods of interface.
	//Note:-This program works in java9
		public static void m1()
		{
			System.out.println("----m1----");
	      
		}
		default void m2()//default means Non-Static.
		{
			System.out.println("----m2----");
			CMTest.m3();
			this.m4();
		}
		private static void m3()
		{
			System.out.println("----m3----");
		}
		private void m4()
		{
			System.out.println("----m4----");
		}
	}

