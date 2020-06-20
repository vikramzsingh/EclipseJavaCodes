package macess;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class DStatic {
	public static void main(String[] args) {
	Scanner s = new Scanner(in);
	out.println("Enter the val of x:");
	double x=s.nextInt();
	double z=sqrt(x);
	out.println("The Square root of "+x+ " is "+z);
	s.close();
}

}
