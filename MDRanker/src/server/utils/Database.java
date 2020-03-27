package server.utils;

import java.sql.*;
import java.util.function.Consumer;

import server.Reviewable;

public class Database {
	public static Connection getConnection() {
		
		Connection con = null;
		
        try{  
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	
        	con =DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/mdranker","root","test"); 
        	
        	}
        catch(Exception e)
        { 
        	e.printStackTrace();
        }  
        	  
	
		return con;
	}
	
	public static void closeDBConnection ( Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
