package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class jdbctest2 {
	 @Test
	  public void f() throws Exception {
		    
		  
		  		Connection con = null;
		  		    try
		  	              {	    
		  	      // create a database connection
		  	    	Class.forName("org.sqlite.JDBC");
		  	      con= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sudheera\\databases\\myfirstdatabase.sqlite");
		  	      String sql = "Select Employee.empID, Employee.EmpName,Employee.DeptID,Department.DeptName From Employee, Department where Employee.DeptID = Department.DeptID";
		  	      PreparedStatement stmt =  con.prepareStatement(sql);
		  	     
		  	 ResultSet rs = stmt.executeQuery();
		  	     
		  	 while(rs.next())
		       {
		         // read the result set
		         System.out.println("Emp Name = " + rs.getString("EmpName"));
		
		         System.out.println("| Emp ID = " + rs.getString("EmpID"));
		         System.out.println("| Emp DeptName = " + rs.getString("DeptName"));
		         System.out.println("| Emp DeptID = " + rs.getString("DeptID"));
		       }
		  	    }
		  	    catch(SQLException e)
		  	    {
		  	      // if the error message is "out of memory", 
		  	      // it probably means no database file is found
		  	      System.err.println(e.getMessage());
		  	    }
		  	    finally
		  	    {
		  	      try
		  	      {
		  	        if(con != null)
		  	          con.close();
		  	      }
		  	      catch(SQLException e)
		  	      {
		  	        // connection close failed.
		  	        System.err.println(e);
		  	      }
		  	    }
		  	  }
		  	


		  	

}
