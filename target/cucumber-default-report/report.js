$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchEmployee.feature");
formatter.feature({
  "name": "Search Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter employee \"\u003cId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify that \"\u003cId\u003e\" is successfully added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Id"
      ]
    },
    {
      "cells": [
        "7570"
      ]
    },
    {
      "cells": [
        "7571"
      ]
    },
    {
      "cells": [
        "7771"
      ]
    },
    {
      "cells": [
        "7573"
      ]
    },
    {
      "cells": [
        "7574"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"7570\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"7570\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[7570]\u003e but was:\u003c[18422A]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(SearchEmployeeStepDefinitions.java:54)\r\n\tat ✽.verify that \"7570\" is successfully added(file:///C:/Users/User/eclipse-workspace/CucumberFramework/src/test/resources/features/SearchEmployee.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"7571\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"7571\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"7771\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"7771\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"7573\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"7573\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"7574\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"7574\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter employee \"\u003cFirst Name\u003e\", \"\u003cMiddle Name\u003e\", and \"\u003cLast Name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify that \"\u003cFirst Name\u003e\", \"\u003cMiddle Name\u003e\", \"\u003cLast Name\u003e\" is successfully added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Middle Name",
        "Last Name"
      ]
    },
    {
      "cells": [
        "John",
        "M",
        "Smith"
      ]
    },
    {
      "cells": [
        "Hunter",
        "ABC",
        "Musoev"
      ]
    },
    {
      "cells": [
        "John",
        "M",
        "Wick"
      ]
    },
    {
      "cells": [
        "John",
        "F",
        "Kennedy"
      ]
    },
    {
      "cells": [
        "Harry",
        "P",
        "Potter"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"John\", \"M\", and \"Smith\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"John\", \"M\", \"Smith\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[John M Smith]\u003e but was:\u003c[Prince Tugba Abdul]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(SearchEmployeeStepDefinitions.java:62)\r\n\tat ✽.verify that \"John\", \"M\", \"Smith\" is successfully added(file:///C:/Users/User/eclipse-workspace/CucumberFramework/src/test/resources/features/SearchEmployee.feature:28)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded5.png", "Search employee by name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"Hunter\", \"ABC\", and \"Musoev\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Hunter\", \"ABC\", \"Musoev\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "Search employee by name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"John\", \"M\", and \"Wick\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"John\", \"M\", \"Wick\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", "Search employee by name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"John\", \"F\", and \"Kennedy\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"John\", \"F\", \"Kennedy\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png", "Search employee by name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credintials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.login_with_valid_credintials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.step({
  "name": "enter employee \"Harry\", \"P\", and \"Potter\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_employee_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Harry\", \"P\", \"Potter\" is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_that_is_successfully_added(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", "Search employee by name");
formatter.after({
  "status": "passed"
});
});