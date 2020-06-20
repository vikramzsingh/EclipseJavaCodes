package p4;
import p3.Transaction;
public class Payment implements Transaction {
public void process(double amt) {
	if(amt<=b1.bal) {
		System.out.println("Amount paid"+amt);
		b1.bal=b1.bal-amt;
		b1.getBal();
	}
	else {
		System.out.println("Insufficient Fund");
	}
}
}
