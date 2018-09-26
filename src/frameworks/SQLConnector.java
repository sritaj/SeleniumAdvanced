package frameworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {

	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    String dbUrl = "jdbc:mysql://localhost:3306/emp_list";					

	//Database Username		
	String username = "root";	
    
	//Database Password		
	String password = "admin";		
	
	public void getDataFromDB (String query) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Query to Execute		
        //String query = "select * from employee;";	>> The query is passed as an argument"
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	    Statement stmt = con.createStatement();		

		// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);			
 
        //While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		
        //Closing DB Connection		
		con.close();			

	}
	
	public void setDataInDB(String query) throws SQLException, ClassNotFoundException {
		
		 //Load mysql jdbc driver		
   	    Class.forName("com.mysql.cj.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	    Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
 		stmt.executeUpdate(query);			
	}
	
	public void updateDataInDB(String query) throws ClassNotFoundException, SQLException {
		
		 //Load mysql jdbc driver		
   	    Class.forName("com.mysql.cj.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	    Statement stmt = con.createStatement();		
	    
		// Execute the SQL Query. Store results in ResultSet		
 		stmt.executeUpdate(query);	
		
	}
	
	public void deleteDataFromDB(String query) throws ClassNotFoundException, SQLException {
		
		 //Load mysql jdbc driver		
  	    Class.forName("com.mysql.cj.jdbc.Driver");			
  
  		//Create Connection to DB		
   	Connection con = DriverManager.getConnection(dbUrl,username,password);
 
 		//Create Statement Object		
	    Statement stmt = con.createStatement();	

		// Execute the SQL Query. Store results in ResultSet		
		stmt.executeUpdate(query);	
		
	}

}
