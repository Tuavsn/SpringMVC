package dao;
import java.util.List;
import entities.Student;

public interface StudentDao {
	List<Student> loadStudents();
}
