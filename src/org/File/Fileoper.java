package org.File;
import java.io.File;
import java.io.IOException;
public class Fileoper {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\File\\Data\\File.txt");
		boolean a = f.createNewFile();
		System.out.println(a);
		boolean b = f.canRead();
		System.out.println(b);
		boolean c = f.canWrite();
		System.out.println(c);
		
		String[] list = f.list();
		for (String ad : list) {
			System.out.println(ad);
		}
		System.out.println("\n");
		File[] files = f.listFiles();
		for (File fil : files) {
			System.out.println(fil);
		}
		
		
	}

}
