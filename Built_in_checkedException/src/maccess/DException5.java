package maccess;

public class DException5 {                                                                                  //package.class
	public static void main(String args[]) 
	throws InterruptedException // InterruptedException belongs to java.lang.InterruptedException;
	{ 
		for(int i=1;i<=10;i++)
		{
			System.out.println("val="+i);
			Thread.sleep(2000);//sleep() method belongs to java.lang.Thread.sleep()
		}//end of loop
	}
}
 