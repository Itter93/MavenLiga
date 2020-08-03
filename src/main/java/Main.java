import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.*;
import java.sql.*;

public class Main {
    @Test
    public void testFunc() {
        Gson gson = new Gson();
        RequestSpecification request = RestAssured.given();
        try {
            Connection conn = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
