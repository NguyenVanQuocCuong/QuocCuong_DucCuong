
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

public class ProjectModify {

	public static List<Project> findAll() {
		List<Project> projects = new ArrayList<>();
		/**
		 * Nguyen Van Quoc Cuong + Nguyen Duc Cuong 
		 */
		Connection connection = null;
		Statement statement = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "select * from project";
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				Project p = new Project(resultSet.getInt("id"), resultSet.getString("projectname"),
						resultSet.getString("deadline"), resultSet.getString("instruction"));
				projects.add(p);
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
		// ket thuc.

		return projects;
	}

	public static void insert(Project project) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "insert into project(projectname, deadline, instruction) values( ?, ?, ?)";
			statement = connection.prepareCall(sql);

			statement.setString(1, project.getProjectname());
			statement.setString(2, project.getDeadline());
			statement.setString(3, project.getInstruction());

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

	// cap nhat
	public static void update(Project project) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "update project set projectname=?,deadline=?,instruction=? where id = ?";
			statement = connection.prepareCall(sql);

			statement.setString(1, project.getProjectname());
			statement.setString(2, project.getDeadline());
			statement.setString(3, project.getInstruction());
			statement.setInt(4, project.getId());

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

	// xoa
	public static void delete(int id) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// lay tat ca danh sach sinh vien
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			// query
			String sql = "delete from project where id = ?";
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

	public static List<Project> findByProjectName(String fullname) {
		List<Project> projects = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root",
					"120120");

			String sql = "select * from project where projectname like ?";
			statement = connection.prepareCall(sql);
			statement.setString(1, "%" + fullname + "%");

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Project p = new Project(resultSet.getInt("id"), resultSet.getString("projectname"),
						resultSet.getString("deadline"), resultSet.getString("instruction"));
				projects.add(p);
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
		// ket thuc.

		return projects;
	}
}
