package macess;
import java.io.*;

public class FileReaderDemo1 {
	public static void main(String args[]) throws Exception {
		File f = new File("Demo.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("The is a File. Testing File handling with java\n");
		fw.close();
		
		char[] ch = new char[(int)f.length()]; // length() is long-type cast into int-type
		FileReader fr = new FileReader(f);
		fr.read(ch);
		for(char ch1 : ch)// for each char ch1 in ch, for every character present in this the ch array
		{
			System.out.print(ch1);
		}
		fr.close();
	}
}
