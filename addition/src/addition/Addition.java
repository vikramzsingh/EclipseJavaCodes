package addition;

public class Addition
{
	int a,b;    //Non-static variables or Instance variables.
	void add()//Non-static variables or Instance method
	{
		int c=a+b; //Non-static variables or Local variables.
		System.out.print(c);
	}
	public static void main(String args[]) 
	{
	    Addition ob=new Addition();//Objcet Creation.
		ob.a=12;
		ob.b=13;
		ob.add();

	}
}



