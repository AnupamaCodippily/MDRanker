package server.utils;

import java.sql.*;
import java.util.Vector;
import java.util.HashMap;


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
	
//	private static void closeDBConnection ( Connection con) {
//		try {
//			if (con != null && !con.isClosed()) {
//				con.close();
//			}
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
	
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

	
	public static Vector<HashMap<String, String>> executeRawQuery(String query, String ... args) {
		
		Vector<HashMap<String, String>> vector = new Vector<HashMap<String, String>>();
		
		try {
			ResultSet result = getResultSet(query);
			
			while(result.next()) {
	   			HashMap <String, String> map = new HashMap<String, String> ();
				for (String arg : args) {
					map.put(arg, result.getString(arg));
				}
	   			vector.add(map);
	   		}	  	 
			
		} catch (SQLException e) {
			System.out.println("Error executing raw query. An SQL Exception has occured");
			e.printStackTrace();
		}
		
		
		return vector;
	}
	
}
