package dao;
import java.util.List;

import model.Student;

public interface StudentDao {
	public List<Student> studentList();
	
	public void saveOrUpdate(Student student);
	
	public void delete(int studentId);
	
	public Student get(int studentId);
	
}
