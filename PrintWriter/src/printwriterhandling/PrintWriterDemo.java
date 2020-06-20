package printwriterhandling;
import java.io.*;

public class PrintWriterDemo {

	public static void main(String args[]) throws IOException {
		File f = new File("Demo.txt");// Directory, file name
		
		FileWriter fw = new FileWriter(f,true);// Append-mode
		PrintWriter pw = new PrintWriter(fw);
		//PrintWriter pw = new PrintWriter("Demo.txt");// This writer can communicate directly
		pw.print(100);
		pw.print(10.5);
		pw.print(true);
		pw.print("Vikram");
		pw.println("This is Testing of PrintWriter.");
		pw.println("This is Testing of PrintWriter.");
		pw.flush();
		pw.close();
		System.out.println("Success");
	}
	
}
