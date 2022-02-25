package tests;

import models.Employees;
import models.EmployeesFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeesTest extends BaseTest{
    @Test(description = "Add a new employee", priority = 1)
    public void addEmployee(){
        employeesPage.open();
        employeesPage.clickAdd();

        Employees employees = EmployeesFactory.get();
        employeesAddPage.createEmployees(employees);

        assertEquals(employeesPage.getField(), employees.getLastName(), "Last name is not correct");
    }

    @Test(description = "Delete the employee by ID", priority = 2)
    public void deleteEmployeeById(){
        employeesPage.open();

        boolean delete = employeesPage.clickDeleteButton("82");
        assertTrue(delete);
    }
    @Test(description = "Update the employee by ID")
    public void updateEmployee(){
        employeesPage.open();
        employeesPage.clickUpdateButton("80");

        Employees employees = EmployeesFactory.get();
        employeesUpdatePage.updateEmployees(employees);

        assertEquals(employeesUpdatePage.getField("80"), employees.getLastName(), "Last name is not correct");
    }
}
