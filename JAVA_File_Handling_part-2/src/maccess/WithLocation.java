package maccess;
import java.io.*;

class WithLocation {

	public static void main(String[] args) throws Exception {
		File f = new File("F://java workspace//JAVA_File_Handling_part-2//src//CreatingFile"); // File is a constructor(buit-in) to create diretory or file
		f.mkdir();
		//File f1 = new ("CreateFolder","abc.txt");
		File f1 = new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println("Folder created with name of CreateFile inside it a file abc.txt is created");
	}

}
