//Its a Assignment 23/07/19
package maccess;
import p2.*;
import java.util.*;

public class Interface2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x=");
		int x=s.nextInt();
		System.out.println("Enter the value of y=");
		int y=s.nextInt();
		System.out.println("Enter the choice:\n1.Greater\n2.Smaller");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			Greater gt = new Greater();
			System.out.println("The greater Value is "+gt.compareTo(x,y));
			break;
		case 2:
			Smaller sm = new Smaller();
			System.out.println("The Smaller Value is "+sm.compareTo(x,y));
			break;
		}
		s.close();
		
	}

}
