package com.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String args[]) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src//main/resources/employee.json");
        Employee employee = objectMapper.readValue(file,Employee.class );
        System.out.println(employee);
        File employeeFileWithList = new File("src//main/resources/employeeList.json");
        List<Employee> employeeList = objectMapper.readValue(employeeFileWithList,objectMapper.getTypeFactory().constructCollectionType(List.class,Employee.class));
        employeeList.forEach(System.out::println);
    }
}
