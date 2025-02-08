package az.developia.teacherRepository;

public class TeacherRepositry {
	public void add(TeacherEntity teacher) {
	

		String query="INSERT INTO teacher(name, surname, phone, address,username,pasword) VALUES "
		+"('"+teacher.getName()
		+",'"+teacher.getsurname()
		+",'"+teacher.getphone()
		+",'"+teacher.getaddress()
		+",'"+teacher.getusername()
		+",'"+teacher.getpassword()+"')"
	
	try {
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:???", "???", "???");
	

	Statement st=conn.createStatement();
}
catch(Exception e)	{
	e.printStackTrace();
}
	}
}
