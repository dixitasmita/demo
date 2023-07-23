package stepDefination;

import com.global.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.thucydides.core.util.EnvironmentVariables;
import pages.HomePage;

public class Hooks {
	
	EnvironmentVariables environmentVariables;

	HomePage homePage;
	
	@Before
	public void setUp(){
		Config config = new Config();
		config.baseUrl =  environmentVariables.getProperties().getProperty("webdriver.base.url");
	}

	@After(value = "@TestDataClean")
		public void cleanUPTestData() throws Exception {
		homePage.clickDelete();
		}



}
