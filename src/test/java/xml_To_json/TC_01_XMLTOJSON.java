package xml_To_json;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.json.XML;

public class TC_01_XMLTOJSON {
	
	
	@Test
	public void verifyRestAssuredTest() {
		
		//https://run.mocky.io/v3/55889581-da52-4383-840e-bdf6dde19252
		//https://run.mocky.io/v3/af180a34-8101-43a6-a8a1-49aec16853ee
		baseURI = "https://run.mocky.io";
		
		
		String response = given().
			//header
			//header("Content-Type", "application/json").
			
		
		when().
			get("/v3/172012fb-737a-41c5-9356-9723815ee002").
		
		thenReturn().asString();
		
		
		
		System.out.println(response);
		System.out.println("==================================");
		
		
		JSONObject json = new JSONObject(response);
		
		
		//JSONObject json = XML.toJSONObject(response);
		
		System.out.println(XML.toString(json));
		
		
		//JSONObject xmltoJSON = new JSONObject(XML.toString(json));
		
		
	}

}
