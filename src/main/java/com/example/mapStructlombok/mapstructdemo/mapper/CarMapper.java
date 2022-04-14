package com.example.mapStructlombok.mapstructdemo.mapper;

import com.example.mapStructlombok.mapstructdemo.dto.CarDto;
import com.example.mapStructlombok.mapstructdemo.entity.Car;
import com.example.mapStructlombok.mapstructdemo.entity.DieselCar;
import com.example.mapStructlombok.mapstructdemo.entity.ElectricCar;
import com.example.mapStructlombok.mapstructdemo.enumeration.FuelType;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class CarMapper {

    //@MappingTarget is a parameter annotation that populates the target mapping DTO right before the mapping
    // logic is executed in case of @BeforeMapping and right after in case of @AfterMapping annotated method.

    @BeforeMapping
    protected void setFuelTypeToDto(Car car, @MappingTarget CarDto carDto) {
        if (car instanceof ElectricCar) {
            carDto.setFuelType(FuelType.ELECTRIC);
        }
        if (car instanceof DieselCar) {
            carDto.setFuelType(FuelType.DIESEL);
        }
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDto carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    public abstract CarDto toCarDto(Car car);
}
