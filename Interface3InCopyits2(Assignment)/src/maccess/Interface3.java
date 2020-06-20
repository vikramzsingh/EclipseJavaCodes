package maccess;
import p1.Icomparable;
import java.util.*;
import static java.lang.System.*;

public class Interface3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(in);//because of static import
				out.println("Enter the value of x=");
				int x=s.nextInt();
				out.println("Enter the value of y=");
				int y=s.nextInt();
				out.println("----CHOICE----");
				out.println("Enter the choice:\n1.Greater\n2.Smaller");
				int choice=s.nextInt();
				switch(choice){
				case 1:
				Icomparable gt = new Icomparable() {
						public int compareTo(int x, int y) {
							if(x>y)
								return x;
							else 
								return y;
						}
					};
					out.println("The Greater vakue is "+gt.compareTo(x, y));
					break;
				case 2:
				Icomparable sm = new Icomparable() {
						public int compareTo(int x, int y) {
							if(x<y)
								return x;
							else 
								return y;
						}
					};
					out.println("The Greater vakue is "+sm.compareTo(x, y));
					break;
					
				}
				s.close();
		
	}

}
