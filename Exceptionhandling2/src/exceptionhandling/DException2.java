package exceptionhandling;
import java.io.*;

public class DException2 {
	static DataInputStream dis=null;
	static FileOutputStream fos=null;
	public static void main(String[] args)
	throws IOException{
		try {
		dis = new DataInputStream(System.in);//to read data into java application
		fos = new FileOutputStream("DText.txt",true);// true for append mode i.e write data along existing data
		char ch1;
		System.out.println("Enter the data(@ at the end)");
		while((ch1=(char)dis.read())!='@') {
			fos.write(ch1);
		}// end of while
	}// end of try
	finally {
		dis.close();
		fos.close();
	}
	}
}

