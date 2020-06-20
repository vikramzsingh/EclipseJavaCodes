package maccess;
import java.util.*;
// built-in exception create object automatically
	public class DException1 {
		public static void main(String[] args)
		{
			try
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the val of x=");
				int x=Integer.parseInt(s.nextLine());
				int k=(44/x);
				System.out.println("The val of k="+k);
				s.close();
			}
			catch(ArithmeticException ie)
			{
				System.out.println("Only Non-Zero valid");
				System.out.println("Exception Details:"+ie.getMessage());
			}
		}


}
