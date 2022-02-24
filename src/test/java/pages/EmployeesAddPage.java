package pages;

import elements.Input;
import models.Employees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeesAddPage extends BasePage{

    public static final By SAVE_BUTTON = By.xpath("//input[@value='Сохранить']");

    public EmployeesAddPage(WebDriver driver) {
        super(driver);
    }

    public void createEmployees(Employees employees){
        new Input(driver, "Введите Фамилию").write(employees.getLastName());
        new Input(driver, "Введите имя").write(employees.getLastName());
        new Input(driver, "Введите отчество").write(employees.getLastName());
        new Input(driver, "Введите должность").write(employees.getLastName());
    }

    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }
}
