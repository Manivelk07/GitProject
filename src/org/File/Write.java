package org.File;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class Write {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\File\\\\Data\\\\File.txt");
		FileUtils.write(f, "Hello Manivel ");
		FileUtils.write(f, " Captian Cool", true);
		FileUtils.write(f, " Java Class ", false);
		FileUtils.write(f, "Selenium Class Started", true);
		List<String> read = FileUtils.readLines(f);
		for (String a : read) {
			System.out.println(a);
		}
		
	}

}
