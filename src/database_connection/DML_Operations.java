package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Operations {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "1234");
		Statement st=con.createStatement();
		//String q="insert into students value(6,'sandesh','raigad',7189876549,'M','2024-01-01')";
		//String q="update students set gender='M' ,city='nagpur' where id in (2,5)";
		String q="delete from students where id=4";
		st.executeUpdate(q);
		System.out.println("done!!");

		
	}

}
