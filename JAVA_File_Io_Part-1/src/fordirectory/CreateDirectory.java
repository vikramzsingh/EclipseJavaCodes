package fordirectory;
import java.io.*;

public class CreateDirectory {
	public static void main(String[] args) throws Exception {
		File d = new File("CreateFolder");
		System.out.println(d.exists());
		d.mkdir();
		System.out.println(d.exists());
	}

}
