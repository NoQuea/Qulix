package models;

import com.github.javafaker.Faker;

public class EmployeesFactory {

    static Faker faker = new Faker();

    public static Employees get(){
        return Employees.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .middleName(faker.name().firstName())
                .position(faker.name().firstName())
                .build();
    }
}
