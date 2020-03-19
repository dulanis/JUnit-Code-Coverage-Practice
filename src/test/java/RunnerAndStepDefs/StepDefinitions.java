package RunnerAndStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import CalculatorApp.Calculator;

public class StepDefinitions {
	
	Calculator calc;
	double operand1, operand2;
	double result;
	
	@Given("the user has a calculator")
	public void the_user_has_a_calculator() {
	     calc = new Calculator();
	}

	@Given("the user supplies two numbers {double} and {double}")
	public void the_user_supplies_two_numbers_and(Double double1, Double double2) {
	    operand1 = double1;
	    operand2 = double2;
	}

	@When("the user uses the add functionality")
	public void the_user_uses_the_add_functionality() {
	    result = calc.add(operand1, operand2);
	}

	@Then("the sum should be returned {int}")
	public void the_sum_should_be_returned(Integer int1) {
	    assertEquals(operand1+operand2, result, 0);
	}
	
	// step defs for other functions of calculator
	

	@When("the user uses the subtract functionality")
	public void the_user_uses_the_subtract_functionality() {
	    result = calc.subtract(operand1, operand2);
	}

	@Then("check the difference is {double}")
	public void check_the_difference_is(Double double1) {
	    assertEquals(operand1-operand2, result, 0);
	}


	@When("the user uses the multiply functionality")
	public void the_user_uses_the_multiply_functionality() {
		result = calc.multiply(operand1, operand2);
	}

	@Then("check the product is {double}")
	public void check_the_product_is(Double double1) {
		assertEquals(operand1*operand2, result, 0);
	}


	@When("the user uses the divide functionality")
	public void the_user_uses_the_divide_functionality() {
		result = calc.divide(operand1, operand2);
	}

	@Then("check the quotient is {double}")
	public void check_the_quotient_is(Double double1) {
		assertEquals(operand1/operand2, result, 0);
	}
	
	// check divide by zero
	@Then("check the quotient is not a number")
	public void check_the_quotient_is_not_a_number() {
	    assertEquals(Double.NaN, result, 0);
	}

}
