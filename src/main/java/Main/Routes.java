package Main;

import static Main.JsonUtil.json;
import static spark.Spark.get;

/**
 * Created by Nathan on 11/8/16.
 */

public class Routes {

        public Routes(final Queries queries) {
            try {
                Class.forName("org.postgresql.Driver");
                get("/guitars", (req, res) -> queries.getAllGuitars(), json());
            } catch(ClassNotFoundException e) {
                System.out.println("That did not work.");
            }
        }

}
