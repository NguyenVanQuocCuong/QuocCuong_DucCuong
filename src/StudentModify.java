// tuong tac table student trong my sql
package QuanLiDeTaiTotNghiep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentModify {
	public static List<Student> findAll() {
		List<Student> studentList = new ArrayList<>();
		/**
		 * Nguyen Van Quoc Cuong + Nguyen Duc Cuong 
		 */
		Connection connection = null;
		Statement statement = null;

		try {
			// tao connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query 
			String sql = "select * from student";
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql);
// duyet tat ca ket qua tra ra tu resultSet
			while (resultSet.next()) {
				Student std = new Student(resultSet.getInt("id"), resultSet.getString("fullname"),
						resultSet.getString("gender"), resultSet.getString("email"),
						resultSet.getString("phone_number"), resultSet.getInt("age"));
				studentList.add(std);
			}
		} catch (SQLException ex) {
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		
		// tra ve list student
		return studentList;
	}
// insert vao database
	public static void insert(Student std) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// tao connection 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "insert into student(fullname, gender, age, email, phone_number) values(?, ?, ?, ?, ?)";
			statement = connection.prepareCall(sql);

			statement.setString(1, std.getFullname());
			statement.setString(2, std.getGender());
			statement.setInt(3, std.getAge());
			statement.setString(4, std.getEmail());
			statement.setString(5, std.getPhoneNumber());

			statement.execute();
		} catch (SQLException ex) {
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close(); // dong connection
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		// ket thuc.
	}

	public static void update(Student std) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// tao connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query update
			String sql = "update student set fullname=?,gender=?,age=?,email=?,phone_number=? where id = ?";
			statement = connection.prepareCall(sql);

			statement.setString(1, std.getFullname());
			statement.setString(2, std.getGender());
			statement.setInt(3, std.getAge());
			statement.setString(4, std.getEmail());
			statement.setString(5, std.getPhoneNumber());
			statement.setInt(6, std.getId());

			statement.execute();
		} catch (SQLException ex) {
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		// ket thuc.
	}

	public static void delete(int id) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// tao connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "delete from student where id = ?";
			statement = connection.prepareCall(sql);

			statement.setInt(1, id);

			statement.execute();
		} catch (SQLException ex) {
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		// ket thuc.
	}

	public static List<Student> findByFullname(String fullname) {
		List<Student> studentList = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// tao connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query 
			String sql = "select * from student where fullname like ?";
			statement = connection.prepareCall(sql);
			statement.setString(1, "%" + fullname + "%");

			ResultSet resultSet = statement.executeQuery();
// tra ve list resultSet + ep ket qua + add vao studentList
			while (resultSet.next()) {
				Student std = new Student(resultSet.getInt("id"), resultSet.getString("fullname"),
						resultSet.getString("gender"), resultSet.getString("email"),
						resultSet.getString("phone_number"), resultSet.getInt("age"));
				studentList.add(std);
			}
		} catch (SQLException ex) {
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		// tra ve student List	
		return studentList;
	}
}
