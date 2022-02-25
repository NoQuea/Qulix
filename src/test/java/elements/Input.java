package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;

    String input = "//label[text()='%s']/ancestor::div[@class='row']//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(input, this.label))).clear();
        driver.findElement(By.xpath(String.format(input, this.label))).sendKeys(text);
    }
}
