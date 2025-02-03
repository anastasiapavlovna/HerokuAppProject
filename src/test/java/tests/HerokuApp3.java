package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuApp3 {
    @Test
    public void dropDown() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        dropdownElement.click();
        WebElement option1 = driver.findElement(By.xpath("//option[text()='Option 1']"));
        option1.click();
        String selectedOption1 = dropdownElement.getAttribute("value");
        Assert.assertEquals("1", selectedOption1);
        dropdownElement.click();
        WebElement option2 = driver.findElement(By.xpath("//option[text()='Option 2']"));
        option2.click();
        String selectedOption2 = dropdownElement.getAttribute("value");
        Assert.assertEquals("2", selectedOption2);
        driver.quit();
    }
}
