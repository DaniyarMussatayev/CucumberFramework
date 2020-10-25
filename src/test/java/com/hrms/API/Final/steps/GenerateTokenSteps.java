package com.hrms.API.Final.steps;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GenerateTokenSteps {

	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

	@Given("a JWT is generated")
	public void a_JWT_is_generated() {

		/** Preparing request to generate token */
		RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json")
				.body("{\r\n" + "  \"email\": \"string\",\r\n" + "  \"password\": \"string\"\r\n" + "}");

		/** Storing response into generateTokenResponse */
		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
		generateTokenResponse.prettyPrint();

		/** Storing token as a static global variable that will be used for other calls */
		String token = "Bearer" + generateTokenResponse.jsonPath().getString("token");
		
	}

}
