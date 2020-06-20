package maccess;
import test.Subclass1;

public class Mainclass {
	public static void main(String[] args) {
	    Subclass1 ob1 = new Subclass1();//outer class object
		Subclass1.Subclass2 ob2 = ob1.new Subclass2();
		ob2.m2();
		
	}

}
