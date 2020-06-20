package appoffilehandling;
import java.io.*;

public class MergeTwoFilesIntoOne 
{
	public static void main(String args[]) throws IOException 
	{
		PrintWriter pw = new PrintWriter("file3.txt");
		
		PrintWriter pw1 = new PrintWriter("file1.txt");
		pw1.println(222);
		pw1.println(333);
		pw1.println(444);
		pw1.println(555);
		
		pw1.flush();
		pw1.close();
		
		PrintWriter pw2 = new PrintWriter("file2.txt");
		pw2.println("AAA");
		pw2.println("BBB");
		pw2.println("CCC");
		pw2.println("DDD");
		pw2.println("EEE");
		
		pw2.flush();
		pw2.close();
		
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while(line != null) 
		{
			pw.println(line);
			line = br.readLine();
		}
		br.close();
		
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while(line != null) 
		{
			pw.println(line);
			line = br.readLine();
		}
		
		pw.flush();
		pw.close();
		System.out.println("Success");
	}
}
