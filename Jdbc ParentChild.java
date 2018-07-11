
package visam.com.Assignment.Database;

import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Java", "postgres", "Password");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * from faculty,student  where faculty.id = student.id and student.id = 2  order by djoined ASC");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2)+ " "+rs.getString(3)+ " " +rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDate(6));
		conn.close();

	}

}
