package tests;

import models.Employees;
import models.EmployeesFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeesTest extends BaseTest{
    @Test(description = "Add a new employee")
    public void addEmployee(){
        employeesPage.open();
        employeesPage.clickAdd();

        Employees employees = EmployeesFactory.get();
        employeesAddPage.createEmployees(employees);

        assertEquals(employeesPage.getField(), employees.getLastName(), "Last name is not correct");
    }

    @Test(description = "Delete the employee by ID")
    public void deleteEmployeeById(){
        employeesPage.open();

        boolean delete = employeesPage.clickDeleteButton("76");
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
