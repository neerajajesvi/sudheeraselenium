package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jdbctest1 {
	@Test
	  public void f() throws Exception {
		  
		 
				 Connection con = null;
				 
				    try
				    
				    {
				    
				      // create a database connection
				    	Class.forName("org.sqlite.JDBC");
				      con= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sudheera\\databases\\myfirstdatabase.sqlite");
				      Statement stmt =  con.createStatement();
				      
				     
				      ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from Employee");
				      while(rs.next())
				      {
				        // read the result set
				        System.out.println("empID = " + rs.getString("empID"));
				        System.out.println("EmpName = " + rs.getString("EmpName"));
				      }
				    }
				    catch(SQLException e)
				    {
				    	System.out.println(e);
	  }
	}


}
