package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Student;

public class CustomRepository implements AppConstants2{
	ConnectionGiver connectiongiver=null;
	 public CustomRepository() {
		 connectiongiver=new ConnectionGiver();
	}
//this method saves the details of customer in the database
	public String	saveCustomerDetails( Student student ) throws ClassNotFoundException, SQLException, IOException 
	{
		Connection connection=connectiongiver.getConnection1();
		PreparedStatement preparedStatement=connection.prepareStatement(Studentsaving1);
		preparedStatement.setInt(1,student.getId());
		preparedStatement.setString(2,student.getName());
		String s2=AES.encrypt(student.getEmail(),Password);
		String s3=AES.encrypt(student.getNumber(),Password);
		String s4=AES.encrypt(student.getAge(),Password);
        preparedStatement.setInt(1,student.getId());
		preparedStatement.setString(2,student.getName());
		preparedStatement.setString(3,s2);
		preparedStatement.setString(4,s3);
		preparedStatement.setString(5,s4);

		int i=preparedStatement.executeUpdate();
	    connection.close();
		preparedStatement.close();
		return "the number of  the rows updated ="+i;
		
		}
	
	public  Student getStudentDetailsByNumber(int i) throws ClassNotFoundException, SQLException, IOException 
	{
		 Connection m  =connectiongiver.getConnection1();
		 PreparedStatement preparedStatement=m.prepareStatement("select * from student1 where id=? ");
		 preparedStatement.setInt(1, i);
		 ResultSet s=preparedStatement.executeQuery();
			Student student = new Student();
			
			if(s.next())
			{   student.setId(s.getInt(1));
				student.setName(s.getString(2));
				String s2=s.getString(3);
				String s3=s.getString(4);
				String s4=s.getString(5);
				
		 String m1=AES.decrypt(s2,AppConstants2.Password);
		 String m2=AES.decrypt(s3,AppConstants2.Password);
		 String m3=AES.decrypt(s4,AppConstants2.Password);
		 student.setEmail(m1);
		 student.setNumber(m2);
		 student.setAge(m3);
return student;
			}
			return student;
	
	}
	public ResultSet StudentMarksById(int i) throws ClassNotFoundException, SQLException, IOException
	{ Connection m  =connectiongiver.getConnection1();
	 PreparedStatement preparedStatement=m.prepareStatement("select * from student3 where id=? ");
	 preparedStatement.setInt(1, i);
	 return preparedStatement.executeQuery();

	}

}
