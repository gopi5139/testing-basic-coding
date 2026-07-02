package api;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import io.restassured.response.Response;
import org.testng.Assert;

public class ApiRestAssuredTesting {
	public Gson gson;
	public Response response;
	public LiveTranscriptTextSegments list_sequence_pojo;
	
	
	public synchronized void ListValidator() {
		try {
			ApiRestAssuredTokenGenerator accesstokenValue  = new ApiRestAssuredTokenGenerator();
            Map<String, String> params = new HashMap<String, String>();
            params.put("sequence_number_from", "1");
            String endpoint = "/speech-to-text/1bd8bedf-e2d2-46a1-94e6-1556821aa026/text-segments";
			String full_url = "https://api-stt.dev.pg.alphastreet.io/v1" + endpoint;
			response = given().auth().oauth2(accesstokenValue.accesstoken())
					.params(params).when().get(full_url).then().extract().response();
			gson = new Gson();
			list_sequence_pojo = gson.fromJson(response.asString(), LiveTranscriptTextSegments.class);
		} catch (Exception e) {
			Assert.assertFalse(true, e.toString());
		}
	}
	
	public synchronized void PostValidator() {
		try {
			String input = "{\\r\\n  \\\"id\\\": 1,\\r\\n  \\\"name\\\": \\\"Gopi\\\"\\r\\n}";
			ApiRestAssuredTokenGenerator accesstokenValue  = new ApiRestAssuredTokenGenerator();
            String endpoint = "/speech-to-text/1bd8bedf-e2d2-46a1-94e6-1556821aa026/text-segments";
			String full_url = "https://api-stt.dev.pg.alphastreet.io/v1" + endpoint;
			response = given().auth().oauth2(accesstokenValue.accesstoken())
					.body(input).when().post(full_url).then().extract().response();
			gson = new Gson();
			list_sequence_pojo = gson.fromJson(response.asString(), LiveTranscriptTextSegments.class);
		} catch (Exception e) {
			Assert.assertFalse(true, e.toString());
		}
	}
	
	public synchronized void PutValidator() {
		try {
			ApiRestAssuredTokenGenerator accesstokenValue  = new ApiRestAssuredTokenGenerator();
			String input = "{\\r\\n  \\\"id\\\": 1,\\r\\n  \\\"name\\\": \\\"Gopi\\\"\\r\\n}";
            String endpoint = "/speech-to-text/1bd8bedf-e2d2-46a1-94e6-1556821aa026/text-segments";
			String full_url = "https://api-stt.dev.pg.alphastreet.io/v1" + endpoint;
			response = given().auth().oauth2(accesstokenValue.accesstoken())
					.body(input).when().put(full_url).then().extract().response();
			gson = new Gson();
			list_sequence_pojo = gson.fromJson(response.asString(), LiveTranscriptTextSegments.class);
		} catch (Exception e) {
			Assert.assertFalse(true, e.toString());
		}
	}
	
	public synchronized void GetValidator() {
		try {
			ApiRestAssuredTokenGenerator accesstokenValue  = new ApiRestAssuredTokenGenerator();
            String endpoint = "/speech-to-text/1bd8bedf-e2d2-46a1-94e6-1556821aa026/text-segments";
			String full_url = "https://api-stt.dev.pg.alphastreet.io/v1" + endpoint;
			response = given().auth().oauth2(accesstokenValue.accesstoken()).
					when().get(full_url).then().extract().response();
			gson = new Gson();
			list_sequence_pojo = gson.fromJson(response.asString(), LiveTranscriptTextSegments.class);
		} catch (Exception e) {
			Assert.assertFalse(true, e.toString());
		}
	}
}


