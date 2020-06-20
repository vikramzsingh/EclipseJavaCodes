package exceptionhandling;
import java.util.*;

public class DException1 {
	public static void main(String[] args) {
		while(true) {
		try {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = s.nextInt();// Exception raised InputMismatchException when x=12.34(non-int value)
		int k = 44/x;// When x==0 exception raised ArithmeticException
		System.out.println("The val of k:"+k);
		s.close();
		break;
		}// end of try
		catch(ArithmeticException | InputMismatchException ae) {
			 System.out.println("Only non-zero integer value");//combine both message for two Exception
			 System.out.println(ae);
			 //System.out.println("Only non-zero value");
			// System.out.println("Only integer value");
		}
		/*catch(InputMismatchException ie) {
			System.out.println("Only integer value");
		}*/
	  }// End of While loop
	}

}
