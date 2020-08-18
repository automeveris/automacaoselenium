package com.bddeveris.runner;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class ClassInit {

	
    public static WebDriver driver;
	
    
    @Before
    public void initializeTest() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();//addOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void endTest(Scenario scenario) {
			driver.quit();
    }
    
    
    //Apenas para linux
//    static ChromeOptions addOptions(){
//	    String so = System.getProperty("os.name").toLowerCase();
//	    so = so.replaceAll(" ", "");
//	    so = so.replaceAll("[0-9]", "");
//	    ChromeOptions options = new ChromeOptions();
//	    
//	    if("linux".equals(so)){
//	    	//options.addArguments("--headless");
//	        options.addArguments("--no-sandbox");
//	    }
//	    
//		return options;
//	}
    
}
