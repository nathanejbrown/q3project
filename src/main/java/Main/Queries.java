package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nathan on 11/10/16.
 */
public class Queries {

    public static ArrayList<Guitar> getAllGuitars() {

        Map<String, Guitar> allGuitars = new HashMap<String, Guitar>();
        try {
            Connection conn = Db.Db();
            Statement stmt = conn.createStatement();
            ResultSet allTheGuitars = stmt.executeQuery("SELECT * FROM guitars;");

            while (allTheGuitars.next()) {

                int id = allTheGuitars.getInt("id");
                String stringedId = Integer.toString(id);
                String make = allTheGuitars.getString("make");
                String model = allTheGuitars.getString("model");
                int price = allTheGuitars.getInt("price");

                Guitar guitar1 = new Guitar(stringedId, make, model, price);
                allGuitars.put(stringedId, guitar1);
            }
            stmt.close();
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return new ArrayList<Guitar>(allGuitars.values());
    }
}

