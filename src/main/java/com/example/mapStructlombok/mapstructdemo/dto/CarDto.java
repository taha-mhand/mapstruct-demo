package com.example.mapStructlombok.mapstructdemo.dto;

import com.example.mapStructlombok.mapstructdemo.enumeration.FuelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private int id;
    private String name;
    private FuelType fuelType;
}
