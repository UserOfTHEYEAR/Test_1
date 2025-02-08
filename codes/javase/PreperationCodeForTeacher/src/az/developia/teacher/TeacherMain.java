package az.developia.teacher;

import TeacherEntity.TeacherEntity;
import az.developia.teacherRepository.TeacherRepositry;

public class TeacherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherEntity teacher=new TeacherEntity(0, "Aydin", "Alkhasli", "056", "mardakan st.","Aydin1", "1234");
		
		TeacherRepositry repo=new TeacherRepositry();
		repo.add(teacher);
		
	}

}
