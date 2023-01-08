package service;

public interface AppConstants2 {
	String Driver_name="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/customer_data_management";
	String data ="Mydata.properties";
	String saving ="insert into customer (id, name, email, address, phonenumber) values(?,?,?,?,?)";
	String Studentsaving ="insert into student (id, name, email) values(?,?,?)";
	String Studentsaving1 ="insert into student1 (id, name, email,phonenumber,age) values(?,?,?,?,?)";

	String Password ="Ngara671*%&";

}
