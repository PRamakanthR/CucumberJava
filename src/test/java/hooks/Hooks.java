package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import webDriverManager.DrivermanagerClass;
public class Hooks {
	@Before
	public void initializeDriver() {
		DrivermanagerClass.initializeDriver();
	}
	@After
	public void tearDown() {
		DrivermanagerClass.quitDriver();
	}
}
