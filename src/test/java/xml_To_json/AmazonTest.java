package xml_To_json;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import io.restassured.response.Response;

public class AmazonTest {
	
	
	@Test
	public void verifyRestAssuredTest() {
		
		//https://run.mocky.io/v3/55889581-da52-4383-840e-bdf6dde19252
		//https://run.mocky.io/v3/af180a34-8101-43a6-a8a1-49aec16853ee
		//baseURI = "https://run.mocky.io";
		
		
		Response response = given().
			//header
			//header("Content-Type", "application/json").
			
		
		when().
			get("https://www.amazon.in/").
		
		then().extract().response();
		
		
		
		System.out.println(response);
		System.out.println("==================================");
		
		
		//Convert 
		
		XmlPath path = new XmlPath(CompatibilityMode.HTML, response.getBody().asString());
		
		System.out.println(path.getString("html.head.title"));
		
		Assert.assertTrue(path.getString("html.head.title").contains("Shopping site"));
	}

}
