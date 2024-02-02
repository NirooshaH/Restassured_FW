package GitHubTestcase;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utility.Authentication;
import Utility.CreateURL;
import Utility.commonres;
import Utility.payloadconvertor;
import baseapiclass.Baseclass;
import io.restassured.response.Response;

public class GithubRepository {
	
//	public static
	public static String bearer_token = Authentication.getbearertoken();
//	public static Response response;
	
 @Test
 
 public void createrepository() throws IOException {
		 String endpoint=CreateURL.getbaseuri("/user/repos");
		 String request_payload=payloadconvertor.generatepayload("Creatrepository.json");
		 Response response=Baseclass.Postrequest(endpoint, bearer_token, request_payload);
		 String responsebody=response.getBody().asString();
		 Assert.assertEquals(commonres.getresponsevalue(responsebody, "name"),commonres.getresponsevalue(responsebody,"name"));
		 Assert.assertEquals(commonres.getstatuscode(response),201);
 }
 @Test
 public void getarepository() {
	 String endpoint=CreateURL.getbaseuri("/repos/NirooshaH/Restframework123");
	 Response response=Baseclass.Getrequest(endpoint);
	 Assert.assertEquals(commonres.getstatuscode(response),200);
 }
 @Test
 public void patchrequest() throws IOException {
	 String enpoint=CreateURL.getbaseuri("/repos/NirooshaH/Restassured Niroosha123");
	 String request_payload=payloadconvertor.generatepayload("UpdateRepo.json");
	Response response=Baseclass.patchrequest(enpoint,bearer_token, request_payload);
	String responsebody=response.getBody().asString();
	Assert.assertEquals(commonres.getresponsevalue(request_payload, "name"),commonres.getresponsevalue(responsebody, "name"));
	Assert.assertEquals(commonres.getstatuscode(response), 200);
 }
 @Test
 public void deleterequest() throws IOException {
	 String endpoint= CreateURL.getbaseuri("/repos/NirooshaH/Restassured Niroosha123");
	 String request_payload=payloadconvertor.generatepayload("Deleterepo.json");
	 Response response=Baseclass.deleterequest(endpoint, bearer_token, request_payload);
	 String responsebody=response.getBody().asString();
	 Assert.assertEquals(commonres.getresponsevalue(request_payload, "name"),commonres.getresponsevalue(responsebody, "name"));
	 Assert.assertEquals(commonres.getstatuscode(response),204);
 }
 @Test
 public void getlistofactivity() {
	 String endpoint=CreateURL.getbaseuri("/repos/NirooshaH/Restassured Niroosha123/activity");
	 Response response=Baseclass.Getrequest(endpoint);
	 Assert.assertEquals(commonres.getstatuscode(response),200);
 }
 @Test
 public void enableprivatevalnarabalitys() throws IOException {
	 String endpoint=CreateURL.getbaseuri("/repos/NirooshaH/Restframework12345/private-vulnerability-reporting");
	 String request_payload=payloadconvertor.generatepayload("putnewrepo.json");
	 Response response=Baseclass.putrequest(endpoint,bearer_token, request_payload);
	 String responsbody=response.getBody().asString();
	 Assert.assertEquals(commonres.getresponsevalue(request_payload, "name"),commonres.getresponsevalue(responsbody, "name"));
	 Assert.assertEquals(commonres.getstatuscode(response),204);
 }

}
