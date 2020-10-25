package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {

	/*
	 * REST Assured - Java library specifically developed to automate REST endpoints
	 * 
	 * Given - Preparing your request When - What action will you perform, what type
	 * of call are you making? Then-Verification
	 * 
	 */

	/** Concatenates with endpoint during run time */
	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2MzU4MDksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY3OTAwOSwidXNlcklkIjoiMTI3MyJ9.Wk6FehGO64XnRCGEjzQ_PHmE3SHBe1aGueODWsE7FE8";
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
		// .log().all();

		/** making call to /createEmployee.php */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		/** Printing response */
		createEmployeeResponse.prettyPrint();

		/**
		 * Using jsonPath() to view the response body which lets us get the employee ID
		 * We are storing the employeeID as a static global variable to be able to use
		 * with other calls
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		/** Optional: Printing employeeID */
		System.out.println(employeeID);

		/** Verifying status code is 201 */
		createEmployeeResponse.then().assertThat().statusCode(201);

		/**
		 * Verifying response body "Message" is paired with "Entry Created"; equalTo()
		 * method comes from static Hamcrest package - NEED TO IMPORT MANUALLY import
		 * static org.hamcrest.Matchers.*;
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
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", employeeID);

		/** Storing response for retrieving created employee */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");

		/** Printing response */
		// getCreatedEmployeeResponse.prettyPrint();

		/**
		 * Storing response employee ID into empID to compare with static global
		 * employee ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");

		/** Comparing empID with stored employeeID from created employee call */
		boolean verifyingEmployeeID = empID.contentEquals(employeeID);

		/** Asserting to verify the above condition is true */
		Assert.assertTrue(verifyingEmployeeID);

		/** Verifying status code is 200 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);

		/**
		 * Storing full response as a string so that we are able to pass it as an
		 * argument with JsonPath
		 */
		String response = getCreatedEmployeeResponse.asString();

		/** Created object of JsonPath */
		JsonPath js = new JsonPath(response);

		/** Grabbing employee ID using 'js' */
		String employeeId = js.getString("employee[0].employee_id");
		String firstName = js.getString("employee[0].emp_firstname");
		String middleName = js.getString("employee[0].emp_middle_name");
		String lastName = js.getString("employee[0].emp_lastname");
		String birthday = js.getString("employee[0].emp_birthday");
		String gender = js.getString("employee[0].emp_gender");
		String jobTitle = js.getString("employee[0].emp_job_title");
		String status = js.getString("employee[0].emp_status");

		/** Asserting response employee ID matches stored employee ID */
		Assert.assertTrue(employeeId.contentEquals(employeeID));

		/** Asserting the rest of the values match expected data */

		Assert.assertEquals(firstName, "Syntax");
		Assert.assertEquals(middleName, "ABC");
		Assert.assertEquals(lastName, "Batch7");
		Assert.assertEquals(birthday, "2000-10-11");
		Assert.assertEquals(gender, "Male");
		Assert.assertEquals(jobTitle, "IT Analyst");
		Assert.assertEquals(status, "Employee");

	}

	@Test
	public void cGETcreatedEmployee() {

		/** Preparing request to get all employees */
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);

		/** Storing response into getAllEmployeesResponse */
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");

		/** Printing response */
		// getAllEmployeesResponse.prettyPrint();

		/** Storing response as a String */
		String response = getAllEmployeesResponse.asString();

		/** Creating objectJsonPath and passing response as a String as an argument */
		JsonPath js = new JsonPath(response);

		/** Retrieving the size of the array (the number of object in the array) */
		int count = js.getInt("Employees.size()");
		// System.out.println(count);

//		for (int i = 0; i < count; i++) {
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
//			// System.out.println(allEmployeeIDs);
//
//			if (allEmployeeIDs.contentEquals(employeeID)) {
//				System.out.println("Employee ID: " + employeeID + "is present in the body");
//				String firstNameOfEmpID = js.getString("Employees[" + i + "].emp_firstname");
//				break;
//
//			}
//
//		}

		/** for loop to print out first names of all employees */
//		for (int i = 0; i < count; i++) {
//			String allFirstNames=js.getString("Employees[" + i + "].emp_firstname");
//			System.out.println(allFirstNames);
//		}

	}
	
	@Test
	public void dPUTupdatedCreatedEmployee() {
		/** Preparing request for creating an employee */
		RequestSpecification updatedCreateEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + 
						"  \"employee_id\": \""+ employeeID +"\",\r\n" + 
						"  \"emp_firstname\": \"HELLO\",\r\n" + 
						"  \"emp_lastname\": \"ABC\",\r\n" + 
						"  \"emp_middle_name\": \"WEQ\",\r\n" + 
						"  \"emp_gender\": \"M\",\r\n" + 
						"  \"emp_birthday\": \"2015-10-17\",\r\n" + 
						"  \"emp_status\": \"Super Contractor\",\r\n" + 
						"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
						"}");
		// .log().all();

		/** making call to /createEmployee.php */
		Response updatedCreateEmployeeResponse = updatedCreateEmployeeRequest.when().put("/updateEmployee.php");

		/** Printing response */
		updatedCreateEmployeeResponse.prettyPrint();
		
		String response = updatedCreateEmployeeResponse.asString();

		/** Created object of JsonPath */
		JsonPath js = new JsonPath(response);

		/** Grabbing employee ID using 'js' */
		String employeeId = js.getString("employee[0].employee_id");
		String firstName = js.getString("employee[0].emp_firstname");
		String middleName = js.getString("employee[0].emp_middle_name");
		String lastName = js.getString("employee[0].emp_lastname");
		String birthday = js.getString("employee[0].emp_birthday");
		String gender = js.getString("employee[0].emp_gender");
		String jobTitle = js.getString("employee[0].emp_job_title");
		String status = js.getString("employee[0].emp_status");

		/** Asserting response employee ID matches stored employee ID */
		Assert.assertTrue(employeeId.contentEquals(employeeID));

		/** Asserting the rest of the values match expected data */

		Assert.assertEquals(firstName, "HELLO");
		Assert.assertEquals(middleName, "WEQ");
		Assert.assertEquals(lastName, "ABC");
		Assert.assertEquals(birthday, "2015-10-17");
		Assert.assertEquals(gender, "Male");
		Assert.assertEquals(jobTitle, "Cloud Architect");
		Assert.assertEquals(status, "Super Contractor");

		
	}
}
