package xml_To_json;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
//import io.restassured.internal.util.IOUtils;
import utility.Constants;

//import static io.restassured.RestAssured.*;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;


public class TC_03_Post_CreateUser_FileExample_JSON {
	
	String requestBody;
	
	@Test
	public void verifyCreateUserTest() throws Exception {
		
		
				
		File apiResponse = new File(".\\People.json");
		
		
		JsonPath json_path = new JsonPath(apiResponse);
		
		
		String firstName = json_path.get("first_name[0]");
		
		System.out.println(firstName);
		System.out.println("---------------------");
		List<String> allFirstName = json_path.getList("first_name");
		
		System.out.println(allFirstName);
		
		
		System.out.println("Get all firstName as per condition");
		List<String> allFemaleFirstName =json_path.getList("findAll{it.gender == 'Female' }.first_name");
		System.out.println(allFemaleFirstName);
		
		
		System.out.println("Get all firstName as per condition");
		List<String> allGeatherThanIDFirstName =json_path.getList("findAll{it.id > 7 }.first_name");
		System.out.println(allGeatherThanIDFirstName);
		
		
		
		System.out.println("============allemailID_asperFirstNameLastName=============");
		List<String> allemailID_asperFirstNameLastName = json_path.getList("findAll{it.first_name == 'Tatiana' &  it.last_name == 'Pratap'}.email");
		System.out.println(allemailID_asperFirstNameLastName);
		
	}
	
	
	

}
