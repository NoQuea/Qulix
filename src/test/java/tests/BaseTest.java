package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.EmployeesAddPage;
import pages.EmployeesPage;
import pages.EmployeesUpdatePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected WebDriver driver;
    EmployeesPage employeesPage;
    EmployeesAddPage employeesAddPage;
    EmployeesUpdatePage employeesUpdatePage;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.baseUrl = "https://cs-training-task.qulix.com/trainingtask1";

        employeesPage = new EmployeesPage(driver);
        employeesAddPage = new EmployeesAddPage(driver);
        employeesUpdatePage = new EmployeesUpdatePage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

