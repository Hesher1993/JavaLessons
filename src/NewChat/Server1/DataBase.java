package NewChat.Server1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static Connection connection;
    private static Statement stmt;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Lesson2/userTestDB.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<String> wordFilter () {
        List<String> wordFilter = new ArrayList<>();
        String sql = String.format("SELECT word FROM DataBase");
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                wordFilter.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wordFilter;
    }

}
