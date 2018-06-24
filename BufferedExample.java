package visam.com.Assignment.com.FileOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Java Assignment";
		byte[] b = s.getBytes();
		bos.write(b);
		bos.close();
		fos.close();
		System.out.println("Success");

		FileInputStream fis = new FileInputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while ((i = bis.read())!=-1) {
			System.out.print((char) i);
		}
		bis.close();
		fis.close();
	}

}
