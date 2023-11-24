package s_11_24;

import java.io.File;
import java.io.OutputStream;

public class FileHandling01 {

	public static void main(String[] args) {
		System.out.println( System.getProperty("user.dir"));
		File fileInfo = new File("src/s_11_24/Example01.java");
		System.out.println(fileInfo.exists());		
	}

}
