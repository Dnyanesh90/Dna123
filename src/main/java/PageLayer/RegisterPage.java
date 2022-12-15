package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass {
	
	@FindBy(name ="firstName")
	private WebElement firstName;
	
	@FindBy(name ="lastName")
	private WebElement lastName;
	
//	@FindBy(name ="phone")
//	private WebElement phone;
//	
//	@FindBy(name ="userName")
//	private WebElement userName;
	
//	@FindBy(name ="address1")
//	private WebElement address1;
//	
//	@FindBy(name ="city")
//	private WebElement city;
//	
//	@FindBy(name ="state")
//	private WebElement state;
//	
//	@FindBy(name ="postalCode")
//	private WebElement postalCode;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	public void typefirstName(String fname) {
		UtilsClass.entervalue(firstName, fname);
	}
	public void typelastName(String lname) {
		UtilsClass.entervalue(lastName, lname);
	}
//	public void typephone(String mobNo) {
//		UtilsClass.entervalue(phone, mobNo);
//	}
//	public void typeuserName(String uname) {
//		UtilsClass.entervalue(userName, uname);
//	}
//	public void typeaddress1(String add) {
//		UtilsClass.entervalue(address1, add);
//	}
//	public void typecity(String cityname) {
//		UtilsClass.entervalue(city, cityname);
//	}
//	public void typestate(String sname) {
//		UtilsClass.entervalue(state, sname);
//	}
//	public void typepostalCode(String pocode) {
//		UtilsClass.entervalue(postalCode, pocode);
	}
//	}
		
	


	


