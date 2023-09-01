import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class JDBCEmployees {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );

        Statement statement = connection.createStatement();
        String query = "SELECT * FROM employees LIMIT 10";

        ResultSet rs = statement.executeQuery(query);

        ArrayList<String> employeesList = new ArrayList<>();

        while(rs.next()) {
            employeesList.add(rs.getString("first_name"));
        }

        System.out.println(employeesList);

    }
}
