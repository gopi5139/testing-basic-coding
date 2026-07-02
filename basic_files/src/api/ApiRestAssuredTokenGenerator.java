package api;

import static io.restassured.RestAssured.given;
import org.testng.Assert;

import com.google.gson.Gson;

import io.restassured.response.Response;


public class ApiRestAssuredTokenGenerator {
	public Gson gson;
	public Response response;
	public AccessToken accesstoken;
	
	
	public String accesstoken() {
		String global_accesstoken = null;
		try {
			String client_id = "5t6jq69uc7qmkdfft7uu7a7nkn";
			String client_secret = "1qbe1kappmvj02u13ltnfqt6fjvh5asftisa3rvqfl72l17pru6l";
			String auth_url = "https://auth-api-sso.dev.pg.alphastreet.io/oauth2/token";
			response = given().auth().preemptive().
					basic(client_id, client_secret).
					formParam("grant_type", "client_credentials").
					formParam("Client Authentication", "Send as Basic Auth header").
					when().post(auth_url).then().extract().response();
			gson = new Gson();
			accesstoken = gson.fromJson(response.asString(), AccessToken.class);
			global_accesstoken = accesstoken.getAccessToken();
		} catch (Exception e) {
			Assert.assertFalse(true, "accessToken generation error");
		}
		return global_accesstoken;
	}

}
