package maccess;
import java.util.*;
import test.CheckAge;

public class DException4 {
	public static void main(String args[])
	{
		try(Scanner s = new Scanner(System.in);) //When try block with resource statement the catch block is optional
		{
			System.out.println("Enter the Age=");
			int age=Integer.parseInt(s.nextLine());
			CheckAge ca = new CheckAge(null);
			ca.verify(age);
		}//End of try
	}
}
