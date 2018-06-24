package visam.com.Assignment.com.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args)  throws IOException{
		
		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		String s = "Hi how r u ?";
		byte b[] = s.getBytes();
		fos.write(b);
		fos.close();*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Sai KumarReddy sheru\\Desktop\\file.txt");
		int i =0;
		
		while((i=fis.read())!=-1){
			System.out.println((char)i);
		}
		fis.close();
			
	}
}
