package bufferedwriterhandling;
import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Demo.txt",true);//true for append mode
		
		// BufferedWriter cannot access file directly it needs writer OBJECT(fw){Here we are going to use FileWriter OBJECT} 
		BufferedWriter bw = new BufferedWriter(fw);// need writer obj to work
		//BufferedWriter bw = new BufferedWriter(fw,8) bufferSize is 8
				
		bw.write(100);// for single char. input
		bw.newLine();
		
		char[] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		
		bw.write("This is Buffered Writer Testing.");
		bw.flush();
		bw.close();
		System.out.println("Success");
	}
	
}
