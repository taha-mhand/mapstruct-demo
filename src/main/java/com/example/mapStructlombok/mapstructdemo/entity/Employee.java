package com.example.mapStructlombok.mapstructdemo.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    private Boolean apt; // implicit conversion
    private long experience; // implicit conversion
    private int tasksNumber;
    private Date date;

    private Department department;

    private LocalDate birthDate;

    List<Certificate> certificates;
}
