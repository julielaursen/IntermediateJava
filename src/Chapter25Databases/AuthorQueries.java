package Chapter25Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorQueries {
	
	private static final String URL = "jdbc:derby:AddressBook";
	private static final String USERNAME = "dietel";
	private static final String PASSWORD = "dietel";
	
	private Connection connection;
	private PreparedStatement insertNewAuthor;
	private PreparedStatement editNewAuthor;
	private PreparedStatement addNewTitle;
	private PreparedStatement addNewAuthorISBN;
	
	try {
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		insertNewAuthor = connection.prepareStatement("");//write out insert here);
		
		editNewAuthor = connection.prepareStatement("");//write out edit here);
		
		addNewTitle = connection.prepareStatement("");//write out add here);
				
		addNewAuthorISBN = connection.prepareStatement("");//write out add here);
		
	}
	catch (SQLException sqlException)
	{
		sqlException.printStackTrace();
		System.exit(1);
	}
	public List <authors> results = null;
	ResultSet resultSet = null;
	try
	{
		resultSet = selectAllPeople.executeQuery();
		results = new ArrayList<authors>();
		
		while (resultSet.next())
		{
			results.add(New Author)
				resultSet.getInt("authorID");
				resultSet.getString("firstName");
				resultSet.getString("lastName");
		}
	catch (SQLExeception sqlException)
	{
		sqlException.printStackTrace();
	}
	finally
	{
		try
		{
			resultSet.close();
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
			close();
		}
	}
	
	
	//   authorID NUMBER GENERATED ALWAYS AS IDENTITY NOT NULL,
	public int addAuthor(int authorID, String firstName, String lastName)
	{
		int result = 0;
		try {
			insertNewAuthor.setInt(1, 1);
			insertNewAuthor.setString(2,  firstName);
			insertNewAuthor.setString(3,  lastName);
			result = insertNewAuthor.executeUpdate();
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
			close();
		}
		return result;
	}
}


