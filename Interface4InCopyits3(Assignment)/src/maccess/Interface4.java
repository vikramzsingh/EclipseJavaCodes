package maccess;
import p1.Icomparable;
import java.util.*;
import static java.lang.System.*;

public class Interface4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(in);//because of static import
				out.println("Enter the value of x=");
				int a=s.nextInt();
				out.println("Enter the value of y=");
				int b=s.nextInt();
				out.println("----CHOICE----");
				out.println("Enter the choice:\n1.Greater\n2.Smaller");
				int choice=s.nextInt();
				switch(choice){
				case 1:
				Icomparable gt =(int x, int y)-> {//lambda Expression
							if(x>y)
								return x;
							else 
								return y;
							};
					out.println("The Greater vakue is "+gt.compareTo(a,b));
					break;
				case 2:
				Icomparable sm =(int x, int y)-> {
							if(x<y)
								return x;
							else 
								return y;
							};
					out.println("The Smaller vakue is "+sm.compareTo(a,b));
					break;
					
				}
				s.close();
		
	}

}
