package com.realEstate.paramountProperty.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility 
{
	static Driver driver;
	static Connection connection;
	static ResultSet result;
	
	/**
	 * This Method will perform the my sql database connection
	 * @throws SQLException
	 */
	public void connectDB() throws SQLException
	{
		//String IConstants_JDBC_URL_String="jdbc:mysql://localhost:3306/paraproperty";
		//String IConstants_JDBC_USERNAME = "root";
		//String IConstants_JDBC_PASSWORD = "root";
		 try 
		 {
			driver =new Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection(IConstants.JDBC_URL_String,IConstants.JDBC_USERNAME,IConstants.JDBC_PASSWORD);
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	}

	/**
	 * This method will close the my sql database
	 * @throws SQLException
	 */

	public void closeDB() throws SQLException
	{
		try
		{
			connection.close();
		}
		
		catch(Exception e)
		{
			
		}
		
	}
     
	/**
	 * This method will execute query based on query and it will verify the data
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public int execyteUpdate(String query) throws Throwable
	{
	  
		int result= connection.createStatement().executeUpdate(query);
		return result;
	}
	
	/**
	 * This method will execute query based on query and it will verify the data
	 * @param query
	 * @param columnINdex
	 * @param expectedData
	 * @return
	 * @throws Throwable
	 */
	
	public boolean executeQueryAndVerify(String query, int columnINdex, String expectedData)throws Throwable
	{
		boolean flag= false;
		result= connection.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnINdex).equals(expectedData))
			{
				flag= true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(expectedData+"==> Data is verified in the database table");
			return flag;
		}
		else
		{
			System.out.println(expectedData+"==>data is not verified in the database");
			return flag;
		}
		
	}
	
}


