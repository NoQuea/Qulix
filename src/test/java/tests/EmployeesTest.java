package tests;

import org.testng.annotations.Test;

public class EmployeesTest extends BaseTest{
    @Test
    public void addEmployee(){
        employeesPage.open();
        employeesPage.clickAdd();
    }
}
