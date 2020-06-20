import java.sql.*;

public class JdbcTest{
	public static void main(String[] args) throws SQLException{
		Connection myConn=null;
		Statement myStmt=null;
		ResultSet myRs=null;
		
		try {
			// 1.Get Connection to Database
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/connjava","root","");
			
			System.out.println("Database Connection successful\n");
			
			// 2.Create a Statement
			myStmt=myConn.createStatement();
			
			// 3.Execute SQL Query
			myRs=myStmt.executeQuery("select * from employee");
			
			// 4.Process Result set
			while(myRs.next())
			{
				System.out.println(myRs.getString("last_name")+","+myRs.getString("first_name"));
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if(myRs!=null) {
				myRs.close();
			}
			if(myStmt!=null) {
				myStmt.close();
			}
			if(myConn!=null) {
				myConn.close();
			}
		}
	}
}