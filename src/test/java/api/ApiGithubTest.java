package api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiGithubTest {
    private String user;

    @BeforeMethod
    public void setup() {
	user = "varfolomeevann";
	RestAssured.baseURI = "https://api.github.com/users/";
    }

    @Test(priority = 4, description = "Api GitHub user")
    public void givenUser() {
	given()
		.log().all()
		.get(user).
		then()
		.statusCode(200)
		.assertThat()
		.body("login", equalTo(user))
		.extract()
		.response();
    }

}
