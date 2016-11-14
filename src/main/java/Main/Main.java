package Main;

import static spark.Spark.before;

public class Main {
    public static void main(String[] args) {
        new Routes(new Queries());
        enableCORS();
    }

    private static void enableCORS() {
        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Request-Method", "*");
            response.header("Access-Control-Allow-Headers", "*");
        });
    }

}
