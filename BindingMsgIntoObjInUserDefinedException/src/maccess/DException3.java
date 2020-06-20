package maccess;
import java.util.*;
@SuppressWarnings("serial")
//java.lang.Exception supper class of DException(Exception-creating-class) class. And java.lang.Throwable is supper class of all Exceptions and Errors 
public class DException3 extends Exception {
	public DException3(String msg) //constructor of public-type
	{
		super(msg);    // First goes to Exception(parent class) and then to Throwable(Parent class of all exception)
				       //Throwable(Parent class of all) has built in getMessage() method so it displayed Exception Details:"Invalid Employee ID"  
	}
	public static void main(String args[])
	{
		Scanner s=null;
		try
		{
			s=new Scanner(System.in);
			System.out.println("Enter the Employee ID=");
			String eid=s.nextLine();
			if(eid.length()!=4)
			{
				DException3 ob = new DException3("Invalid Employee ID");
				throw ob;		
			}
			System.out.println("Valid ID="+eid);
		}
		catch(DException3 obj)
		{
			System.out.println("Exception Details:"+obj.getMessage());
		}
		finally
		{
			s.close();
		}
	}
}
