package maccess;
import java.io.*;

public class CreateFileInsideDirectry {

	public static void main(String[] args) throws Exception {
		File f = new File("CreateFolder"); // File is a constructor(buit-in) to create diretory or file
		f.mkdir();
		//File f1 = new ("CreateFolder","abc.txt");
		File f1 = new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println("Folder created with name of CreateFolder inside it a file abc.txt is created");
	}

}
