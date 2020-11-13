$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/createEmployees.feature");
formatter.feature({
  "name": "Creating Employees",
  "description": "  Description: This feature creates employees",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateEmployees"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Creating employees",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "a request is prepared to create employees",
  "keyword": "Given "
});
formatter.step({
  "name": "employee data provided is \"\u003cemployeeFirstName\u003e\", \"\u003cemployeeLastName\u003e\", \"\u003cemployeeMiddleName\u003e\",\"\u003cemployeeGender\u003e\",\"\u003cemployeeBirthday\u003e\",\"\u003cemployeeJobStatus\u003e\",\"\u003cemployeeJobTitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "employees are created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "employeeFirstName",
        "employeeLastName",
        "employeeMiddleName",
        "employeeGender",
        "employeeBirthday",
        "employeeJobStatus",
        "employeeJobTitle"
      ]
    },
    {
      "cells": [
        "Bob",
        "Bob",
        "Bob",
        "M",
        "2000-07-11",
        "Employee",
        "Cloud Architect"
      ]
    },
    {
      "cells": [
        "Gozde",
        "Gozde",
        "Gozde",
        "F",
        "2000-07-11",
        "Independent contractor",
        "API Tester"
      ]
    },
    {
      "cells": [
        "Irma",
        "Irma",
        "Irma",
        "F",
        "2000-07-11",
        "Super Contractor",
        "CEO"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateEmployees"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create employees",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.a_request_is_prepared_to_create_employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee data provided is \"Bob\", \"Bob\", \"Bob\",\"M\",\"2000-07-11\",\"Employee\",\"Cloud Architect\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employee_data_provided_is(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employees are created",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employees_are_created()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateEmployees"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create employees",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.a_request_is_prepared_to_create_employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee data provided is \"Gozde\", \"Gozde\", \"Gozde\",\"F\",\"2000-07-11\",\"Independent contractor\",\"API Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employee_data_provided_is(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employees are created",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employees_are_created()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateEmployees"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create employees",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.a_request_is_prepared_to_create_employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee data provided is \"Irma\", \"Irma\", \"Irma\",\"F\",\"2000-07-11\",\"Super Contractor\",\"CEO\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employee_data_provided_is(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employees are created",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.CreateEmployees.employees_are_created()"
});
formatter.result({
  "status": "passed"
});
});