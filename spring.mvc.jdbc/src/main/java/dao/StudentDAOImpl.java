package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import dao.StudentDao;
import model.Student;

public class StudentDAOImpl implements StudentDao {

	private JdbcTemplate jdbcTemp;

	public StudentDAOImpl(DataSource datasource) {
		jdbcTemp = new JdbcTemplate(datasource);
	}

	@Override
	public List<Student> studentList() {
		String sql = "SELECT * FROM Student";
		List<Student> listStudent = jdbcTemp.query(sql, new RowMapper<Student>() {
			
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
	 
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAddress(rs.getString("address"));
	 
	            return student;
	        }
			
		});
		
		return listStudent;
	}

	@Override
	public void saveOrUpdate(Student student) {
		if (student.getId() > 0) {
			// update
			String sql = "UPDATE Student SET name=?, address=? where id=?";
			jdbcTemp.update(sql, student.getName(), student.getAddress(), student.getId());
		} else {
			String sql = "INSERT INTO Student (name, address) + VALUE(?,?)";
			jdbcTemp.update(sql, student.getName(), student.getAddress());
		}
	}

	@Override
	public void delete(int studentId) {
		String sql = "DELETE FROM Student WHERE id=?";
		jdbcTemp.update(sql, studentId);
	}

	@Override
	public Student get(int StudentId) {
		String sql = "SELECT * FROM Student WHERE id=" + StudentId;
		return jdbcTemp.query(sql, new ResultSetExtractor<Student>() {

			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Student student = new Student();
					student.setId(rs.getInt("id"));
					student.setName(rs.getString("name"));
					student.setAddress(rs.getString("address"));
					return student;
				}

				return null;
			}

		});
	}
}
