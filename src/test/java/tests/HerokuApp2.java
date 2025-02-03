package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuApp2 {
    @Test
    public void checkBoxes() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement fisrtCheckbox1 = driver.findElement(By.cssSelector("[type='checkbox']"));
        fisrtCheckbox1.click();
        Assert.assertEquals(fisrtCheckbox1.isSelected(), true);
        driver.quit();
    }
    @Test
    public void checkBoxes2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement secondCheckbox2 = driver.findElement(By.cssSelector(("input[type='checkbox']:checked")));
        secondCheckbox2.click();
        Assert.assertEquals(secondCheckbox2.isSelected(), false);
        driver.quit();


    }
}
