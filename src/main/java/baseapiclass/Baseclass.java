package baseapiclass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	public  static Response Getrequest(String requesturl) {
		RequestSpecification requestspecification=RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response=requestspecification.get(requesturl);
		return response;	
	}
	public static Response Postrequest(String requesturl, String bearer_token, String requestpayload) {
		RequestSpecification requestSpecification=RestAssured.given().body(requestpayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestSpecification.post(requesturl);
		return response;		
	}
	public static Response putrequest(String requesturl,String bearer_token, String requestpayload) {
		RequestSpecification requestSpecification=RestAssured.given().body(requestpayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestSpecification.put(requesturl);
		return response;
	}
	public static Response deleterequest(String requesturl, String bearer_token , String requestpayload) { //String requestpayload
		RequestSpecification requestSpecification=RestAssured.given().body(requestpayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestSpecification.delete(requesturl);
		return response;	
	}	
	public static Response patchrequest(String requesturl, String bearer_token , String requestpayload) {
		RequestSpecification requestSpecification=RestAssured.given().body(requestpayload);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("Authorization","Bearer "+bearer_token);
		Response response=requestSpecification.patch(requesturl);
		return response;	
	}
}
