package maccess;
import test.Subclass1;

public class Mainclass {
	public static void main(String[] args) {
		Subclass1 obj1 = new Subclass1();//new operator says create a object for Subclass1.
		Subclass1.Subclass2 obj2 = obj1.new Subclass2();//new operator says create a object for Subclass2 which belongs to object1(obj1)..
		obj2.m2();              //and load the reference to the object2(obj2) of Subclass2 which belongs to Subclass1..             
	}

}
