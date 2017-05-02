package connectt;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.corba.se.pept.transport.Connection;

public class ourKonnect {
	ArrayList<datamodell1> dataContainer;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;
	
	public ourKonnect(){
		dataContainer = new ArrayList<datamodell1>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = (Connection) DriverManager.getConnection("jdbc:mytsql://localhost/startrek?"+"user=myblog&password=123aa");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	
}