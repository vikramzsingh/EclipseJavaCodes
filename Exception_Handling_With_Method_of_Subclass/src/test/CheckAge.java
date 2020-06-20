package test;
@SuppressWarnings("serial")
public class CheckAge extends Exception {
	/*public CheckAge()
	{
		//System.out.println("Valid Age:"); Just for Test
		//Default constructor and it executes first while object creation
	}*/
	public CheckAge(String msg)
	{
		super(msg);
	}
	

	public void verify(int age)
	{
		try
		{
			if(age<=0) // Exception
			{
				CheckAge ca = new CheckAge("Invalid Age");
				throw ca;
			}
			System.out.println("Valid Age:"+age);
		}//End try
		catch(CheckAge ob)
		{
			System.out.println("Exception Details:"+ob.getMessage());
			//System.out.println("just Test");
			
		}
	}
}
