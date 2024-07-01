package task17;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

	public class snapdeal {
	    public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\project\\LaunchFirefox1\\src\\main\\java\\snapdeal\\geckodriver.e"
	        		+ "xe");

	        WebDriver driver = new FirefoxDriver();

	       driver.get("http://www.snapdeal.com");
	       
	       driver.manage().window().maximize();
	       Actions action=new Actions(driver);
	        action.moveByOffset(460,540).click().build().perform();
	        driver.close();  
	       driver.findElement(By.className("signin-button"))
           .click();
	       driver.findElement(By.id("luser"))
           .sendKeys("prabhakaran2631994@gmail.com");
	       driver.close();
	       driver.findElement(By.id("password"))
           .sendKeys("Prabhu03!");

	    }
	}




