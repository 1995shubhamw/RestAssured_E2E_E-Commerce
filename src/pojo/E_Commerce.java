package pojo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class E_Commerce 
{

	public static void main(String[] args) 
	
	 
	{
		
		Login_Response lore=new Login_Response();
	   lore.setUserEmail("1995shubhamw@gmail.com");
	   lore.setUserPassword("Shubh@m13041995");
	    
	    
		 RequestSpecification req=new RequestSpecBuilder()
				                      .setBaseUri("https://rahulshettyacademy.com")
				                      .setContentType(ContentType.JSON)
				                      .build();

	     RequestSpecification request=given().spec(req).body(lore);
	     
	     Response response =request.when().post("/api/ecom/auth/login")
	     .then().log().all().extract().response();
	     
	     
	    
	     
	     
	
	
	}

}
