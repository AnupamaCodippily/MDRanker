package server.utils;

import java.sql.*;


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
        	System.out.println("DB Error");
        	e.printStackTrace();
        }  
        	  
	
		return con;
	}
	
	public static ResultSet getResultSet(String query) throws SQLException {
		
		
		Connection conn = getConnection();

    	Statement statement=conn.createStatement();  
		
    	ResultSet resultSet = statement.executeQuery(query);
    	
//    	closeDBConnection(conn);
    	return resultSet;
    	
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
	
	public static void closeConnection ( ResultSet resultSet) {
		
		try {
			Connection con = resultSet.getStatement().getConnection();
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
