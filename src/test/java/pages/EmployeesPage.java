package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeesPage extends BasePage {

    public static final By ADD_BUTTON = By.xpath("//button[@class='add-btn']");
    String deleteButton = "//td/ancestor::tr[td='%s']//button[text()='Удалить']";
    String updateButton = "//td/ancestor::tr[td='%s']//button[text()='Изменить']";

    public EmployeesPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(baseUrl + "/employees");
    }

    public void clickAdd(){
        driver.findElement(ADD_BUTTON).click();
    }

    public void clickUpdateButton(String label){
        driver.findElement(By.xpath(String.format(updateButton, label))).click();
    }
    public void clickDeleteButton(String label){
        driver.findElement(By.xpath(String.format(deleteButton, label))).click();
    }
}
