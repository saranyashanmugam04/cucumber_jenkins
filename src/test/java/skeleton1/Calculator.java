package skeleton1;

import cucumber.api.java.en.Given;

public class Calculator {
	@Given("open calc")
	public void open_calc() {
	    System.out.println("open calc");
	}

	@Given("enter {int}")
	public void enter(Integer int1) {
	    System.out.println("print "+int1);
	}

	@Given("enter +")
	public void enter() {
	    System.out.println("press +");
	}

	@Given("verify output is {int}")
	public void verify_output_is(Integer int1) {
	    System.out.println("output shuld be "+int1);
	}


}
