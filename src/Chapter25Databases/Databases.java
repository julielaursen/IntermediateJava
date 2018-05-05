package Chapter25Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import java.sql.SQLException;

//Define a data manipulation application for the books database
//The user should be able to edit existing data  add new data
//allow the user to add a new author,
//edit the existing information for an author,
//add a new title for an author
//add a new entry in the authorISBN table to link authors with titles
public class Databases {

	
	public static void main(String args[])
	{
		final String DATABASE_URL = "jdbc:derby:books";
		final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors";
		public static final String USERNAME = "dietel";
		public static final String PASSWORD = "dietel";
		
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()){
			//instead of dietel, dietel use your username and password
			//Connection connection = DriverManager.getConnection(DATABASE_URL, "dietel", "dietel");
			//Statement statement = connection.createStatement();
			//ResultSet resultSet = statement.executeQuery(SELECT_QUERY));9o,`\			
			rowSet.setUrl(DATABASE_URL);
			rowSet.setUsername(USERNAME);
			rowSet.setPassword(PASSWORD);
			rowSet.execute();
			
			ResultSetMetaData metaData = rowSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();


			
			//System.out.printf("Authors table of books database:%n%n");
		}
		catch (SQLException sqlException){
			sqlException.printStackTrace();
		}
	}
	
	
}
                                                                                           
