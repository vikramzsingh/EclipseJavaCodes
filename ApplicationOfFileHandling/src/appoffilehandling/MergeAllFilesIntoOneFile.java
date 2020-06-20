package appoffilehandling;

import java.io.*;

public class MergeAllFilesIntoOneFile 
{
	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw = new PrintWriter("output.txt");
		
		File d = new File("Directory");
		d.mkdir();
		
		String[] s = d.list();
		for(String s1 : s )
		{
			File f = new File(d,s1);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			br.close();
		}
		pw.close();
		System.out.println("Success");
	}
}
