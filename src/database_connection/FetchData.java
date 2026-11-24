package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "1234");
		Statement st = con.createStatement();
		String q = "select * from students";
		ResultSet rs = st.executeQuery(q);
		ResultSetMetaData rsmd = rs.getMetaData();//to fetch column name from table
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
		}

	}

}
