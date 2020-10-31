package com.hrms.utils;

import com.hrms.API.Final.steps.GenerateTokenSteps;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class APICommonMethods {
	
	/** Use this method to create an employee */
	/**
	 * Pass below parameters
	 * @param token
	 * @param createEmployeeBody
	 * @return
	 */
	public static  RequestSpecification createEmployeeRequest(String token, String createEmployeeBody) {
		return given().header("Authorization", GenerateTokenSteps.token).header("Content-Type", "application/json")
		.body(createEmployeeBody);
	}
	
	public static RequestSpecification getOneEmployeeRequest(String token, String employeeID) {
		return given().header("Content-Type", "application/json").header("Authorization", token)
				.param("employee_id", employeeID);
	}
	

}
