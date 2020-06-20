package maccess;
import java.util.*;
@SuppressWarnings("serial") //Suppress warnings when your program contain questionable code

public class DException2 extends Exception {
	public static void main(String args[])
	{
		Scanner s=null;
		try 
		{
			s=new Scanner(System.in);
			System.out.println("Enter the Employee ID=");
			String eid = s.nextLine();
			if(eid.length()!=4) //Exception
			{
				DException2 ob = new DException2(); //In User defined exception. Create object of class and throw it to the catch block 
				throw ob;
			}
			System.out.println("Valid ID="+eid);
		}
		catch(DException2 obj) //catch(exception-type-class ref-variable)
		{
			System.out.println("Exception Details:"+obj.getMessage());
			//obj.printStackTrace(); Note:-This method print complete details of Exception
			System.out.println("Invalid employee ID");
		}
		finally
		{
			s.close();
		}
	}

}
