import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	public static void main(String []args)
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandu\\Documents\\SeleniumDriverChrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
	      
	       driver.get("https://gitforwindows.org/");
	       
	}

}
