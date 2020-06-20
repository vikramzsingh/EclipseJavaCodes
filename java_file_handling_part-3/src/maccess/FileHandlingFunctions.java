package maccess;
import java.io.*;

class FileHandlingFunctions {
	//static int count=0;
	
	public static void main(String[] args) throws Exception {
		int count=0,count1=0;
		File f = new File("F://java workspace//java_file_handling_part-3//src//CreatingFile"); // File is a constructor(buit-in) to create diretory or file
		
		f.mkdir();
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		
		//File f1 = new ("CreateFolder","abc.txt");
		File f1 = new File(f,"Demo1.txt");
		
		f1.createNewFile();
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		String[] s = f.list();
		
		for(String s1 : s )
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("The total No. of Files and Folders: "+count);
		
		for(String s1 : s )
		{
			File f3 = new File(f,s1);// with for loop s1 recieve one by one name of file
			if(f3.isFile())//f3.isDirectory() for getting no. of directory
			{
				count1++;
				System.out.println(s1);
			}
		}
		System.out.println("The total No. of Files: "+count1);
		
		System.out.println("Folder created with name of CreateFile inside it a file Demo.txt is created");
	}

}
