
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = App2.getConnection();
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM doctor");

                while (rs.next()) {
                    //System.out.println("Employee No: " + rs.getInt("eno"));
                    System.out.println("Name: " + rs.getString("name"));
                    //System.out.println("Age: " + rs.getInt("age"));
                    //System.out.println("---------------");
                }

                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
