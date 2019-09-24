package rs.itbootcamp.humanity.start;

import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class HumanityMain {

	public static void main(String[] args) throws InterruptedException {
		
		HumanityLoginTests.LogInTest();
		
		HumanityAddNewEmployeeTests.AddEmployeeTest();

	}

}
