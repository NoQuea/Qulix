package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class EmployeesPage extends BasePage {

    public static final By ADD_BUTTON = By.xpath("//button[@class='add-btn']");
    String deleteButton = "//td/ancestor::tr[td='%s']//button[text()='Удалить']";
    String updateButton = "//td/ancestor::tr[td='%s']//button[text()='Изменить']";
    String fieldValue = "//tr[last()]//td[2]";

    public EmployeesPage(WebDriver driver) {
        super(driver);
    }
    @Step("Opening employees page")
    public void open() {
        driver.get(baseUrl + "/employees");
    }

    @Step("Click add button")
    public void clickAdd() {
        driver.findElement(ADD_BUTTON).click();
    }

    public void clickUpdateButton(String label) {
        driver.findElement(By.xpath(String.format(updateButton, label))).click();
    }
    @Step("Click delete button")
    public boolean clickDeleteButton(String label) {
        try {
            driver.findElement(By.xpath(String.format(deleteButton, label))).click();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String getField() {
        return driver.findElement(By.xpath(fieldValue)).getText();
    }
}
