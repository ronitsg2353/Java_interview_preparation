package selenium_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws SQLException {


        String url="";
        String userid="";
        String password="";
        Connection connection= DriverManager.getConnection(url,userid,password);
        Statement statement=connection.createStatement();
        statement.executeQuery("Select * from Table");

    }
}
