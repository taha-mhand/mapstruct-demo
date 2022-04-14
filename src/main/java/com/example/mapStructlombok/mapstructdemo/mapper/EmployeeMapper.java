package com.example.mapStructlombok.mapstructdemo.mapper;

import com.example.mapStructlombok.mapstructdemo.dto.DepartmentDto;
import com.example.mapStructlombok.mapstructdemo.dto.EmployeeDto;
import com.example.mapStructlombok.mapstructdemo.entity.Department;
import com.example.mapStructlombok.mapstructdemo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDate;
import java.time.Period;

@Mapper(componentModel = "spring", uses = {CertificateMapper.class})
public interface EmployeeMapper {

    @Mapping(target="employeeId", source="entity.id")
    @Mapping(target="employeeFirstName", source="entity.firstName")
    @Mapping(target="employeeLastName", source="entity.lastName")
    @Mapping(target="startDate", source = "entity.date",
            dateFormat = "dd-MM-yyyy HH:mm:ss")
    @Mapping(target = "departmentName", source = "entity.department.name")
    @Mapping(target = "tasksNumber", numberFormat = "$#.00")
    @Mapping(target = "age", expression = "java(birthDateToAge(entity))", dependsOn = "apt")
    @Mapping(target = "job", constant = "DEVELOPER")
    EmployeeDto employeeToEmployeeDto(Employee entity);

    default String birthDateToAge(Employee employee) {
        Period period = Period.between(LocalDate.now(), employee.getBirthDate());
        return String.valueOf(period.getYears());
    }

    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="firstName", source="dto.employeeFirstName"),
            @Mapping(target="lastName", source="dto.employeeLastName"),
            @Mapping(target="date", source="dto.startDate",
                    dateFormat="dd-MM-yyyy HH:mm:ss")
    })
    Employee employeeDtoToEmployee(EmployeeDto dto);


    DepartmentDto departmentToDepartmentDto(Department department);
    Department departmentDtoToDepartment(DepartmentDto departmentDto);

}
