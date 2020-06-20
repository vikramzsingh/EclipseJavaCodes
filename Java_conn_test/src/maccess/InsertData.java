package maccess;
import java.sql.*;
@SuppressWarnings("serial")

public class InsertData extends Exception {
	public static void main(String[] args){
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded, hello vikram");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connjava","root","");
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
			System.out.println("Statement created");
			//inserting new employee
			System.out.println("Inserting new data in employee table");
			
			int rowsAffected = stmt.executeUpdate(
				"Insert into employee" +
				"(las_name,first_name,email,salary)" + 
				"values" +
				"('Singh','Vikram','Vikram@gmail.com',50000)");
			
			ResultSet rs=stmt.executeQuery("select * from employee"); // (Remember)Operation not allowed after ResultSet closed
			System.out.println("ResultSet created");
			while(rs.next())// points the next line
				{
					System.out.println(rs.getString("las_name")+","+rs.getString("first_name"));
				}
				if(rs!=null) { // Not necessary to write
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
