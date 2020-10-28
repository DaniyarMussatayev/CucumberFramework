package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {

	public static String createEmployeeBody() {

		String createEmployeeBody = "{\r\n" + "  \"emp_firstname\": \"Syntax\",\r\n"
				+ "  \"emp_lastname\": \"Batch7\",\r\n" + "  \"emp_middle_name\": \"ABC\",\r\n"
				+ "  \"emp_gender\": \"M\",\r\n" + "  \"emp_birthday\": \"2000-10-11\",\r\n"
				+ "  \"emp_status\": \"Employee\",\r\n" + "  \"emp_job_title\": \"IT Analyst\"\r\n" + "}";
		return createEmployeeBody;

	}

	public static String createEmployeePayload() {

		JSONObject obj = new JSONObject();

		obj.put("emp_firstname", "Syntax");
		obj.put("emp_lastname", "Batch7");
		obj.put("emp_middle_name", "ABC");
		obj.put("emp_gender", "M");
		obj.put("emp_birthday", "2000-10-11");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "IT Analyst");

		return obj.toString();

	}

}
