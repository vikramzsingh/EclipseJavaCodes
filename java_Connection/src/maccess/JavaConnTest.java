package maccess;
import java.sql.*;
@SuppressWarnings("serial")

public class JavaConnTest extends Exception {
	public static void main(String[] args){
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded, hello vikram");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connjava","root","");
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
			System.out.println("Statement created");
			ResultSet rs=stmt.executeQuery("select * from studentdata");
			System.out.println("ResultSet created");
			while(rs.next())
				{
					System.out.println(rs.getString("rollno")+","+rs.getString("name"));
				}
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
			
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
	}
}