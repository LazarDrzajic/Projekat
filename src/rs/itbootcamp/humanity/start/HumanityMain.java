package rs.itbootcamp.humanity.start;

import java.io.IOException;

import rs.itbootcamp.humanity.page.tests.HumanityAddEmpExcelTest;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInExcelTest;

public class HumanityMain {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//HumanityLogInTests.LogInTest();
		HumanityLogInExcelTest.Log();
		
		//HumanityAddNewEmployeeTests.AddEmployeeTest();
		//HumanityAddEmpExcelTest.Addemp();
	}

}
