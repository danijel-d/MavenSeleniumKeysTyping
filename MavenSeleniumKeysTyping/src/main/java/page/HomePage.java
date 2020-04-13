package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	private By formAuthenticationLink = By.linkText("Form Authentication");
	private By figureBox = By.className("figure");

	
	
	public void hoverOverFigure(int index) {
		
	}
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private void clicklink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public KeysTyping clickKeyPresses() {
		clicklink("Key Presses");
		return new KeysTyping(driver);
	}
	
	
}
