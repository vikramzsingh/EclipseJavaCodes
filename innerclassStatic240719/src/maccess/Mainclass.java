package maccess;
import test.Subclass11;

public class Mainclass {
	public static void main(String[] args) {
	  //Subclass11 ob1 = new Subclass11();//outer class object
		Subclass11.Subclass22 ob2 = new Subclass11.Subclass22();
		ob2.m11();
		Subclass11.Subclass22.m22();
	}

}
