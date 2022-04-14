package com.example.mapStructlombok.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;

    private boolean apt; // conversion from Boolean to boolean
    private int experience;
    private String tasksNumber;
    private String startDate;


    private DepartmentDto department;
    private String departmentName;

    private String age;

    private String job;

    private List<CertificateDto> certificates;
}
