package database.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/shop_db";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");
        Connection conn = DriverManager.getConnection(url, props);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO shop_user(id, username, password) " +
                "VALUES (4, 'abcqewrqewr', 'cdeqwerqew')");
    }
}