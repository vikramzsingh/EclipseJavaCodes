package maccess;
import java.io.*;

public class JavaFileHandling {
	public static void main(String[] args) throws Exception {
		File f = new File("abc.txt"); //File already created(second time)
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}
