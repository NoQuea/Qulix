package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;

    String input = "//input[@placeholder='%s']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(input, this.label))).sendKeys(text);
    }
}
