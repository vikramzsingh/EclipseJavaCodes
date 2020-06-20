package maccess;
import test.*;
import java.util.*;

public class Demo
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Username=");
		String a=s.nextLine();
		System.out.println("Enter the Password=");
		String b=s.nextLine();
		Login ob = new Login();
		Login1 obj = new Login1();
		obj.msg1();
		ob.login(a,b);
		ob.getLoginDetails();
		s.close();
	}
}
