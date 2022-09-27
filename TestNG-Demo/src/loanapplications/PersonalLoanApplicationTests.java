package loanapplications;

import org.testng.annotations.Test;

public class PersonalLoanApplicationTests {
	
	@Test(groups= {"Smoke"})
	public void PersonalLoanLoginWeb() {
		System.out.println("Personal Loan Application - Web Login Test");
	}
	
	@Test
	public void PersonalLoanLoginMobile() {
		System.out.println("Personal Loan Application - Mobile Login Test");
	}
	
	@Test
	public void PersonalLoanLoginAPI() {
		System.out.println("Personal Loan Application - API Login Test");
	}
	
}
