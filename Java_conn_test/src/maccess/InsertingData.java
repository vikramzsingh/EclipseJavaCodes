package maccess;
import java.util.*;
import java.sql.*;
@SuppressWarnings("serial")

public class InsertingData extends Exception{
	public static void main(String args[]) {
				
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter last name:");
			String lname=s.nextLine();
			System.out.println("Enter first name:");
			String fname=s.nextLine();
			System.out.println("Enter Email:");
			String email=s.nextLine();
			System.out.println("Enter Salary:");
			int sal=s.nextInt();

			// connection to Db
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/connjava","root","");;
			// ready sql stmt
			Statement myStmt=myConn.createStatement();
			// inserting data(inputed data from above)
			int rowAffected=myStmt.executeUpdate("Insert into employee" +
					"(las_name,first_name,email,salary)" + 
					"values" +
					"('+lname+','+fname+','+email+',+sal+)");
			ResultSet rs=myStmt.executeQuery("select * from employee");
			while(rs.next())// points the next line
			{
				System.out.println(rs.getString("las_name")+","+rs.getString("first_name"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
