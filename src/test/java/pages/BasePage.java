package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    public static String baseUrl;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


}
