import java.sql.*;
import java.util.*;

public class StudentDAO {
    private String url = "jdbc:mysql://localhost:3306/studentdb";
    private String user = "abhi";
    private String password = "your_password";

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }

    
    public void save(Student s) throws Exception {
        try (Connection con = getConnection()) {
            if (s.getId() == 0) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student(name,email) VALUES(?,?)");
                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.executeUpdate();
                ps.close();
            } else {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE student SET name=?,email=? WHERE id=?");
                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.setInt(3, s.getId());
                ps.executeUpdate();
                ps.close();
            }
        }
    }

    
    public List<Student> getAll() throws Exception {
        List<Student> list = new ArrayList<>();

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM student")) {

            while (rs.next()) {
                list.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email")
                ));
            }
        }
        return list;
    }

    
    public Student getById(int id) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(
                 "SELECT * FROM student WHERE id=?")) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                    );
                }
            }
        }
        return null;
    }

    
    public void delete(int id) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(
                 "DELETE FROM student WHERE id=?")) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
