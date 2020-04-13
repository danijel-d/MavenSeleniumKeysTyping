package keys;

import static org.testng.Assert.assertEquals;

import com.google.common.io.Files;

import base.BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;


public class KeysTypingTest extends BaseTest {

	@Test
	public void testBackspace() {
		var keyPage = homePage.clickKeyPresses();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		keyPage.enterText("A" + Keys.BACK_SPACE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");

	}

	@Test
	public void testMultiButtonPress() {
		var keyPage = homePage.clickKeyPresses();

		keyPage.enterPi();
		assertEquals(keyPage.getResult(), "You entered: 4");
	}

}
