package server.utils;

import java.sql.*;
import java.util.function.Consumer;


public class Database {
	private static Connection getConnection() {
		
		Connection con = null;
		
        try{  
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	
        	con =DriverManager.getConnection(  
        	"jdbc:mysql://localhost/mdranker?serverTimezone=UTC","root",""); 
        	}
        catch(Exception e)
        { 
        	e.printStackTrace();
        }  
        	  
	
		return con;
	}
	
	public static ResultSet getResultSet(String query) throws SQLException {
		
		
		Connection conn = getConnection();

    	Statement statement=conn.createStatement();  
		
    	ResultSet resultSet = statement.executeQuery(query);
    	
    	closeDBConnection(conn);
    	return null;
		
	}
	
	private static void closeDBConnection ( Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
