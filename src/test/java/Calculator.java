import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Calculator {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }
    @Test
    public void addTest(){
        int x = 10;
        int y = -5;
        int expectedResult = 5;
        WebElement firstNumber = driver.findElement(By.xpath("//*[@id=\"number1Field\"]"));
        firstNumber.sendKeys();
        WebElement secondNumber = driver.findElement(By.xpath("//*[@id=\"number2Field\"]"));
        secondNumber.sendKeys();
        WebElement selectOperation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(selectOperation);
        select.selectByVisibleText("Add");
        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();
        WebElement checkbox = driver.findElement(By.id("integerSelect"));
        checkbox.click();
        int actualResult =();
        Assert.assertEquals(expectedResult, actualResult);

        WebElement clearButton = driver.findElement(By.id("clearButton"));
        clearButton.click();


    }
}
