import java.nio.file.Files;
import java.nio.file.Paths;

public class LambdaAssignment {

	public static void main(String[] args) throws Exception {

		System.out.println("Doing more things than just reading file using Java 8 Streams");
		Files.lines(Paths.get("C:\\Users\\Sai KumarReddy sheru\\Desktop\\1.txt"))
				// .map(s -> s.trim())
				.filter(s -> s.length() > 35).forEach(System.out::println);

	}

}
