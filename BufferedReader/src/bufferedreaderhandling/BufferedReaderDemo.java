package bufferedreaderhandling;
import java.io.*;
import java.util.*;

public class BufferedReaderDemo {
	public static void main(String args[]) throws IOException {
		File f = new File("Demo.txt");// file object
		
		// For write operation
		FileWriter fw = new FileWriter(f,true);//file name, append and override-mode
		
		//BufferedWriter cannot communicate directly with file it need Writer object
		BufferedWriter bw = new BufferedWriter(fw);// writer obj
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String data to save into file: ");
		String s1 = s.nextLine();
		bw.write(s1);
		bw.newLine();
		bw.flush();
		s.close();
		bw.close();
		
		// For read operation
		System.out.println("Here data inside the file: ");
		FileReader fr = new FileReader(f);//file name, append and override-mode
		
		//BufferedReader cannot communicate directly with file it need reader object
		BufferedReader br = new BufferedReader(fr);// reader obj
		//BufferedReader br = new BufferedReader(fr,8); 8 is BufferSize to coustomize
		String line = br.readLine();
		while(line != null)
		{
			System.out.print(line);
			line = br.readLine();
		}
		br.close();
	}
}
