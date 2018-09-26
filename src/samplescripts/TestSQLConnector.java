package samplescripts;

import java.sql.SQLException;

import frameworks.SQLConnector;

public class TestSQLConnector {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String query = "select *  from employee;";
		String query1 = "INSERT INTO employee (name, age)" + "VALUES ('Komal', 26);";
		String query2 = "UPDATE employee SET name = 'FlabyJackob' WHERE name = 'Flaby';";
		String query3 = "DELETE FROM employee WHERE name = 'Komal';";
		SQLConnector sql = new SQLConnector();
		sql.setDataInDB(query1);
		sql.getDataFromDB(query);
		sql.updateDataInDB(query2);
		sql.deleteDataFromDB(query3);
		
	}


}
