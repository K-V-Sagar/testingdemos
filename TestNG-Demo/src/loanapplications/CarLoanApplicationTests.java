package loanapplications;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {
	
	@Test
	public void CarLoanLoginWeb() {
		System.out.println("Car Loan Application - Web Login Test");
	}
	
	@Test(groups= {"Smoke"})
	public void CarLoanLoginMobile() {
		System.out.println("Car Loan Application - Mobile Login Test");
	}
	
	@Test
	public void CarLoanLoginAPI() {
		System.out.println("Car Loan Application - API Login Test");
	}
	
}
