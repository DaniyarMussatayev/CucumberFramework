package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SearchEmployeeElements;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static SearchEmployeeElements empList;
	protected static PersonalDetailsPageElements persDetails;

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		empList = new SearchEmployeeElements();
		persDetails=new PersonalDetailsPageElements();
	}
}