package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HardcodedExamples {

	/*
	 * REST Assured - Java library specifically developed to automate REST endpoints
	 * 
	 * Given - Preparing your request When - What action will you perform, what type
	 * of call are you making? Then-Verification
	 * 
	 */

	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM1NTgxNjMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzYwMTM2MywidXNlcklkIjoiMTI3MyJ9._fciXu8obNf8Uro6wHJhlCylyE6G_EwyzajXYSsACVA";
	static String employeeID;

	// @Test
	public void sampleTest() {
		/** BaseURI for all enpoints */
		// RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

		/** JWT */
		// String token = "Bearer
		// eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM1NTgxNjMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzYwMTM2MywidXNlcklkIjoiMTI3MyJ9._fciXu8obNf8Uro6wHJhlCylyE6G_EwyzajXYSsACVA";

		/** Preparing request for /getOneemployee.php */
		/** Using .log().all() to print out everything being with the request */
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", "3695").log().all();

		/** Making call to /getOneEmployee.php */
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** One way to print response object */
		// System.out.println(getOneEmployeeResponse.asString());

		/** Second way using rest assured prettyPrint() */
		getOneEmployeeResponse.prettyPrint();

		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);
	}

	@Test
	public void aPostCreateEmployee() {

		/** Preparing request for creating an employee */
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"emp_firstname\": \"Syntax\",\r\n" + "  \"emp_lastname\": \"Batch7\",\r\n"
						+ "  \"emp_middle_name\": \"ABC\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"2000-10-11\",\r\n" + "  \"emp_status\": \"Employee\",\r\n"
						+ "  \"emp_job_title\": \"IT Analyst\"\r\n" + "}");

		/** making call to /createEmployee.php */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		/** Printing response */
		createEmployeeResponse.prettyPrint();

		/**
		 * Using jsonPath() to view the response body which lets us get the employee ID
		 * We are storing the employeeID as a static global variable to be able to use
		 * with other calls 8/
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id\r\n" + "\r\n" + "");

		/** Optinal: Printing employeeID */
		System.out.println(employeeID);

		/** Verifying status code 201 */
		createEmployeeResponse.then().assertThat().statusCode(201);

		/**
		 * Verifying response bodu "Message" is paired with "Entry Created"; equalsTo()
		 * method comes from static Hamcrest packages - NEED TO IMPORT MANUALLY import
		 * static org.hamcrest.Matchers.*
		 */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

		/** Verifying created employee first name */
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Syntax"));

		/** Verifying server Apache/2.4.39 (Win64) PHP/7.2.18 */
		createEmployeeResponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");

	}

	@Test
	public void bGETcreatedEmployee() {

		/** Preparing request to get created employee */
		RequestSpecification getCreatedEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", employeeID);

		/** Strong response for retrieving created employee */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().post("/getOneEmployee.php");

		/** Printing response */
		getCreatedEmployeeResponse.prettyPrint();

		/**
		 * Storing response employee ID into empID to compare with static global
		 * employee ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");

		/** Comparing empId with stored employeeID from created employee call */
		boolean verifyingEmployeeID = empID.equalsIgnoreCase(employeeID);
		
		/** Asserting to verify the above condition is true*/
		Assert.assertTrue(verifyingEmployeeID);
		
		/** Verifying status code 200 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
	}
}
