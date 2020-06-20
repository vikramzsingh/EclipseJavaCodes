package maccess;
import java.util.*;
import test.CheckBranch;

public class DException6 {
	public static void main(String args[])
	{
		try(Scanner s = new Scanner(System.in);)
		{
			System.out.println("Enter the branch=");
			String br=s.nextLine();
			CheckBranch cb = new CheckBranch();
			cb.verify(br.toLowerCase());
			System.out.println("Enter the rollno.=");
			String rno=s.nextLine();
			System.out.println("Branch="+br);
			System.out.println("Roll No.="+rno);
		}
		catch(CheckBranch ob)
		{
			System.out.println("Details="+ob.getMessage());
		}
	}
	
}
