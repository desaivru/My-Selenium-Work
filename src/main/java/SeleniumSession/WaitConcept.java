package SeleniumSession;

public class WaitConcept {

	public static void main(String[] args) {
		// Selenium script -----> browser------> application
		//synch between script and application
		
		//Waits:
		//1. Static wait: Thread.sleep(5000)milisecond: Constant wait it will pause the script for 5second
		//2. Dynamic wait:
			//2.a: Implicitly Wait
			//2.b: Explicitly Wait
				//2.b.1: Webdriver wait:
				//2.b.2: Fluent Wait:
		
		//Wait (Interface)<--------FluentWait(parent class)<--------WebdriverWait(child class)
		//wait interface have one method declaration only which is until().
		//FluentWait class implements the until method body + have some other methods.
		//webdriver wait is child hence can inherit all the methods from fluentwait class.
		
	}

}
