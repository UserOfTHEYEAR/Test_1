package az.developia.teacherRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import TeacherEntity.TeacherEntity;

public class TeacherRepositry {
	public void add(TeacherEntity teacher) {

		String query = "INSERT INTO teacher(name, surname, phone, address,username,password) VALUES " + "('"
				+ teacher.getName() + ",'" + teacher.getSurname() + ",'" + teacher.getPhone() + ",'"
				+ teacher.getAddress() + ",'" + teacher.getUsername() + ",'" + teacher.getPassword() + "')";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:teacher_project", "root", "0703");

			Statement st = conn.createStatement();
			
			st.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
