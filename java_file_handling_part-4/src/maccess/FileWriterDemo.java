package maccess;
import java.io.*;
import java.util.*;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		//File f = new File("Demo.txt");
		//f.createNewFile();
		FileWriter fw = new FileWriter("Demo.txt",true);//without true over-riding existing data 
		//FileWriter fw = new FileWriter(f,true);//ture used for append mode
		fw.write(100);// adding single character d
		fw.write("urga\nSoftware Solutions");
		fw.write('\n');
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data you want to input:");
		String s1=s.nextLine();
		fw.write(s1);
		System.out.println("File Saved Successfully");
		fw.flush();// for Garentee that all data is written properly
		fw.close();
		s.close();
	}

}
