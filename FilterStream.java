package visam.com.Assignment.com.FileOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterStream {
	public static void main(String args[]) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		FilterOutputStream filter = new FilterOutputStream(fos);
		String s = "using filter output stream and filter output stream";
		byte[] b = s.getBytes();
		filter.write(b);
		filter.close();
		fos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		FilterInputStream filter1 = new BufferedInputStream(fis);
		int i = 0;
		while ((i = filter1.read()) != -1)
			System.out.print((char) i);

	}

}
