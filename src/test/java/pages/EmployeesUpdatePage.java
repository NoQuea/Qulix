package pages;

import elements.Input;
import io.qameta.allure.Step;
import models.Employees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeesUpdatePage extends BasePage{

    public static final By SAVE_BUTTON = By.xpath("//input[@value='Сохранить']");
    String fieldValue = "//tr[td='%s']//td[2]";

    public EmployeesUpdatePage(WebDriver driver) {
        super(driver);
    }
    @Step("Filling in updated data")
    public void updateEmployees(Employees employees){
        new Input(driver, "Фамилия").write(employees.getLastName());
        new Input(driver, "Имя").write(employees.getFirstName());
        new Input(driver, "Отчество").write(employees.getMiddleName());
        new Input(driver, "Должность").write(employees.getPosition());

        clickSaveButton();
    }
    @Step("Click save button")
    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }

    public String getField(String id) {
        return driver.findElement(By.xpath(String.format(fieldValue, id))).getText();
    }
}
