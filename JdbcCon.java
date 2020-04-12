package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCon {

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/world";
		String user="root";
		String pass="naresh@123";
		String query="select * from neon";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("age");
		System.out.println(name);
		st.close();
		con.close();
		

	}

}
