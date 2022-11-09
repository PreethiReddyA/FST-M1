package Activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {
    final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {
        FileInputStream inputJSON = new FileInputStream("C:\\Users\\0021ZY744\\IdeaProjects\\FST_Selenium\\src\\test\\java\\Activities\\userinfo.json");
        String reqBody = new String(inputJSON.readAllBytes());

        Response response =
                given().contentType(ContentType.JSON)
                        .body(reqBody)
                        .when().post(ROOT_URI);

        inputJSON.close();
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("8702"));
    }
    @Test(priority=2)
    public void getUserInfo() {
        File outputJSON = new File("C:\\Users\\0021ZY744\\IdeaProjects\\FST_Selenium\\src\\test\\java\\Activities\\userGETResponse.json");
        Response response =
                given().contentType(ContentType.JSON)
                        .pathParam("username", "PreethiA")
                        .when().get(ROOT_URI + "/{username}");
        String resBody = response.getBody().asPrettyString();
        try {
            outputJSON.createNewFile();
            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }
        response.then().body("id", equalTo(8701));
        response.then().body("username", equalTo("PreethiA"));
        response.then().body("firstName", equalTo("Preethi"));
        response.then().body("lastName", equalTo("Reddy"));
        response.then().body("email", equalTo("preethi.alavalapati@gmail.com"));
        response.then().body("password", equalTo("p@ssword1234"));
        response.then().body("phone", equalTo("9718802715"));
    }
    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response =
                given().contentType(ContentType.JSON)
                        .pathParam("username", "PreethiA")
                        .when().delete(ROOT_URI + "/{username}");
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("PreethiA"));
    }
}