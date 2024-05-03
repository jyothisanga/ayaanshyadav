package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdef {
	public WebDriver driver;
	public String actT;
	@Given("browser should open app should launch")
	public void browser_should_open_app_should_launch() {
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
	}

	@When("user captures title ofgoogle page")
	public void user_captures_title_ofgoogle_page() {
		actT=driver.getTitle();
	}

	@Then("expected and actual title should match")
	public void expected_and_actual_title_should_match() {
		if(actT.contains("Google")){
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
	}
}
