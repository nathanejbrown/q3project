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
//                get("/guitars/:max", (req, res) -> {
//                    int maximum = req.params(":max");
//                    queries.getSomeGuitars(maximum);
//                    json();
//                });
            } catch(ClassNotFoundException e) {
                System.out.println("That did not work.");
            }
        }

//    private static void enableCORS(final String origin, final String methods, final String headers) {
//
//        options("/*", (request, response) -> {
//
//            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
//            if (accessControlRequestHeaders != null) {
//                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
//            }
//
//            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
//            if (accessControlRequestMethod != null) {
//                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
//            }
//
//            return "OK";
//        });
//
//        before((request, response) -> {
//            response.header("Access-Control-Allow-Origin", origin);
//            response.header("Access-Control-Request-Method", methods);
//            response.header("Access-Control-Allow-Headers", headers);
//            response.type("application/json");
//        });
//    }

}
