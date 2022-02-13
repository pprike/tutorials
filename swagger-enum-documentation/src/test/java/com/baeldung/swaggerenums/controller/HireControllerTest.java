package com.baeldung.swaggerenums.controller;

import com.baeldung.swaggerenums.model.Employee;
import com.baeldung.swaggerenums.model.Role;
import org.junit.Assert;
import org.junit.Test;

public class HireControllerTest {

    @Test
    public void hireEmployee_RoleEngineer_ReturnsRoleString() {
        //Arrange
        Role testRole = Role.Engineer;
        Employee employee = new Employee();
        employee.setRole(testRole);

        //Act
        HireController hireController = new HireController();
        String response = hireController.hireEmployee(employee);

        //Assert
        Assert.assertEquals(String.format("Hired for role: %s", testRole),
                response);
    }
}
