package StepDefination;
import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageStepDef extends BaseClass {
	private static RegisterPage registerpage;
	
	@Given("user is on register page")
	public void user_is_on_register_page() {
		BaseClass.inilization();
			   
	}

	@When("user enter valid {string} and {string} and {string} and {string}")
	public void user_enter_valid_and_and_and(String fname, String lname) {
		registerpage =new RegisterPage();
		registerpage.typefirstName(fname);
		registerpage.typelastName(lname);
//		registerpage.typephone(mobno);
//		registerpage.typeuserName(uname);
		
	}
//	@When("user enter valid {string} and {string} and {string} and {string} and {string}")
//	public void user_enter_valid_and_and_and_and(String add, String cityname, String statename, String pcode) {
//		registerpage.typeaddress1(add);
//		registerpage.typecity(cityname);
//		registerpage.typestate(statename);
//		registerpage.typepostalCode(pcode);
//			  
	}


