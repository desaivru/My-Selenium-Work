package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
//	
//	@BeforeSuite
//	@BeforeTest
//	@BeforeClass
//	@BeforeMethod
//	@Test
//	@AfterMethod
//	@AfterClass
//	@AfterTest
//	@AfterSuite
//
//	
	
	
//Usecase - connect with DB->create user->launch browser->login to app->add to cart->app logout
	
//before -- test -- after
	
//	BS -- connect with DB
//	BT -- create user
//	BC -- launch Browser
//	
		//	BM -- loginToApp
		//	add to cart test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	checkout test
		//	AM -- logout
//	
		//	BM -- loginToApp
		//	search test
		//	AM -- logout
//	
//	AC -- close browser
//	AT -- delete user
//	AS -- disconnect With DB
	
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("Connect to DB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("User created");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Login to app");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	//5
	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	//8
	@Test
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out");
	}
	
	@AfterClass
	public void closeBroser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("User deleted");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("Connection clsed");
	}

}


