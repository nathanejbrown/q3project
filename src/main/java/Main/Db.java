/**
 * Created by Nathan on 11/8/16.
 */
package Main;

import java.sql.*;


public class Db {

    public static Connection Db() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/q3project");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return connection;
    }
}

