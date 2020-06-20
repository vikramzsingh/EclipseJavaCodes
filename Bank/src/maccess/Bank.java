package maccess;
import p1.PinCheck;
import p4.*;
import java.util.*;
public class Bank {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
//System.out.println("Enter the pin:");
int count=0;
xyz://lable
	while(true) {
	System.out.println("Enter the pin:");	
    String pinNo=s.nextLine();
    if(pinNo.length()==4) {
    	PinCheck pc = new PinCheck();
    	boolean k=pc.verify(Integer.parseInt(pinNo));
    	if(k) {
    		System.out.println("----CHOICE----");
    		System.out.println("1.WithDraw\n2.Deposit\n3.Payment");
    		System.out.println("Enter the choice");
    		int choice=Integer.parseInt(s.nextLine());
    		switch(choice) {
    		case 1:
    			WithDraw wd = new WithDraw();
    			System.out.println("Enter the Amount:");
    			int a1=Integer.parseInt(s.nextLine());
    			if(a1>0&&a1%100==0) {
    				wd.process(a1);
    			}
    			else {
    				System.out.println("Invalid Amount");
    			}
    			break xyz;// it breaks whole while loop 
    		case 2:
    			Deposit d1 = new Deposit();
    			System.out.println("Enter the Amount:");
    			int a2=Integer.parseInt(s.nextLine());
    			if(a2>0&&a2%100==0) {
    				d1.process(a2);
    			}
    			else {
    				System.out.println("Invalid Amount");
    			}
    			break xyz;
    		case 3:
    			Payment p1 = new Payment();
    			System.out.println("Enter the Amount:");
    			int a3=Integer.parseInt(s.nextLine());
    			if(a3>0&&a3%100==0) {
    				p1.process(a3);
    			}
    			else {
    				System.out.println("Invalid Amount");
    			}
    			break xyz;
    			default:
    				System.out.println("Invalid choice");
    				break xyz;
    		
    			
    		}//end of switch
    		}//end of if on line no.18
    		else{
    			System.out.println("PinNo doesnot exist");
    			count++;
    		}//else body of if on line no 18
    }//end of if on line no 15
    else {
    	System.out.println("Invalid PinNo");
    	count++;
    }//else body of if on line no 15
    	
    	if(count==3) {
    		System.out.println("Transaction Blocked");
    		break xyz;
    	}
    	}//end of while loop
    s.close();
    }//main method end.
	}//class end

