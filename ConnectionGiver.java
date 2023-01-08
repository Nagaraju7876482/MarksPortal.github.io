package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionGiver implements AppConstants2 {
	public static Connection connection=null;
	public ConnectionGiver()
	{
		
	}
public   Connection getConnection1() throws ClassNotFoundException, SQLException, IOException
{  if(connection ==null)
   {
	Class.forName(Driver_name);
	
    connection= DriverManager.getConnection(url, "root","PFH#23kgrw9");}
    return connection;
      }	
}
