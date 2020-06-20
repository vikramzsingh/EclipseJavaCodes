import java.sql.*;

public class Mysqlconcheck1 {
	public static void main(String[] args) throws SQLException  {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connjava","root","");
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
			System.out.println("Statement created");
			ResultSet rs=stmt.executeQuery("select*from employee");
			System.out.println("ResultSet created");
			while(rs.next())
				{
					System.out.println(rs.getString("last_name")+","+rs.getString("first_name")+","+rs.getString("salary"));
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
