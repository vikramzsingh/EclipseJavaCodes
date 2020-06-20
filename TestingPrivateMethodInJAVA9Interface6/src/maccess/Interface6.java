package maccess;
import test.CMTest;

public class Interface6 {public static void main(String[] args)
{
	CMTest.m1();
	CMTest ob = new CMTest() {};
	// This error ocurring because its java 8 version, but private method only work in java 9 and above version
	//ob.m1();//error
	ob.m2();//default method call
}

}

