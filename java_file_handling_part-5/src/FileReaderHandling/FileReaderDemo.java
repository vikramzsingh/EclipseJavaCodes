package FileReaderHandling;
import java.io.*;
import java.util.*;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("Demo.txt",true);
		System.out.println("Enter the Text data: ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		fw.write(s1);
		fw.write("\n");
		fw.close();
		s.close();
		
		// For read operation
		FileReader fr = new FileReader("Demo.txt");
		int i = fr.read();
		System.out.println("The result is: ");
		while(i != -1)// i = -1 when there is not any data
		{
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}

}
